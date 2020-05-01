/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author propietario
 */
public class SearchQuery {
    static PreparedStatement pstmt ;
    
    public SearchQuery(){
        
    }
    
    public DefaultTableModel BuscaFecha(String tipo_consulta, String date, String date2){
        DefaultTableModel modelo = new DefaultTableModel();
        
        String querydate;
        modelo.setRowCount(0);
        Conexion con = new Conexion();
        Connection c = con.miconexion();
         ResultSet rs;
        
        if (c != null) {
                    
                    try {
                      switch(tipo_consulta){
                    case "diaria":
                        modelo.addColumn("cantidad");
                        modelo.addColumn("fecha");
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate localDate = LocalDate.parse(date, formatter);
                        java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
                        pstmt = c.prepareStatement("SELECT cantidad, fecha FROM \"Venta\" WHERE fecha = ?;");
                        pstmt.setDate(1, sqlDate);
                        rs =pstmt.executeQuery();
                      
                          while(rs.next()) {
                            modelo.addRow(new Object[]{rs.getDate("fecha"), rs.getInt("cantidad")});

                          }
                        break;
                    case "mes":
                        modelo.addColumn("año");
                        modelo.addColumn("total_dinero");
                        pstmt = c.prepareStatement("SELECT TO_CHAR(fecha, 'Month') AS \"Mes\", SUM(cantidad) AS total_dinero FROM \"Venta\"  WHERE EXTRACT(month FROM fecha) = ? GROUP BY TO_CHAR(fecha, 'Month');");
                        pstmt.setString(1, date);
                        rs =pstmt.executeQuery();
                        while(rs.next()) {
                            modelo.addRow(new Object[]{rs.getString("año"), rs.getInt("total_dinero")});

                          }
                        
                        break;
                    case "año":
                        modelo.addColumn("año");
                        modelo.addColumn("total_dinero");
                        pstmt = c.prepareStatement("SELECT EXTRACT(year FROM fecha), SUM(cantidad) AS total_dinero FROM \"Venta\"  WHERE EXTRACT(year FROM fecha) = ? GROUP BY EXTRACT(year FROM fecha)");
                        pstmt.setString(1, date);
                        rs =pstmt.executeQuery();
                        while(rs.next()) {
                            modelo.addRow(new Object[]{rs.getString("año"), rs.getInt("total_dinero")});

                          }
                        break;
                    case "mes-año":
                        modelo.addColumn("Mes");
                        modelo.addColumn("Año");
                        modelo.addColumn("total_dinero");
                        pstmt = c.prepareStatement("SELECT EXTRACT(month from fecha) AS \"Mes\", EXTRACT(year FROM fecha) AS \"Año\", SUM(cantidad) AS total_dinero FROM \"Venta\"  GROUP BY EXTRACT(month FROM fecha),  EXTRACT(year FROM fecha) ORDER BY EXTRACT(year FROM fecha);");
                        
                        rs =pstmt.executeQuery();
                        while(rs.next()) {
                            modelo.addRow(new Object[]{rs.getString("Mes"), rs.getString("Año"), rs.getInt("total_dinero")});

                          }
                        break;
                        
                    case "anual":
                        modelo.addColumn("año");
                        modelo.addColumn("total_dinero");
                        pstmt = c.prepareStatement("SELECT EXTRACT(year FROM fecha) AS año, SUM(cantidad) AS total_dinero FROM \"Venta\" GROUP BY EXTRACT(year FROM fecha);");
                        rs =pstmt.executeQuery();
                        while(rs.next()) {
                            modelo.addRow(new Object[]{rs.getString("año"), rs.getInt("total_dinero")});

                          }
                        
                        break;
                    case "dia-mes":
                        modelo.addColumn("fecha");
                        modelo.addColumn("total_dinero");
                        
                        pstmt = c.prepareStatement("SELECT fecha, cantidad AS total_dinero FROM \"Venta\"  EXTRACT(month FROM fecha) = ? AND  EXTRACT(year FROM fecha) = ? ORDER BY EXTRACT(day FROM fecha)");
                        pstmt.setString(1, date);
                        pstmt.setString(2, date2);
                        rs =pstmt.executeQuery();
                        while(rs.next()) {
                            modelo.addRow(new Object[]{rs.getString("fecha"), rs.getInt("total_dinero")});

                          }
                        break;
                         }
                      
                     
                      
                    c.close();
                    
                    }catch(Exception e){
                        System.out.println("Error searchquery");
                        System.out.println(e);
                        JOptionPane.showMessageDialog(null, e);
                    }
        
    }
        
    return modelo;
}
    
  
}

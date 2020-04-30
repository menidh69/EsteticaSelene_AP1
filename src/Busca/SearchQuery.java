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
    
    
    public SearchQuery(String f1){
        
    }
    
    public DefaultTableModel BuscaFecha(DefaultTableModel modelo, String tipo_consulta, String date){
        
        String querydate;
        modelo.setRowCount(0);
        Conexion con = new Conexion();
        Connection c = con.miconexion();
         PreparedStatement pstmt = null;
        
        if (c != null) {
                    
                    try {
                      switch(tipo_consulta){
                    case "diaria":
                        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                        LocalDate localDate = LocalDate.parse(date, formatter);
                        java.sql.Date sqlDate = java.sql.Date.valueOf( localDate );
                        pstmt = c.prepareStatement("SELECT * FROM registros WHERE fecha = '?';");
                        pstmt.setDate(1, sqlDate);
                        break;
                    case "mensual":
                        pstmt = c.prepareStatement("SELECT SUM(dinero), EXTRACT(month FROM fecha) INTO dinero, month FROM registros WHERE EXTRACT(month FROM fecha) = '?' GROUP BY month;");
                        pstmt.setString(1, date);
                        break;
                    case "anual":
                        pstmt = c.prepareStatement("SELECT SUM(dinero), EXTRACT(year FROM fecha) INTO dinero, year FROM registros WHERE EXTRACT(year FROM fecha) = '?' GROUP BY year;");
                        pstmt.setString(1, date);
                        break;
                         }
                      
                     
                      ResultSet rs =pstmt.executeQuery();
                      while(rs.next()) {
                        Object[] tablaSQL = new Object[8];

                         for(int i=0; i<=modelo.getColumnCount()-1; i++) {
                             tablaSQL[i] = rs.getObject(i+1);
                        }

                        modelo.addRow(tablaSQL);
                       }
                    c.close();
                    JOptionPane.showMessageDialog(null, "Dato agregado correctamente xD");
                    }catch(Exception e){
                        System.out.println(e);
                        JOptionPane.showMessageDialog(null, e);
                    }
        
    }
        
    return modelo;
}
    
  
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Busca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author propietario
 */
public class Conexion {
    public static Connection miconexion() {

        String ip = "jdbc:postgresql://127.0.0.1:5432/Estetica";
  final String URL_DB = "jdbc:postgresql://127.0.0.1:5432/Estetica";
        final String USER_DB = "postgres";
        final String PASS_DB = "manuel";
    
    int b = 0;

    try {
     Class.forName("org.postgresql.Driver");
     System.out.println("Driver correcto!");
     b = 1;
    } catch(ClassNotFoundException ex) {
     JOptionPane.showMessageDialog(null, ex);
        System.out.println("error archivo conexion");
    }

    Connection c = null;
    
     if (b == 1){
     try{
      c = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);
      System.out.println("Conexion correcta!");
      //JOptionPane.showMessageDialog(null, "Conexion correcta!");
     } catch(SQLException s) {
      System.out.println(s);
         System.out.println("error archivo conexion");
      JOptionPane.showMessageDialog(null,s);
    }

//    if (b == 1){
//     try{
//      c = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);
//      System.out.println("Conexion correcta!");
//      //JOptionPane.showMessageDialog(null, "Conexion correcta!");
//     } catch(SQLException s) {
//      System.out.println(s);
//      JOptionPane.showMessageDialog(null,s);
//    }
   
}
    return c;
}
    
}

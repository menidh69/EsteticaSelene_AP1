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

        String ip = "";
  final String URL_DB = "";
        final String USER_DB = "";
        final String PASS_DB = "";
    
    int b = 0;

    try {
     Class.forName("");
     System.out.println("Driver correcto!");
     b = 1;
    } catch(ClassNotFoundException ex) {
     JOptionPane.showMessageDialog(null, ex);
    }

    Connection c = null;
    
     if (b == 1){
     try{
      c = DriverManager.getConnection(URL_DB, USER_DB, PASS_DB);
      System.out.println("Conexion correcta!");
      //JOptionPane.showMessageDialog(null, "Conexion correcta!");
     } catch(SQLException s) {
      System.out.println(s);
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

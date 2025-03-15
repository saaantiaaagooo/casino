/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.swing.JOptionPane;


/**
 *
 * @author julio
 */
public class conexionBD {
    
        String user="postgres";
        String password="julio";
        String dataBase="casino";
        String id="localhost";
        String port="5432";
        
        Connection conector=null;
        public Statement stmt =null;
        
        String cadena = "jdbc:postgresql://"+id+":"+port+"/"+dataBase;
        
    public  Connection conector(){
        
        try{
                try{
                Class.forName("org.postgresql.Driver");
                conector=DriverManager.getConnection(cadena,user,password);
                JOptionPane.showMessageDialog(null, "CONEXION EXITOSA");
                }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "CONEXION NO REALIZADA"+e.toString());
                }
                
              stmt = conector.createStatement();
                
        }catch(java.sql.SQLException e){
            System.out.println("Error"+e.getSQLState());
        }
        
        return conector;
    }
    
}

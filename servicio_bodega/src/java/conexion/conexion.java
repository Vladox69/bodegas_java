/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexion;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class conexion {
    Connection conexion;
    public conexion(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conexion=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/bodegas","root","" );
            System.out.println("Conectado");
        }catch(ClassNotFoundException | SQLException ex){
            System.out.println("Problema con "+ex.getMessage());
        }
    }
    
    public Connection getConexion(){
        return conexion;
    }
    
}

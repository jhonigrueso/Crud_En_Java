/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Conexion {
    
    // PARAMETROS PARA HACER UNA CONEXION EN MYSQL
    private static  Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/basedatosjava";
    
    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
        conn = (Connection) DriverManager.getConnection(url, user, password);
        if (conn != null){
            
        }
        } catch (ClassNotFoundException | SQLException e) {
            
        }
     }
    
    // ESTE METODO NOS RETORNA LA CONEXION
    public Connection getConnection(){
        return conn;
    }
    

}

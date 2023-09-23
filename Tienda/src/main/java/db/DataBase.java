package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private Connection conn;
    
    public void establecerConexion() {
        try {
            String url = "jdbc:sqlite:db/database.bd";
            // create a connection to the database
            conn = DriverManager.getConnection(url);
        } catch (SQLException e) {  
            System.out.println(e.getMessage());  
        }   
    }
    
    public Connection obtenerConexion(){
        return conn;
    }
    
    public void cerrarConexion() {
        try {
            obtenerConexion().close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}

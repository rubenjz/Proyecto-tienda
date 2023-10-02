package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private final String url = "jdbc:sqlite:db/database.bd";
    private Connection conn;
    
    public Connection obtenerConexion() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(url);
            } catch (SQLException e) {
                System.out.println("Error al establecer la conexión: " + e.getMessage());
            }
        }
        return conn;
    }
    
    public void cerrarConexion() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            } finally {
                conn = null;
            }
        }
    }
}

package Controler;

import Interfaces.DAOVenta;
import Model.Venta;
import db.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOVentaImpl extends DataBase implements DAOVenta {

    @Override
    public void registrar(Venta venta) {
        String query = "INSERT INTO Venta (ID_Cliente, Fecha, Total) VALUES (?, ?, ?)";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, venta.getId_Cliente());
            ps.setString(2, venta.getFecha());
            ps.setDouble(3, venta.getTotal());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarID_Cliente(int id_Venta, int nuevoID_Cliente) {
        String query = "UPDATE Venta SET ID_Cliente = ? WHERE ID_Venta = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id_Venta);
            ps.setInt(2, nuevoID_Cliente);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarFecha(int id_Venta, String nuevaFecha) {
        String query = "UPDATE Venta SET Fecha = ? WHERE ID_Venta = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id_Venta);
            ps.setString(2, nuevaFecha);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarTotal(int id_Venta, double total) {
        String query = "UPDATE Venta SET Total = ? WHERE ID_Venta = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id_Venta);
            ps.setDouble(2, total);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public List<Venta> listar() {
        int activo;
        List<Venta> ListVenta = new ArrayList();
        String query = "SELECT * FROM Producto";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                activo = resultSet.getInt("Activo");
                if (activo == 1) {
                    ListVenta.add(new Venta(resultSet.getInt("ID_Venta"),
                        resultSet.getInt("ID_Cliente"),
                        resultSet.getString("Fecha"),
                        resultSet.getDouble("Total")));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        return ListVenta;
    }
    
}

package Controler;

import Interfaces.DAODetalles_Venta;
import Model.Detalles_Venta;
import db.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAODetalles_VentaImpl extends DataBase implements DAODetalles_Venta {

    @Override
    public void registrar(Detalles_Venta detalles_Venta) {
        String query = "INSERT INTO Detalles_Venta (ID_Venta, ID_Producto, Cantidad, Subtotal) VALUES (?, ?, ?, ?)";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, detalles_Venta.getId_Venta());
            ps.setInt(2, detalles_Venta.getId_Producto());
            ps.setInt(3, detalles_Venta.getCantidad());
            ps.setDouble(4, detalles_Venta.getSubtotal());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void actualizarProducto(int id_Detalles_Venta, int nuevoIdProducto) {
        String query = "UPDATE Detalles_Venta SET ID_Producto = ? WHERE ID_Detalles_Venta = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, nuevoIdProducto);
            ps.setInt(2, id_Detalles_Venta);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarCantidad(int id_Detalles_Venta, int nuevaCantidad) {
        String query = "UPDATE Detalles_Venta SET Cantidad = ? WHERE ID_Detalles_Venta = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, nuevaCantidad);
            ps.setInt(2, id_Detalles_Venta);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }
    
    @Override
    public void actualizarSubtotal(int idDetalles_Venta, double subtotal) {
        String query = "UPDATE Detalles_Venta SET Subtotal = ? WHERE ID_Detalles_Venta = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setDouble(1, subtotal);
            ps.setInt(2, idDetalles_Venta);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }
    
    @Override
    public void eliminar(int id_Detalles_Venta) {
        String query = "DELETE FROM Detalles_Venta WHERE ID_Detalles_Venta = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id_Detalles_Venta);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public List<Detalles_Venta> listar() {
        List<Detalles_Venta> ListDetalles_Venta = new ArrayList();
        String query = "SELECT * FROM Detalles_Venta";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                ListDetalles_Venta.add(new Detalles_Venta(resultSet.getInt("ID_Detalles_Venta"),
                        resultSet.getInt("ID_Venta"),
                        resultSet.getInt("ID_Producto"),
                        resultSet.getInt("Cantidad"),
                        resultSet.getDouble("Subtotal")));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        return ListDetalles_Venta;
    }
}

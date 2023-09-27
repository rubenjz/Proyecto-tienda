package Controler;

import Interfaces.DAODetalles_Venta;
import Model.Detalles_Venta;
import db.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class DAODetalles_VentaImpl extends DataBase implements DAODetalles_Venta {

    @Override
    public void registrar(Detalles_Venta detalles_Venta) {
        String query = "INSERT INTO Cliente (first_Name, last_Name, cedula) VALUES (?, ?, ?)";
        try (Connection conn = obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(query)) {
            /*ps.setString(1, cliente.getFirst_Name());
            ps.setString(2, cliente.getLast_Name());
            ps.setString(3, cliente.getCedula());
            ps.executeUpdate();*/
        } catch (SQLException e) {
            System.out.println("Error al registrar Cliente: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarProducto(Detalles_Venta detalles_Venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarCantidad(Detalles_Venta detalles_Venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void modificarSubtotal(Detalles_Venta detalles_Venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void eliminar(Detalles_Venta detalles_Venta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Detalles_Venta> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

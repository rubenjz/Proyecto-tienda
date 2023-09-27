package Controler;

import Interfaces.DAOCliente;
import Model.Cliente;
import db.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOClienteImpl extends DataBase implements DAOCliente {

    @Override
    public void registrar(Cliente cliente) {
        String query = "INSERT INTO Cliente (first_Name, last_Name, cedula) VALUES (?, ?, ?)";
        try (Connection conn = obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, cliente.getFirst_Name());
            ps.setString(2, cliente.getLast_Name());
            ps.setString(3, cliente.getCedula());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al registrar Cliente: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void eliminar(Cliente cliente) {
        String query = "DELETE FROM Cliente WHERE id_Cliente = ?";
        try (Connection conn = obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, cliente.getCedula());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error al eliminar cliente: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public List<Cliente> listar() {
        List<Cliente> ListCliente = new ArrayList();
        String query = "SELECT * FROM Cliente";
        try (Connection conn = obtenerConexion();
             PreparedStatement ps = conn.prepareStatement(query);
             ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                Cliente cliente = new Cliente();
                cliente.setId_Cliente(resultSet.getInt("id_Cliente"));
                cliente.setFirst_Name(resultSet.getString("first_Name"));
                cliente.setLast_Name(resultSet.getString("last_Name"));
                cliente.setCedula(resultSet.getString("cedula"));
                ListCliente.add(cliente);
            }
        } catch (SQLException e) {
            System.out.println("Error al mostrar la lista: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        return ListCliente;
    }
    
}

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
        String query = "INSERT INTO Cliente (First_Name, Last_Name, Cedula) VALUES (?, ?, ?)";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, cliente.getFirst_Name());
            ps.setString(2, cliente.getLast_Name());
            ps.setString(3, cliente.getCedula());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void eliminar(String cedula) {
        String query = "DELETE FROM Cliente WHERE id_Cliente = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, cedula);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
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
                ListCliente.add(new Cliente(resultSet.getInt("ID_Cliente"),
                        resultSet.getString("Nombres"),
                        resultSet.getString("Apellidos"),
                        resultSet.getString("Cedula")));
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        return ListCliente;
    }
    
}

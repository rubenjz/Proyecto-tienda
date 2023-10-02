package Controler;

import Interfaces.DAOProducto;
import Model.Producto;
import db.DataBase;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAOProductoImpl extends DataBase implements DAOProducto{

    @Override
    public void registrar(Producto producto) {
        String query = "INSERT INTO Producto (Codigo, Nombre, Cantidad, Precio_venta, Costo_compra) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, producto.getCodigo());
            ps.setString(2, producto.getNombre());
            ps.setInt(3, producto.getCantidad());
            ps.setDouble(4, producto.getPrecio_venta());
            ps.setDouble(5, producto.getCosto_compra());
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarCodigo(int id_Producto, int nuevoCodigo) {
        String query = "UPDATE Producto SET Codigo = ? WHERE ID_Producto = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, nuevoCodigo);
            ps.setInt(2, id_Producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarNombre(int id_Producto, String nuevoNombre) {
        String query = "UPDATE Producto SET Nombre = ? WHERE ID_Producto = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, nuevoNombre);
            ps.setInt(2, id_Producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarCantidad(int id_Producto, int nuevoCantidad) {
        String query = "UPDATE Producto SET Cantidad = ? WHERE ID_Producto = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, nuevoCantidad);
            ps.setInt(2, id_Producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarPrecio_venta(int id_Producto, double nuevoPrecio) {
        String query = "UPDATE Producto SET Precio_venta = ? WHERE ID_Producto = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setDouble(1, nuevoPrecio);
            ps.setInt(2, id_Producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void modificarCosto_compra(int id_Producto, double nuevoPrecio) {
        String query = "UPDATE Producto SET Costo_compra = ? WHERE ID_Producto = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setDouble(1, nuevoPrecio);
            ps.setInt(2, id_Producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void eliminar(int id_Producto) {
        String query = "UPDATE Producto SET Activo = ? WHERE ID_Producto = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, 0);
            ps.setInt(2, id_Producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public List<Producto> listar() {
        int activo;
        List<Producto> ListProducto = new ArrayList();
        String query = "SELECT * FROM Producto";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query);
                ResultSet resultSet = ps.executeQuery()) {
            while (resultSet.next()) {
                activo = resultSet.getInt("Activo");
                if (activo == 1) {
                    ListProducto.add(new Producto(resultSet.getInt("ID_Producto"),
                        resultSet.getInt("Codigo"),
                        resultSet.getString("Nombre"),
                        resultSet.getInt("Cantidad"),
                        resultSet.getDouble("Precio_venta"),
                        resultSet.getDouble("Costo_compra"),
                        resultSet.getInt("Activo")));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        return ListProducto;
    }

}

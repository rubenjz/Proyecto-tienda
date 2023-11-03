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
            ps.setLong(1, producto.getCodigo());
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
    public void modificarCodigo(int id_Producto, long nuevoCodigo) {
        String query = "UPDATE Producto SET Codigo = ? WHERE ID_Producto = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setLong(1, nuevoCodigo);
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
    public void eliminarConID(int id_Producto) {
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
    public void eliminarConNombre(String nombre_Producto) {
        String query = "UPDATE Producto SET Activo = ? WHERE Nombre = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, 0);
            ps.setString(2, nombre_Producto);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }

    @Override
    public void eliminarConCodigo(long Codigo) {
        String query = "UPDATE Producto SET Activo = ? WHERE Codigo = ?";
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, 0);
            ps.setLong(2, Codigo);
            ps.executeUpdate();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
    }
    
    @Override
    public String obtenerNombre(int id_Producto, long codigo, String nombre) {
        
        return null;
        
    }

    @Override
    public int obtenerCodigo(int id_Producto, long codigo, String nombre) {
        
        return 0;
        
    }

    @Override
    public double obtenerPrecio(int id_Producto, long codigo, String nombre) {
        double precio = 0;
        String query = null;
        
        if (id_Producto != 0) {
            query = "SELECT Precio_venta FROM Producto WHERE ID_Producto = ?";
        } else if (codigo != 0) {
            query = "SELECT Precio_venta FROM Producto WHERE Codigo = ?";
        } else if (!nombre.isEmpty()) {
            query = "SELECT Precio_venta FROM Producto WHERE Nombre = ?";
        }
        
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            
            if (id_Producto != 0) {
                ps.setInt(1, id_Producto);
            } else if (codigo != 0) {
                ps.setLong(1, codigo);
            } else if (!nombre.isEmpty()) {
                ps.setString(1, nombre);
            }
            
            try(ResultSet resultSet = ps.executeQuery()){
                if (resultSet.next()) {
                    precio = resultSet.getDouble("Precio_venta");
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        return precio;
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
                        resultSet.getLong("Codigo"),
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

    @Override
    public Producto obtenerProducto(int id_Producto, long codigo, String nombre) {
        Producto producto = null;
        String query = null;
        
        if (id_Producto != 0) {
            query = "SELECT * FROM Producto WHERE ID_Producto = ?";
        } else if (codigo != 0) {
            query = "SELECT * FROM Producto WHERE Codigo = ?";
        } else if (!nombre.isEmpty()) {
            query = "SELECT * FROM Producto WHERE Nombre = ?";
        }
        
        try (Connection conn = obtenerConexion();
                PreparedStatement ps = conn.prepareStatement(query)) {
            
            if (id_Producto != 0) {
                ps.setInt(1, id_Producto);
            } else if (codigo != 0) {
                ps.setLong(1, codigo);
            } else if (!nombre.isEmpty()) {
                ps.setString(1, nombre);
            }
            
            try(ResultSet resultSet = ps.executeQuery()){
                if (resultSet.next()) {
                    producto = new Producto(
                            resultSet.getInt("ID_Producto"),
                            resultSet.getInt("Codigo"),
                            resultSet.getString("Nombre"),
                            resultSet.getInt("Cantidad"),
                            resultSet.getDouble("Precio_venta"),
                            resultSet.getDouble("Costo_compra"),
                            resultSet.getInt("Activo"));
                }
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            cerrarConexion();
        }
        return producto;
    }
}

package Interfaces;

import Model.Producto;
import java.util.List;

public interface DAOProducto {
    public void registrar(Producto producto);
    public void modificarCodigo(int id_Producto, int nuevoCodigo);
    public void modificarNombre(int id_Producto, String nuevoNombre);
    public void modificarCantidad(int id_Producto, int nuevoCantidad);
    public void modificarPrecio_venta(int id_Producto, double nuevoPrecio);
    public void modificarCosto_compra(int id_Producto, double nuevoPrecio);
    public void eliminar(int id_Producto);
    public List<Producto> listar();
}

package Interfaces;

import Model.Detalles_Venta;
import java.util.List;

public interface DAODetalles_Venta {
    public void registrar(Detalles_Venta detalles_Venta);
    public void actualizarProducto(int id_Detalles_Venta, int nuevoIdProducto);
    public void modificarCantidad(int id_Detalles_Venta, int nuevaCantidad);
    public void actualizarSubtotal(int id_Detalles_Venta, double subtotal);
    public void eliminar(int id_Detalles_Venta);
    public List<Detalles_Venta> listar();
    public Detalles_Venta obtenerDetallesVenta(int id_Detalles_Venta);
}

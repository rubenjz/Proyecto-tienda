package Interfaces;

import Model.Venta;
import java.util.List;

public interface DAOVenta {
    public void registrar(Venta venta);
    public void modificarID_Cliente(int id_Venta, int nuevoID_Cliente);
    public void modificarFecha(int id_Venta, String nuevaFecha);
    public void modificarTotal(int id_Venta, double total);
    public List<Venta> listar();
}

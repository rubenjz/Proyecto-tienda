package Interfaces;

import Model.Venta;
import java.util.List;

public interface DAOVenta {
    public void registrar(Venta venta);
    public void modificar(Venta venta);
    public List<Venta> listar();
}

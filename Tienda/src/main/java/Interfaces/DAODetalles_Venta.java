package Interfaces;

import Model.Detalles_Venta;
import java.util.List;

public interface DAODetalles_Venta {
    public void registrar(Detalles_Venta detalles_Venta);
    public void modificar(Detalles_Venta detalles_Venta);
    public List<Detalles_Venta> listar();
}

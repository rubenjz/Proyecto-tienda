package Interfaces;

import Model.Producto;
import java.util.List;

public interface DAOProducto {
    public void registrar(Producto producto);
    public void modificar(Producto producto);
    public void eliminar(Producto producto);
    public List<Producto> listar();
}

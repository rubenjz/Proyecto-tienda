package Interfaces;

import Model.Cliente;
import java.util.List;

public interface DAOCliente {
    public void registrar(Cliente cliente);
    public void modificar(Cliente cliente);
    public void eliminar(Cliente cliente);
    public List<Cliente> listar();
}

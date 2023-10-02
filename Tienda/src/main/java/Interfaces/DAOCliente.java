package Interfaces;

import Model.Cliente;
import java.util.List;

public interface DAOCliente {
    public void registrar(Cliente cliente);
    public void eliminar(String cedula);
    public List<Cliente> listar();
}

package Model;

import java.sql.Date;

public class Venta {
    private int id_Venta;
    private int id_Cliente;
    private String fecha;
    private double total;

    public Venta() {
    }

    public Venta(int id_Cliente, String fecha, double total) {
        this.id_Cliente = id_Cliente;
        this.fecha = fecha;
        this.total = total;
    }

    public Venta(int id_Venta, int id_Cliente, String fecha, double total) {
        this.id_Venta = id_Venta;
        this.id_Cliente = id_Cliente;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Cliente() {
        return id_Cliente;
    }

    public void setId_Cliente(int id_Cliente) {
        this.id_Cliente = id_Cliente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}

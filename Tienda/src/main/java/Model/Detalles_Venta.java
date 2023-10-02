package Model;

public class Detalles_Venta {
    private int id_Detalles_Venta;
    private int id_Venta;
    private int id_Producto;
    private int cantidad;
    private double subtotal;

    public Detalles_Venta(int id_Venta, int id_Producto, int cantidad, double subtotal) {
        this.id_Venta = id_Venta;
        this.id_Producto = id_Producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public Detalles_Venta(int id_Detalles_Venta, int id_Venta, int id_Producto, int cantidad, double subtotal) {
        this.id_Detalles_Venta = id_Detalles_Venta;
        this.id_Venta = id_Venta;
        this.id_Producto = id_Producto;
        this.cantidad = cantidad;
        this.subtotal = subtotal;
    }

    public int getId_Detalles_Venta() {
        return id_Detalles_Venta;
    }

    public void setId_Detalles_Venta(int id_Detalles_Venta) {
        this.id_Detalles_Venta = id_Detalles_Venta;
    }

    public int getId_Venta() {
        return id_Venta;
    }

    public void setId_Venta(int id_Venta) {
        this.id_Venta = id_Venta;
    }

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

}

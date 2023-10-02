package Model;

public class Producto {
    private int id_Producto;
    private int codigo;
    private String nombre;
    private int cantidad;
    private double precio_venta;
    private double costo_compra;
    private int activo;

    public Producto(int id_Producto, int codigo, String nombre, int cantidad, double precio_venta, double costo_compra, int activo) {
        this.id_Producto = id_Producto;
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.costo_compra = costo_compra;
        this.activo = activo;
    }

    public Producto(int codigo, String nombre, int cantidad, double precio_venta, double costo_compra) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio_venta = precio_venta;
        this.costo_compra = costo_compra;
    }
    

    public int getId_Producto() {
        return id_Producto;
    }

    public void setId_Producto(int id_Producto) {
        this.id_Producto = id_Producto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getCosto_compra() {
        return costo_compra;
    }

    public void setCosto_compra(double costo_compra) {
        this.costo_compra = costo_compra;
    }

    public int getActivo() {
        return activo;
    }

    public void setActivo(int activo) {
        this.activo = activo;
    }
}

package Models;

public class Producto {
    private String nombre;
    private double precio;
    private String categoria;

    public Producto(String nombre,double precio,String categoria){
        this.nombre = nombre;
        this.precio = precio;
        this.categoria = categoria;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}

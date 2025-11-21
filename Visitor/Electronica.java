package VisitorPattern.Visitor;

public class Electronica implements Producto {
    private String nombre;
    private double precio;

    public Electronica(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public void aceptar(VisitorProducto visitor) {
        visitor.visitar(this);
    }

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }
}


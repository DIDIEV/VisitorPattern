package VisitorPattern.Visitor;

public interface Producto {
    void aceptar(VisitorProducto visitor);
    String getNombre();
    double getPrecio();
}

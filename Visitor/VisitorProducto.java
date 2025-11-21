package VisitorPattern.Visitor;

public interface VisitorProducto {
    void visitar(Libro libro);
    void visitar(Ropa ropa);
    void visitar(Electronica electronica);
}

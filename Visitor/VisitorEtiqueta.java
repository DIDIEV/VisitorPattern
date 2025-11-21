package VisitorPattern.Visitor;

public class VisitorEtiqueta implements VisitorProducto{
    @Override
    public void visitar(Libro libro) {
        System.out.println("Etiqueta LIBRO: " +
                libro.getNombre() + " | Precio: $" + libro.getPrecio());
    }

    @Override
    public void visitar(Ropa ropa) {
        System.out.println("Etiqueta ROPA: " + ropa.getNombre() + " | Precio: $" + ropa.getPrecio());
    }

    @Override
    public void visitar(Electronica electronica) {
        System.out.println("Etiqueta ELECTRÓNICA: " + electronica.getNombre() + " | Precio: $" + electronica.getPrecio());
    }
}

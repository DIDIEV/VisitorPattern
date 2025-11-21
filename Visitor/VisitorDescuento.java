package VisitorPattern.Visitor;

public class VisitorDescuento implements VisitorProducto {
    @Override
    public void visitar(Libro libro) {
        double precioFinal = libro.getPrecio() * 0.90;
        System.out.println("Descuento Libro: " + libro.getNombre() +
                " → Precio final: $" + precioFinal);
    }

    @Override
    public void visitar(Ropa ropa) {
        double precioFinal = ropa.getPrecio() * 0.80;
        System.out.println("Descuento Ropa: " + ropa.getNombre() +
                " → Precio final: $" + precioFinal);
    }

    @Override
    public void visitar(Electronica electronica) {
        double precioFinal = electronica.getPrecio() * 0.95;
        System.out.println("Descuento Electrónica: " + electronica.getNombre() +
                " → Precio final: $" + precioFinal);
    }
}

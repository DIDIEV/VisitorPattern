package VisitorPattern;

import java.util.ArrayList;

import VisitorPattern.Visitor.*;
public class Main {

    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Libro("El Principito", 50.0));
        productos.add(new Ropa("Camiseta Deportiva", 80.0));
        productos.add(new Electronica("Audífonos Bluetooth", 200.0));

        VisitorProducto visitorDescuento = new VisitorDescuento();
        VisitorProducto visitorEtiqueta = new VisitorEtiqueta();

        System.out.println("=== ETIQUETAS ===");
        for (Producto p : productos) {
            p.aceptar(visitorEtiqueta);
        }

        System.out.println("\n=== DESCUENTOS ===");
        for (Producto p : productos) {
            p.aceptar(visitorDescuento);
        }
    }

}
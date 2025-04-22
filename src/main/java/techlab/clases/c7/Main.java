package techlab.clases.c7;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();

        Te te = new Te("Té Verde", 100);
        Cafe cafe = new Cafe("Café Espresso", 150);

        productos.add(te);
        productos.add(cafe);

        System.out.println("Precios antes del descuento:");
        for (Producto p : productos) {
            System.out.println(p.nombre + ": " + p.calcularPrecioFinal());
        }

        // Aplicar 10% de descuento a todos los Descontable
        for (Producto p : productos) {
            if (p instanceof Descontable) {
                ((Descontable) p).aplicarDescuento(10);
            }
        }

        System.out.println("\nPrecios después del descuento del 10%:");
        for (Producto p : productos) {
            System.out.println(p.nombre + ": " + p.calcularPrecioFinal());
        }
    }
}

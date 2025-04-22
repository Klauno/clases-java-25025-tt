package techlab.clases.c4;

import java.util.Arrays;

public class SistemaModularizado {

    // Módulo 1: Gestión de Precios
    public static double calcularPrecioConDescuento(double precio, int cantidad, double descuento) {
        if (cantidad > 50) descuento += 5;
        return precio * cantidad * (1 - descuento / 100);
    }

    // Módulo 2: Gestión de Stock
    private static int[] stock = new int[3];

    public static void reponerStock(int indice, int unidades) {
        if (indiceValido(indice)) {
            stock[indice] += unidades;
        }
    }

    private static boolean indiceValido(int indice) {
        return indice >= 0 && indice < stock.length;
    }

    public static void mostrarStock() {
        System.out.println("Stock: " + Arrays.toString(stock));
    }

    // Módulo 3: Mensajería Clientes
    public static void mostrarMensaje(String mensaje) {
        System.out.println("[Nuevo] " + mensaje);
    }

    public static void mostrarMensaje(String mensaje, int id) {
        System.out.printf("[Cliente#%d] %s%n", id, mensaje);
    }

    // Módulo Principal
    public static void main(String[] args) {
        // Flujo de precios
        double total = calcularPrecioConDescuento(50.0, 60, 10);
        System.out.printf("Total a pagar: $%.2f%n", total);

        // Flujo de stock
        mostrarStock();
        reponerStock(1, 50);
        mostrarStock();

        // Flujo de clientes
        mostrarMensaje("Bienvenido al sistema");
        mostrarMensaje("Gracias por su compra", 1024);
    }
}


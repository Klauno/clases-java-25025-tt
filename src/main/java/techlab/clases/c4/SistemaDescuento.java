package techlab.clases.c4;
import java.util.ArrayList;
public class SistemaDescuento {

    public static void main(String[] args) {
        // --- Uso de calcularImpuesto ---
        double precio1 = 100;
        double impuesto1 = 10;
        System.out.println("Precio final con impuesto: " + calcularImpuesto(precio1, impuesto1));

        double precio2 = 200;
        double impuesto2 = 20;
        System.out.println("Precio final con impuesto: " + calcularImpuesto(precio2, impuesto2));

        // --- Uso de calcularPrecioFinal ---
        double precioBase = 10;
        double descuento = 10;
        int cantidad = 60;
        double precioFinal = calcularPrecioFinal(precioBase, descuento, cantidad);
        System.out.println("Precio final con descuento y cantidad: " + precioFinal);

        // --- Manejo de stock con array ---
        int[] stock = {10, 20, 30};
        System.out.println("\nStock inicial:");
        mostrarStock(stock);

        reponerStock(stock, 1, 15); // Reponer 15 unidades en producto índice 1

        System.out.println("Stock después de reposición:");
        mostrarStock(stock);

        // --- Sobrecarga de métodos mostrarMensaje ---
        mostrarMensaje("Bienvenido cliente nuevo");
        mostrarMensaje("Bienvenido cliente recurrente", 3);

        // --- Modularización: ejemplo simple ---
        System.out.println("\nEjemplo modularización:");
        String cadena = " té CHAi ";
        String cadenaFormateada = formatearCadena(cadena);
        mostrarInfoCadena(cadenaFormateada);
    }

    // Método para calcular impuesto
    public static double calcularImpuesto(double precio, double porcentajeImpuesto) {
        double impuesto = precio * (porcentajeImpuesto / 100);
        return precio + impuesto;
    }

    // Método para calcular precio final con descuento y cantidad
    public static double calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5; // Aumentar descuento en 5%
        }
        double precioConDescuento = precio * (1 - descuento / 100);
        return precioConDescuento * cantidad;
    }

    // Método para reponer stock en un índice específico
    public static void reponerStock(int[] stock, int indice, int unidades) {
        if (indice >= 0 && indice < stock.length) {
            stock[indice] += unidades;
        } else {
            System.out.println("Índice fuera de rango para reponer stock.");
        }
    }

    // Método para mostrar stock
    public static void mostrarStock(int[] stock) {
        for (int i = 0; i < stock.length; i++) {
            System.out.println("Producto " + (i + 1) + ": " + stock[i] + " unidades");
        }
    }

    // Sobrecarga: mostrar mensaje simple
    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    // Sobrecarga: mostrar mensaje repetido n veces
    public static void mostrarMensaje(String mensaje, int veces) {
        for (int i = 0; i < veces; i++) {
            System.out.println(mensaje);
        }
    }

    // Método para formatear cadena (capitalizar palabras y eliminar espacios extras)
    public static String formatearCadena(String texto) {
        texto = texto.trim().toLowerCase();
        String[] palabras = texto.split("\\s+");
        StringBuilder resultado = new StringBuilder();
        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                resultado.append(Character.toUpperCase(palabra.charAt(0)))
                        .append(palabra.substring(1))
                        .append(" ");
            }
        }
        return resultado.toString().trim();
    }

    // Método para mostrar información de la cadena
    public static void mostrarInfoCadena(String cadena) {
        System.out.println("Cadena formateada: " + cadena);
        System.out.println("Longitud: " + cadena.length());
        System.out.println("Primera letra: " + cadena.charAt(0));
        System.out.println("¿Contiene 'Chai'?: " + cadena.contains("Chai"));
    }
}

package techlab.clases.c4;

public class GestionVentas {

    // 1. Método para calcular impuesto
    public static double calcularImpuesto(double precio, double porcentajeImpuesto) {
        return precio + (precio * porcentajeImpuesto / 100);
    }

    // 2. Método para calcular precio final con descuento variable
    public static void calcularPrecioFinal(double precio, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5; // Aumento del 5% en descuento
        }
        double precioTotal = precio * cantidad * (1 - descuento / 100);
        System.out.printf("Precio final con %.1f%% de descuento: $%.2f\n", descuento, precioTotal);
    }

    // 3. Gestión de stock
    public static void mostrarStock(int[] stock) {
        System.out.print("Stock actual: [");
        for (int i = 0; i < stock.length; i++) {
            System.out.print(stock[i] + (i < stock.length-1 ? ", " : ""));
        }
        System.out.println("]");
    }

    public static void reponerStock(int[] stock, int indice, int unidades) {
        if (indice >= 0 && indice < stock.length) {
            stock[indice] += unidades;
        }
    }

    // 4. Sobrecarga de métodos
    public static void mostrarMensaje(String mensaje) {
        System.out.println("[Info] " + mensaje);
    }

    public static void mostrarMensaje(String mensaje, int numero) {
        System.out.printf("[Cliente #%d] %s\n", numero, mensaje);
    }

    public static void main(String[] args) {
        // Prueba cálculo de impuestos
        System.out.println("Precio con impuesto: $" + calcularImpuesto(100, 21));

        // Prueba cálculo precios con descuento
        calcularPrecioFinal(50.0, 10, 45);
        calcularPrecioFinal(50.0, 10, 60);

        // Gestión de stock
        int[] stock = {100, 200, 150};
        System.out.println("\n--- Gestión de Stock ---");
        mostrarStock(stock);
        reponerStock(stock, 1, 50);
        System.out.println("Después de reposición:");
        mostrarStock(stock);

        // Mensajes con sobrecarga
        System.out.println("\n--- Mensajes ---");
        mostrarMensaje("Bienvenido nuevo cliente");
        mostrarMensaje("Tienes puntos acumulados", 12345);
    }
}

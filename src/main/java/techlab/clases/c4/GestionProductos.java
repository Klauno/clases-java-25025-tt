package techlab.clases.c4;

public class GestionProductos {

    // Método para calcular precio final con descuento variable
    public static void calcularPrecioFinal(double precioUnitario, double descuento, int cantidad) {
        if (cantidad > 50) {
            descuento += 5; // Aumento del 5% adicional
        }
        double precioTotal = precioUnitario * cantidad * (1 - descuento / 100);
        System.out.printf("Cantidad: %d | Descuento: %.1f%% | Total: $%.2f\n",
                cantidad, descuento, precioTotal);
    }

    // Métodos para gestión de stock
    private static int[] stock = new int[3]; // Array para 3 productos

    public static void mostrarStock() {
        System.out.println("Stock Actual: " + java.util.Arrays.toString(stock));
    }

    public static void reponerStock(int indice, int unidades) {
        if (indice >= 0 && indice < stock.length) {
            stock[indice] += unidades;
            System.out.printf("Reponiendo %d unidades al producto %d\n", unidades, indice);
        } else {
            System.out.println("Índice inválido para reposición");
        }
    }

    public static void main(String[] args) {
        // Prueba del método de precios
        System.out.println("--- Cálculo de Precios ---");
        calcularPrecioFinal(100.0, 10, 30);  // Sin descuento adicional
        calcularPrecioFinal(50.0, 5, 60);    // Con descuento incrementado

        // Prueba del sistema de stock
        System.out.println("\n--- Gestión de Stock ---");
        mostrarStock();  // Stock inicial (todos en 0)

        reponerStock(1, 50);  // Reposición al producto 1
        mostrarStock();

        reponerStock(0, 30);  // Reposición al producto 0
        reponerStock(2, 100); // Reposición al producto 2
        mostrarStock();
    }
}

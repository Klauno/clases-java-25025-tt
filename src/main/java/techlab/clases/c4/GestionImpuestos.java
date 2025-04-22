package techlab.clases.c4;

public class GestionImpuestos {

    // Método para cálculo de impuestos
    public static double calcularImpuesto(double precio, double porcentajeImpuesto) {
        return precio * (1 + porcentajeImpuesto / 100);
    }

    // Método principal con casos de prueba
    public static void main(String[] args) {
        // Caso 1: Producto básico con 21% IVA
        double precioFinal1 = calcularImpuesto(100.0, 21.0);
        System.out.printf("Precio con 21%% IVA: $%.2f\n", precioFinal1);

        // Caso 2: Producto premium con 10% impuesto
        double precioFinal2 = calcularImpuesto(250.50, 10.0);
        System.out.printf("Precio con 10%% impuesto: $%.2f\n", precioFinal2);

        // Caso 3: Servicio con 5% tasa especial
        double precioFinal3 = calcularImpuesto(1500.75, 5.0);
        System.out.printf("Precio con 5%% tasa: $%.2f\n", precioFinal3);
    }
}

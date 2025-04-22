package techlab.clases.c5;

public class Producto {
    // Atributos
    private String nombre;
    private double precio;
    private int stock;

    // Constructor
    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    // Método para mostrar información del producto
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + precio);
        System.out.println("Stock: " + stock);
    }

    // Método para aplicar un descuento del 10% al precio
    public void aplicarDescuento() {
        double descuento = precio * 0.10; // 10% del precio
        precio -= descuento; // Reducir el precio
    }

    // Método main para probar
    public static void main(String[] args) {
        // Crear productos con distintos precios
        Producto producto1 = new Producto("Laptop", 1200.50, 10);
        Producto producto2 = new Producto("Mouse", 25.00, 50);
        Producto producto3 = new Producto("Teclado", 45.99, 30);

        // Mostrar info antes del descuento
        System.out.println("Antes del descuento:");
        producto1.mostrarInformacion();
        System.out.println();
        producto2.mostrarInformacion();
        System.out.println();
        producto3.mostrarInformacion();
        System.out.println();

        // Aplicar descuento del 10%
        producto1.aplicarDescuento();
        producto2.aplicarDescuento();
        producto3.aplicarDescuento();

        // Mostrar info después del descuento
        System.out.println("Después del descuento del 10%:");
        producto1.mostrarInformacion();
        System.out.println();
        producto2.mostrarInformacion();
        System.out.println();
        producto3.mostrarInformacion();
    }
}

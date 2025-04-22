package techlab.clases.c6;

public class Main {
    public static void main(String[] args) {
        // Crear clientes con validación de email
        Cliente cliente1 = new Cliente("Silvia Gómez", "silvia.gomez@example.com");
        Cliente cliente2 = new Cliente("Matías Fernández", "matias.fernandezexample.com"); // email inválido
        cliente2.setEmail("matias.fernandez@example.com"); // corregir email

        cliente1.mostrarInformacion();
        System.out.println();
        cliente2.mostrarInformacion();
        System.out.println();

        // Crear productos
        Producto p1 = new Producto("Laptop", 1200.50, 10);
        Producto p2 = new Producto("Mouse", 25.00, 50);
        Producto p3 = new Producto("Teclado", 45.99, 30);

        // Intentar asignar stock negativo
        p2.setCantidadEnStock(-10); // no se debe actualizar

        // Mostrar productos
        p1.mostrarInformacion();
        System.out.println();
        p2.mostrarInformacion();
        System.out.println();
        p3.mostrarInformacion();
        System.out.println();

        // Mostrar cantidad total de productos creados
        System.out.println("Total de productos creados: " + Producto.getContadorProductos());
        System.out.println();

        // Crear carrito y agregar productos
        Carrito carrito = new Carrito();
        carrito.agregarProducto(p1);
        carrito.agregarProducto(p2);
        carrito.agregarProducto(p3);

        // Mostrar productos en carrito y total
        System.out.println("Productos en el carrito:");
        carrito.mostrarProductos();

        System.out.println("Total a pagar: $" + carrito.calcularTotal());
    }
}

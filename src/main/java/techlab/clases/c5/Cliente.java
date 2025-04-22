package techlab.clases.c5;

public class Cliente {
    // Atributos
    private String nombre;
    private String email;

    // Constructor que recibe nombre y email
    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Método para mostrar información del cliente
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Email: " + email);
    }

    // Método main para crear clientes y mostrarlos
    public static void main(String[] args) {
        // Crear varios clientes usando el constructor
        Cliente cliente1 = new Cliente("Silvia Gómez", "silvia.gomez@example.com");
        Cliente cliente2 = new Cliente("Matías Fernández", "matias.fernandez@example.com");
        Cliente cliente3 = new Cliente("Sabrina López", "sabrina.lopez@example.com");

        // Mostrar información de cada cliente
        cliente1.mostrarInformacion();
        System.out.println();
        cliente2.mostrarInformacion();
        System.out.println();
        cliente3.mostrarInformacion();
    }
}

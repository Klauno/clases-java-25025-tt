package techlab.clases.c4;

public class MensajeriaCliente {

    // Método para clientes nuevos
    public static void mostrarMensaje(String mensaje) {
        System.out.println("[NUEVO CLIENTE] " + mensaje);
    }

    // Método para clientes recurrentes
    public static void mostrarMensaje(String mensaje, int idCliente) {
        System.out.printf("[CLIENTE RECURRENTE #%d] %s%n", idCliente, mensaje);
    }

    public static void main(String[] args) {
        // Flujo para cliente nuevo
        mostrarMensaje("Bienvenido a nuestra plataforma digital");
        mostrarMensaje("Complete su perfil para obtener beneficios");

        // Flujo para cliente recurrente
        mostrarMensaje("Acceso a descuentos exclusivos", 1024);
        mostrarMensaje("Tiene 150 puntos disponibles", 2048);
    }
}


package techlab.practicas.p2;

import java.util.Scanner;

public class EjercicioClase2 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int precioArroz = 2000;
        System.out.println("🍚 Te damos la bienvenida a la tienda de arroz 🍚");
        System.out.println("Ingrese su nombre: ");
        String nombreUsuario = entrada.nextLine();
        System.out.println("Cada kilo de arroz cuesta: " + precioArroz);
        System.out.println("Cuantos kilos desea comprar?: ");
        int cantidadArroz = entrada.nextInt();
        // Verificamos si aplica descuento especial
        if (cantidadArroz > 100) {
            System.out.println("¡Felicitaciones! Por comprar más de 100 kilos, aplica un descuento especial.");
        }
        int total = precioArroz * cantidadArroz;
        System.out.println(nombreUsuario + ", el coste total seria: " + total);

        // --- BUCLES ---
        System.out.println("\nAhora, ingrese un número para imprimir desde 1 hasta ese número:");
        int numero = entrada.nextInt();

        // Usando for
        System.out.println("Imprimiendo con for:");
        for (int i = 1; i <= numero; i++) {
            System.out.println(i);
        }

        // Usando while
        System.out.println("Imprimiendo con while:");
        int contador = 1;
        while (contador <= numero) {
            System.out.println(contador);
            contador++;
        }

        // Comparación breve
        System.out.println("\nComparación:");
        System.out.println("El bucle for es más compacto y fácil de leer cuando conocés de antemano cuántas veces se va a repetir.");
        System.out.println("El bucle while es útil cuando la cantidad de repeticiones depende de una condición que puede cambiar dentro del bucle.");
    }
}
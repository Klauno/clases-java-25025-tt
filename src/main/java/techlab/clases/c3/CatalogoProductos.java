package techlab.clases.c3;
import java.util.ArrayList;

public class CatalogoProductos {
    public static void main(String[] args) {
        // Manipulación de cadenas
        String cadena = " té CHAi ";

        // Limpiar espacios y formatear cada palabra con mayúscula inicial
        cadena = formatearCadena(cadena);

        System.out.println("Cadena formateada: " + cadena);
        System.out.println("Longitud de la cadena: " + cadena.length());
        System.out.println("Primera letra: " + cadena.charAt(0));
        System.out.println("¿Contiene 'Chai'?: " + cadena.contains("Chai"));

        // Arrays
        String[] productos = new String[5];
        productos[0] = "Arroz";
        productos[1] = "Frijoles";
        productos[2] = "Azúcar";
        productos[3] = "Sal";
        productos[4] = "Aceite";

        // Imprimir productos
        System.out.println("\nProductos en el catálogo:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println((i + 1) + ". " + productos[i]);
        }

        // Intentar agregar un sexto producto
        System.out.println("\nIntentando agregar un sexto producto...");
        try {
            productos[5] = "Harina";  // Esto lanzará excepción
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: No se puede agregar un sexto producto porque el array tiene tamaño fijo.");
            System.out.println("Excepción: " + e);
        }

        // ArrayList
        ArrayList<String> productosArrayList = new ArrayList<>();

        // Agregar productos
        productosArrayList.add("Arroz");
        productosArrayList.add("Frijoles");
        productosArrayList.add("Azúcar");
        productosArrayList.add("Sal");
        productosArrayList.add("Aceite");
        productosArrayList.add("Harina");

        // Imprimir lista inicial
        System.out.println("\nLista de productos inicial:");
        System.out.println(productosArrayList);

        // Eliminar un producto
        productosArrayList.remove("Azúcar");

        // Verificar si existe un producto
        System.out.println("\n¿Existe 'Frijoles'?: " + productosArrayList.contains("Frijoles"));

        // Imprimir lista final
        System.out.println("\nLista de productos final:");
        System.out.println(productosArrayList);

        // Combinar Cadenas y Listas
        ArrayList<String> productosDesprolijos = new ArrayList<>();
        productosDesprolijos.add(" té CHAi ");
        productosDesprolijos.add(" arroz ");
        productosDesprolijos.add(" FRIJOLES ");

        // Imprimir lista desprolija
        System.out.println("\nLista de productos desprolijos:");
        System.out.println(productosDesprolijos);

        // Formatear nombres
        ArrayList<String> productosProlijos = formatearNombres(productosDesprolijos);

        // Imprimir lista prolija
        System.out.println("\nLista de productos prolijos:");
        System.out.println(productosProlijos);
    }

    // Método para formatear cadena
    public static String formatearCadena(String texto) {
        texto = texto.trim().toLowerCase();
        String[] palabras = texto.split(" ");
        for (int i = 0; i < palabras.length; i++) {
            if (!palabras[i].isEmpty()) {
                palabras[i] = palabras[i].substring(0, 1).toUpperCase() + palabras[i].substring(1);
            }
        }
        return String.join(" ", palabras);
    }

    // Método para formatear nombres de productos
    public static ArrayList<String> formatearNombres(ArrayList<String> lista) {
        ArrayList<String> listaFormateada = new ArrayList<>();
        for (String producto : lista) {
            listaFormateada.add(formatearCadena(producto));
        }
        return listaFormateada;
    }
}

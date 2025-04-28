package techlab.practicas.p3;

public class textoFormatear {
    public static void main(String[] args) {
        String original = " té CHAi ";

        // 1. Eliminar espacios al inicio y final
        String sinEspacios = original.trim(); // "té CHAi"

        // 2. Convertir todo a minúsculas
        String minusculas = sinEspacios.toLowerCase(); // "té chai"

        // 3. Separar en palabras y capitalizar cada una
        String[] palabras = minusculas.split("\\s+");
        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            if (!palabra.isEmpty()) {
                // Capitalizar primera letra + resto en minúsculas
                String palabraFormateada = palabra.substring(0, 1).toUpperCase()
                        + palabra.substring(1);
                resultado.append(palabraFormateada).append(" ");
            }
        }

        String formateado = resultado.toString().trim(); // "Té Chai"

        System.out.println("Cadena formateada: " + formateado);
    }
}
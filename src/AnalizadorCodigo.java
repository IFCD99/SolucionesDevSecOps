
import java.io.BufferedReader;    // Importa la clase BufferedReader para leer texto de forma eficiente línea por línea
import java.io.FileReader;        // Importa la clase FileReader para leer archivos desde el sistema de archivos
import java.io.IOException;       // Importa la clase IOException para manejar errores de entrada/salida

public class AnalizadorCodigo {   // Define la clase principal llamada AnalizadorCodigo
    public static void main(String[] args) {  // Método principal que se ejecuta al iniciar el programa
        if (args.length != 1) {   // Verifica que se haya pasado exactamente un argumento (la ruta del archivo)
            System.out.println("Uso: java AnalizadorCodigo <ruta_al_archivo_java>");  // Muestra mensaje de uso correcto
            return;  // Termina la ejecución si no se proporcionó correctamente el argumento
        }

        String rutaArchivo = args[0];  // Guarda la ruta del archivo pasado como argumento

        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {
            // Crea un BufferedReader para leer el archivo línea por línea

            String linea;             // Variable para guardar cada línea leída del archivo
            int numeroLinea = 1;     // Contador para llevar el número de línea actual

            while ((linea = lector.readLine()) != null) {  // Lee cada línea del archivo hasta que no haya más
                if (contienePatronPeligroso(linea)) {       // Verifica si la línea contiene un patrón peligroso
                    System.out.println("⚠️ Advertencia en línea " + numeroLinea + ": " + linea.trim());
                    // Si es peligrosa, imprime una advertencia con el número de línea y su contenido
                }
                numeroLinea++;       // Aumenta el contador de línea
            }

        } catch (IOException e) {  // Captura errores de lectura del archivo
            System.err.println("Error al leer el archivo: " + e.getMessage());  // Muestra el mensaje de error
        }
    }

    private static boolean contienePatronPeligroso(String linea) {
        // Método auxiliar que verifica si una línea contiene un patrón sospechoso

        String contenido = linea.toLowerCase();  // Convierte la línea a minúsculas para hacer búsqueda insensible a mayúsculas

        // Devuelve true si contiene alguna de las palabras sospechosas
        return contenido.contains("password=") || contenido.contains("1234") || contenido.contains("admin");
    }
}

import java.io.IOException;                         // Manejo de errores de entrada/salida
import java.nio.file.Files;                         // Para leer archivos como listas de líneas
import java.nio.file.Paths;                         // Para construir rutas de archivos
import java.util.stream.IntStream;                  // Permite recorrer índices de forma funcional
import java.util.List;                              // Representa la lista de líneas del archivo

// Clase principal del programa
public class AnalizadorCodigoModerno {
    // Método principal (puede lanzar IOException)
    public static void main(String[] args) throws IOException {
        // Verifica que se pase exactamente un argumento
        if (args.length != 1) {
            System.out.println("Uso: java AnalizadorCodigoModerno <ruta_al_archivo_java>");
            return;                                 // Sale del programa si no hay argumento
        }

        // Lee todas las líneas del archivo como una lista
        List<String> lineas = Files.readAllLines(Paths.get(args[0]));

        // Crea un stream de números desde 0 hasta el número de líneas
        IntStream.range(0, lineas.size())
                .filter(i -> contienePatronPeligroso(lineas.get(i))) // Filtra los índices cuyas líneas son peligrosas
                .forEach(i -> System.out.println("⚠️ Advertencia en línea " + (i + 1) + ": " + lineas.get(i).trim()));
        // Para cada línea sospechosa, imprime la advertencia con su número y contenido
    }

    // Método auxiliar para buscar patrones peligrosos
    private static boolean contienePatronPeligroso(String linea) {
        // Convierte la línea a minúsculas (insensible a mayúsculas)
        String contenido = linea.toLowerCase();

        return contenido.contains("password=") ||                    // Busca si contiene "password="
                contenido.contains("1234") ||                         // O si contiene "1234"
                contenido.contains("admin");                          // O si contiene "admin"
    }
}


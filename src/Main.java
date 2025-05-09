import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Obtener la ruta del archivo desde los argumentos
        String rutaArchivo = "EjemploCodigo.java";

        String[] argumentos = {rutaArchivo};

        try {
            // Llamada al AnalizadorCodigo (Versión clásica)
            System.out.println("Ejecutando AnalizadorCodigo...");
            AnalizadorCodigo.main(argumentos);  // Llamar al main de AnalizadorCodigo

            // Llamada al AnalizadorCodigoModerno (Versión moderna)
            System.out.println("Ejecutando AnalizadorCodigoModerno...");
            AnalizadorCodigoModerno.main(argumentos);  // Llamar al main de AnalizadorCodigoModerno

        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
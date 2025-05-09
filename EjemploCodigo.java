public class EjemploCodigo {

    private static final String DB_USER = "admin";
    private static final String DB_PASSWORD = "1234"; // TODO: proteger esta contraseña

    public static void main(String[] args) {
        conectarBaseDeDatos();
    }

    public static void conectarBaseDeDatos() {
        String url = "jdbc:mysql://localhost:3306/miBD";

        // conexión directa sin cifrado ni variables de entorno
        System.out.println("Conectando a la base de datos con usuario: " + DB_USER);
        System.out.println("Contraseña: " + DB_PASSWORD);

        // Simulación de operación
        System.out.println("Conexión exitosa. Ejecutando consulta...");
    }

    // Método de autenticación insegura
    public static boolean autenticar(String user, String pass) {
        // Validación insegura de credenciales
        return user.equals("admin") && pass.equals("1234");
    }
}
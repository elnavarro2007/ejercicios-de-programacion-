public class Pruebas {
    static void main(String[] args) {

        try {
// Lanzamos una excepción intencionadamente
            throw new IllegalArgumentException("Error: El argumento es inválido");
        } catch (IllegalArgumentException ex) {
// Manejo de la excepción
            System.out.println("Mensaje de excepción: " + ex.getMessage());
            System.out.println("Causa de la excepción: " + ex.getCause());
            ex.printStackTrace(); // Muestra la pila de llamadas
        } finally {
// Código que se ejecuta siempre, incluso si hubo excepción
            System.out.println("Bloque finally ejecutado");
        }
    }
}

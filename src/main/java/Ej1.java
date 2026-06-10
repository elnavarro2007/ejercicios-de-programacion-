import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 * Práctica UD8 – Ficheros y Regex
 * Sin funciones auxiliares: todo el procesamiento está dentro del main.
 */
public class Ej1 {

    public static void main(String[] args) {

        String ficheroEntrada = "usuarios.txt";
        String ficheroValidos = "usuarios_validos.txt";
        String ficheroInvalidos = "usuarios_invalidos.txt";

        // Expresiones regulares
        Pattern regexNombre = Pattern.compile("[A-Za-záéíóúÁÉÍÓÚñÑ\\s ]{1,200}");
        Pattern regexEmail = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9_/.-]+\\.[a-zA-Z]{2,}");
        Pattern regexTelefono = Pattern.compile("[0-9]{1}[0-9]{8}");
        Pattern regexDni = Pattern.compile("[0-9]{8}[A-Z]{1}");

        List<String> validos = new ArrayList<>();
        List<String> invalidos = new ArrayList<>();

        // ── 1. Lectura y validación ────────────────────────────────────────────
        try (BufferedReader br = new BufferedReader(
                new InputStreamReader(new FileInputStream(ficheroEntrada)))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                linea = linea.trim();
                if (linea.isEmpty()) continue;

                String[] campos = linea.split(";");

                // Comprobar que hay exactamente 4 campos
                if (campos.length != 4) {
                    invalidos.add(linea + "Invalido : ");
                    continue;
                }

                String nombre = campos[0];
                String email = campos[1];
                String telefono = campos[2];
                String dni = campos[3];

                // Validar cada campo con su regex
                boolean nombreOk = regexNombre.matcher(nombre).matches();
                boolean emailOk = regexEmail.matcher(email).matches();
                boolean telefonoOk = regexTelefono.matcher(telefono).matches();
                boolean dniOk = regexDni.matcher(dni).matches();

                // Construir mensaje de error si hace falta
                if (nombreOk && emailOk && telefonoOk && dniOk) {
                    validos.add(linea);
                } else {


                    invalidos.add(linea);
                }
            }

        } catch (FileNotFoundException e) {
            System.err.println("ERROR: No se encontró el fichero '" + ficheroEntrada + "'.");
            return;
        } catch (IOException e) {
            System.err.println("ERROR de lectura: " + e.getMessage());
            return;
        }

        // ── 2. Escritura de usuarios_validos.txt ──────────────────────────────
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(ficheroValidos)))) {

            for (String linea : validos) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Fichero generado: " + ficheroValidos);

        } catch (IOException e) {
            System.err.println("ERROR al escribir '" + ficheroValidos + "': " + e.getMessage());
        }

        // ── 3. Escritura de usuarios_invalidos.txt ────────────────────────────
        try (BufferedWriter bw = new BufferedWriter(
                new OutputStreamWriter(new FileOutputStream(ficheroInvalidos),
                        StandardCharsets.UTF_8))) {

            for (String linea : invalidos) {
                bw.write(linea);
                bw.newLine();
            }
            System.out.println("Fichero generado: " + ficheroInvalidos);

        } catch (IOException e) {
            System.err.println("ERROR al escribir '" + ficheroInvalidos + "': " + e.getMessage());
        }

        // ── 4. Resumen ────────────────────────────────────────────────────────
        System.out.println("=== Procesamiento completado ===");
        System.out.println("Registros válidos  : " + validos.size());
        System.out.println("Registros inválidos: " + invalidos.size());

    }
}
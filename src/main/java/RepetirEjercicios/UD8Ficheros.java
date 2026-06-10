package RepetirEjercicios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class UD8Ficheros {
    static void main(String[] args) throws RuntimeException {
        String archivo = "usuarios.txt";
        String incorrectos = "UsuarioInvalido.txt";
        String correctos = "UsuarioValido.txt";

        List<String> listaCorrectos = new ArrayList<>();
        List<String> listaIncorrectos = new ArrayList<>();

        Pattern regexNombreApellido = Pattern.compile("[A-Za-záéíóúÑñÁÉÍÓÚ\\s]{1,200}");
        Pattern regexEmail = Pattern.compile("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9_/.-]+\\.[a-zA-Z]{2,}");
        Pattern regexTelefono = Pattern.compile("[0-9]{1}[0-9]{8}");
        Pattern regexDni = Pattern.compile("[0-9]{8}[A-Z]{1}");

        try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(archivo)))) {
            String linea;

            while ((linea = br.readLine()) != null) {
                linea = linea.trim();

                String[] campos = linea.split(";");

                if (linea.isEmpty()) {
                    continue;
                }

                if (campos.length != 4) {
                    listaCorrectos.add(linea + " Invalido, no cumple los 4 campos");

                }
                String nombres = campos[0];
                String email = campos[1];
                String telefono = campos[2];
                String dni = campos[3];

                boolean verificarNombre = regexNombreApellido.matcher(nombres).matches();
                boolean verificarEmail = regexEmail.matcher(email).matches();
                boolean verificarTelefono = regexTelefono.matcher(telefono).matches();
                boolean verificarDNI = regexDni.matcher(dni).matches();

                if (verificarNombre && verificarEmail && verificarTelefono && verificarDNI) {
                    listaCorrectos.add(linea);
                } else {
                    listaIncorrectos.add(linea);
                }

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        // meter usuarios correctos

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(correctos))) {

            for (String l : listaCorrectos) {
                bw.write(l);
                bw.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(correctos))) {
            for (String s : listaIncorrectos){
                bw.write(s);
                bw.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println(listaCorrectos.size());
        System.out.println(listaIncorrectos.size());


    }
}

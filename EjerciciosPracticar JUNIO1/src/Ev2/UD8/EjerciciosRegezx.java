package Ev2.UD8;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EjerciciosRegezx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce un correo : ");
        String correo = sc.nextLine();

        Pattern regexCorreo = Pattern.compile("[A-Za-z0-9,._/]+@[A-Za-z0-9,._/]+\\.[A-Za-z0-9,._/]{2,}");
        Matcher matcherCorreo = regexCorreo.matcher(correo);

        if (matcherCorreo.matches()) {
            System.out.println("La direccion de correo es correcta");
        } else {
            System.out.println("La direccion de correo no es valida");
        }

        // ----------------


        System.out.print("Introduce un numero de telefono con el formato 111-111-1111 : ");

        String telefono = sc.nextLine().trim();

        Pattern regexTelefono = Pattern.compile("\\d{3}-\\d{3}-\\d{4}");

        if (regexTelefono.matcher(telefono).matches()) {
            System.out.println("El telefono esta bien escrito");
        } else {
            System.out.println("No esta bien escrito");
        }

        // ----------------------

        System.out.println("Introduce una cadena de texto");
        String frase = sc.nextLine();
        int contador = 0;

        String[] copia = frase.split(" ");

        Pattern regexFrase = Pattern.compile("[A-ZÁÉÍÓÚ].*");

        for (String s : copia) {
            if (regexFrase.matcher(s).matches()) {
                contador++;
            }
        }
        System.out.println("Hay " + contador + " palabras que empiezan por mayuscula");

        // -------------

        System.out.println("Introduce una fecha");
        String fecha = sc.nextLine();

        Pattern patterFecha = Pattern.compile("([0-2]{1}[0-9]{1}|[3]{1}[0-1]{1})/([0]{1}[1-9]{1}|[1]{1}[0-2]{1})/[0-9]{1,4}");
        if (patterFecha.matcher(fecha).matches()) {
            System.out.println("Fecha correcta");
        } else {
            System.out.println("Fecha incorrecta");
        }

        // --------------

        System.out.println("Introduce una frase");
        String frase2 = sc.nextLine();
        String[] copia2 = frase2.split(" ");
        int contador2 = 0;

        Pattern patterLongitud = Pattern.compile("[A-Za-záéíóúÁÉÍÓÚ]{5,}");
        Matcher matcherLongitud = patterLongitud.matcher(frase2);

        while (matcherLongitud.find()) {
            System.out.println("Palabra con mas de 5 letras : " + matcherLongitud.group());
            contador2++;
        }


        System.out.println(" Hay " + contador2 + " palabras con mas de 5 letras");

        // -------------

        System.out.println(" Introduce una contraseña : ");
        String password = sc.nextLine().trim();
        Pattern mayusculas = Pattern.compile(".*[A-Z]{1,}.*");
        Pattern minusculas = Pattern.compile(".*[a-z]{1,}.*");
        Pattern numeros = Pattern.compile(".*[0-9]{1,}.*");
        Pattern especial = Pattern.compile(".*[@#%_/]{1,}.*");
        Pattern longitud = Pattern.compile(".{8,}");

        if (!mayusculas.matcher(password).matches()) {
            System.out.println("Debe tener al menos una mayuscula");
        } else if (!minusculas.matcher(password).matches()) {
            System.out.println("Debe tener al menos una minuscula");
        } else if (!numeros.matcher(password).matches()) {
            System.out.println("Debe tener al menos una numeros");
        } else if (!especial.matcher(password).matches()) {
            System.out.println("Debe tener al menos una especial");
        } else if (!longitud.matcher(password).matches()) {
            System.out.println("Debe tener al menos 8 caracteres");
        }else {
            System.out.println("Contraseña valida");
        }

    }

    public static class Ej23 {
        public static void main(String[] args) {
            String archivo = "textoRacistaHechoporunaIA.txt";
            String archivo2 = "textoRacistaHechoporJava.txt";
            ArrayList<String> lista = new ArrayList<>();

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
                String linea;

                while ((linea= br.readLine()) != null){
                    String[] palabra = linea.toLowerCase().split(" ");
                    for (String s :palabra){
                        if (s.equals("negro")){
                            s.replace("negro","blanco");
                            lista.add(s);
                        }
                        lista.add(s);
                    }
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }

            try (BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(archivo2)))){

                for (String s : lista){
                    bw.write(s);
                    bw.newLine();
                }




            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }
    }
}

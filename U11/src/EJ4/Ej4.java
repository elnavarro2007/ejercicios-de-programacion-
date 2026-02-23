package EJ4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Ej4 {
    /* //Esta bien
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("monitor", "keyboard", "trackpad", "computer"));
        System.out.println(lista);

        System.out.print("Introduce la palabra que quieres cambiar: ");
        String buscar = sc.nextLine();

        System.out.print("Introduce la palabra que quieres sustituir: ");
        String sustituto = sc.nextLine();

        if (lista.contains(buscar.toLowerCase())) {

            int indice = lista.indexOf(buscar);
            lista.set(indice, sustituto);
            System.out.println(lista);


        } else {
            System.out.println("No se ha encontrado la palabra");
        }


    }
    */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String palabra = "monitor,keyboard,trackpad,computer";

        String[] palabras = palabra.split(",");

        System.out.println(Arrays.toString(palabras));
        System.out.print("Dime la palabra a sustituir: ");
        String sustituto = scanner.next();

        System.out.print("Dime la palabra que quieres: ");
        String quieres = scanner.next();

        for (int i = 0; i < palabras.length; i++) {
            if (palabras[i].equals(sustituto)) {
                palabras[i] = quieres;
            }
        }

        System.out.println(Arrays.toString(palabras));


    }
}

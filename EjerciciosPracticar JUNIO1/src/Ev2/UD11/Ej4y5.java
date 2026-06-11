package Ev2.UD11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ej4y5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>(Arrays.asList("monitor", "keyboard", "trackpad", "computer"));
        System.out.println(list);

        System.out.println("Busca la palabra");
        String palabra = sc.nextLine();
        System.out.println("Introduce la palabra sustituta");
        String sustituto = sc.nextLine();
        if (list.contains(palabra)) {
            int indice = list.indexOf(palabra);
            list.set(indice, sustituto);
        }

        System.out.println("Nueva lista : " + list);

        System.out.println("Elimina un elementode la lista");
        System.out.println("Busca la palabra");
        String palabra2 = sc.nextLine();
        if (list.contains(palabra2)){
            int indice = list.indexOf(palabra2);
            list.remove(indice);
        }
        System.out.println("Nuevo indice : "+list);
    }
}

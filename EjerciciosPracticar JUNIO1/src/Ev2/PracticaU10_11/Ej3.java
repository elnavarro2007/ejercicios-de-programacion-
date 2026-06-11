package Ev2.PracticaU10_11;

import java.util.HashMap;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine().toLowerCase();
        char c = 0;
        int posicion = 0;
        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < frase.length(); i++) {
            char c2 = frase.charAt(i);
            if (map.containsKey(c2)) {
                c = c2;
                posicion = i;
                break;
            } else {
                map.put(c2, i);
            }

        }

        System.out.println("El primer caracter : " + c + " se repite en la posicion : " + (posicion + 1));


    }
}

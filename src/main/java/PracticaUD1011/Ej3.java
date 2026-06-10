package PracticaUD1011;

import java.util.HashMap;
import java.util.Scanner;

public class Ej3 {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce una frase");
        String frase = sc.next().toLowerCase();

        HashMap<Character, Integer> visto = new HashMap<>();
        int posicion = 0;
        char caracterRepetido = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (visto.containsKey(c)) {
                caracterRepetido = c;
                posicion = i;

                break;
            } else {
                visto.put(c, i);
            }


        }


        if (posicion != 0) {
            System.out.println(" Carácter repetido : " + caracterRepetido + " En la posicion : " + posicion);
        } else {
            System.out.println("No se ha repetido ningun caracter");
        }


    }
}

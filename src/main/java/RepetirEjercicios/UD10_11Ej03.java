package RepetirEjercicios;

import java.util.HashMap;
import java.util.Scanner;

public class UD10_11Ej03 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = sc.nextLine().toLowerCase().trim();
        frase = frase.replace(" ","");

        HashMap<Character, Integer> map = new HashMap<>();
        char caracter = 0;
        int posicion = 0;
        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);
            if (map.containsKey(c)) {
                caracter = c;
                posicion = i;
                break;
            } else {
                map.put(c, i);
            }
        }

        if (posicion != 0) {
            System.out.println("El primer caracter que se repite es : " + caracter + " en la posicion  " + posicion);

        } else {
            System.out.println("No se ha repetido ningun caracter");

        }
    }
}

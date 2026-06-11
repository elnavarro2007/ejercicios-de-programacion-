package Ev1;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean booleano = true;

        while (booleano) {
            System.out.println("Introduce una frase");
            String frase = sc.nextLine().trim().toLowerCase();
            String[] copia = frase.split(" ");
            System.out.println("Introduce otra frase");
            String frase2 = sc.nextLine().toLowerCase();
            String[] copia2 =  frase2.split(" ");

            if (copia[copia.length -1 ].equals(copia2[0])){
                booleano = false;
                System.out.println("La letra del final coincide con la primera palabra de la segunda frase");
            }else {
                System.out.println("No se cumple ");
            }





        }
    }
}

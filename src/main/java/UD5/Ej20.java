package UD5;

import java.util.Scanner;

public class Ej20 {
    static void main(String[] args) {
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");

        String frase = sc.nextLine().toLowerCase().replace(" ","");




        for (int i = 0; i<frase.length();i++){
            if(frase.charAt(i)== 's'){
                System.out.println("La s esta en la posicion : "+(i+1));
                contador++;
            }
        }
        System.out.println("La letra s aparece "+contador+ " veces" );
    }
}

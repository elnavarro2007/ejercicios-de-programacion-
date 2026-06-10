package UD5;

import java.util.Scanner;

public class Ej21 {
    static void main() {
        int contador = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");

        String frase = sc.nextLine().toLowerCase().replace(" ","").replace("á","a").replace("Á","a");




        for (int i = 0; i<frase.length();i++){
            if(frase.charAt(i)== 'a'){
                System.out.println("La a esta en la posicion : "+(i+1));
                contador++;
            }
        }
        System.out.println("La letra s aparece "+contador+ " veces" );
    }
}

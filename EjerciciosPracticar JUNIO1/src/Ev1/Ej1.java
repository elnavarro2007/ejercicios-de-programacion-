package Ev1;

import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        // a
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce una frase : ");
        String frase = sc.nextLine().toLowerCase().trim();

        // para copiar el string
        String copia = "";

        for (int i = 0; i<frase.length();i++){
            // verifico si son vocales
            if(frase.charAt(i) == 'a' || frase.charAt(i) == 'e'  || frase.charAt(i) == 'i' || frase.charAt(i) == 'o' || frase.charAt(i) == 'u' || frase.charAt(i) == 'á' || frase.charAt(i) == 'é'  || frase.charAt(i) == 'í' || frase.charAt(i) == 'ó' || frase.charAt(i) == 'ú' ){
                copia = copia.trim() + " " + frase.charAt(i);
            }
        }

        System.out.println(copia);

        // b
        System.out.print("Introduce una frase : ");
        String frase2 = sc.nextLine().toLowerCase();

        String copia2 = frase2.replace("a","A").replace("e","E").replace("i","I").replace("o","O").replace("u","U").replace("á","Á").replace("é","É").replace("í","Í").replace("ó","Ó").replace("ú","Ú");

        System.out.println(copia2);
    }
}

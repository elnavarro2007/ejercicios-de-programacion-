package UD5;

import java.util.Scanner;

public class Ej15 {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = scanner.nextLine();


        String copia = "" ;



        System.out.println(reverso(frase,copia));


    }

    static String reverso(String frase, String copia){
        for (int i = 0;i<frase.length()  ;i++){
            copia = copia + frase.charAt(frase.length() -i -1);
        }
        return copia;
    }
}

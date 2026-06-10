package UD5;

import java.util.Scanner;

public class Ej17 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una frase");
        String frase = sc.nextLine();
        System.out.println(quitarEspacios(frase));
    }
    static String quitarEspacios(String texto){
        return texto.replace(" ","");
    }
}

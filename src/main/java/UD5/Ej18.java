package UD5;

import java.util.Scanner;

public class Ej18 {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un texto");
        String texto = sc.nextLine();
        String[] copia = texto.split(" ");
        for(int i = 0; i<copia.length;i++){
            System.out.println(copia[i]);
        }



    }


}

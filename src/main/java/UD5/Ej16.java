package UD5;

import java.util.Scanner;

public class Ej16 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero");
        int num = sc.nextInt();
        String hola = ""+ num;
        String copia = reverso(num,hola);
        int numero = Integer.parseInt(copia);

        System.out.println(numero);
    }

    static String reverso(int num,String texto){
        if(num < 0){
            return "-" + new StringBuilder(texto).reverse().toString().replace("-","");
        }else {
            return new StringBuilder(texto).reverse().toString();
        }
    }
}

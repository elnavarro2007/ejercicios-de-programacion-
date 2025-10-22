import java.lang.annotation.Repeatable;

import java.util.Scanner;


public class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce un numero y te dare la raiz cuadrada");

        int num = sc.nextInt();

        System.out.println("La raiz es : " + Math.sqrt(num));


    }
}
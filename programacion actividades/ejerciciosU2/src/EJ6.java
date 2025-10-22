import java.lang.annotation.Repeatable;

import java.util.Scanner;


public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce dos numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            System.out.println(a + " es mayor que " + b);

        } else {
            System.out.println(b + " es mayor que " + a);

        }
        if (a % b == 0) {
            System.out.println("son multiplos");


        } else {
            System.out.println("no son multiplos");
        }
    }

}
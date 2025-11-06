import java.lang.annotation.Repeatable;

import java.util.Scanner;


public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce dos numeros");
        int a = sc.nextInt();

        System.out.println("introduce dos numeros");
        int b = sc.nextInt();

        float c = a/b;
        System.out.printf("la division es %.3f\n",c);
    }
}
import java.lang.annotation.Repeatable;

import java.util.Scanner;


public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("se va a generar un numero aleatorio ");
        int num = (int) (Math.random() * 100);
        System.out.println("el numero es " + num);
        System.out.println("introduce un numero para generar un numero entre 0 y ese numero");
        int numero = sc.nextInt();
        System.out.println("a continuacion se conseguiran numeros aleatorios del numero " + numero);

        for (int j = 0; j < 3; j++) {
            int i = (int) (Math.random() * numero);
            System.out.println("Numero aleatorio: " + i);
        }
        System.out.println("introduce dos numeros");
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > b) {
            for (int k = 0; k < 3; k++) {
                int c = b + (int) (Math.random() * (a - b));
                System.out.println("Numero aleatorio: " + c);
            }
        } else if (b > a) {
            for (int j = 0; j < 3; j++) {
                int c = a + (int) (Math.random() * (b - a));
                System.out.println("Numero aleatorio: " + c);/*nummin + Mathrandom * (nummax-nummin)*/
            }
        }

    }
}
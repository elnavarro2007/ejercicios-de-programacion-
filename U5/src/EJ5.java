import java.util.Random;
import java.util.Scanner;

public class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[10];
        boolean encontrado = false;
        boolean negativo = false;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 100);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        while (!negativo) {
            System.out.print("Introduce un numero, pon un numero negativo para salir: ");

            if (sc.hasNextInt()) {
                int n = sc.nextInt();

                if (n < 0) {
                    System.out.println("Fin de Programa");
                    negativo = true;
                } else {
                    for (int num : a) {
                        if (num == n) {
                            encontrado = true;
                        }
                    }
                    if (encontrado){
                        System.out.println("Encontrado");
                    }else {
                        System.out.println("No encontrado");
                    }
                }

            } else {
                System.out.println("Número entero");
                sc.next();
                negativo = false;
            }

        }


    }
}




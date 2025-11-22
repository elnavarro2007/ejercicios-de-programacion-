import java.util.Scanner;

public class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        System.out.println("Tabla 1 :");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20) - 10;
            System.out.print(a[i] + " |");
        }
        System.out.println();
        System.out.println("Tabla 2 :");
        for (int i = 0; i < a.length; i++) {
            b[i] = (int) (Math.random() * 20) - 10;
            System.out.print(b[i] + " |");

        }
        System.out.println();
        System.out.println("Array sumado");

        for (int i = 0;i<a.length;i++){
            b [i] = b[i]+a[i];

            System.out.print(b[i]+ " |");

        }

    }
}
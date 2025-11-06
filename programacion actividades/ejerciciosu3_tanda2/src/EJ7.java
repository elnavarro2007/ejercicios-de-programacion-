import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int i = sc.nextInt();
        do {
            i = i-2;
            System.out.println(i);
        }while (i>0);

    }
}
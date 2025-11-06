import java.util.Scanner;

public class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int i = sc.nextInt();
        System.out.println("introduce otro numero");
        int j = sc.nextInt();
        System.out.println(i/j);
        int aux;
        int k;
        k= i-j;
        while(k>0) {
            k = k - j;
            System.out.println(k);
            if (k==j ){
                System.out.println("el numero es divisible");
            }
        }




    }

}
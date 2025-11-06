import java.util.Scanner;

public class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int i = sc.nextInt();
        System.out.println("introduce otro numero");
        int j = sc.nextInt();
        int m = 0;
        int k;
        k = i * j;
        System.out.println(k);
        for (int l=0; l<=k;l=i+l){
            System.out.println(l);
            m++;

        }
        System.out.println("la suma se ha hecho "+m+ " veces" );
    }
}
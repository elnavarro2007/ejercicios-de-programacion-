import java.util.Scanner;

public class EJ15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int i = sc.nextInt();
        int m=0;

            for (int j = i-1; j > 1; j--) {



                i= i * j;

                System.out.println(i);
            }

}
}
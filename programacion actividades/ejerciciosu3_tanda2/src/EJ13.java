import java.util.Scanner;

public class EJ13 {
    public static void main(String[] args) {
        System.out.println("introduce un numero");
        Scanner sc = new Scanner(System.in);
        int i =sc.nextInt();
        int j =0;
        int k;

            for (j=0; i>0;j++)
                i= i/10;

        System.out.println("el numero tiene " +j+ " cifras");
    }
}
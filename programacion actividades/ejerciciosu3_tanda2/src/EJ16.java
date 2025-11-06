import java.util.Scanner;

public class EJ16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int i = sc.nextInt();
        if (i<=0){
            System.out.println("error");
        }
    }
}
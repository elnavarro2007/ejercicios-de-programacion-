import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce las ptas que quieras para pasarlos a euros");
        float ptas= sc.nextFloat();
        double euros = ptas/166.386;
        System.out.printf("hay esta cantidad de euros %.3f\n ",euros );
    }
}
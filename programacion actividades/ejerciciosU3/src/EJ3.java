import java.util.Scanner;

public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un caracter");
        char car = sc.next().charAt(0);




        if (Character.isDigit(car)) {
            System.out.println("el caracter es numerico");
        }
            else if (Character.isLetter(car)) {
                System.out.println("el caracter es alfabetico");

        }
            else {
            System.out.println("es un caracter especial");
        }



    }
}
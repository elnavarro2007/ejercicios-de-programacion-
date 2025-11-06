import java.lang.annotation.Repeatable;
import java.util.Scanner;


public class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un valor para saber su ascii");
        int letra = sc.nextInt();
        if (letra == 65 | letra == 69 | letra == 73 | letra == 79 | letra == 85 | letra == 97 | letra == 101 | letra == 105 | letra == 111 | letra == 115)
            System.out.println("el numero introducido representa una vocal " + (char) letra);/*se puede cambiar la variable de un valor poniendo la nueva variable entre parentesis*/
        else
            System.out.println("el numero no representa ninguna vocal, representa la consonante " + (char) letra);

        // char num= 'a';
        System.out.println("el valor de " + (char) letra + " en ascii es " + letra);


    }
}
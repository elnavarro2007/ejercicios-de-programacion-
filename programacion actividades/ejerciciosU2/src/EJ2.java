
import java.util.Scanner;

class EJ2 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  /*sirve para introducir valorespara aqui se pone el nombre que quieras, despues para las variables habria que poner "nombre".next"variable"*/
        System.out.println("introduce tu nombre");
        String nombre = sc.nextLine();
        System.out.println("Hola " + nombre);


    }
}
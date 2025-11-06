import java.util.Scanner;

public class para_introducir_valores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); //crear un lector para leer valores introducidos
        int aux;
        System.out.println("Introduce un el primer numero");
        int n = sc.nextInt();
        System.out.println("introduce otro numero");
        int s = sc.nextInt();
        System.out.println("los numeros introducidos son " + n + " y " + s + "ahora intercambiare los valores");

    }
}
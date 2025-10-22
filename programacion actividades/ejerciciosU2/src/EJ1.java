
import java.util.Scanner; /*las librerias van siempre antes del class555*/

class Scratch {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  /*para aqui se pone el nombre que quieras, despues para las variables habria que poner "nombre".next"variable"*/
        System.out.println("introduce un numero, vamos a calcular el area de un rectangulo, introduce la base");
        int i = sc.nextInt();
        System.out.println("ahora la altura");
        int j = sc.nextInt();
        int k = i * j;
        System.out.println("el area es " + k);


    }
}
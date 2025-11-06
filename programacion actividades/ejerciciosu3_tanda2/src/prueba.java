import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int j= 0;
        String hola= "hola";

        do{
            System.out.println(" introduce un numero");
            int i = sc.nextInt();
            j = i + j;
            System.out.println(j);

        }while (j<9000);



        System.out.println(hola.toUpperCase());


    }
}
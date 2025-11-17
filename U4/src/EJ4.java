import java.util.Scanner;

class EJ4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero, vamos a hacer su tabla del uno al diez");
        int a = sc.nextInt();
        tabla(a);

    }
    static void tabla (int a){
        for (int b = 0; b<=10;b++){
            int c = a*b;
            System.out.println(a+" x "+b+ " = " +c );

        }


    }
}
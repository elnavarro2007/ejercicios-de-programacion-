import java.util.Scanner;

class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce dos numeros a y b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("a = " +a);
        System.out.println("b = "+b);
         calcularmenor(a,b);

    }
    static  void calcularmenor (int a, int b) {

        System.out.println(Math.min(a,b));
        System.out.println(a*b);




    }

}
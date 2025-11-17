import java.util.Scanner;

class EJ10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int a = sc.nextInt();
        int d = a;
        factorial(a,d);
    }
    static void factorial (int a, int d){
             d= a;
        for (int b = 1 ; b<a;b++){

            a = a * (d-b);


            System.out.println(a);

        }


    }

}
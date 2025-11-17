import java.util.Scanner;

class EJ11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        long a = sc.nextLong();

        System.out.println(factorialrecursivo(a));

    }
    static long factorialrecursivo (long a){
        if (a == 0 || a == 1){

            return 1;

        } else {
            System.out.println(a);
            return a * factorialrecursivo( a-1);

        }




    }


}
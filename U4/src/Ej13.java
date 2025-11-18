import java.util.Scanner;

class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int a = sc.nextInt();

        System.out.println(fibonacci(a));
    }
    static int fibonacci (int a){

        if (a == 0 ) {

            return 0;
        } else if (a == 1){

            return 1;
        }else {
            return fibonacci(a - 1) + fibonacci(a - 2);

        }

    }
}
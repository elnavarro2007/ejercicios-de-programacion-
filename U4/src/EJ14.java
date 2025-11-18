import java.util.Scanner;

class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int a = sc.nextInt();
        System.out.println(suma (a));
    }
    static int suma (int a){
        if (a<=9){

            return a;
        }else if (a<0) {

            return -a;
        }else {

        }

    }
}
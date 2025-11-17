import java.util.Scanner;

class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("vamos a hacer la media de dos numeros, primer numero");
        System.out.print("primer numero : ");
        int a = sc.nextInt();
        double c = (double)a;
        System.out.print("segundo numero : ");
        int b = sc.nextInt();
        double d = (double) b;
        System.out.println("introduce el numero para hacer la media");
        double e = sc.nextByte();

        media(c,d,e);





    }
    static void media (double a, double b, double c){

         a = (a+b)/c;
        System.out.println("la media da : "+a );

    }
}
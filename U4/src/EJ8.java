import java.util.Scanner;

class EJ8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce dos numeros enteros");
        int a = sc.nextInt();
        int b = sc.nextInt();

        maximo(a,b);
        System.out.println("ahora dos numeros reales");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
        System.out.println("el numero mayor es :"+maximo_reales(c,d));

    }
    static void maximo (int a, int b){
        int c = Math.max(a,b);
        System.out.println("el maximo es :" +c);;
    }


    static double maximo_reales (double a, double b){

        if (a>b){
            return a;

        } else {

            return b;
        }
    }
}
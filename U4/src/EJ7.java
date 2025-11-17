import java.util.Scanner;

class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la nota");
        double a = sc.nextDouble();

        System.out.println(nota(a));

    }

    static String nota(double a) {


        if (a >= 0 && a < 5) {

            return "suspenso";
        } else if (a >= 5 && a < 7) {

            return "aprobado";
        } else if (a >= 7 && a < 9) {

            return "notable";
        } else if (a >= 9 && a <= 10) {

            return "sobresaliente";
        } else {

            return "valor no valido";
        }



    }


}
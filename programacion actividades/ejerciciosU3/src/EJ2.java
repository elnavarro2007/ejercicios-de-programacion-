import java.util.Scanner;

public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero de la semana");
        int semana = sc.nextInt();
        switch (semana) {
            case 1:
                System.out.println("1 – lunes Música");
                break;
            case 2:
                System.out.println("2 – martes Natación");
                break;
            case 3:
                System.out.println("3 – miércoles Inglés");
                break;
            case 4:
                System.out.println("4 – jueves Natación");
                break;
            case 5:
                System.out.println("5 – viernes -");
                break;
            case 6:
                System.out.println("6 – sábado Deporte escolar");
                break;
            case 7:
                System.out.println("7 – domingo -");
                break;
        }
        if (semana>=8)
            System.out.println("error");
    }
}
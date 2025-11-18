import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class EJ1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        System.out.println(signo(a));

    }

    static double   signo (double a) {

        if (a == 0) {
            return 0;
        } else if (a > 0) {
          return 1;
        } else {
            return -1;
        }


    }
}
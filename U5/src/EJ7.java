import java.util.Scanner;

public class EJ7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];
        for (int i = 0; i<a.length;i++){
            a[i] =(int) (Math.random()*20) - 10;
            System.out.print(a[i]+ " |");

        }
        System.out.println();
        System.out.println();
        System.out.println("Array sin numeros negativos :");
        for (int j = 0; j<a.length;j++){
            if (a[j]<0){
                a[j] =-a[j];
            }

            System.out.print(a[j]+ " |");

        }
    }

}
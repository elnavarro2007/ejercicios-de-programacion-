import java.util.Scanner;

public class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[] = new int[10];

        System.out.println("Tabla 1 :");
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20) - 10;
            System.out.print(a[i] + " |");
        }
        System.out.println();

        for (int i = 0; i < a.length; i++){
            int num = 0;
            for (int j = 0;j<a.length;j++) {
                if (a[i] == a[j]){
                    num++;
                    System.out.println( +a[i]+" se repiten :"+num+ "veces");

                }
            }



        }
    }
}
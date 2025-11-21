import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a[] = new int[10];


    for (int i = 0; i<a.length-1;i++){

        a[i] = (int) (Math.random()*20)-10;
        System.out.println(a[i]);

        if (a[i]<0) {
            System.out.print(a[i] + "|");
        }


        }
    }
}
import java.util.Scanner;

public class EJ6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int a[] = new int[10];
    int pos = 0;
    int neg = 0;

    for (int i = 0; i<a.length-1;i++){

        a[i] = (int) (Math.random()*20)-10;
        System.out.print(a[i] +" | ");


    }
        for (int n : a) {
            System.out.print(n + " ");
        }

        System.out.println();
    for (int j = 0; j<a.length;j++){
        if (a[j]<0) {
            System.out.println(a[j] + ": negativo");
            neg++;
        }else {
            System.out.println(a[j]+ ": positivo");
            pos++;
        }

    }
        System.out.println("numero de positivos : "+pos);
        System.out.println("numero de negativos : "+neg);

    }
}
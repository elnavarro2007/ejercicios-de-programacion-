import java.util.Scanner;

class EJ9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce un numero");
        int tiempos = sc.nextInt();
        System.out.println(tiempo(tiempos));

    }

    static int tiempo(int a) {

       if (a==0){
            return 0;
        }else{
           System.out.println(a);
           return tiempo(a-1);


       }


    }
}
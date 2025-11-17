import java.util.Scanner;

class EJ3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce dos numeros, el primero sera elevado del segundo");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = b;
        int multiplicacion = 0;
        elevado(a,b,multiplicacion, c);

    }
    static void elevado (int a, int b,int c ,int multiplicacion){
        Scanner sc = new Scanner(System.in);


        for (c=1;c<=b;c++){/*para poder hacer una potencia se empieza pore el final y con un contador, hacemos que el contador sea el exponente de a*/

           multiplicacion =Math.powExact(a,c);

            System.out.println(multiplicacion);
        }



    }
}
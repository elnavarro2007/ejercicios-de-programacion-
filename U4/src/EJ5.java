import java.util.Scanner;

class EJ5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce la base");
        int base = sc.nextInt();

        triangulo(base);
    }
    static void triangulo (int base){
        for (int c = base ; c>0;c--){
            for (int d = 0; d<c;d++) {
                System.out.print("Q");
            }

            System.out.println();

        }


    }

}
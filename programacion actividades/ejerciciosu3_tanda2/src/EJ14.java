import java.util.Scanner;

public class EJ14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = 3;



      for (int k = 0; k<=50; k++ )
      {
          i = i+1;
         if (i % 3 == 0)


          System.out.println(i);
         if (i==50){
             break;
         }
      }
    }
}
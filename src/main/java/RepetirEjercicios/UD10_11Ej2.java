package RepetirEjercicios;

import java.util.Arrays;
import java.util.Scanner;

public class UD10_11Ej2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int[] nums  = new int[5];

        for (int i = 0; i<nums.length;i++){
            System.out.println("Quedan "+(5-i) +" espacios");
            nums[i] = sc.nextInt();

        }

        for (int i = 0; i<nums.length;i++){
            System.out.print(nums[i] + " | ");


        }

        int[] copia = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copia);

        if (Arrays.equals(nums,copia)){
            System.out.println("Esta ordenado");
        }else {
            System.out.println("No esta ordenado");
        }


    }
}

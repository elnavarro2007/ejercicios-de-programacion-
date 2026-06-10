package PracticaUD1011;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[5];

        for (int i = 0; i<nums.length;i++){
            System.out.println("Introduce " + (5-i) +"  numeros");
            int num = sc.nextInt();
            nums[i] = num;


        }

        for (int i = 0; i<nums.length;i++){


            System.out.print(nums[i] + " | ");



        }
        System.out.println("");

        int[] copia = Arrays.copyOf(nums,nums.length);
        Arrays.sort(copia);

       if (!Arrays.equals(nums,copia)){
           System.out.println("no esta ordenado");
       }else {
           System.out.println("Esta ordenado");
       }
        for (int i = 0; i<copia.length;i++){


            System.out.print(copia[i] + " | ");



        }




    }
}

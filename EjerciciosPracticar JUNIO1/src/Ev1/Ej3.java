package Ev1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean booleano = true;
        boolean bool2 = true;
        ArrayList<Integer> nums = new ArrayList<>();
        int contador = 0;

        while (booleano) {
            System.out.println("introduce un numero entre el 8 y el 15");
            int num = sc.nextInt();



            if (num < 8 || num > 15) {
                while (bool2) {
                    System.out.println("El numero debe estar entre ese rango");
                     num = sc.nextInt();
                    if (num >= 8 && num <= 15) {
                        bool2 = false;


                    }

                }


            }
            if (!nums.contains(num)){
                nums.add(num);
                contador++;
            }else {
                break;
            }
        }

        int[] array = new int[contador];
        for (int i = 0 ; i<array.length;i++){
            Random random = new Random();
            array[i] = random.nextInt(10,101);
        }
        ArrayList<Integer> enteros = new ArrayList<>(array.length);

        for (int i = 0 ; i<array.length;i++){
            int num = array[i];
            if (!enteros.contains(num)){
                enteros.add(num);
            }






        }
        System.out.println(enteros);







    }
}


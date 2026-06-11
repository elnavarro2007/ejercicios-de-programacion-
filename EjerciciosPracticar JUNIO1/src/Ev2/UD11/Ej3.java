package Ev2.UD11;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        System.out.println(" Numeros al azar del 1 al 100");

        HashMap<Integer, Integer> list = new HashMap<>();
        Random random = new Random();
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 50; i++) {
            int nums = random.nextInt(0, 100);
            list.put(nums, list.getOrDefault(nums, 0) + 1);
        }
        System.out.println(list + " | ");

        System.out.println("introduce que numero quieres buscar");
        int num = sc.nextInt();

        if (num < 0 || num >= 100) {
            System.out.println("El numero es invalido");
        } else {
            int total = list.getOrDefault(num, 0);
            System.out.println("El numero " + num + " aparece : " + total + " veces");
        }


    }
}


package Ej3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random numero = new Random();




        List<Integer> lista = new ArrayList<>();

        for (int i= 0;i<50;i++){
            //System.out.println(numero.nextInt(9));
            lista.add((numero.nextInt(99)));
            System.out.println(lista.get(i) );

        }

        System.out.print("Que numero quieres introducir ");
        int num = sc.nextInt();
        while (num >99 || !sc.hasNextInt()) {
            System.out.println("Debe ser un numero menor que 99");
            int i = sc.nextInt();
            if (i<99) {
                num = i;
                break;
            }
        }
        int contador = 0;
        for (int i = 0; i<50;i++){
            if (num == lista.get(i)){
                contador++;
            }
        }
        System.out.println(" El numero "+num+ " aparece "+ contador +" veces");

    }
}

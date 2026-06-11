package Ev2.UD11;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ej2 {
    public static void main(String[] args) {
        Random random = new Random();

        System.out.println("Introduccion numeros random");
        ArrayList<Integer> list = new ArrayList<>(3);

        for (int i = 0;i<3 ; i++){
            list.add(random.nextInt(10));
        }

        System.out.println(list);


    }
}

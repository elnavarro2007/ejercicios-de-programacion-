package Ev2.UD11;

import java.util.ArrayList;
import java.util.Random;

public class Ej6 {
    public static void main(String[] args) {
        ArrayList<Integer> lista1 = new ArrayList<>();
        ArrayList<Integer> listaCopia = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i<30 ;i++){
            lista1.add(random.nextInt(0,100));
        }
        System.out.println(lista1);

        for (int i = 0; i<30; i++){

            if (!listaCopia.contains(lista1.get(i))){
                listaCopia.add(lista1.get(i));
            }
        }
        System.out.println(listaCopia);
    }
}

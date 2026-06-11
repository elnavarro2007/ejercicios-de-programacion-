package Ev2.PracticaU10_11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ej1 {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();

        for(int i = 0; i<20;i++){
            arrayList.add(random.nextInt(0,50));
        }

        System.out.println(arrayList);
        int num = 0;

        for (int i : arrayList){
            if (Collections.frequency(arrayList,i) == 1){
                num = i;
                break;
            }
        }
        System.out.println("El primer numero que no se repite por orden de aparicion es : "+num);
    }
}

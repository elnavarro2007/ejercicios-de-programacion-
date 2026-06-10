package PracticaUD1011;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Random;

public class Ej1 {
    static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(20);

        for (int i = 0; i<20;i++){
            Random random = new Random();
            list.add(random.nextInt(50));
        }





        System.out.println(list);
        int unico = 0;

        for (int num : list){
            if(Collections.frequency(list,num) == 1){
                unico = num;
                break;
            }

        }

        System.out.println(unico);






    }
}

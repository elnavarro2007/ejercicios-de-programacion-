package RepetirEjercicios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class UD10_11Ej1 {
    static void main() {
        ArrayList<Integer> list = new ArrayList<>(20);

        for(int i = 0 ; i<20;i++){
            Random random = new Random();
            list.add(random.nextInt(50));
        }
        System.out.println(list);

        int unico = 0;

        for (int i : list){

            if(Collections.frequency(list,i) == 1){
                unico = i;
                break;
            }

        }

        System.out.println(unico);

    }
}

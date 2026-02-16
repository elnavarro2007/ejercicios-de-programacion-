package EJ2;


//2. Crea un programa que elija al azar 3 números distintos entre 0 y 9.


import java.util.ArrayList;
import java.util.List;

import java.util.Random;
import java.util.regex.Matcher;

public class Ej2 {
    public static void main(String[] args) {
        Random numero = new Random();




        List<Integer> lista = new ArrayList<>();
       
        for (int i= 0;i<3;i++){
            //System.out.println(numero.nextInt(9));
            lista.add((numero.nextInt(9)));
            System.out.print(lista.get(i) + " ");



        }
    }
}

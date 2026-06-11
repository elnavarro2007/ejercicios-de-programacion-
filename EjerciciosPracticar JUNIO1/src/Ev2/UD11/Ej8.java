package Ev2.UD11;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Ej8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce una frase");
        String frase = sc.nextLine().toLowerCase();
        HashMap<Character,Integer> caracteres = new HashMap<>();
        frase = frase.replace(" ","");




        for (int i = 0; i<frase.length();i++){
            char c = frase.charAt(i);

            caracteres.put(c,caracteres.getOrDefault(c,0)+1);

        }

        TreeMap<Character,Integer> ordenado = new TreeMap<>(caracteres);

        for (Map.Entry<Character,Integer> m : ordenado.entrySet()){
            System.out.println("La letra : "+m.getKey()+ " Aparece : "+m.getValue()+ " veces");
        }
    }
}

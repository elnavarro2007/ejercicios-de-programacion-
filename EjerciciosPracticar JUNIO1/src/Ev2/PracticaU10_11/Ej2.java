package Ev2.PracticaU10_11;

import java.util.*;

public class Ej2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> lista = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.println("Introduce "+(5-i)+ " numeros");
            int num = sc.nextInt();
            lista.add(num);
        }
        System.out.println(lista);

        List<Integer> copia = new ArrayList<>(lista);

        Collections.sort(copia);
        System.out.println(copia);

        if (Arrays.equals(lista.toArray(),copia.toArray())){
            System.out.println("estan ordenados");
        }else {
            System.out.println("no estan ordenados");
        }
    }
}

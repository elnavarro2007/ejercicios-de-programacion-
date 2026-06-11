package Ev2.UD11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej7 {
    public static void main(String[] args) {
        List<String> lista1 = new ArrayList<>(Arrays.asList("Ann", "Carol", "Mary", "Joe",
                "John", "Kevin", "Jack", "Jack", "Lucy", "Laura", "George",
                "Ann", "Johnny", "Charlie", "Hillary"));

        List<String> lista2 = new ArrayList<>(Arrays.asList("Ann", "Martha", "Noel",
                "Mark", "Pamela", "Elisabeth", "Laura", "Jane", "Mildred",
                "Laura", "Rue", "Ann", "Jacob", "Sidney", "Sophia", "Tyler"));

        List<String> listaCopia = new ArrayList<>();
        List<String> primeraSolo = new ArrayList<>();
        List<String> segundaSolo = new ArrayList<>();
        List<String> union = new ArrayList<>();

        for (String s : lista1){
            if (lista1.contains(s) && lista2.contains(s) ){
                listaCopia.add(s);
            }
        }

        for (String s : lista1){
            if (lista1.contains(s) && !lista2.contains(s) ){
                primeraSolo.add(s);
            }
        }

        for (String s : lista1){
            if (!lista1.contains(s) && lista2.contains(s) ){
                segundaSolo.add(s);
            }
        }

        for (String s : lista1){
            if (lista1.contains(s) || lista2.contains(s) ){
                union.add(s);
            }
        }

        System.out.println(listaCopia);
        System.out.println(primeraSolo);
        System.out.println(segundaSolo);
        System.out.println(union);


    }
}

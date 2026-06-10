package PracticaUD1011;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Ej4 {
    static void main() {
        String archivo = "Metadata in DBMS.txt";

        HashMap<String,Integer> mapa = new HashMap<>();

        try(BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null ){


                String[] palabras = linea.toLowerCase().split(" ");

                for(String s : palabras){
                    mapa.put(s,mapa.getOrDefault(s,0)+1);
                }

            }
            System.out.println(mapa.size() + " Palabras unicas hay");

            for (Map.Entry<String,Integer> m : mapa.entrySet()){
                System.out.println("Palabra : "+m.getKey() + " | "+ " Veces que se repite : "+m.getValue());
            }





        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}

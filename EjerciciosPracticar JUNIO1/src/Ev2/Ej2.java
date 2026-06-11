package Ev2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Ej2 {
    public static void main(String[] args) {
        String archivo = "DataAnalysis.txt";

        HashMap<String,Integer> map = new HashMap<>();
        Pattern regexData = Pattern.compile(".*data.*");

        int contador = 0;



        try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
            String linea;

            while ((linea = br.readLine()) != null){

                String[] palabra = linea.toLowerCase().split(" ");




                for (String s : palabra){
                    if (regexData.matcher(s).matches()){
                        map.put(s, map.getOrDefault(s,0)+1);
                        contador++;
                    }
                }


            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Hay "+contador+ " palabras que contienen data o que son data");

    }

    public static class Ej22 {
        public static void main(String[] args) {
            String archivo = "textoRacistaHechoporunaIA.txt";
            int contador = 0;

            HashMap<String,Integer> palabras = new HashMap<>();

            try (BufferedReader br = new BufferedReader(new FileReader(archivo))){
                String linea;

                while ((linea= br.readLine()) != null){
                    String[] palabra = linea.toLowerCase().split(" ");
                    for (String s :palabra){
                        contador++;
                        palabras.put(s, palabras.getOrDefault(s,0)+1);
                    }
                }


            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            System.out.println(" El archivo contiene unas : "+contador+ " palabras");

            for (Map.Entry<String,Integer> m : palabras.entrySet()){
                System.out.println("La palabra : "+m.getKey() + " Se repite unas  : "+m.getValue()+ " veces");
            }
        }
    }
}

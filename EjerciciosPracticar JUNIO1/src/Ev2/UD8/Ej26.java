package Ev2.UD8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce una longitud");
        int num = sc.nextInt();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("textoRacistaHechoporunaIA.txt"))){
            String linea ;

            while ((linea = br.readLine()) != null){


                String[] palabra = linea.split(" ");

                for (String s : palabra){


                    if (s.length() == num){
                        contador++;
                    }
                }


            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(" Hay : "+contador+ " palabras con esta longitud");
    }
}

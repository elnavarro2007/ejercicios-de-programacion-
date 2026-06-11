package Ev2.UD8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ej25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una palabra");
        String pal = sc.nextLine();
        int contador = 0;

        try (BufferedReader br = new BufferedReader(new FileReader("textoRacistaHechoporunaIA.txt"))){
            String linea ;

            while ((linea = br.readLine()) != null){
                if (linea.toLowerCase().contains(pal)){
                    contador++;
                }
            }



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("La palabra "+pal+ " se encuentra en : "+contador+ " lineas");
    }
}

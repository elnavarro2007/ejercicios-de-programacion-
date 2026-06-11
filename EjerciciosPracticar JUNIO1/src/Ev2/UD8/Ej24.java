package Ev2.UD8;

import java.io.*;

public class Ej24 {
    public static void main(String[] args) {
        String archivo = "textoRacistaHechoporunaIA.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(archivo));
            BufferedWriter bw = new BufferedWriter(new FileWriter("textoAlreves.txt"))){

            String linea ;

            while ((linea = br.readLine()) != null){
                String invertido = "";

                for (int i = linea.length()-1; i >= 0;i--){
                    invertido = invertido + linea.charAt(i);

                }
                bw.write(invertido);
                bw.newLine();
            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

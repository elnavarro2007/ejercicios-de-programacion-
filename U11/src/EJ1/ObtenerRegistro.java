package EJ1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Arrays;

public class ObtenerRegistro extends Registro {
    public static void main(String[] args) {
        Registro registro = new Registro();
        String archivo = "DATA.csv";
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("archivosplit.txt"));
             BufferedReader br = new BufferedReader(new FileReader(archivo))) {
            String linea;

            while ((linea = br.readLine()) != null) {

                bw.write(Arrays.toString(linea.split(",")));
                bw.newLine();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }


}

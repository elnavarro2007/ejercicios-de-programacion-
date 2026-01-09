import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ej5 {
    public static void main(String[] args) {
        Path archivo = Paths.get("si.txt");
        Path copia = Paths.get("sicopia.txt");

        try {
            Files.copy(archivo, copia, StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (BufferedReader br = new BufferedReader(new FileReader("si.txt"));
             BufferedWriter bw = new BufferedWriter(new FileWriter("sicopia.txt"))) {

            String linea;
            while ((linea = br.readLine()) != null) {
                bw.write(linea.toUpperCase());
                bw.newLine();
            }

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}


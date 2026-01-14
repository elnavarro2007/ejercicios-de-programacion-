import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej4 {
    static void main() {
        Path archivo =  Paths.get("C:\\Users\\usuario\\Desktop\\ejercicios programacion\\Programacion Ev2\\src\\texto.txt");
        System.out.println("se va a leer el archivo texto.txt");
        File arch = archivo.toFile();
        try (BufferedReader br = new BufferedReader(new FileReader(arch))){
            String line ;
            while ((line = br.readLine() ) != null){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

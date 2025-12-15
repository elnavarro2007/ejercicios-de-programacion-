import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Introduce la ruta: ");
        String ruta = sc.nextLine();

        File archivo = new File(ruta);
        if (archivo.exists()) {
            System.out.println("Existe");
            System.out.println("Directorio raiz: " + archivo.toPath().getRoot());
            System.out.println("Nombre del archivo: " + archivo.getName());
            System.out.println("Extension del archivo: " + ruta.substring(ruta.lastIndexOf('.')));
        } else {
            System.out.println("No existe el archivo");
        }

    }
}

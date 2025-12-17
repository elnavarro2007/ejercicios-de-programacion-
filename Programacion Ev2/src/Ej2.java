import java.io.File;
import java.nio.file.Path;
import java.util.Scanner;

public class Ej2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce la ruta : ");
        String texto = sc.nextLine();
        File archivo = new File(texto);
        if (archivo.exists()) {
            System.out.println("La ruta :" + archivo.getPath() + " existe");
            if (archivo.isFile()) {
                System.out.println("Es un archivo, la esxtension es :" + texto.substring(texto.lastIndexOf('.')));

            } else {
                System.out.println("es un directorio, a continuacion se mostrara el contenido del directorio ");
                System.out.println(archivo.listFiles());
            }
        } else {
            System.out.println("el directorio no existe");
        }


    }
}

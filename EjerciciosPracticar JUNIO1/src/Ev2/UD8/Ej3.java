package Ev2.UD8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej3 {
    public static void main(String[] args) throws IOException {
        Path ruta = Paths.get("documents/PRO_UD08_Ej03");
        Path archivo = ruta.resolve("ola.txt");

        if(!Files.exists(ruta)){
            Files.createDirectories(ruta);
            if (!Files.exists(archivo)){
                Files.createFile(archivo);
            }
        }
        Path copia1 = ruta.resolve("programacion(1).txt");
        Path copia2 = ruta.resolve("programacion(2).txt");

      //  try {
      //      Files.copy(archivo,copia1);
      //      Files.copy(archivo,copia2);
//
      //  } catch (IOException e) {
      //      throw new RuntimeException(e);
      //  }

       Path ruta2 = ruta.resolve("samples");

      // try {
      //     Files.createDirectories(ruta2);

      // } catch (Exception e) {
      //     throw new RuntimeException(e);
      // }

        Path ruta3 = ruta.resolve("excercises");

       // try {
       //     Files.createDirectories(ruta3);
//
       // } catch (Exception e) {
       //     throw new RuntimeException(e);
       // }
//
      //  Path archivo2 = ruta.resolve("ola.txt");

     //  try {
     //      Files.copy(archivo,ruta2.resolve("programacion.txt"));
     //  } catch (Exception e) {
     //      throw new RuntimeException(e);
     //  }

       // try {
       //     Files.move(archivo,ruta3.resolve("ola.txt") );
       // } catch (Exception e) {
       //     throw new RuntimeException(e);
       // }

       // try {
       //     Files.move(copia1, archivo.resolve("Programacion.txt"));
       // } catch (IOException e) {
       //     System.out.println("Error cambiando el nombre (F)");
       // }

        Files.delete(copia2);

    }
}

package UD8;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ej3 {
    static void main() throws IOException {
        Path rutaBase = Paths.get("PRO_UD08_Ej03");
        Path archivo = rutaBase.resolve("Programacion.txt");

        if (!Files.exists(rutaBase)) {
            Files.createDirectories(rutaBase);
            System.out.println("Se ha creado correctamente");
            if (!Files.exists(archivo)) {
                Files.createFile(archivo);
                System.out.println("Creado correctamente");
            }

        }


        Path archivo1 = rutaBase.resolve("Programacion1.txt");
        Path archivo2 = rutaBase.resolve("Programacion2.txt");

        // A
        try {
            Files.copy(archivo,archivo1);
            Files.copy(archivo,archivo2);
        } catch (Exception e) {
            throw new RuntimeException("No se ha podido crear");
        }
        // B

        Path ruta2 = rutaBase.resolve("docs/samples");

        try {
            Files.createDirectories(ruta2);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        Path ruta3 = rutaBase.resolve("docs/exercises");
        try {
            Files.createDirectories(ruta3);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        // D

       try {
           Files.copy(archivo, ruta2.resolve("Programacion.txt"));
       } catch (Exception e) {
           throw new RuntimeException(e);
       }


       try {
           Files.move(archivo, ruta3.resolve("Programacion.txt"));
       } catch (Exception e) {
           throw new RuntimeException(e);
       }



        try {
            Files.move(archivo1, rutaBase.resolve("Programacion.txt"));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
}

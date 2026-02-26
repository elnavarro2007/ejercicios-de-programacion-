import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ej3 {

    public static void main(String[] args) {
        Path source1 = Path.of("Documentos\\PRO_UD08_Ej03\\Programacion.txt");
        File archivo = source1.toFile();


        try {
            if (!archivo.exists()) {
                System.out.println("no existe el archivo, creando...");
                archivo.createNewFile();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



        Path carpeta = source1.getParent();

        try {
            if (archivo.exists()) {
                Path destino1 = Path.of("Documentos\\PRO_UD08_Ej03\\Programacion(+1).txt");
                Path destino2 = Path.of("Documentos\\PRO_UD08_Ej03\\Programacion(+2).txt");

                Files.copy(source1, destino1, StandardCopyOption.REPLACE_EXISTING);
                Files.copy(source1, destino2, StandardCopyOption.REPLACE_EXISTING);

                System.out.println("Archivos copiados con éxito en: " + carpeta.toAbsolutePath());
            } else {
                System.out.println("No existe ningun archivo");
            }


        } catch (Exception e) {
            throw new RuntimeException(e);
        }



        File ruta = new File("Documentos\\PRO_UD08_Ej03\\docs\\samples");


        if (!ruta.exists()) {
            System.out.println("no existe el directorio, creando...");
            ruta.mkdirs();
            System.out.println("Directorio Creado : " + ruta.getPath());
        } else {
            System.out.println("el directorio ya existe");
        }

        File ruta2 = new File("Documentos\\PRO_UD08_Ej03\\docs\\exercises");
        if (!ruta2.exists()) {
            System.out.println("no existe el directorio");
            ruta2.mkdirs();
            System.out.println("Directorio Creado : " + ruta2.getPath());
        } else {
            System.out.println("el directorio ya existe");
        }


        Path rutaCopia = Paths.get("Documentos\\PRO_UD08_Ej03\\docs\\samples\\ProgramacionCopia.txt");
        Path carpeta2 = rutaCopia.getParent();


        try {
            if (archivo.exists()) {


                Files.copy(source1, rutaCopia, StandardCopyOption.REPLACE_EXISTING);


                System.out.println("Archivos copiados con éxito en: " + carpeta2.toAbsolutePath());

                System.out.println("Archivo copiado correctamente");
            } else {
                System.out.println("No ha podido copiarse el archivo correctamente");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        File ruta4 = new File("Documentos\\PRO_UD08_Ej03\\docs\\exercises\\Programacion.txt");
        try {
            if (archivo.exists()) {
                Files.move(source1, ruta4.toPath(), StandardCopyOption.REPLACE_EXISTING);
                System.out.println("archivo movido correctamente");
            } else {
                System.out.println("no ha podido moverse el archivo");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


        Path eliminarArchivo = Paths.get("Documentos\\PRO_UD08_Ej03\\Programacion(+2).txt");
        try {
            if (eliminarArchivo.toFile().exists()) {
                eliminarArchivo.toFile().delete();
                System.out.println("Archivo eliminado");
            } else {
                System.out.println("No existe");
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }
}

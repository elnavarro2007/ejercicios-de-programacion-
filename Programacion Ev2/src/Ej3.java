import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Ej3 {
    public static void main(String[] args) {
        // ponemos el directorio original
        String basedir = "C:\\Users\\usuario\\Documents";

        // añadimos el documento que esta en la carpeta
        String originalFilePath = basedir + "\\Programacion.txt";
        Path target = Paths.get("Programacion(+1)");

        File originalFile = new File(originalFilePath);
        if (!originalFile.exists()) {
            try {
                Files.createDirectory(Path.of(basedir));
                Files.createFile(Path.of(originalFilePath));

            }catch (IOException e){
                throw new RuntimeException();
            }
        }
        try {
            Files.copy(originalFile.toPath(), Path.of(basedir + "\\Programacion(+1).txt"),StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
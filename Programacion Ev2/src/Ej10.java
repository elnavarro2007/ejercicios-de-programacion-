import java.io.BufferedReader;
import java.io.FileReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej10 {
    public static void main(String[] args) {
        String path = "DATA.csv";

        String registros = ".*,(ES|PT),.*";
        String email = ".*,\\w+@\\w+.edu,.*";
        String yahoo = ".*@yahoo\\..*";

        Pattern patternRegistros = Pattern.compile(registros);

        Pattern patternEmail = Pattern.compile(email);
        Matcher matcherEmail = patternEmail.matcher(path);
        Pattern patternYahoo = Pattern.compile(yahoo);
        Matcher matcherYahoo = patternEmail.matcher(path);

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String linea;
            while ((linea = br.readLine()) != null) {
               if (patternRegistros.matcher(linea).matches()) {
                    System.out.println("España y Portugal ---------> "+ linea);
                }

                if (patternEmail.matcher(linea).matches()) {
                    System.out.println(".Edu ---------> " +linea);
                }



                if (patternYahoo.matcher(linea).matches()) {
                    System.out.println(" Yahoo ---------> " + linea);
                }


            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }


}

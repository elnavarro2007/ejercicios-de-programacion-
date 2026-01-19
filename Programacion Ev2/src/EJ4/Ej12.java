package EJ4;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej12 {
    public static void main(String[] args) {
        String email= "usuario@dominio.com";
        String verificarCorreo = "[a-zA-Z0-0._%+-]+@[a-zA-Z.]+\\.[a-zA-Z]{2,}";

        Pattern patternCorreo = Pattern.compile(verificarCorreo);
        Matcher matcherCorreo = patternCorreo.matcher(email);

        if(matcherCorreo.find()){

            System.out.println("correo encontrado ===== "+matcherCorreo.group() + " =====") ;
        }else {
            System.out.println("correo no encontrado");
        }




    }
}

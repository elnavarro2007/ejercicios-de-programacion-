import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej9 {
    static void main() {
        String texto = "IES SEGUNDO DE CHOMÓN\n" +
                "C/ Pablo Monguió, 48\n" +
                "44002 Teruel\n" +
                "Teléfono: 978 60 13 21\n" +
                "Fax: 978 60 00 80\n" +
                "Email: iesschteruel@educa.aragon.es\n" +
                "Web: www.iesch.org";
        String correo = "[a-zA-Z0-9._%+-]+@[a-zA-Z.]+\\.[a-zA-Z]{2,}";
        String postal = "\\d{5}";
        String telefono = "\\d{3} \\d{2} \\d{2} \\d{2}";

        Pattern patterncorreo = Pattern.compile(correo);
        Matcher matchercorreo = patterncorreo.matcher(texto);
        Pattern patternpostal = Pattern.compile(postal);
        Matcher matcherpostal = patternpostal.matcher(texto);
        Pattern patterntelefono = Pattern.compile(telefono);
        Matcher matchertelefono = patterntelefono.matcher(texto);
        if(matchercorreo.find()){

            System.out.println("correo encontrado :" +matchercorreo.group());

        }else {
            System.out.println("correo no encontrado");
        }


        if(matcherpostal.find()){

            System.out.println("postal encontrada :" +matcherpostal.group());

        }else {
            System.out.println("POSTAL no encontrada");
        }
        if(matchertelefono.find()){

            System.out.println("numero encontrado :" +matchertelefono.group());

        }else {
            System.out.println("numero no encontrado");
        }


    }

}

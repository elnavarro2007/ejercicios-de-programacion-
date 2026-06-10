package UD8;

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

        Pattern instituto = Pattern.compile("[A-Za-zÁÉÍÓÚáéíóúÑñ \\s]");
        Pattern calle = Pattern.compile("[A-Za-z/-ÁÉÍÓÚáéíóúÑñ],[0-9]{1,}");
        Pattern telefono = Pattern.compile("\\d{3} \\d{2} \\d{2} \\d{2}");
        Pattern email = Pattern.compile("[A-Za-z0-9._/]+@[A-Za-z0-9._/-]+\\.[a-z]{2,}");
        Pattern web = Pattern.compile("[www]+\\.[a-z]+\\.[a-z]{2,}");
        Pattern postal = Pattern.compile("[0-9]{5}");

        Matcher matcherInstituto = instituto.matcher(texto);
        Matcher matcherCalle = calle.matcher(texto);
        Matcher matcherTelefono = telefono.matcher(texto);
        Matcher matcherEmail = email.matcher(texto);
        Matcher matcherWeb = web.matcher(texto);
        Matcher matcherPostal = postal.matcher(texto);

        if(matcherEmail.find()){
            System.out.println("Texto "+matcherEmail.group());
        }else {
            System.out.println("Correo no encontrado");
        }

        if(matcherPostal.find()){
            System.out.println("Texto : "+matcherPostal.group());
        }




        for (int i = 0 ; i<texto.length() ; i++){
            if(matcherTelefono.find()){
                System.out.println("Texto : "+matcherTelefono.group());
            }
        }

        if(matcherWeb.find()){
            System.out.println("Texto : "+matcherWeb.group());
        }





    }
}

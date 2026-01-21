package EJ4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("introduce una direccion IP : ");
        String ip = sc.nextLine();
        String validarIp = "^(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)$";

        Pattern patternIp = Pattern.compile(validarIp);
        Matcher matcherIp = patternIp.matcher(ip);
        if (matcherIp.find()){
            System.out.println("Se ha encontrado la siguiente direccion IP "+ip);
        }else {
            System.out.println("no se ha encontrado ninguna IP");
        }
    }
}

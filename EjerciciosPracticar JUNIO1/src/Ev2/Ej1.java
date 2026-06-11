package Ev2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ej1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("introduce una contraseña");
        String contrasena = sc.nextLine().trim();


        Pattern regexMayuscula = Pattern.compile(".*[A-Z].*");
        Pattern regexMinuscula = Pattern.compile(".*[a-z].*");
        Pattern regexNum = Pattern.compile(".*[0-9].*");
        Pattern regexSimbolos = Pattern.compile(".*[@$%&#].*");
        Pattern regexLongitud = Pattern.compile(".{8,}");
        boolean mayusValida = regexMayuscula.matcher(contrasena).matches();
        boolean minusculaValida = regexMinuscula.matcher(contrasena).matches();
        boolean numValida = regexNum.matcher(contrasena).matches();
        boolean simboloValida = regexSimbolos.matcher(contrasena).matches();
        boolean lognitudValida = regexLongitud.matcher(contrasena).matches();

        if (!mayusValida) System.out.println("Debe tener al menos una mayúscula");
        if (!minusculaValida) System.out.println("Debe tener al menos una minúscula");
        if (!numValida) System.out.println("Debe tener al menos un número");
        if (!simboloValida) System.out.println("Debe tener al menos un símbolo especial (@$%&#)");
        if (!lognitudValida) System.out.println("Debe tener mínimo 8 caracteres");


        if (mayusValida && minusculaValida && numValida && simboloValida && lognitudValida) {
            System.out.println("Contraseña segura");

        }
    }
}

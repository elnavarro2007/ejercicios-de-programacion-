package EJ4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ej13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un numero : ");
        String num= sc.nextLine();
        String verficarNum = "\\d{3}-\\d{3}-\\d{4}";

        Pattern patternNum = Pattern.compile(verficarNum);
        Matcher matcherNum = patternNum.matcher(num);

        if (matcherNum.find()){
            System.out.println("==== "+num+ " ===");
        }else {
            System.out.println("No se ha encontrado ningun Numero");
        }
    }
}

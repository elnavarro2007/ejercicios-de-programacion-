import java.time.LocalDate;

public class DemoPersona {
    public static void main (String[] args){
        Persona p1 = new Persona();
        LocalDate fechap2 = LocalDate.of(2000,02,12);
        Persona p2 = new Persona("Alonso","soriano", fechap2,"12345","M");
        System.out.println(p2.toString());
    }
}

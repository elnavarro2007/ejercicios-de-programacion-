import java.time.LocalDate;
import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Trabajador> trabjadores = new ArrayList<>();

        trabjadores.add(new Profesor("Oracio", "saguillo", "12344", LocalDate.of(2023, 2, 2), 1000.00, "musica", 40));
        trabjadores.add(new Profesor("Rompe", "Techos", "12544", LocalDate.of(2020, 2, 2), 100.00, "tecnologia", 60));
        trabjadores.add(new PersonalAdministrativo("Pepe", "Gotera", "14344", LocalDate.of(2012, 2, 2), 2000.00, "1", 2));
        trabjadores.add(new PersonalAdministrativo("Tete", "Cohete", "13344", LocalDate.of(202, 2, 2), 20.00, "2", 1));


        CentroEducativo centroEducativo = new CentroEducativo(trabjadores);

        System.out.println("MOSTRAR TRABAJADORES");
        centroEducativo.mostrarTrabajadores();

        System.out.println();
        System.out.println("SALARIO MEDIO");
        System.out.println(centroEducativo.salarioMedio());

        System.out.println();
        System.out.println("TRABAJADOR MÁS ANTIGÜO");
        System.out.println(centroEducativo.trabajadorMasAntiguo());

        System.out.println();
        System.out.println("ULTIMO APARTADO");
        for (Trabajador tr : trabjadores) {
            System.out.println(tr.getNombre() + " " + tr.getApellidos() + " " + tr.trabajar());
        }


    }

}

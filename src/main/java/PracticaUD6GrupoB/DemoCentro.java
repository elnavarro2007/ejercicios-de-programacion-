package PracticaUD6GrupoB;

import java.time.LocalDate;

public class DemoCentro {
    static void main(String[] args) {
        Profesor p1 = new Profesor("Ana", "López", "123A",
                LocalDate.of(2015, 3, 10), 1500,
                "Matemáticas", 20);

        Profesor p2 = new Profesor("Luis", "Martínez", "456B",
                LocalDate.of(2010, 1, 5), 1600,
                "Historia", 18);

        PersonalAdministrativo a1 = new PersonalAdministrativo("Marta", "García", "789C",
                LocalDate.of(2018, 6, 1), 1300,
                "Secretaría", 2);

        PersonalAdministrativo a2 = new PersonalAdministrativo("Carlos", "Ruiz", "321D",
                LocalDate.of(2008, 9, 20), 1400,
                "Contabilidad", 3);

        CentroEducativo centroEducativo = new CentroEducativo();

        centroEducativo.anadirTrabajador(p1);
        centroEducativo.anadirTrabajador(p2);
        centroEducativo.anadirTrabajador(a1);
        centroEducativo.anadirTrabajador(a2);

        centroEducativo.mostrarEmpleado();

        System.out.println(centroEducativo.mediaCentro());

    }
}

package Evaluacion1.PracticaUD6;

import java.time.LocalDate;

public class Main {
    static void main() {

        Empresa empresa = new Empresa();
        Empleado empleado = new Empleado();

        Empleado e1 = new Empleado("Carlos", "García López", LocalDate.of(2018, 5, 10),
                "12345678A", 2850.50, "Desarrollador Senior");

        Empleado e2 = new Empleado("Ana", "Martínez Ruiz", LocalDate.of(2020, 3, 15),
                "87654321B", 2450.00, "Analista");

        Empleado e3 = new Empleado("Luis", "Fernández", LocalDate.of(2015, 11, 22),
                "11223344C", 3200.00, "Project Manager");

        Empleado e4 = new Empleado("María", "Sánchez", LocalDate.of(2022, 1, 8),
                "55667788D", 2100.00, "Diseñadora UX");

        empresa.añadirEmpleado(e1);
        empresa.añadirEmpleado(e2);
        empresa.añadirEmpleado(e3);
        empresa.añadirEmpleado(e4);

        // empresa.empleados();
//
        // System.out.println(" La media salario de empleados es  " + empresa.mediaSalario());
//
        // // empresa.buscarEmpleado();
//
        // System.out.println(e1.getNombre()+ " " +e1.trabajar());
        // System.out.println(e1.antiguedad());
        empresa.buscarEmpleado();


    }
}

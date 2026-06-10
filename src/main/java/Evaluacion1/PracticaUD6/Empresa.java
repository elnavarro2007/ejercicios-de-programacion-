package Evaluacion1.PracticaUD6;

import java.util.ArrayList;
import java.util.Scanner;

public class Empresa {
    private ArrayList<Empleado> empleados;


    public Empresa(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(ArrayList<Empleado> empleados) {
        this.empleados = empleados;
    }

    public void empleados() {
        for (Empleado e : empleados) {
            System.out.println(e);
        }
    }

    public Double mediaSalario() {
        double suma = 0;
        double contador = 0;

        for (Empleado e : empleados) {
            suma = suma + e.getSalario();
            contador++;
        }
        return suma / contador;
    }

    public void buscarEmpleado() {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        while (num != 3) {
            System.out.println("Busca un empleado por 1 puesto o por 2 nombre");
            num = scanner.nextInt();
            switch (num) {
                case 1:
                    System.out.println("Introduce el puesto");
                    String puesto = scanner.next();
                    for (Empleado e : empleados) {
                        if (e.getPuesto().equals(puesto)) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce el Nombre");
                    String nombre = scanner.next();
                    for (Empleado e : empleados) {
                        if (e.getNombre().equals(nombre)) {
                            System.out.println(e);
                        }
                    }
                    break;
                case 3:
                    break;


            }


        }
    }
    public void añadirEmpleado (Empleado e){
        empleados.add(e);
    }

}

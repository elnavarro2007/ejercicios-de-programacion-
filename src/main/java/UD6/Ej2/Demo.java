package UD6.Ej2;

import java.util.ArrayList;

public class Demo {
    static void main(String[] args) {


        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado e1 = new Empleado("Pepe",1200);
        EmpleadoFijo e2 = new EmpleadoFijo("blas",100,8);

        empleados.add(e1);
        empleados.add(e2);

        double suma = 0;

        for (Empleado e : empleados){
            suma = suma + e.calcularSalario();

        }
        System.out.println(suma);
    }
}

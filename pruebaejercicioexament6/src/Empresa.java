import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Empresa {

    private ArrayList<Empleado> empleados;

    public Empresa() {
        empleados = new ArrayList<>();
    }

    public ArrayList<Empleado> getEmpleado() {
        return empleados;
    }

    public Empresa(ArrayList<Empleado> empleado) {
        this.empleados = empleado;

    }

    public void mostrarEmpleado() {
        if (empleados.isEmpty()) {
            System.out.println("no hay ningun elemento");
        } else {
            for (Empleado e : empleados) {
                System.out.println(e);
            }
        }
    }
    public Double salarioPromedio () {
        double suma = 0.0;
        if (empleados.isEmpty())
            return 0.0;


        for (Empleado e : empleados) {
            suma = suma + e.getSalario();
        }
        return suma / empleados.size();
    }


    public Double salariopromedio() {
        Double sumaSalario = 0.0;
        for (Empleado e : empleados) {
            sumaSalario = sumaSalario + e.getSalario();
        }
        return sumaSalario;

    }

    public Empleado antiguedad() {
        Empleado masAntiguo = empleados.get(0);
        for (Empleado e : empleados) {
            if (e.getAntiguedad() > masAntiguo.getAntiguedad()) {
                masAntiguo = e;
            }

        }
        return masAntiguo;


    }

    public ArrayList<Empleado> buscar(String texto) {
        ArrayList<Empleado> encontrado = new ArrayList<>();
        for (Empleado e : empleados) {
            if (e.getNombre().equalsIgnoreCase(texto) || e.getPuesto().equalsIgnoreCase(texto)) {
                encontrado.add(e);
            }
        }
        return encontrado;
    }


}

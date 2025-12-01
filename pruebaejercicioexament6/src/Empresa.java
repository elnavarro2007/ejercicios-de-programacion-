import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Empresa {

  ArrayList<Empleado> empleados = new ArrayList<Empleado>();

    public ArrayList<Empleado> getEmpleado() {
        return empleados;
    }

    public Empresa(ArrayList<Empleado> empleado) {
        this.empleados = empleado;

    }
    public void devolverempleados() {
        for (Empleado e: empleados) {
            System.out.println(e.toString());
        }
    }
    public Double salariopromedio (){
        Double sumaSalario = 0.0;
        for (Empleado e:empleados){
            sumaSalario = sumaSalario+e.getSalario();
        }
        return sumaSalario;

    }
    public LocalDate antiguedad (){
        for (Empleado e: empleados){
            Arrays.sort();
        }


    }




}

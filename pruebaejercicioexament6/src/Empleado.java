import java.time.LocalDate;
import java.time.Period;

public class Empleado {

    String nombre;
    String apellido;
    LocalDate fechaDeContratacion;
    String DNI;
    Double salario;
    String puesto;

    public String getNombre() {
        return nombre;

    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaDeContratacion() {
        return fechaDeContratacion;
    }

    public void setFechaDeContratacion(LocalDate fechaDeContratacion) {
        fechaDeContratacion = fechaDeContratacion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String trabajar() {
        return "Trabajando como " +puesto;
    }

    public String toString() {
        return "Nombre :" + nombre +
                "apellido :" + apellido +
                "Fecha contratacion :" + fechaDeContratacion +
                "DNI :" + DNI +
                "Salario :" + salario +
                "Puesto :" + puesto;


    }

    public Integer antiguedad() {

        return Period.between(fechaDeContratacion,LocalDate.now()).getDays();
    }
}


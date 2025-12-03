import java.time.LocalDate;
import java.time.Period;

public class Empleado {

   private String nombre;
   private String apellido;
   private LocalDate fechaContratacion;
   private String dni;
   private Double salario;
   private String puesto;

    public Empleado() {
    }

    public Empleado(String nombre) {
        this.nombre = nombre;
    }

    public Empleado(String nombre, String apellido, LocalDate fechaContratacion, String dni, Double salario, String puesto) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaContratacion = fechaContratacion;
        this.dni = dni;
        this.salario = salario;
        this.puesto = puesto;
    }

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
        return fechaContratacion;
    }

    public void setFechaDeContratacion(LocalDate fechaDeContratacion) {
        fechaDeContratacion = fechaDeContratacion;
    }

    public String getDNI() {
        return dni;
    }

    public void setDNI(String dni) {
        this.dni = dni;
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
                "Fecha contratacion :" + fechaContratacion +
                "DNI :" + dni +
                "Salario :" + salario +
                "Puesto :" + puesto;


    }

    public Integer getAntiguedad() {
        if (fechaContratacion==null){
            return 0;
        }else {
            return Period.between(fechaContratacion, LocalDate.now()).getDays();
        }
    }

}


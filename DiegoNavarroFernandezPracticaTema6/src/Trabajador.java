import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Trabajador {

    private String nombre;
    private String apellidos;
    private String DNI;
    private LocalDate fechaIncorporacion;
    private double salarioBase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public LocalDate getFechaIncorporacion() {
        return fechaIncorporacion;
    }

    public void setFechaIncorporacion(LocalDate fechaIncorporacion) {
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Trabajador() {
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }

    public Trabajador(String nombre, LocalDate fechaIncorporacion) {
        this.nombre = nombre;
        this.fechaIncorporacion = fechaIncorporacion;
    }

    public Trabajador(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.DNI = DNI;
        this.fechaIncorporacion = fechaIncorporacion;
        this.salarioBase = salarioBase;
    }

    public abstract double calcularSalario();


    public String trabajar() {
        return "Estoy trabajando en el centro educativo";
    }

    public int antiguedad() {
        return (int) ChronoUnit.YEARS.between(fechaIncorporacion, LocalDate.now());
    }

    @Override
    public String toString() {
        return "Trabajador: " +
                "nombre ='" + nombre + '\'' +
                ", apellidos ='" + apellidos + '\'' +
                ", DNI ='" + DNI + '\'' +
                ", fechaIncorporacion =" + fechaIncorporacion +
                ", salarioBase =" + salarioBase ;
    }
}

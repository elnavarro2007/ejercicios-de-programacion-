package PracticaUD6GrupoB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Trabajador {
    private String nombre;
    private String apellidos;
    private String dni;
    private LocalDate fechaInc;
    private double salarioBase;

    //constructores


    public Trabajador() {
    }

    public Trabajador(String nombre) {
        this.nombre = nombre;
    }


    public Trabajador(String nombre, LocalDate fechaInc) {
        this.nombre = nombre;
        this.fechaInc = fechaInc;
    }

    public Trabajador(String nombre, String apellidos, String dni, LocalDate fechaInc, double salarioBase) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.fechaInc = fechaInc;
        this.salarioBase = salarioBase;
    }

    // Getters y setters


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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public LocalDate getFechaInc() {
        return fechaInc;
    }

    public void setFechaInc(LocalDate fechaInc) {
        this.fechaInc = fechaInc;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    // metodos

    public String trabajar(){
        return "Estoy trabajando en un centro educativo ";
    }

    public int antiguedad(){
        return fechaInc.getYear() - LocalDate.now().getYear();
    }

    public abstract double calcularSalario();

    @Override
    public String toString() {
        return "Trabajador{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", fechaInc=" + fechaInc +
                ", salarioBase=" + salarioBase +
                '}';
    }
}

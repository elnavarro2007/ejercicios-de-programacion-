package PracticaUD6GrupoB;

import java.time.LocalDate;

public class Profesor extends Trabajador {

    private String especialidad;
    private int horasLectivasSemanales;


    public Profesor(String nombre, String apellidos, String dni, LocalDate fechaInc, double salarioBase, String especialidad, int horasLectivasSemanales) {
        super(nombre, apellidos, dni, fechaInc, salarioBase);
        this.especialidad = especialidad;
        this.horasLectivasSemanales = horasLectivasSemanales;
    }

    // metodos
    @Override
    public double calcularSalario() {
        return getSalarioBase() + horasLectivasSemanales * 20;
    }


    @Override
    public String trabajar() {
        return "Estoy trabajando como : " + especialidad;
    }

    // getters y setters

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public int getHorasLectivasSemanales() {
        return horasLectivasSemanales;
    }

    public void setHorasLectivasSemanales(int horasLectivasSemanales) {
        this.horasLectivasSemanales = horasLectivasSemanales;
    }

    @Override
    public String toString() {
        return super.toString() + "Profesor{" +
                "especialidad='" + especialidad + '\'' +
                ", horasLectivasSemanales=" + horasLectivasSemanales +
                '}';
    }
}

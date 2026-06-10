package PracticaUD6GrupoB;

import java.time.LocalDate;

public  class PersonalAdministrativo extends Trabajador{

    private String especialidad;
    private int nivel;


    public PersonalAdministrativo(String nombre, String apellidos, String dni, LocalDate fechaInc, double salarioBase, String especialidad, int nivel) {
        super(nombre, apellidos, dni, fechaInc, salarioBase);
        this.especialidad = especialidad;
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + nivel*30;
    }

    @Override
    public String trabajar() {
        return super.trabajar() +  " Mi es especialidad es : "+especialidad;
    }

    @Override
    public String toString() {
        return super.toString() + "PersonalAdministrativo{" +
                "especialidad='" + especialidad + '\'' +
                ", nivel=" + nivel +
                '}';
    }
}

package UD6.Ej2;

import java.util.ArrayList;

public class Empleado {
    public String nombre;
    public double salario;

    ArrayList<Empleado> empleados = new ArrayList<>();

    public Empleado() {
    }

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public double calcularSalario(){
        return salario;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void anadirEmpleado(Empleado e){
        empleados.add(e);
    }
}

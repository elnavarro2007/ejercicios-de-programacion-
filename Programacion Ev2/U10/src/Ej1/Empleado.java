package Ej1;

public class Empleado {
    public String nombre;
    public double salarioBase;

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    public String mostrarInfo(){
        return "Empleado : " +nombre+ " Salario : " +salarioBase + " €";
    }
}

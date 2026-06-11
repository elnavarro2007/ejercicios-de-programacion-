package Ev2.UD10.Ej1;

public class Gerente extends Empleado {
    private double bono;


    public Gerente() {
    }

    public Gerente(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

    @Override
    public String mostrarInfo(){
        return super.mostrarInfo() + " Bono : "+bono;
    }
}

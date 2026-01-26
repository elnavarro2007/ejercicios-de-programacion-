package Ej1;

public class Gerente extends Empleado {
    private String bono;

    public Gerente(String nombre, double salarioBase, String bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }
    @Override
    public String mostrarInfo(){

        return "Empleado : " +nombre+ " Salario : " +salarioBase + " € " +" Bono : " +bono;
    }
}

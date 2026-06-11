package Ev2.UD10.Ej1;

public class DemoEmpleadoGerente {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("La puta de tu madre",1200.00);
        Gerente g1 = new Gerente("La puta de tu madre",1200.00,200);


        System.out.println(        e1.mostrarInfo());
        System.out.println(g1.mostrarInfo());
    }
}

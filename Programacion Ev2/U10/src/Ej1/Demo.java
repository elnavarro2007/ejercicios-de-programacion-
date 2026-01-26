package Ej1;

public class Demo {
    public static void main(String[] args) {
        Empleado empleado = new Empleado("Pacheco",2100);
        Gerente gerente = new Gerente("Niggaman",20,"2 migas de pan");
        System.out.println(empleado.mostrarInfo());
        System.out.println(gerente.mostrarInfo());
    }

}

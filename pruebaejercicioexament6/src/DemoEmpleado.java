import java.time.LocalDate;

public class DemoEmpleado {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        Empleado e1 = new Empleado("Ana", "Lopez", LocalDate.of(2000, 1,  5), "11111a", 1800.0, "contable");
        empresa.getEmpleado().add(e1);
        System.out.println("LISTA ");
        empresa.mostrarEmpleado();

        System.out.println("Salario promedio" + empresa.salariopromedio());

        System.out.println("Empleado mas antiguo" + empresa.antiguedad());
    }
}

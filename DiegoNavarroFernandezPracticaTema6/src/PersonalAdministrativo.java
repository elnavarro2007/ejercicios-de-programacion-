import java.time.LocalDate;

public class PersonalAdministrativo extends Trabajador {

    private String departamento;
    private int nivel;


    public PersonalAdministrativo(String nombre, String apellidos, String DNI, LocalDate fechaIncorporacion, double salarioBase, String departamento, int nivel) {
        super(nombre, apellidos, DNI, fechaIncorporacion, salarioBase);
        this.departamento = departamento;
        this.nivel = nivel;
    }

    @Override
    public double calcularSalario() {
        return super.getSalarioBase() + (nivel * 100);
    }

    @Override
    public String trabajar() {
        return "Realiza tareas administrativas del departamento " + departamento;
    }


}

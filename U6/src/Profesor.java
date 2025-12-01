public class Profesor extends Personas {
    private Integer nomina;
    private Boolean escabron;


    public Profesor() {
    }

    public Profesor(Double peso, Double altura, Integer edad, String DNI, String nombre, Integer nomina, Boolean escabron) {
        super(peso, altura, edad, DNI, nombre);
        this.nomina = nomina;
        this.escabron = escabron;
    }

    public Integer getNomina() {
        return nomina;
    }

    public void setNomina(Integer nomina) {
        this.nomina = nomina;
    }

    public Boolean getEscabron() {
        return escabron;
    }

    public void setEscabron(Boolean escabron) {
        this.escabron = escabron;
    }
}

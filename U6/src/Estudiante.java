public class Estudiante extends Personas {
    private Integer numexp;
    private Integer faltas;
    private Integer examens;


    public Estudiante() {
    }


    public Estudiante(Double peso, Double altura, Integer edad, String DNI, String nombre, Integer numexp, Integer faltas, Integer examens) {
        super(peso, altura, edad, DNI, nombre);
        this.numexp = numexp;
        this.faltas = faltas;
        this.examens = examens;


    }
}
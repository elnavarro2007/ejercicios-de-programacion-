



public class Personas {

    private Double peso;
    private Double altura;
    private Integer edad;
    private String DNI;
    private String nombre;

    //constructor persona




    public Personas () {


    }

    public Personas(Double peso, Double altura, Integer edad, String DNI, String nombre) {


        this.peso = peso;
        this.altura = altura;
        this.edad = edad;
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Personas{" +
                "peso=" + peso +
                ", altura=" + altura +
                ", edad=" + edad +
                ", DNI='" + DNI + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}


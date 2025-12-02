import java.time.LocalDate;
import java.time.Period;
import java.util.Locale;

public class Persona {

    private String nombre;
    private String apellidos;
    private LocalDate fechaDeNacimiento;
    private String dni;
    private String sexo;



    public Persona(String nombre, String apellidos, LocalDate fechaDeNacimiento, String dni, String sexo) {
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.fechaDeNacimiento=fechaDeNacimiento;
        this.dni=dni;
        this.sexo=sexo;


    }

    public Persona() {
    }

    public String getNombre() {

        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {

        return apellidos;
    }

    public void setApellidos(String apellidos) {

        this.apellidos = apellidos;
    }

    public LocalDate getFechaDeNacimiento() {

        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(LocalDate fechaDeNacimiento) {

        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getDni() {

        return dni;
    }

    public void setDni(String dni) {

        this.dni = dni;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {

        this.sexo = sexo;
    }
    public String nomnbre (){

        return "Hola soy "+nombre;
    }
    @Override
    public String toString(){
        return "nombre "+nombre+
                " apellidos "+apellidos+
                " fechanacimiento "+fechaDeNacimiento+
                " DNI "+dni+
                " Sexo "+sexo;
    }
    public Integer tiempo (){
        return Period.between(fechaDeNacimiento,LocalDate.now()).getYears();
    }
}

package PracticaUD8Herencia;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Vehiculo {
    private String marca;
    private  String modelo;
    private int anoFabricacion;
    private String matricula;
    private double precio;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int anoFabricacion, String matricula, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacion = anoFabricacion;
        this.matricula = matricula;
        this.precio = precio;
    }

    public Vehiculo(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnoFabricacion() {
        return anoFabricacion;
    }

    public void setAnoFabricacion(int anoFabricacion) {
        this.anoFabricacion = anoFabricacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String descripcion (){
        return "Vehiculo marca : "+marca+ " modelo : "+modelo
                +" Año fabricacion : "+anoFabricacion + " matricula " +matricula+
                "precio" + precio;
    }

    public int calcularAntiguedad(){
        return LocalDate.now().getYear() - anoFabricacion  ;
    }
}

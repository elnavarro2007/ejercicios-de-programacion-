package PracticaUD8Herencia;

public class Coche extends Vehiculo{
    private  int puertas;
    private String tipoCombustible;

    public Coche(String marca, String modelo, int anoFabricacion, String matricula, double precio, int puertas, String tipoCombustible) {
        super(marca, modelo, anoFabricacion, matricula, precio);
        this.puertas = puertas;
        this.tipoCombustible = tipoCombustible;
    }

    public String descripcion(){
        return super.descripcion() + " Puertas : " +puertas + " tipoCombustible" + tipoCombustible;
    }
}

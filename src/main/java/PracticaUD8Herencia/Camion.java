package PracticaUD8Herencia;

public class Camion extends Vehiculo{
    private double capacidadCarga;
    private int ejes;

    public Camion(String marca, String modelo, int anoFabricacion, String matricula, double precio, double capacidadCarga, int ejes) {
        super(marca, modelo, anoFabricacion, matricula, precio);
        this.capacidadCarga = capacidadCarga;
        this.ejes = ejes;
    }

    @Override

    public String descripcion(){
        return super.descripcion() + " Carga capacidad + "+capacidadCarga+ " ejes : "+ejes ;
    }


}

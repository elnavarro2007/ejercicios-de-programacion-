package PracticaUD8Herencia;

public class Moto extends Vehiculo{
    private int cilindrada;
    private String tipoMoto;

    public Moto(String marca, String modelo, int anoFabricacion, String matricula, double precio, int cilindrada, String tipoMoto) {
        super(marca, modelo, anoFabricacion, matricula, precio);
        this.cilindrada = cilindrada;
        this.tipoMoto = tipoMoto;
    }

    public String descripcion(){
        return super.descripcion() + " cilindrada : "+cilindrada + " tipoMoto : "+tipoMoto;
    }
}

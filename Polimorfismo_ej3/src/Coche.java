public class Coche extends Vehiculo{

    public Coche(String marca, String vehiculo) {
        super(marca, vehiculo);
    }
    public String abrirMaletero(){
        return "la marca"  +super.marca + " y su  " +super.vehiculo + "se puede abrir maletero";
    }
}

public class Motocicleta extends Vehiculo {
    public Motocicleta(String marca, String vehiculo) {
        super(marca, vehiculo);
    }
    public String caballito(){
        return " la marca " +super.marca + " y su " +super.vehiculo + " hace caballitos" ;
    }
}

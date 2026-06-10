package UD6.Ej3;

public class Motocicleta extends Vehiculo{


    public String haceCaballitos(){
        return "La marca "+marca + " Con su modelo "+modelo + "Hace caballitos";
    }

    @Override
    public void arrancar(){
        System.out.println("La motochicletera bichicletera arrancara!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public Motocicleta(String marca, String modelo) {
        super(marca, modelo);
    }
}

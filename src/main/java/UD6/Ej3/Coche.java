package UD6.Ej3;

public class Coche extends Vehiculo {

    public String abrirMaletero(){
        return  "La marca : "+marca+ " Su modelo "+ modelo + " tiene maleteros";
    }

    @Override
    public void arrancar(){
        System.out.println("El coche arrancara!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }


    public Coche(String marca, String modelo) {
        super(marca, modelo);
    }
}

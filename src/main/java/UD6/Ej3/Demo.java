package UD6.Ej3;

import java.util.ArrayList;

public class Demo {

    static void main(String[] args) {
        ArrayList<Vehiculo> vehiculos = new ArrayList<>();

        Coche c1 = new Coche("Fuukacar","fuuka");
        Motocicleta m1 = new Motocicleta("Motochicleta","Thor");

        vehiculos.add(c1);
        vehiculos.add(m1);

        System.out.println(c1.abrirMaletero());
        System.out.println(m1.haceCaballitos());

        for (Vehiculo v : vehiculos){
            v.arrancar();
        }
    }




}

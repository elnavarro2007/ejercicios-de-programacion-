package Ej2;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        ArrayList<Vehiculo> listaVehiculos = new ArrayList<>();

        listaVehiculos.add(new Auto());
        listaVehiculos.add(new Camion());
        listaVehiculos.add(new Motocicleta());

        for (Vehiculo v : listaVehiculos) {
            System.out.println(v.describirVehiculo());
        }

    }
}

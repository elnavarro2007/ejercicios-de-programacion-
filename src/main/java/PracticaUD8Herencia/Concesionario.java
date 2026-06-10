package PracticaUD8Herencia;

import java.util.ArrayList;
import java.util.Scanner;

public class Concesionario {
    private ArrayList<Vehiculo> vehiculos;

    public Concesionario() {
        this.vehiculos = new ArrayList<>();
    }

    public Concesionario(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public ArrayList<Vehiculo> getVehiculos() {
        return vehiculos;
    }



    public void setVehiculos(ArrayList<Vehiculo> vehiculos) {
        this.vehiculos = vehiculos;
    }

    public void mostrarVehiculos() {
        for (Vehiculo v : vehiculos) {
            System.out.println(v.descripcion());
        }
    }

    public int vehiculoAntiguo() {
        Vehiculo v = vehiculos.get(0);

        for (Vehiculo v2 : vehiculos) {
            if (v2.calcularAntiguedad() < v.calcularAntiguedad()) {
                v = v2;
            }
        }
        return v.getAnoFabricacion();
    }

    public ArrayList<Vehiculo> buscarVehiculo() {
        ArrayList<Vehiculo> vehiculoMarca = new ArrayList<>() ;
        ArrayList<Vehiculo> vehiculoTipo = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int num = 0;

            System.out.println(" 1 buscar por marca 2 buscar por tipo 3 salir");
            num = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("Introduce la marca");
                    String marca = sc.next();
                    for (Vehiculo v : vehiculos) {
                        if (marca.equals(v.getMarca())) {
                            vehiculoMarca.add(v);
                        }
                    }
                    break;
                case 2:
                    System.out.println("Introduce el tipo");
                    String tipo = sc.next();
                    for (Vehiculo v : vehiculos) {
                        if (tipo.equals(v.getModelo())) {
                            vehiculoTipo.add(v);
                        }
                    }
                    break;

                case 3:
                    break;

            }

        System.out.println("Introduce que quieres 1 modelo o 2Marca");
        int escoger = sc.nextInt();
        if (escoger == 1) {
            return vehiculoTipo;
        } else if (num == 2) {
            return vehiculoMarca;
        } else {
            return null;
        }


    }

    public double mediaPrecio() {
        double precio = 0;
        int contador = 0;
        for (Vehiculo v : vehiculos) {
            precio = precio + v.getPrecio();
            contador++;
        }
        return precio / contador;
    }

    public void anadirVehiculo(Vehiculo v) {
        vehiculos.add(v);
    }
}

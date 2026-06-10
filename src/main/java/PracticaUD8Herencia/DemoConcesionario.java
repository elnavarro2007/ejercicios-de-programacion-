package PracticaUD8Herencia;

public class DemoConcesionario {
    static void main() {
        Concesionario concesionario = new Concesionario();
        Coche coche1 = new Coche("Toyota", "Corolla", 2018, "ABC1234", 18500.0, 5, "Gasolina");
        Coche coche2 = new Coche("Volkswagen", "Golf", 2020, "XYZ5678", 22500.0, 5, "Diésel");
        Coche coche3 = new Coche("Seat", "Ibiza", 2019, "DEF4321", 159000.0, 3, "Gasolina");

        // MOTOCICLETAS
        Moto moto1 = new Moto("Honda", "CBR", 1900, "MOT7777", 8900.0, 650, "Deportiva");
        Moto moto2 = new Moto("Yamaha", "MT-07", 2019, "MOT8888", 7200.0, 689, "Naked");
        Moto moto3 = new Moto("BMW", "R1250GS", 2022, "MOT9999", 18500.0, 1250, "Adventure");

        // CAMIONES
        Camion camion1 = new Camion("Mercedes", "Actros", 2017, "CAM1111", 45000.0, 24.5, 3);
        Camion camion2 = new Camion("Scania", "R500", 2015, "CAM2222", 52000.0, 35.0, 4);
        Camion camion3 = new Camion("Volvo", "FH", 2020, "CAM3333", 48000.0, 18.0, 2);

        // ==================== AÑADIR AL CONCESIONARIO ====================

        concesionario.anadirVehiculo(coche1);
        concesionario.anadirVehiculo(coche2);
        concesionario.anadirVehiculo(coche3);

        concesionario.anadirVehiculo(moto1);
        concesionario.anadirVehiculo(moto2);
        concesionario.anadirVehiculo(moto3);

        concesionario.anadirVehiculo(camion1);
        concesionario.anadirVehiculo(camion2);
        concesionario.anadirVehiculo(camion3);

        concesionario.mostrarVehiculos();
        System.out.println(concesionario.vehiculoAntiguo());
        System.out.println(moto2.calcularAntiguedad());

        System.out.println(concesionario.mediaPrecio());
    }
}

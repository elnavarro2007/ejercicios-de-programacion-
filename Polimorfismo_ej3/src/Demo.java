import java.util.ArrayList;

public class Demo {
    static void main() {
        ArrayList <Vehiculo> listaVehiculo = new ArrayList<>();

        listaVehiculo.add(new Coche("Neesan","coche"));
        listaVehiculo.add(new Motocicleta("Fuuka", "Fuukamoto"));
        for (Vehiculo ve : listaVehiculo){
            System.out.println(ve.arrancara());

        }


    }
}

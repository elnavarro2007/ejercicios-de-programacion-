import java.time.LocalDate;
import java.util.ArrayList;

public class CentroEducativo {


    private ArrayList<Trabajador> trabajdorr;

    public CentroEducativo() {
        trabajdorr = new ArrayList<>();
    }

    public CentroEducativo(ArrayList<Trabajador> trabajdorr) {
        this.trabajdorr = trabajdorr;
    }

    /*
    public void mostrarNombre (){
        for (Trabajador t : trabajdorr){
            System.out.println(super.getNombre());
        }
    }
    */

    public void mostrarTrabajadores(){
        for (Trabajador t : trabajdorr){
            System.out.println(t);
        }
    }

    public double salarioMedio() {
        double salarioMedio = 0;
        for (Trabajador t : trabajdorr) {
            salarioMedio = salarioMedio + t.getSalarioBase();
        }
        return salarioMedio / trabajdorr.size();
    }

    public Trabajador trabajadorMasAntiguo() {
        Trabajador mayor = trabajdorr.getFirst();

        for (Trabajador t : trabajdorr) {
            if (t.antiguedad() > mayor.antiguedad()) {
                mayor = t;
            }
        }

        return mayor;
    }
}

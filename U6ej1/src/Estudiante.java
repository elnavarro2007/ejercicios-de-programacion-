import java.util.ArrayList;

public class Estudiante extends Persona{

    private ArrayList<Persona> lista = new ArrayList<Persona>();

    public ArrayList<Persona> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Persona> lista) {
        this.lista = lista;
    }


}

package UD6.Ej4;

public class Revista extends Publicacion {
    public int numEdicion;

    public Revista(String titulo, String autor, int numEdicion) {
        super(titulo, autor);
        this.numEdicion = numEdicion;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + " edicion : "+numEdicion;
    }
}

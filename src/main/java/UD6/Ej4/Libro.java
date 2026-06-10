package UD6.Ej4;

public class Libro extends Publicacion {
    public int numPaginas;

    public Libro(String titulo, String autor, int numPaginas) {
        super(titulo, autor);
        this.numPaginas = numPaginas;
    }
    @Override
    public String mostrarInformacion(){
        return super.mostrarInformacion() + " paginas : "+numPaginas;

    }

}

package UD6.Ej4;

public class Publicacion {

    public String titulo;
    public String autor;

    public String mostrarInformacion(){
        return "Autor : "+autor + " titulo : "+titulo;

    }

    public Publicacion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
}

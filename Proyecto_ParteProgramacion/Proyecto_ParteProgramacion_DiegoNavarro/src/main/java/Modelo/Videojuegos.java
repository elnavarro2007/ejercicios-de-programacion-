package Modelo;

public class Videojuegos {
    public int numero_serie;
    public String nombre;
    public String genero;


    // constructor y constructor vacio
    public Videojuegos() {
    }

    public Videojuegos(int numero_serie, String nombre, String genero) {
        this.numero_serie = numero_serie;
        this.nombre = nombre;
        this.genero = genero;
    }

    // Getter y Setter

    public int getNumero_serie() {
        return numero_serie;
    }

    public void setNumero_serie(int numero_serie) {
        this.numero_serie = numero_serie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}

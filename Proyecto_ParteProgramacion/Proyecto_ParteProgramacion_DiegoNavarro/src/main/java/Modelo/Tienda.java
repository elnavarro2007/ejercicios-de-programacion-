package Modelo;

public class Tienda {
    public int id;
    public int telefono;
    public String nombreTienda;
    public String ubicacion;
    public int Stock;

// constructor y constructor vacio

    public Tienda() {
    }

    public Tienda(int id, int telefono, String nombreTienda, String ubicacion, int stock) {
        this.id = id;
        this.telefono = telefono;
        this.nombreTienda = nombreTienda;
        this.ubicacion = ubicacion;
        Stock = stock;
    }

    // Getter y Setter

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int stock) {
        Stock = stock;
    }
}

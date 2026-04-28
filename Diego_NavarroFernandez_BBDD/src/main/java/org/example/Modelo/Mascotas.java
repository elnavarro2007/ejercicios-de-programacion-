package org.example.Modelo;

public class Mascotas {
    private int idMascota;
    private String nombre;
    private String especie;
    private int edad;
    private int id;
    private String NombreDueño;
    private String telefono;

    public Mascotas() {
    }

    public Mascotas(String nombre, String especie, int edad, int id) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.id = id;
    }

    public Mascotas(int idMascota, String nombre, String especie, int edad, int id, String nombreDueño) {
        this.idMascota = idMascota;
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.id = id;
        NombreDueño = nombreDueño;
    }

    public Mascotas(int idMascota) {
        this.idMascota = idMascota;
    }

    public Mascotas(String nombre, String nombreDueño, String telefono) {
        this.nombre = nombre;
        NombreDueño = nombreDueño;
        this.telefono = telefono;
    }

    public int getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(int idMascota) {
        this.idMascota = idMascota;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreDueño() {
        return NombreDueño;
    }

    public void setNombreDueño(String nombreDueño) {
        NombreDueño = nombreDueño;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Mascotas{" +
                "nombre='" + nombre + '\'' +
                ", NombreDueño='" + NombreDueño + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}

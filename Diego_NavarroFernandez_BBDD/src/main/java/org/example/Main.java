package org.example;

import org.example.Controlador.Conexion;
import org.example.Controlador.MascotaDAO;
import org.example.Modelo.Mascotas;

import java.util.ArrayList;
import java.util.Scanner;

import static java.sql.DriverManager.getConnection;

public class Main {
    public static void main(String[] args) {
        if (Conexion.getConnection() == null) {
            System.out.println("Error al establecer Conexion");
        } else {
            System.out.println("Conexion establecida");
        }


        // booleano para controlar el bucle


        boolean bucle = true;
        Scanner sc = new Scanner(System.in);

        System.out.println("1 -- Ver mascotas \n" +
                "2-- insertar Mascota\n" +
                "3-- Mostrar mascotas registradas\n" +
                "4 Buscar Mascota\n" +
                "5 eliminar\n" +
                "6 salir\n");


        //Mascotas añadirMascota = new Mascotas("Perro1","Perro",10,1);
        ////ArrayList<Mascotas> mascota = MascotaDAO.verMascotaDueño();
        //Mascotas mascota2 = new Mascotas(1);


        //if(MascotaDAO.insertarMascota(añadirMascota)){
        //    System.out.println("insertado");
        //}else {
        //    System.out.println("No insertado");
        //}

        //for (Mascotas m : mascota){
        //    System.out.println(m);
        //}

        // if(MascotaDAO.eliminarMascota(mascota2)){
        //     System.out.println("Eliminado");
        // }else {
        //     System.out.println("Error al eliminar");
        // }
        sc.nextLine();


        // menu en bucle
        while (bucle) {
            System.out.println("1 -- Ver mascotas \n" +
                    "2-- insertar Mascota\n" +
                    "3-- Mostrar mascotas registradas\n" +
                    "4 Buscar Mascota\n" +
                    "5 eliminar\n" +
                    "6 salir\n");
            int numero = sc.nextInt();

            switch (numero) {
                case 1:
                    MascotaDAO.verMascotaDueño();


                    break;
                case 2:
                    System.out.println("introduce un nombre");
                    String nombre = sc.next();
                    System.out.println("introduce una especie");
                    String especie = sc.next();
                    System.out.println("Introduce el edad");
                    int edad = sc.nextInt();
                    System.out.println("La id del propietario");
                    int idProp = sc.nextInt();
                    Mascotas añadirMascota = new Mascotas(nombre, especie, edad, idProp);
                    if (MascotaDAO.insertarMascota(añadirMascota)) {
                        System.out.println("insertado");
                    } else {
                        System.out.println("No insertado");
                    }

                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    System.out.println("introduce el id de la mascota");
                    int id = sc.nextInt();
                    Mascotas mascota = new Mascotas(id);

                    if (MascotaDAO.eliminarMascota(mascota)) {
                        System.out.println("Eliminado");
                    } else {
                        System.out.println("Error al eliminar");
                    }
                    break;
                case 6:
                    bucle = false;
                    break;
                default:
            }
        }

    }


}

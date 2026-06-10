package UD6.Ej4;

import java.util.ArrayList;

public class Demo {
    static void main(String[] args) {
        ArrayList<Publicacion> publicacions = new ArrayList<>();

        Libro l1 = new Libro("Como ser como ENP", "Jordi ENP", 230);
        Revista r1 = new Revista("Como imitar las poses del kamasutra sin parirte la espalda",
                "Adolfo", 9);

        publicacions.add(l1);
        publicacions.add(r1);

        for (Publicacion p : publicacions){
            System.out.println(p.mostrarInformacion());
        }
    }
}

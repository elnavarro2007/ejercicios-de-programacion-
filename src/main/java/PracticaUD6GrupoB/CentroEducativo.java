package PracticaUD6GrupoB;

import java.util.ArrayList;
import java.util.Scanner;

public class CentroEducativo {
    private ArrayList<Trabajador> trabajadors;


    public CentroEducativo() {
        this.trabajadors = new ArrayList<>();
    }

    public CentroEducativo(ArrayList<Trabajador> trabajadors) {
        this.trabajadors = trabajadors;
    }

    public void anadirTrabajador(Trabajador t) {
        trabajadors.add(t);
    }

    public double mediaCentro() {
        int contador = 0;
        double sumaSalario = 0;
        for (Trabajador t : trabajadors) {
            sumaSalario = sumaSalario + t.calcularSalario();
            contador++;
        }
        return sumaSalario / contador;
    }

    public void buscarEmpleado() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Que quieres 1 Buscar por nombre 2 buscar por tipo");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("Introduce un nombre");
                String nombre = sc.nextLine();
                for (Trabajador t : trabajadors) {
                    if (t.getNombre() == nombre) {
                        System.out.println(t.toString());
                    }
                }
            case 2:

                System.out.println("Introduce un tipo");
                String tipo = sc.nextLine();
                for (Trabajador t : trabajadors) {
                    if (t.getNombre() == tipo) {
                        System.out.println(t.toString());
                    }
                }

        }
    }
    public void mostrarEmpleado(){
        for (Trabajador t : trabajadors){
            System.out.println(t);
        }
    }
}

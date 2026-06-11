import Controlador.Conexion;
import Controlador.ESTUDIANTEDAO;
import Modelo.Estudiante;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    static void main() {
        Scanner sc = new Scanner(System.in);
        Conexion.conexion();
        boolean booleano = true;


        while (booleano) {
            System.out.println("Introduce lo que qieres hacer \n" +
                    "1. Ver estudiantes\n" +
                    "2. Insertar estudiante\n" +
                    "3. Actualizar edad\n" +
                    "4. Eliminar estudiante\n" +
                    "5. Salir");

            int num = sc.nextInt();

            switch (num) {
                case 1:
                    sc.nextLine();
                    ArrayList<Estudiante> estudiantes = new ArrayList<>(ESTUDIANTEDAO.verEstudiante());

                    for (Estudiante e : estudiantes) {
                        System.out.println(e);
                    }

                    break;

                case 2:

                    try {
                        sc.nextLine();

                        System.out.println("Introduce un nombre");
                        String nombre = sc.nextLine();

                        System.out.println("Introduce la edad");
                        int edad = sc.nextInt();

                        System.out.println("Introduce el id del curso");
                        int id = sc.nextInt();

                        Estudiante estudiante = new Estudiante(nombre, edad, id);

                        if (ESTUDIANTEDAO.insertEstudiante(estudiante)) {
                            System.out.println("Estudiante insertado con exito");
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(" No se ha podido añadir al estudiante");
                    }

                    break;

                case 3:
                    sc.nextLine();

                    System.out.println("Introduce la edad");
                    int edad = sc.nextInt();
                    System.out.println("Introduce la id");
                    int id = sc.nextInt();

                    Estudiante estudiante = new Estudiante(id, edad);

                    if (ESTUDIANTEDAO.actualizarEdad(estudiante)) {
                        System.out.println("Edad actualizada correctamente");
                    }


                    break;

                case 4:

                    sc.nextLine();

                    System.out.println("introduce un id : ");
                    int id2 = sc.nextInt();

                    Estudiante estudiante1 = new Estudiante(id2);
                    if (ESTUDIANTEDAO.eliminarEstudiante(estudiante1)){
                        System.out.println("Estudiante eliminado con exito");
                    }
                    break;


                case 5:
                    booleano = false;
                    System.out.println("Saliendo...");

            }
        }


    }
}

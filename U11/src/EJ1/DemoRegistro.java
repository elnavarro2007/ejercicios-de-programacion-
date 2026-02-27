package Ej1;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.*;

public class DemoRegistro {
    public static void main(String[] args) {
        List<Registro> listaRegistros = new ArrayList<>();
        String linea;


        try (BufferedReader br = new BufferedReader(new FileReader("DATA.csv"))) {
            br.readLine();
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(",");
                listaRegistros.add(new Registro(campos));
            }
        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }

        System.out.println("\n--- Registros de Francia ---");
        for (Registro r : listaRegistros) {
            if (r.getCountry().equalsIgnoreCase("FR")) {
                System.out.println(r);
            }
        }

        System.out.println("\n---- Registros Yahoo");
        for (Registro r : listaRegistros) {
            if (r.getEmail().contains("@yahoo")) {
                System.out.println(r);
            }
        }
        System.out.println("\n --- Registros 2015-2017 ---");
        List<Registro> fechaList = new ArrayList<>();
        LocalDateTime inicio = LocalDateTime.of(2015, 11, 1, 0, 0);
        LocalDateTime fin = LocalDateTime.of(2017, 1, 31, 23, 59);

        System.out.println("\n --- Ordenado alfabeticamente ---");

        for (Registro r : listaRegistros) {
            if (!r.getLast_login().isBefore(inicio) && !r.getLast_login().isAfter(fin)) {
                fechaList.add(r);
                System.out.println(r);
            }
        }
        Collections.sort(listaRegistros, new Comparator<Registro>() {
            @Override
            public int compare(Registro r1, Registro r2) {
                return r2.getLast_login().compareTo(r1.getLast_login());
            }
        });
        for (Registro r : listaRegistros) {
            System.out.println(r.getFirst_name() + " " + r.getLast_name() + " | " + r.getLast_login());
        }
    }
}

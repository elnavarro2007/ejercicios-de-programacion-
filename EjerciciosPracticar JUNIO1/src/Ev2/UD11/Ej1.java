package Ev2.UD11;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {

        try {
            List<Registro> registros = Files.lines(Paths.get("DATA (2).csv")).skip(1).map(linea -> new Registro(linea.split(","))).toList();


            System.out.println("----- FRANCIA ------");
            registros.stream().filter(r -> r.getCountry().equals("FR")).forEach(System.out::println);

            System.out.println("----- YAHOO ------");
            registros.stream().filter(r -> r.getEmail().contains("yahoo")).sorted(Comparator.comparing(Registro::getFirstName)).forEach(System.out::println);

            LocalDateTime inicio = LocalDateTime.of(2015, 11, 1, 0, 0);
            LocalDateTime fin = LocalDateTime.of(2017, 1, 31, 23, 59);

            System.out.println("----- Logins 2015-2017 -------");

            registros.stream().filter(r -> r.getLastLogin().isBefore(inicio) && r.getLastLogin().isAfter(fin)).sorted(Comparator.comparing(Registro::getLastLogin).reversed()).forEach(System.out::println);


            System.out.println("----- Emperzar por A ------");
            registros.stream().filter(r -> r.getFirstName().startsWith("A")).sorted(Comparator.comparing(Registro::getLastLogin)).forEach(r -> System.out.println(r.getFirstName() +" "+ r.getLastLogin()));



        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

package Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static String URL = "jdbc:mysql://localhost:3306/academia";
    private static String USER = "root";
    private static String PASSWD = "1234";

    public static Connection conexion (){
        try {
            System.out.println("Se ha conectado correctamente");
            return DriverManager.getConnection(URL,USER,PASSWD);

        } catch (SQLException e) {
            throw new RuntimeException("No se ha conectado a la base de datos");
        }
    }



}

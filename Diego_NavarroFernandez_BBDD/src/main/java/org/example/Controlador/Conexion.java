package org.example.Controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    // atributos para no modificar la conexion
    private static final String URL = "jdbc:mysql://localhost:3306/veterinaria";
    private static final String root = "root";
    private static final String contraseña = "1234";



    public static Connection getConnection(){
        try {
            return  DriverManager.getConnection(URL,root,contraseña);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }











}

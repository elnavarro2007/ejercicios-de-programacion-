package Controlador;

import Modelo.Estudiante;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ESTUDIANTEDAO {


    public static boolean insertEstudiante(Estudiante estudiante) {
        try (Connection conexion = Conexion.conexion();
             PreparedStatement ps = conexion.prepareStatement("Insert into estudiantes (nombre,edad,id_curso) values (?,?,?)")) {


            ps.setString(1, estudiante.getNombre());
            ps.setInt(2, estudiante.getEdad());
            ps.setInt(3, estudiante.getId_curso());

            int filas = ps.executeUpdate();

            return filas > 0;




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }

    public static ArrayList<Estudiante> verEstudiante(){
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        try (Connection connection = Conexion.conexion();
        PreparedStatement ps = connection.prepareStatement("select * from estudiantes")) {

            ResultSet rs = ps.executeQuery();

            while (rs.next()){
                Estudiante estudiante = new Estudiante();
                estudiante.setId(rs.getInt("ID"));
                estudiante.setNombre(rs.getString("Nombre"));
                estudiante.setEdad(rs.getInt("edad"));
                estudiante.setId_curso(rs.getInt("ID_curso"));

                estudiantes.add(estudiante);
            }



        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return estudiantes;
    }

    public static boolean actualizarEdad(Estudiante estudiante){

        try(Connection connection = Conexion.conexion();
            PreparedStatement ps = connection.prepareStatement("update estudiantes set edad = ? where id = ?")) {

            ps.setInt(1,estudiante.getEdad());
            ps.setInt(2,estudiante.getId());

            int filas = ps.executeUpdate();

            return filas > 0;




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public static boolean eliminarEstudiante(Estudiante estudiante){

        try(Connection connection = Conexion.conexion();
            PreparedStatement ps = connection.prepareStatement("delete from estudiantes where id = ?")) {


            ps.setInt(1,estudiante.getId());

            int filas = ps.executeUpdate();

            return filas > 0;




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }



}

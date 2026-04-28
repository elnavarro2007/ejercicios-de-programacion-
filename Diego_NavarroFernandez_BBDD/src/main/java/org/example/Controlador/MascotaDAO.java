package org.example.Controlador;

import org.example.Modelo.Mascotas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class MascotaDAO {
    public MascotaDAO() {
    }

    // Metodo para insertar mascotas
    public static boolean insertarMascota(Mascotas mascotas) {

        try (Connection connection = Conexion.getConnection();
             PreparedStatement ps = connection.prepareStatement("INSERT INTO mascotas (nombre,especie,edad,id_propietario) values (?,?,?,?)")) {


            ps.setString(1, mascotas.getNombre());
            ps.setString(2, mascotas.getEspecie());
            ps.setInt(3, mascotas.getEdad());
            ps.setInt(4, mascotas.getId());

            int filasAfectadas = ps.executeUpdate();

            return filasAfectadas > 0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


    public static void verMascotaDueño() {ArrayList<Mascotas> mascotas = new ArrayList<>();try (Connection connection = Conexion.getConnection(); ResultSet rs = connection.createStatement().executeQuery(" Select m.nombre, p.nombre ,p.telefono from mascotas m  join propietarios p on p.id = m.id_propietario")) {

        while(rs.next()){
            System.out.println(rs.getString("m.nombre") + "<->" + rs.getString("p.nombre"));

        }

    } catch (SQLException ex) {
        throw new RuntimeException(ex);
    }

    }

    // metodo para eliminar mascota
    public static boolean eliminarMascota(Mascotas mascotas) {
        try (Connection connection = Conexion.getConnection();
             PreparedStatement ps = connection.prepareStatement("Delete from mascotas where id = ?")) {


            ps.setInt(1, mascotas.getIdMascota());


            int filasAfectadas = ps.executeUpdate();

            return filasAfectadas > 0;


        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }


}

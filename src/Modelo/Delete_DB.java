package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class Delete_DB extends Crear_BD{
    Crear_BD cBD = new Crear_BD();
    ObtenerDB obDB = new ObtenerDB();
    public boolean delete() {
        Connection con = connect();
        try {
            String lastDB = obDB.ObtenerDB();
            
            String sql = "DROP DATABASE " + lastDB;
            PreparedStatement preparedStatement = con.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement.close();

            System.out.println("Base de datos eliminada exitosamente: " + lastDB);
            return true;
        } catch (SQLException e) {
            System.err.println("Error al eliminar la base de datos: " + e.getMessage());
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al cerrar la conexión: " + e.getMessage());
            }
        }
    }
}
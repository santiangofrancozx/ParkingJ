/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import Vista.DataBase.*;

public class Delete_DB extends Conexion{
    Crear_DataBase vista;
    DataBase db = null;
    public boolean delete(){
        String nombreData = db.getNameBD();
        Connection con = connect();
        try {
            String sql = "DROP DATABASE " + nombreData;
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            System.out.println("Base de datos eliminada exitosamente");
            return true;
            
        } catch (SQLException e) {
            System.err.println(e);
            return false;
        }
        finally{
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println(e);
            }
        }
    }
}

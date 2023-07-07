/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import Vista.Users.*;
import Vista.DataBase.*;
import java.awt.event.*;

public class ControladorMenu implements ActionListener{
    PrincipalMenu menu;
    Crear_Usuario cu;
    Crear_DataBase crearDB;
    Delete_DB dDB;
    ObtenerDB obtDB;
    
    public ControladorMenu(PrincipalMenu menu, Crear_Usuario cu, Crear_DataBase crearDB, Delete_DB dDB, ObtenerDB obtDB){
        this.menu = menu;
        this.cu = cu;
        this.crearDB = crearDB;
        this.dDB = dDB;
        this.obtDB = obtDB;
        this.menu.crearU.addActionListener(this);
        this.menu.crearBD.addActionListener(this);
        this.menu.eliminarBD.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == menu.crearU){
            inicioCU();
        }
        if(e.getSource() == menu.crearBD){
            inicioCrearDB();
        }
        if(e.getSource() == menu.eliminarBD){
            dDB.delete();
        }
    }
    
    public void inicioCU(){
        cu.setTitle("Crear Usuario");
        cu.setSize(300, 300);
        cu.setLocationRelativeTo(null);
        cu.setVisible(true);
    }
    
    public void inicioCrearDB(){
        crearDB.setTitle("                      Creacion Base de Datos");
        crearDB.setSize(330,270);
        crearDB.setLayout(null);
        crearDB.setLocationRelativeTo(null);
        crearDB.setVisible(true);   
    }
   
            
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.*;
import Vista.*;
import Vista.DataBase.Crear_DataBase;
import java.awt.event.*;
import javax.swing.WindowConstants;


public class ControladorDB implements ActionListener{
    DataBase modelo;
    Crear_DataBase vista;
    Crear_BD crear;
    
    public ControladorDB (DataBase modelo, Crear_DataBase vista, Crear_BD crear){
        this.modelo = modelo;
        this.vista = vista;
        this.crear = crear;
        this.vista.bGuardar.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == vista.bGuardar){
            modelo.setNameBD(vista.caja_nombreBD.getText());
            modelo.setDireIP(vista.caja_IP.getText());
            modelo.setUserDB(vista.caja_UserBD.getText());
            modelo.setPasswordDB(vista.caja_passBD.getText());
            System.out.println("hola");
            System.out.println(modelo.getNameBD());
            System.out.println(modelo.getDireIP());
            System.out.println(modelo.getUserDB());
            System.out.println(modelo.getPasswordDB());
        }
        
        if(crear.createDB(modelo)){
            System.out.println("Guardado");
        }else{
            System.out.println("No se guardo");
        }
        
        if(e.getSource() == vista.bCancelar){
           
        }
    }
    
}

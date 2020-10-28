/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Controlador.Conexion;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hp g4
 */
public class Especializaciones {
    
    
  Conexion obj_operaciones= new Conexion();
  //Prepara la operacion: insert, delete, update....
  PreparedStatement preparador_esp;
  
  public void Guardar_esp(JTextField txtId, JTextField txtNombre, JTextField txtDescripcion) throws SQLException, ClassNotFoundException{
         //Comprueba la conexion abierta
         
          
              if (obj_operaciones.obtener_conexion()!=null) {
            System.out.println("Estas Conectado !!");
        } else {
             System.out.println("NO Estas Conectado !!");
        }
        preparador_esp=obj_operaciones.obtener_conexion().prepareStatement("INSERT INTO `tblespecializaciones` (`espId`, `espNombre`, `espDescripcion`) VALUES ("+txtId.getText()+",'"+txtNombre.getText()+"','"+txtDescripcion.getText()+"')"); 
        preparador_esp.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Usuario Registrado Éxitosamente!!!");
        
     
}
     public void Eliminar (JTextField txtId)throws SQLException, ClassNotFoundException{
       
        preparador_esp=(com.mysql.jdbc.PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("DELETE FROM `tblespecializaciones` WHERE `espId`="+txtId.getText());
        preparador_esp.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Registro Eliminado !!!");

    
     }
}
        
        
        
        
        
        
        
        
        
        
        
        
        
   
        
      
  
    
    
    


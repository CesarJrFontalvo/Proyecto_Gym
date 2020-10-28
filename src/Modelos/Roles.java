/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

import Controlador.Conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Cesar Jr. Fontalvo
 */
public class Roles {
   // static ResultSet Resultado;
    
    
    Conexion obj_operaciones = new Conexion();
     //Prepara la operacion: insert, delete, update....
PreparedStatement preparador;

public void Guardar (JTextField txtId, JTextField txtNombre, JTextField txtPermisos) throws SQLException, ClassNotFoundException{
    
    if (obj_operaciones.obtener_conexion()!=null ) {
        System.out.println("Estas conectado ");
        
    } else {System.out.println("No estas conectado");
    }
    
    preparador=(PreparedStatement) obj_operaciones.obtener_conexion().prepareStatement("INSERT INTO `tblRoles`(`rolId`,`rolNombre`,`rolPermisos`)VALUES ("+txtId.getText()+",'"+txtNombre.getText()+"','"+txtPermisos.getText()+"')");
    preparador.executeUpdate();
    JOptionPane.showConfirmDialog(null, " Registro Exitoso ");
}
    public void Eliminar (JTextField txtId)throws SQLException, ClassNotFoundException{
       
        preparador=(PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("DELETE FROM `tblRoles` WHERE `rolId`="+txtId.getText());
        preparador.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Registro Eliminado !!!");
        
    }
    
//    public void  Consultar(JTextField txtId)throws SQLException, ClassNotFoundException{
//         preparador= (PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement(" SELECT * FROM `tblRoles` WHERE `rolId`="+txtId.getText()); 
//         preparador.executeQuery();
//      
//        
 //   }
    
    
}

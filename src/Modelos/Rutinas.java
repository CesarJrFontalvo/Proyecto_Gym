
package Modelos;

import Controlador.Conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Hp g4
 */
public class Rutinas {
Conexion obj_operaciones = new Conexion();
    PreparedStatement preparador;
    
    public void Guardar (JTextField txtId, JTextField txtNombre, JTextField txtDescripcion)throws SQLException, ClassNotFoundException{
    
          if (obj_operaciones.obtener_conexion()!=null) {
            System.out.println("Estas Conectado");
            
        } else {System.out.println("no estas Conectado");
        }
          
          preparador=(PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("INSERT INTO `tblrutinas`(`rutId`,`rutNonbre`,`rutDescripcion`)VALUES ("+txtId.getText()+",'"+txtNombre.getText()+"','"+txtDescripcion.getText()+"')");
          preparador.executeUpdate();
               JOptionPane.showConfirmDialog(null, " Registro Exitoso");
          
          
    } 
    
     public void Eliminar (JTextField txtId)throws SQLException, ClassNotFoundException{
         
          
        preparador= (PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("DELETE FROM `tblrutinas` WHERE `empId`="+txtId.getText());
        preparador.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Registro Eliminado");
         
         
     }
}

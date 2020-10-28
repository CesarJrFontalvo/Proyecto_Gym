
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
public class Sesiones {
  
    Conexion obj_Operaciones =new Conexion();
    PreparedStatement preparador;
    
    public void Guardar (JTextField txtId, JTextField txtempId, JTextField txtusuId, JTextField txtFechaInicio, JTextField txtHoraInicio,JTextField txtFechaFinal, JTextField txtHoraFinal,JTextField txtDescripcion)throws  SQLException, ClassNotFoundException{
     
        if (obj_Operaciones.obtener_conexion()!=null) {
            System.out.println("Estas Conectado");
            
        } else {System.out.println("no estas Conectado");
        }
        preparador=(PreparedStatement)obj_Operaciones.obtener_conexion().prepareStatement("INSERT INTO`tblsesiones`(`sesId`,`empId`,`usuId`,`sesFecha_inicio`,`sesHora_inicio`,`sesFecha_fin`,`sesHora_fin`,`sesDescripcion`)VALUES ("+txtId.getText()+","+txtempId.getText()+","+txtusuId.getText()+",'"+txtFechaInicio.getText()+"','"+txtHoraInicio.getText()+"','"+txtFechaFinal.getText()+"','"+txtHoraFinal.getText()+"','"+txtDescripcion.getText()+"')");
        preparador.executeUpdate();
         JOptionPane.showConfirmDialog(null, "Registro Exitoso");
        
    }
   
    public void Eliminar(JTextField txtId)throws SQLException, ClassNotFoundException{
       
        preparador=(PreparedStatement)obj_Operaciones.obtener_conexion().prepareStatement("DELETE FROM `tblsesiones` WHERE `sesId`="+txtId.getText());
        preparador.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Registro Eliminado");
    }
}

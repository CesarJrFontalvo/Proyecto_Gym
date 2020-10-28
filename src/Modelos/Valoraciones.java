

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
public class Valoraciones {
    Conexion obj_operaciones=new Conexion();
    PreparedStatement preparador;
    
    public void Guardar (JTextField txtId, JTextField txtDemoninacion, JTextField txtRegistroMedico, JTextField txtusuId)throws SQLException, ClassNotFoundException{
    
    if (obj_operaciones.obtener_conexion()!=null) {
            System.out.println("Estas Conectado");
            
        } else {System.out.println("no estas Conectado");    
    }
    
    preparador=(PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("INSERT INTO `tblvaloraciones`(`valId`,`valDenominacion`,`valRegistro_Medico`,`usuId`)VALUES ("+txtId.getText()+",'"+txtDemoninacion.getText()+"','"+txtRegistroMedico.getText()+"',"+txtusuId.getText()+")");
    preparador.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Registro Registrado");
    }
    
    public void Eliminar (JTextField txtId)throws SQLException, ClassNotFoundException{
        
        preparador=(PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("DELETE FROM `tblvaloraciones` WHERE `valId`="+txtId.getText());
        preparador.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Registro Eliminado");
        
        
    }
    
    
}

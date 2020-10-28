
package Modelos;

import Controlador.Conexion;
import com.mysql.jdbc.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cesar Jr. Fontalvo
 */
public class Empleados {
    Conexion obj_operaciones = new Conexion();
    PreparedStatement preparador;
    
    public void Gurdar (JTextField txtId, JTextField txtNombre,JTextField txtApellido, JTextField txtDireccion,JTextField txtTelefono, JTextField txtCorreo ,JPasswordField etiContrasena, JTextField txtFechaNacimiento, JTextField txtIdRoles)throws SQLException, ClassNotFoundException{
        
        if (obj_operaciones.obtener_conexion()!=null) {
            System.out.println("Estas Conectado");
            
        } else {System.out.println("no estas Conectado");
        }
        
        preparador= (PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("INSERT INTO `tblempleado`(`empId`,`empNombres`,`empApellidos`,`empDireccion`,`empTelefono`,`empCorreo`,`empContrasena`,`empFecha_Nac`,`empIdRol`)VALUES ("+txtId.getText()+",'"+txtNombre.getText()+"','"+txtApellido.getText()+"','"+txtDireccion.getText()+"','"+txtTelefono.getText()+"','"+txtCorreo.getText()+"','"+etiContrasena.getText()+"','"+txtFechaNacimiento.getText()+"',"+txtIdRoles.getText()+")");
        preparador.executeUpdate();
        JOptionPane.showConfirmDialog(null, " Registro Exitoso ");
        
    }
    public void Eliminar (JTextField txtId)throws SQLException, ClassNotFoundException{
        
        preparador= (PreparedStatement)obj_operaciones.obtener_conexion().prepareStatement("DELETE FROM `tblempleado` WHERE `empId`="+txtId.getText());
        preparador.executeUpdate();
        JOptionPane.showConfirmDialog(null, "Registro Eliminado");
        
    }
    
    
}

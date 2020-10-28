
package Modelos;

import Controlador.Conexion;
import java.awt.HeadlessException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Hp g4
 */
  public class Usuarios {
 
  Conexion obj_operaciones = new Conexion();
  //Prepara la operacion: insert, delete, update....
  PreparedStatement preparador;
   
    
  public void Guardar(JTextField txtId, JTextField txtNombres, JTextField txtApellidos, JTextField txtDireccion, JTextField txtTelefono, JTextField txtCorreo, JPasswordField txtContrasena, JTextField txtFecha_Nac) throws SQLException, ClassNotFoundException {
  
    
                           
        //Comprueba la conexion abierta
        if (obj_operaciones.obtener_conexion()!=null) {
            System.out.println("Estas Conectado !!");
        } else {
             System.out.println("NO Estas Conectado !!");
        }
        
      try {
          //Preparar el String del Buffer
          preparador=obj_operaciones.obtener_conexion().prepareStatement("INSERT INTO `tblusuarios`(`usuId`, `usuNombres`, `usuApellidos`, `usuDireccion`, `usuTelefono`, `usuCorreo`, `usuContrasena`, `usuFecha_Nac`) VALUES ("+txtId.getText()+",'"+txtNombres.getText()+"','"+txtApellidos.getText()+"','"+txtDireccion.getText()+"','"+txtTelefono.getText()+"','"+txtCorreo.getText()+"','"+txtContrasena.getText()+"','"+txtFecha_Nac.getText()+"')");
          //Ejecutar la Inserción en la BD JOptionPane.showConfirmDialog(null, "Usuario Registrado Éxitosamente!!!");
          preparador.executeUpdate();
          JOptionPane.showConfirmDialog(null, "Usuario Registrado Éxitosamente!!!");
          //obj_operaciones.cerrar();
          
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
      }
    }


  public void Eliminar(JTextField txtId) throws SQLException, ClassNotFoundException {
                         
        
      try {
          preparador=obj_operaciones.obtener_conexion().prepareStatement("DELETE FROM `tblusuarios` WHERE `usuId`="+txtId.getText());
          preparador.executeUpdate();
          JOptionPane.showConfirmDialog(null, "Usuario Eliminado !!!");
                    
      } catch (ClassNotFoundException ex) {
          Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
      }
    }

    
  
  
    public ResulSet Buscar(JTextField txtId,JTextField txtNombres, JTextField txtApellidos, JTextField txtDireccion, JTextField txtTelefono, JTextField txtCorreo, JPasswordField txtContrasena, JTextField txtFecha_Nac, Object ResulSet)throws SQLException, ClassNotFoundException {
        ResulSet  =null;
        
        ResulSet rs;
        
        preparador = obj_operaciones.obtener_conexion().prepareStatement("SELECT * FROM `tblusuarios` WHERE `usuId`="+txtId.getText());
        rs = (ResulSet) preparador.executeQuery();
        
        if (rs.next()) {
            JOptionPane.showConfirmDialog(null, "Usuario encontrado");
        
            txtId.setText(rs.getString("usuId"));
            txtNombres.setText(rs.getString("usuNombres"));
            txtApellidos.setText(rs.getString("usuApellidos"));
            txtDireccion.setText(rs.getString("usuDireccion"));
            txtTelefono.setText(rs.getString("usuTelefono"));
            txtCorreo.setText(rs.getString("usuCorreo"));
            txtContrasena.setText(rs.getString("usuContrasena"));
            txtFecha_Nac.setText(rs.getString("usuFcha_Nac"));
            
            
        } else {JOptionPane.showConfirmDialog(null, "La identificacion no ha sido encontrada");
        }
        
        
        
        return null;
    }


     
    private static class ResulSet {

        public ResulSet() {
        }

        private boolean next() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }

        private String getString(String usuId) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
    
    
    public void Modificar(JTextField txtId, JTextField txtNombres, JTextField txtApellidos, JTextField txtDireccion, JTextField txtTelefono, JTextField txtCorreo,JTextField txtFecha_Nac, JPasswordField txtContraseña) throws SQLException, ClassNotFoundException{
       
       try{
           
      preparador=obj_operaciones.obtener_conexion().prepareStatement("UPDATE `tblusuarios` SET `usuNombres`='"+txtNombres.getText()+"',`usuApellidos`= '"+txtApellidos.getText()+"',`usuDireccion`= '"+txtDireccion.getText()+"',`usuTelefono`= '"+txtTelefono.getText()+"',`usuCorreo`='"+txtCorreo.getText()+"',`usuContrasena`='"+txtContraseña.getText()+"',`usuFecha_Nac`='"+txtFecha_Nac.getText()+"' WHERE usuId="+txtId.getText());
      preparador.executeUpdate();
      JOptionPane.showMessageDialog(null, "Información Actualizada");   
           
           
       }catch(HeadlessException | ClassNotFoundException | SQLException e){
       }
}
    
    
    
    }

   
    
      

    

    
        
    
    
    

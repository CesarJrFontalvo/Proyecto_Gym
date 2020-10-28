
package Modelos;

import Controlador.Conexion;
import Vistas.jfPrincipal;
import com.mysql.jdbc.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Cesar Jr. Fontalvo
 */
public class Gestion_Acceso {
    public int validarUsuario(JTextField txtUsuario, JPasswordField txtContrasena) {
        Conexion obj_operaciones= new Conexion();
        
      try{
          if (obj_operaciones.obtener_conexion()!=null) {
           Statement instruccionSQL=(Statement) obj_operaciones.obtener_conexion().createStatement();
              try{

                  ResultSet resultadoConsulta = instruccionSQL.executeQuery("SELECT * FROM tblusuarios WHERE usuId="+txtUsuario.getText()+" AND usuContrasena='"+ txtContrasena.getText()+"'");
                  if (resultadoConsulta.first()) {
                      jfPrincipal ir = new jfPrincipal();
                      ir.setVisible(true);
                      
                  } else { JOptionPane.showConfirmDialog(null, "El Usuario no Existe!!");
                  }
              }catch(SQLException ex){
                  Logger.getLogger(Gestion_Acceso.class.getName()).log(Level.SEVERE,null, ex);
              }
              
          } else {
          }
      }catch(SQLException | ClassNotFoundException ex){
            Logger.getLogger(Gestion_Acceso.class.getName()).log(Level.SEVERE,null, ex);
      }
      
    



        
        return 0;
        
        
        
    }

}

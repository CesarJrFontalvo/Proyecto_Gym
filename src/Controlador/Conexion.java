package Controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Conexion {
    //Atributos de la clase
     private  Connection cnx = null;
     
   //Métodos de la clase
     public Connection obtener_conexion() throws SQLException, ClassNotFoundException{
         //Si la conexión existe.
            if (cnx == null)   {
                
            try {
            Class.forName("com.mysql.jdbc.Driver");
            
            //String de Conexión
            cnx = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_gym?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root", "");
            
            }catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showConfirmDialog(null, "Error: "+ex.toString());
            //throw new SQLException(ex);
         }

}
return cnx;
    
//    private static final String db="bd_gym?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
//    private static final String user="root";
//    private static final String pass="";
//    private static final String host="localhost:3306";
//    private static final String server="jdbc:mysql://"+host+"/"+db;
//    
    
//     public static  Connection getConexion() {
//        Connection cnx=null;
//        try{
//            Class.forName("com.mysql.jdbc.Driver");
//            cnx=DriverManager.getConnection(server,user,pass);         
//        }
//        catch(ClassNotFoundException | SQLException e){
//         System.out.println(String.valueOf(e));}
//        return cnx;
//    
}
     public void cerrar() throws SQLException {
                     if (cnx != null) {
                         //JOptionPane.showConfirmDialog(null, "Su sesión ha sido cerrada");
                     cnx.close();
                     }
                }


// public static ResultSet getTabla(String Consulta){
//        Connection cnx=getConexion();
//        Statement st;
//        ResultSet datos=null;
//        try{
//            st=cnx.createStatement();
//            datos=st.executeQuery(Consulta);            
//        }
//        catch(SQLException e){ System.out.print(e.toString());}
//        return datos;



// }
 
 
 
}

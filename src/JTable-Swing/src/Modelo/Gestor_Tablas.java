package Modelo;

import Controlador.Conexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Gestor_Tablas {
    
    public void listarUsuarios(JTable table) {        
        DefaultTableModel modelo = new DefaultTableModel();               
        ResultSet rs = Conexion.getTabla("SELECT UsuNombres,UsuApellidos FROM `tblusuarios`");
        modelo.setColumnIdentifiers(new Object[]{"Nombres", "Apellidos"});
        try {
            while (rs.next()) {
                // Adicionar los resultados al modelo de la tabla.
                modelo.addRow(new Object[]{rs.getString("UsuNombres"), rs.getString("UsuApellidos")});
            }            
            // Asigna el modelo a la tabla
            table.setModel(modelo);            
        } catch (SQLException e) {
            //System.out.println(e);
        }

    }
    
    public void valorSeleccionado(JTable table){
        String selectedData = null;

        int[] selectedRow = table.getSelectedRows();
        int[] selectedColumns = table.getSelectedColumns();

        for (int i = 0; i < selectedRow.length; i++) {
          for (int j = 0; j < selectedColumns.length; j++) {
            selectedData = (String) table.getValueAt(selectedRow[i], selectedColumns[j]);
          }
        }
        System.out.println("Selected: " + selectedData);
        JOptionPane.showConfirmDialog(null, "Selected: " + selectedData);
        
    }

}

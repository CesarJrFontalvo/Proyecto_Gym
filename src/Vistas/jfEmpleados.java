/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Controlador.Conexion;
import Modelos.Empleados;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Hp g4
 */
public class jfEmpleados extends javax.swing.JFrame {

    /**
     * Creates new form jfEmpleados
     */
    public jfEmpleados() {
        initComponents();
        
        this.getContentPane().setBackground(Color.ORANGE);
    }

    public void Limpiar(){
        
        txtApellido.setText("");
        txtDirección.setText("");
        txtEmail.setText("");
        txtFechaNacimiento.setText("");
        txtId.setText("");
        txtNombre.setText("");
        txtTelefono.setText("");
        txtIdRoles.setText("");
   }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLIdentificación = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLApellido = new javax.swing.JLabel();
        txtDirección = new javax.swing.JTextField();
        jLDirección = new javax.swing.JLabel();
        txtTelefono = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jLEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        jLContrasena = new javax.swing.JLabel();
        jLFechaNacimiento = new javax.swing.JLabel();
        txtFechaNacimiento = new javax.swing.JTextField();
        txtIdRoles = new javax.swing.JTextField();
        jLRoles = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        etiContrasena = new javax.swing.JPasswordField();
        btnAtras = new javax.swing.JButton();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel1.setText("Gestión de Empleados");

        jLIdentificación.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLIdentificación.setText("Identificación:");

        txtId.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdActionPerformed(evt);
            }
        });

        jLNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLNombre.setText("Nombre:");

        txtNombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });

        txtApellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApellidoActionPerformed(evt);
            }
        });

        jLApellido.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLApellido.setText("Apellidos:");

        txtDirección.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtDirección.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDirecciónActionPerformed(evt);
            }
        });

        jLDirección.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLDirección.setText("Dirección:");

        txtTelefono.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });

        jLTelefono.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLTelefono.setText("Telefono:");

        jLEmail.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLEmail.setText("Email:");

        txtEmail.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        jLContrasena.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLContrasena.setText("Contraseña:");

        jLFechaNacimiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLFechaNacimiento.setText("Fecha Nacimiento:");

        txtFechaNacimiento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtFechaNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaNacimientoActionPerformed(evt);
            }
        });

        txtIdRoles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtIdRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdRolesActionPerformed(evt);
            }
        });

        jLRoles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLRoles.setText(" Rol:");

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        etiContrasena.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        etiContrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                etiContrasenaActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/if_Previous_2_372909.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img_empleado.png"))); // NOI18N

        btnCerrar.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/if_Close_1891023.png"))); // NOI18N
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jButton1.setText("Consultar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addComponent(jLApellido)
                                    .addComponent(jLDirección)
                                    .addComponent(jLTelefono)
                                    .addComponent(jLEmail)
                                    .addComponent(jLContrasena)
                                    .addComponent(jLFechaNacimiento)
                                    .addComponent(jLRoles)
                                    .addComponent(jLIdentificación))
                                .addGap(96, 96, 96)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtId)
                                    .addComponent(txtNombre)
                                    .addComponent(txtApellido)
                                    .addComponent(txtDirección)
                                    .addComponent(txtTelefono)
                                    .addComponent(txtEmail)
                                    .addComponent(txtFechaNacimiento)
                                    .addComponent(txtIdRoles)
                                    .addComponent(etiContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel2)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAtras)
                            .addComponent(btnCerrar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(56, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCerrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnAtras)))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLIdentificación)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLNombre)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLApellido)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLDirección)
                            .addComponent(txtDirección, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLTelefono)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLEmail)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLContrasena)
                            .addComponent(etiContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLFechaNacimiento)
                            .addComponent(txtFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLRoles)
                            .addComponent(txtIdRoles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnRegistrar)
                        .addGap(15, 15, 15)
                        .addComponent(btnEliminar)
                        .addGap(15, 15, 15)
                        .addComponent(btnLimpiar)
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)))
                .addContainerGap(114, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdActionPerformed

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreActionPerformed

    private void txtApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtApellidoActionPerformed

    private void txtDirecciónActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDirecciónActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDirecciónActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtFechaNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaNacimientoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaNacimientoActionPerformed

    private void txtIdRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdRolesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdRolesActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        try {
            Empleados inserta= new Empleados();
            inserta.Gurdar(txtId, txtNombre, txtApellido, txtDirección, txtTelefono, txtNombre, etiContrasena, txtFechaNacimiento, txtIdRoles);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void etiContrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_etiContrasenaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_etiContrasenaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try {
            Empleados borrar= new Empleados();
            borrar.Eliminar(txtId);
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
    
         try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfPrincipal ir=new jfPrincipal();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
 
        Limpiar();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed

        try {
            Conexion obj1= new Conexion();
            obj1.cerrar();
            this.setVisible(false);
            
        } catch (SQLException ex) {
            Logger.getLogger(jfEmpleados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCerrarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfEmpleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JPasswordField etiContrasena;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLApellido;
    private javax.swing.JLabel jLContrasena;
    private javax.swing.JLabel jLDirección;
    private javax.swing.JLabel jLEmail;
    private javax.swing.JLabel jLFechaNacimiento;
    private javax.swing.JLabel jLIdentificación;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLRoles;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDirección;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFechaNacimiento;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtIdRoles;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
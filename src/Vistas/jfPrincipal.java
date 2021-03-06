
package Vistas;

import Controlador.Conexion;
import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Cesar Jr. Fontalvo
 */
public class jfPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form jfPrincipal
     */
    public jfPrincipal() {
        initComponents();
        this.getContentPane().setBackground(Color.ORANGE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUsuario = new javax.swing.JButton();
        btnEmpleado = new javax.swing.JButton();
        btnRoles = new javax.swing.JButton();
        btnSesiones = new javax.swing.JButton();
        btnRutinas = new javax.swing.JButton();
        btnValoraciones = new javax.swing.JButton();
        btnEspecializaciones = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnUsuario.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img_usuario.png"))); // NOI18N
        btnUsuario.setText("Usuario");
        btnUsuario.setBorderPainted(false);
        btnUsuario.setContentAreaFilled(false);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnEmpleado.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEmpleado.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/img_empleado.png"))); // NOI18N
        btnEmpleado.setText("Empleado");
        btnEmpleado.setBorderPainted(false);
        btnEmpleado.setContentAreaFilled(false);
        btnEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpleadoActionPerformed(evt);
            }
        });

        btnRoles.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRoles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Roles.png"))); // NOI18N
        btnRoles.setText("Roles");
        btnRoles.setBorderPainted(false);
        btnRoles.setContentAreaFilled(false);
        btnRoles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRolesActionPerformed(evt);
            }
        });

        btnSesiones.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnSesiones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/sesiones_gym.png"))); // NOI18N
        btnSesiones.setText("Sesiones");
        btnSesiones.setBorderPainted(false);
        btnSesiones.setContentAreaFilled(false);
        btnSesiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSesionesActionPerformed(evt);
            }
        });

        btnRutinas.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnRutinas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/rutinas2.png"))); // NOI18N
        btnRutinas.setText("Rutinas");
        btnRutinas.setBorderPainted(false);
        btnRutinas.setContentAreaFilled(false);
        btnRutinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRutinasActionPerformed(evt);
            }
        });

        btnValoraciones.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnValoraciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/if_medical_icon_1_1290990 (1).png"))); // NOI18N
        btnValoraciones.setText("Valoraciones");
        btnValoraciones.setBorderPainted(false);
        btnValoraciones.setContentAreaFilled(false);
        btnValoraciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValoracionesActionPerformed(evt);
            }
        });

        btnEspecializaciones.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnEspecializaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/especialista.png"))); // NOI18N
        btnEspecializaciones.setText("Especializaciones");
        btnEspecializaciones.setBorderPainted(false);
        btnEspecializaciones.setContentAreaFilled(false);
        btnEspecializaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspecializacionesActionPerformed(evt);
            }
        });

        btnAtras.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras2.png"))); // NOI18N
        btnAtras.setText("Atras");
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("SISTEMA DE GESTIÓN DEL GIMNASIO");

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/if_Close_1891023.png"))); // NOI18N
        btnCerrar.setText("Cerrar Sesión");
        btnCerrar.setBorder(null);
        btnCerrar.setBorderPainted(false);
        btnCerrar.setContentAreaFilled(false);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnEspecializaciones)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(btnRutinas, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRoles, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUsuario, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnValoraciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSesiones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnEmpleado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCerrar))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addComponent(btnCerrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnUsuario)
                    .addComponent(btnEmpleado))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRoles)
                    .addComponent(btnSesiones))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRutinas)
                    .addComponent(btnValoraciones))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEspecializaciones)
                    .addComponent(btnAtras))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRolesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRolesActionPerformed
         try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfRoles ir=new jfRoles();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRolesActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfUsuario ir=new jfUsuario();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpleadoActionPerformed
      try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfEmpleados ir=new jfEmpleados();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEmpleadoActionPerformed

    private void btnSesionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSesionesActionPerformed
     try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfSesiones ir=new jfSesiones();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnSesionesActionPerformed

    private void btnRutinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRutinasActionPerformed
     
         try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfRutinas ir=new jfRutinas();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRutinasActionPerformed

    private void btnValoracionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValoracionesActionPerformed
    
         try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfValoraciones ir=new jfValoraciones();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnValoracionesActionPerformed

    private void btnEspecializacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspecializacionesActionPerformed
      
         try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfEspecializaciones ir=new jfEspecializaciones();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEspecializacionesActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
 
         try {
            Conexion obj1=new Conexion();
            if (obj1.obtener_conexion()==null) {
                
            } else {
                jfLogin ir=new jfLogin();
                ir.setVisible(true);
                this.setVisible(false);
            }
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(jfPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEmpleado;
    private javax.swing.JButton btnEspecializaciones;
    private javax.swing.JButton btnRoles;
    private javax.swing.JButton btnRutinas;
    private javax.swing.JButton btnSesiones;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JButton btnValoraciones;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

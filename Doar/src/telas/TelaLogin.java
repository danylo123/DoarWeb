/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telas;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import usuario.Usuario;
import usuario.UsuarioDAO;

/**
 *
 * @author Danylo
 */
public class TelaLogin extends javax.swing.JFrame {

    Usuario usuario;
    UsuarioDAO dao;

    public TelaLogin() {
        initComponents();

        usuario = new Usuario();
        dao = new UsuarioDAO();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tfSenhaUsuario = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btEntrar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        tfCpfUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tfSenhaUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tfSenhaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSenhaUsuarioActionPerformed(evt);
            }
        });
        tfSenhaUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSenhaUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(tfSenhaUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 300, 240, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Senha:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("CPF:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, -1, -1));

        btEntrar.setText("Entrar");
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });
        btEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(btEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 440, 133, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel2.setText("Login");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 170, 110, 86));

        tfCpfUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCpfUsuarioActionPerformed(evt);
            }
        });
        tfCpfUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfCpfUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(tfCpfUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 240, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/fundo.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        if (!tfCpfUsuario.getText().isEmpty() && !tfSenhaUsuario.getText().isEmpty()) {

            usuario = dao.autenticarUsuario(tfCpfUsuario.getText(), tfSenhaUsuario.getText());

            if (usuario != null) {
                Usuario.setUsuario(usuario);
                MenuPrincipal menu = new MenuPrincipal(Usuario.getInstance());
                menu.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null, "Dados inválidos!");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
        }
    }//GEN-LAST:event_btEntrarActionPerformed

    private void tfCpfUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCpfUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCpfUsuarioActionPerformed

    private void btEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btEntrarKeyPressed

    }//GEN-LAST:event_btEntrarKeyPressed

    private void tfSenhaUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSenhaUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            btEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_tfSenhaUsuarioKeyPressed

    private void tfSenhaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSenhaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSenhaUsuarioActionPerformed

    private void tfCpfUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfCpfUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            tfSenhaUsuario.grabFocus();
            //btEntrarActionPerformed(null);
        }
    }//GEN-LAST:event_tfCpfUsuarioKeyPressed

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
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btEntrar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField tfCpfUsuario;
    private javax.swing.JPasswordField tfSenhaUsuario;
    // End of variables declaration//GEN-END:variables
}

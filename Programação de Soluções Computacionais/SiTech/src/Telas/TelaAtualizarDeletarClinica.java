package Telas;

import Classes.Clinica;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author joaol
 */
public class TelaAtualizarDeletarClinica extends javax.swing.JFrame {

    /**
     * Creates new form TelaAtualizarDeletarClinica
     */
    public TelaAtualizarDeletarClinica() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        a = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoCRMAtualizarDeletarClinica = new javax.swing.JTextField();
        botaoAtualizarClinica = new javax.swing.JButton();
        Deletar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        campoSenhaAtualizarDeletarClinica = new javax.swing.JPasswordField();
        jCheckBox1 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("CRM:");

        jLabel2.setText("Senha:");

        campoCRMAtualizarDeletarClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        campoCRMAtualizarDeletarClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCRMAtualizarDeletarClinicaActionPerformed(evt);
            }
        });

        botaoAtualizarClinica.setText("Atualizar");
        botaoAtualizarClinica.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoAtualizarClinica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAtualizarClinicaActionPerformed(evt);
            }
        });

        Deletar.setText("Deletar");
        Deletar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Deletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeletarActionPerformed(evt);
            }
        });

        jButton2.setText("Voltar");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jCheckBox1.setText("Mostrar Senha");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoAtualizarClinica)
                                .addGap(52, 52, 52)
                                .addComponent(Deletar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoSenhaAtualizarDeletarClinica)
                                    .addComponent(campoCRMAtualizarDeletarClinica, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jCheckBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCRMAtualizarDeletarClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(campoSenhaAtualizarDeletarClinica, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox1)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoAtualizarClinica)
                    .addComponent(Deletar))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(423, 319));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoAtualizarClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAtualizarClinicaActionPerformed
        Clinica ClinicaTela = new Clinica();

        String CRM = (campoCRMAtualizarDeletarClinica.getText());
        String Senha = (campoSenhaAtualizarDeletarClinica.getText());

        ClinicaTela.setCRM(CRM);
        ClinicaTela.setSenha(Senha);
        try {
            ClinicaTela.Atualizar();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAtualizarDeletarClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
        TelaPrincipalMDI T1 = new TelaPrincipalMDI();
        T1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botaoAtualizarClinicaActionPerformed

    private void DeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeletarActionPerformed
        Clinica ClinicaTela = new Clinica();

        String CRM = (campoCRMAtualizarDeletarClinica.getText());

        ClinicaTela.setCRM(CRM);

        try {
            ClinicaTela.Delete();
        } catch (SQLException ex) {
            Logger.getLogger(TelaAtualizarDeletarClinica.class.getName()).log(Level.SEVERE, null, ex);
        }
      TelaPrincipalMDI T1 = new TelaPrincipalMDI();
        T1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DeletarActionPerformed

    private void campoCRMAtualizarDeletarClinicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCRMAtualizarDeletarClinicaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCRMAtualizarDeletarClinicaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        TelaPrincipalMDI T1= new TelaPrincipalMDI();
        T1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
       if (jCheckBox1.isSelected()) {
            campoSenhaAtualizarDeletarClinica.setEchoChar('\0');
        } else {
            campoSenhaAtualizarDeletarClinica.setEchoChar('*');
        }
    }//GEN-LAST:event_jCheckBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(TelaAtualizarDeletarClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarDeletarClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarDeletarClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAtualizarDeletarClinica.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAtualizarDeletarClinica().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Deletar;
    private javax.swing.JPasswordField a;
    private javax.swing.JButton botaoAtualizarClinica;
    private javax.swing.JTextField campoCRMAtualizarDeletarClinica;
    private javax.swing.JPasswordField campoSenhaAtualizarDeletarClinica;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}

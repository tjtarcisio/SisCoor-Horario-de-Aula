/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.util.ArrayList;
import utilitarios.AreaAtuacao;
import utilitarios.AreaAtuacaoDAO;
import utilitarios.Professor;
import utilitarios.ProfessorDAO;

/**
 *
 * @author livre
 */
public class TelaPrincipal extends javax.swing.JFrame {
    Professor prof = ProfessorDAO.buscarProfAtivo();
    
    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuInfoPessoal = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        menuAddRestricao = new javax.swing.JMenuItem();
        menuEditarRestricao = new javax.swing.JMenuItem();
        menuExcluirRestricao = new javax.swing.JMenuItem();
        menuVisualizarRestricao = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jMenu1.setText("Minha Conta");

        menuInfoPessoal.setText("Editar Informações Pessoais");
        menuInfoPessoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuInfoPessoalActionPerformed(evt);
            }
        });
        jMenu1.add(menuInfoPessoal);

        jMenu3.setText("Restrições");

        menuAddRestricao.setText("Adicionar Restrição");
        menuAddRestricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuAddRestricaoActionPerformed(evt);
            }
        });
        jMenu3.add(menuAddRestricao);

        menuEditarRestricao.setText("Editar Restrição");
        menuEditarRestricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEditarRestricaoActionPerformed(evt);
            }
        });
        jMenu3.add(menuEditarRestricao);

        menuExcluirRestricao.setText("Excluir Restrição");
        menuExcluirRestricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuExcluirRestricaoActionPerformed(evt);
            }
        });
        jMenu3.add(menuExcluirRestricao);

        menuVisualizarRestricao.setText("Visualizar Restrições");
        menuVisualizarRestricao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuVisualizarRestricaoActionPerformed(evt);
            }
        });
        jMenu3.add(menuVisualizarRestricao);

        jMenu1.add(jMenu3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Ajuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void menuInfoPessoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuInfoPessoalActionPerformed
        ArrayList<AreaAtuacao> aArea = AreaAtuacaoDAO.listar();
        EditarInformacoesPessoais eip = new EditarInformacoesPessoais(this.prof);
        eip.setLocationRelativeTo(this);
        eip.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        eip.setVisible(true);
        
        eip.addItem("Outro(a)");
        for(int i=0;i<aArea.size();i++){
            eip.addItem(aArea.get(i).getNomeArea());
        }
        
    }//GEN-LAST:event_menuInfoPessoalActionPerformed

    private void menuAddRestricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuAddRestricaoActionPerformed
        Nova_restricao nr = new Nova_restricao();
        nr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        nr.setLocationRelativeTo(this);
        nr.setVisible(true);
    }//GEN-LAST:event_menuAddRestricaoActionPerformed

    private void menuEditarRestricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEditarRestricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuEditarRestricaoActionPerformed

    private void menuExcluirRestricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuExcluirRestricaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menuExcluirRestricaoActionPerformed

    private void menuVisualizarRestricaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuVisualizarRestricaoActionPerformed
        Visualizar_restricao vr = new Visualizar_restricao();
        
        vr.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        vr.setLocationRelativeTo(this);
        vr.setVisible(true);
    }//GEN-LAST:event_menuVisualizarRestricaoActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem menuAddRestricao;
    private javax.swing.JMenuItem menuEditarRestricao;
    private javax.swing.JMenuItem menuExcluirRestricao;
    private javax.swing.JMenuItem menuInfoPessoal;
    private javax.swing.JMenuItem menuVisualizarRestricao;
    // End of variables declaration//GEN-END:variables
}

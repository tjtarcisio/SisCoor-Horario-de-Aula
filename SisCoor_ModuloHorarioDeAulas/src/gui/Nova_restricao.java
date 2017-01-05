/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import utilitarios.ProfessorDAO;
import utilitarios.Restricao;
import utilitarios.RestricaoDAO;

/**
 *
 * @author Diego
 */
public class Nova_restricao extends javax.swing.JFrame {

    /**
     * Creates new form Nova_restricao
     */
    public Nova_restricao() {
        
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jbVoltar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        rbSegunda = new javax.swing.JRadioButton();
        rbTerca = new javax.swing.JRadioButton();
        rbQuarta = new javax.swing.JRadioButton();
        rbQuinta = new javax.swing.JRadioButton();
        rbSexta = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        rbMatutino = new javax.swing.JRadioButton();
        rbVespertino = new javax.swing.JRadioButton();
        rbNoturno = new javax.swing.JRadioButton();
        jbSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Nova Restrição");

        jbVoltar.setMnemonic('v');
        jbVoltar.setText("Voltar");
        jbVoltar.setToolTipText("Retorna ao menu principal");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dia"));
        jPanel1.setToolTipText("Dia da restrição");

        buttonGroup1.add(rbSegunda);
        rbSegunda.setText("Segunda-feira");

        buttonGroup1.add(rbTerca);
        rbTerca.setText("Terça-feira");

        buttonGroup1.add(rbQuarta);
        rbQuarta.setText("Quarta-feira");

        buttonGroup1.add(rbQuinta);
        rbQuinta.setText("Quinta-feira");

        buttonGroup1.add(rbSexta);
        rbSexta.setText("Sexta-feira");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbSegunda)
                .addGap(18, 18, 18)
                .addComponent(rbTerca)
                .addGap(18, 18, 18)
                .addComponent(rbQuarta)
                .addGap(18, 18, 18)
                .addComponent(rbQuinta)
                .addGap(18, 18, 18)
                .addComponent(rbSexta)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbSegunda)
                    .addComponent(rbTerca)
                    .addComponent(rbQuarta)
                    .addComponent(rbQuinta)
                    .addComponent(rbSexta))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Turno"));
        jPanel2.setToolTipText("Turno da restrição");

        buttonGroup2.add(rbMatutino);
        rbMatutino.setText("Matutino");

        buttonGroup2.add(rbVespertino);
        rbVespertino.setText("Vespertino");

        buttonGroup2.add(rbNoturno);
        rbNoturno.setText("Noturno");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rbMatutino)
                    .addComponent(rbVespertino)
                    .addComponent(rbNoturno))
                .addContainerGap(159, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(rbMatutino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbVespertino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rbNoturno)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jbSalvar.setMnemonic('s');
        jbSalvar.setText("Salvar Restrição");
        jbSalvar.setToolTipText("Salva a restrição");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbSalvar)
                                .addGap(72, 72, 72))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbVoltar)
                                .addGap(101, 101, 101))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbVoltar)
                        .addGap(18, 18, 18)
                        .addComponent(jbSalvar)
                        .addGap(36, 36, 36))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
       this.dispose();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        Restricao restricao = new Restricao();
        RestricaoDAO restricaoDAO = new RestricaoDAO();
        ProfessorDAO professorDAO = new ProfessorDAO();
        
        if(rbSegunda.isSelected())
        {
            restricao.setDia("Segunda-feira");
        }
        
        if(rbTerca.isSelected())
        {
            restricao.setDia("Terça-feira");
        }
        
        if(rbQuarta.isSelected())
        {
            restricao.setDia("Quarta-feira");
        }
        
        if(rbQuinta.isSelected())
        {
            restricao.setDia("Quinta-feira");
        }
        
        if(rbSexta.isSelected())
        {
            restricao.setDia("Sexta-feira");
        }
        
        if(rbMatutino.isSelected())
        {
            restricao.setTurno("Matutino");
        }
        
        if(rbVespertino.isSelected())
        {
            restricao.setTurno("Vespertino");
        }
        
        if(rbNoturno.isSelected())
        {
            restricao.setTurno("Noturno");
        }
        
        restricao.setCodProf(professorDAO.buscar_Ativo());
        
        if((restricaoDAO.buscar_Repeticao(restricao.getDia(), restricao.getTurno(), restricao.getCodProf()))==true)
        {
            JOptionPane.showMessageDialog(rootPane, "Restrição ja Existente", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        else
        {
            restricaoDAO.inserir(restricao);
            JOptionPane.showMessageDialog(rootPane, "Restrição Salva com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(Nova_restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nova_restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nova_restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nova_restricao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Nova_restricao().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbVoltar;
    private javax.swing.JRadioButton rbMatutino;
    private javax.swing.JRadioButton rbNoturno;
    private javax.swing.JRadioButton rbQuarta;
    private javax.swing.JRadioButton rbQuinta;
    private javax.swing.JRadioButton rbSegunda;
    private javax.swing.JRadioButton rbSexta;
    private javax.swing.JRadioButton rbTerca;
    private javax.swing.JRadioButton rbVespertino;
    // End of variables declaration//GEN-END:variables
}

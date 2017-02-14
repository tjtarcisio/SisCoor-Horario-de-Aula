/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.Color;
import java.util.ArrayList;
import utilitarios.AreaAtuacao;
import utilitarios.AreaAtuacaoDAO;
import utilitarios.Professor;
import utilitarios.ProfessorDAO;

/**
 *
 * @author livre
 */
public class EditarInformacoesPessoais extends javax.swing.JFrame {

    private Professor prof;
    private ProfessorDAO profD = new ProfessorDAO();
    private AreaAtuacao aa = new AreaAtuacao();
    private AreaAtuacaoDAO aaD = new AreaAtuacaoDAO();
    private ArrayList<AreaAtuacao> aList = aaD.listar();
    private ArrayList<Professor> aProf = profD.listar();
    
    
    
    /**
     * Creates new form EditarInformacoesPessoais
     * @param prof Professor ativo
     */
    
    public EditarInformacoesPessoais(Professor prof) {
        initComponents();
        
        
        
        this.prof = prof;
        tfNomeCad.setText(this.prof.getNome());
        tfEmailCad.setText(this.prof.getEmail());
        
        for(int i = 0;i<aList.size();i++){
            if(this.prof.getAreaAtuacao()==aList.get(i).getCod()){
                aa = aList.get(i);
            }
        }
    }

    public EditarInformacoesPessoais() {
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

        jLabel2 = new javax.swing.JLabel();
        tfNomeCad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tfEmailCad = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        comboAreaAtuacao = new javax.swing.JComboBox();
        tfAreaAtuacao = new javax.swing.JTextField();
        btVoltar = new javax.swing.JButton();
        btSalvar = new javax.swing.JButton();
        lbErro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nome Completo:");

        tfNomeCad.setToolTipText("Entre com seu nome completo.");

        jLabel4.setText("E-mail:");

        tfEmailCad.setToolTipText("Entre com um e-mail válido.");

        jLabel8.setText("Área de Atuação:");

        comboAreaAtuacao.setToolTipText("Caso sua área não esteja listada aqui, crie uma selecionando \"Outro(a)\".");
        comboAreaAtuacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreaAtuacaoActionPerformed(evt);
            }
        });

        tfAreaAtuacao.setEditable(false);

        btVoltar.setMnemonic('v');
        btVoltar.setText("Voltar");
        btVoltar.setToolTipText("Aperte para voltar ao Menu Inicial");
        btVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVoltarActionPerformed(evt);
            }
        });

        btSalvar.setText("Salvar");
        btSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarActionPerformed(evt);
            }
        });

        lbErro.setBackground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tfEmailCad)
                            .addComponent(comboAreaAtuacao, 0, 371, Short.MAX_VALUE)
                            .addComponent(tfAreaAtuacao)
                            .addComponent(tfNomeCad, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btSalvar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lbErro)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(400, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(tfNomeCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmailCad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tfAreaAtuacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lbErro)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btVoltar)
                    .addComponent(btSalvar))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jLabel2)
                    .addContainerGap(233, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public void addItem(String nomeItem) {
        comboAreaAtuacao.addItem(nomeItem);
    }
    
    private void comboAreaAtuacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreaAtuacaoActionPerformed
        if (comboAreaAtuacao.getSelectedItem().equals("Outro(a)")) {
            tfAreaAtuacao.setEditable(true);
        } else {
            tfAreaAtuacao.setEditable(false);
        }
    }//GEN-LAST:event_comboAreaAtuacaoActionPerformed

    private void btVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVoltarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btVoltarActionPerformed

    private void btSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarActionPerformed
        ArrayList<AreaAtuacao> aList = AreaAtuacaoDAO.listar();
        boolean nomeValido = true;
        boolean emailValido = true;
        boolean areaAtuacaoValida = false;
        boolean emailEncontrado = false;
        boolean inserir = false;
        boolean nenhumaModif = false;
        
        for(int i = 0; i<aList.size();i++){
            if(tfNomeCad.getText().equals(prof.getNome())&&tfEmailCad.getText().equals(prof.getEmail())&&(comboAreaAtuacao.getSelectedItem().equals(aList.get(i).getNomeArea())&&aList.get(i).getCod()==prof.getAreaAtuacao())){
                lbErro.setText("Nenhuma modificação encontrada!");
                nenhumaModif = true;
                break;
            }
        }
            inserir = false;
            
            if(!nenhumaModif){
                if(tfNomeCad.getText().isEmpty()){
                    lbErro.setText("Digite um nome válido!");
                    nomeValido = false;
                }else{
                    if(tfEmailCad.getText().isEmpty()||(tfEmailCad.getText().indexOf('@') == -1 || tfEmailCad.getText().indexOf('.') == -1)){
                        lbErro.setText("Digite um e-mail válido!");
                        emailValido = false;
                    }else{
                        for (int i = 0; i < aProf.size(); i++) {
                            if (tfEmailCad.getText().equals(aProf.get(i).getEmail())&&!tfEmailCad.getText().equals(prof.getEmail())) {
                                lbErro.setText("E-mail já cadastrado! Tente novamente");
                                tfEmailCad.setText(prof.getEmail());
                                emailEncontrado = true;
                                break;
                            }
                        }
                        if(!emailEncontrado){
                            if(comboAreaAtuacao.getSelectedItem().equals("Outro(a)")&&tfAreaAtuacao.getText().isEmpty()){
                                lbErro.setText("Digite uma área de atuação válida.");
                            }else if(comboAreaAtuacao.getSelectedItem().equals("Outro(a)")&&!tfAreaAtuacao.getText().isEmpty()){
                                aa.setNomeArea(tfAreaAtuacao.getText());
                                this.aaD.inserir(aa);
                                comboAreaAtuacao.addItem(aa.getNomeArea());
                                comboAreaAtuacao.setSelectedItem(aa.getNomeArea());
                                tfAreaAtuacao.setText("");
                                inserir = false;
                                btSalvarActionPerformed(evt);
                            }else{
                                inserir = true;
                            }
                        }

                    }

                }
            }
        
        
        if(inserir == true){
            prof.setNome(tfNomeCad.getText());
            prof.setEmail(tfEmailCad.getText());
            
            for(int i = 0; i<aList.size();i++){
                if(aList.get(i).getNomeArea().equals(comboAreaAtuacao.getSelectedItem())){
                    prof.setAreaAtuacao(aList.get(i).getCod());
                }
            }
            profD.editar(prof);
            lbErro.setBackground(Color.blue);
            lbErro.setText("Informações gravadas com sucesso!");
        }
    }//GEN-LAST:event_btSalvarActionPerformed

    
    
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
            java.util.logging.Logger.getLogger(EditarInformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarInformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarInformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarInformacoesPessoais.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarInformacoesPessoais().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btSalvar;
    private javax.swing.JButton btVoltar;
    private javax.swing.JComboBox comboAreaAtuacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lbErro;
    private javax.swing.JTextField tfAreaAtuacao;
    private javax.swing.JTextField tfEmailCad;
    private javax.swing.JTextField tfNomeCad;
    // End of variables declaration//GEN-END:variables
}
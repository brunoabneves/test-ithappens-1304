/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerFilial;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.ModelFilial;
import util.Formatador;

/**
 *
 * @author bruno
 */
public class ViewFilial extends javax.swing.JFrame {
    
    ArrayList<ModelFilial> listaModelFilial = new ArrayList<>();
    ControllerFilial controllerFilial = new ControllerFilial();
    ModelFilial modelFilial = new ModelFilial();
    Formatador formatador = new Formatador();
    String alterarSalvar;

    /**
     * Creates new form ViewFilial
     */
    public ViewFilial() {
        initComponents();
        preencheTabelaFilial();
        setLocationRelativeTo(null);
        habilitaDesabilitaCampos(false);
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
        tfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jbNovo = new javax.swing.JButton();
        tfNome = new javax.swing.JTextField();
        jbCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaFilial = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Filiais");

        jLabel1.setText("Código:");

        tfCodigo.setEditable(false);
        tfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodigoActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome:");

        jbNovo.setText("Novo");
        jbNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        TabelaFilial.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaFilial);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfNome))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(jbExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(jbNovo)
                        .addGap(18, 18, 18)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbSalvar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(tfNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbNovo)
                    .addComponent(jbCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodigoActionPerformed

    private void jbNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoActionPerformed
        //
        habilitaDesabilitaCampos(true);
        limparCampos();
        alterarSalvar = "salvar";
    }//GEN-LAST:event_jbNovoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        //
        habilitaDesabilitaCampos(false);
        limparCampos();
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        if(alterarSalvar.equals("salvar")){
            this.salvarFilial();
        }else if(alterarSalvar.equals("alterar")){
            this.atualizarFilial();
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Exclui um cliente do banco
        int linha = TabelaFilial.getSelectedRow();
        int codigoFilial = (int) TabelaFilial.getValueAt(linha, 0);

        if(controllerFilial.excluirFilialController(codigoFilial)){

            JOptionPane.showMessageDialog(this, "Filial excluido com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.preencheTabelaFilial();
            habilitaDesabilitaCampos(false);

        }else{
            JOptionPane.showMessageDialog(this, "Erro ao excluir cliente!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed

        alterarSalvar = "alterar";
        habilitaDesabilitaCampos(true);
        int linha = this.TabelaFilial.getSelectedRow();

        try{
            int idFilial = (int) this.TabelaFilial.getValueAt(linha, 0);
            //recupera dados do banco
            modelFilial = controllerFilial.getFilialController(idFilial);
            //seta na interface
            this.tfCodigo.setText(String.valueOf(modelFilial.getIdFilial()));
            this.tfNome.setText(modelFilial.getNome());

        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFilial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFilial().setVisible(true);
            }
        });
    }
    
    private void salvarFilial(){
        // Salva uma nova filial no banco
        modelFilial.setNome(this.tfNome.getText());
        
        if(controllerFilial.salvarFilialController(modelFilial) > 0){
            
            JOptionPane.showMessageDialog(this, "Filial cadastrada com sucesso!","ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.preencheTabelaFilial();
            limparCampos();
            habilitaDesabilitaCampos(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o filial!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void atualizarFilial(){
        // Atualiza uma filial no banco
        modelFilial.setNome(this.tfNome.getText());
        
        if(controllerFilial.atualizarFilialController(modelFilial)){
            
            JOptionPane.showMessageDialog(this, "Filial atualizada com sucesso!","ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.preencheTabelaFilial();
            limparCampos();
            habilitaDesabilitaCampos(false);
            
        }else{
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o filial!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Habilita e desabilita campos do formulário
     * @param condicao 
     */
    private void habilitaDesabilitaCampos(boolean condicao){
        tfCodigo.setEnabled(condicao);
        tfNome.setEnabled(condicao);
    }
    
    /**
     * Preenche a tabela de filials com os filials do banco
     */
    private void preencheTabelaFilial(){
        listaModelFilial = controllerFilial.getListaFilialController();
        DefaultTableModel modelo = (DefaultTableModel) TabelaFilial.getModel();
        modelo.setNumRows(0);
        
        //inserir filials na tabela
        int count = listaModelFilial.size();
        for (int i = 0; i < count; i++) {
            modelo.addRow(new Object[]{
            listaModelFilial.get(i).getIdFilial(),
            listaModelFilial.get(i).getNome(), 
            });
        }
                
    }
    
    private void limparCampos(){
        tfNome.setText("");
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaFilial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField tfCodigo;
    private javax.swing.JTextField tfNome;
    // End of variables declaration//GEN-END:variables
}

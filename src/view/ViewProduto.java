/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.ControllerProduto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import model.ModelProduto;
import util.Formatador;

/**
 *
 * @author bruno
 */
public class ViewProduto extends javax.swing.JFrame {

    ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
    ControllerProduto controllerProduto = new ControllerProduto();
    ModelProduto modelProduto = new ModelProduto();
    Formatador formatador = new Formatador();
    String alterarSalvar;

    /**
     * Creates new form ViewProduto
     */
    public ViewProduto() {
        initComponents();
        preencheTabelaProduto();
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
        tfId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        tfCodBarras = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tfDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelaProduto = new javax.swing.JTable();
        jbSalvar = new javax.swing.JButton();
        jbAlterar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbPesquisar = new javax.swing.JButton();
        jbNovo = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tfPesquisar = new javax.swing.JTextField();
        tfValor = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Produtos");

        jLabel1.setText("Id serial");

        tfId.setEditable(false);

        jLabel2.setText("Código de Barras:");

        tfCodBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCodBarrasActionPerformed(evt);
            }
        });

        jLabel3.setText("Descrição:");

        jLabel4.setText("Valor:");

        TabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id serial", "Cod barras", "Descrição", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TabelaProduto);

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbAlterar.setText("Alterar");
        jbAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAlterarActionPerformed(evt);
            }
        });

        jbExcluir.setText("Excluir");
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbPesquisar.setText("Pesquisar");
        jbPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarActionPerformed(evt);
            }
        });

        jbNovo.setText("Novo");
        jbNovo.setMaximumSize(new java.awt.Dimension(40, 20));
        jbNovo.setMinimumSize(new java.awt.Dimension(40, 20));
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

        jLabel5.setText("Pesquisar:");

        tfValor.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(171, 171, 171))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(tfCodBarras)
                                .addContainerGap())))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(54, 54, 54))
                                    .addComponent(tfValor)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(tfPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(jbExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbCancelar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbSalvar)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAlterar)
                    .addComponent(jbExcluir)
                    .addComponent(jbNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar)
                    .addComponent(jbSalvar))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfCodBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCodBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCodBarrasActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

        if (alterarSalvar.equals("salvar")) {
            this.salvarProduto();
        } else if (alterarSalvar.equals("alterar")) {
            this.atualizarProduto();
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        // Exclui um produto no banco:
        excluirProduto();
    }//GEN-LAST:event_jbExcluirActionPerformed

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

    private void jbAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAlterarActionPerformed
        //
        alterarSalvar = "alterar";
        habilitaDesabilitaCampos(true);
        int linha = this.TabelaProduto.getSelectedRow();

        try {
            int idProduto = (int) this.TabelaProduto.getValueAt(linha, 0);
            //recupera dados do banco
            modelProduto = controllerProduto.retornarProdutoController(idProduto);
            //seta na interface
            this.tfId.setText(String.valueOf(modelProduto.getIdProduto()));
            this.tfCodBarras.setText(modelProduto.getCodBarras());
            this.tfDescricao.setText(modelProduto.getDescricao());
            this.tfValor.setText(String.valueOf(modelProduto.getValor()));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Código inválido ou nenhum registro selecionado!", "Aviso", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbAlterarActionPerformed

    private void jbPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarActionPerformed
        // Busca um produto no banco
        DefaultTableModel modelo = (DefaultTableModel) this.TabelaProduto.getModel();
        final TableRowSorter<TableModel> classificador = new TableRowSorter<>(modelo);
        this.TabelaProduto.setRowSorter(classificador);

        //String txtId = tfId.getText();
        //String txtCodBarras = tfCodBarras.getText();
        String txt = tfPesquisar.getText();

        classificador.setRowFilter(RowFilter.regexFilter(txt, 2));
    }//GEN-LAST:event_jbPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewProduto().setVisible(true);
            }
        });
    }

    private void salvarProduto() {
        // Salva um novo produto no banco
        modelProduto.setCodBarras(this.tfCodBarras.getText());
        modelProduto.setDescricao(this.tfDescricao.getText());
        modelProduto.setValor(formatador.converteVirgulaParaPonto(this.tfValor.getText()));

        if (controllerProduto.salvarProdutoController(modelProduto) > 0) {

            JOptionPane.showMessageDialog(this, "Produto cadastrado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.preencheTabelaProduto();
            limparCampos();
            habilitaDesabilitaCampos(false);

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao cadastrar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void atualizarProduto() {
        // Atualiza um produto no banco
        modelProduto.setCodBarras(this.tfCodBarras.getText());
        modelProduto.setDescricao(this.tfDescricao.getText());
        modelProduto.setValor(formatador.converteVirgulaParaPonto(this.tfValor.getText()));

        if (controllerProduto.atualizarProdutoController(modelProduto)) {

            JOptionPane.showMessageDialog(this, "Produto atualizado com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.preencheTabelaProduto();
            limparCampos();
            habilitaDesabilitaCampos(false);

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao atualizar o produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * Habilita e desabilita campos do formulário
     *
     * @param condicao
     */
    private void habilitaDesabilitaCampos(boolean condicao) {
        tfId.setEnabled(condicao);
        tfCodBarras.setEnabled(condicao);
        tfDescricao.setEnabled(condicao);
        tfValor.setEnabled(condicao);
    }

    /**
     * Preenche a tabela de produtos com os produtos do banco
     */
    private void preencheTabelaProduto() {
        listaModelProduto = controllerProduto.retornarListaProdutoController();
        DefaultTableModel modelo = (DefaultTableModel) TabelaProduto.getModel();
        modelo.setNumRows(0);

        //inserir produtos na tabela
        int count = listaModelProduto.size();
        for (int i = 0; i < count; i++) {
            modelo.addRow(new Object[]{
                listaModelProduto.get(i).getIdProduto(),
                listaModelProduto.get(i).getCodBarras(),
                listaModelProduto.get(i).getDescricao(),
                listaModelProduto.get(i).getValor()
            });
        }
    }

    private void excluirProduto() {
        int linha = TabelaProduto.getSelectedRow();
        int codigoProduto = (int) TabelaProduto.getValueAt(linha, 0);

        if (controllerProduto.excluirProdutoController(codigoProduto)) {

            JOptionPane.showMessageDialog(this, "Produto excluido com sucesso!", "ATENÇÃO", JOptionPane.WARNING_MESSAGE);
            this.preencheTabelaProduto();
            habilitaDesabilitaCampos(false);

        } else {
            JOptionPane.showMessageDialog(this, "Erro ao excluir produto!", "ERRO", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void limparCampos() {
        tfCodBarras.setText("");
        tfDescricao.setText("");
        tfValor.setText("");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAlterar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JButton jbNovo;
    private javax.swing.JButton jbPesquisar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JTextField tfCodBarras;
    private javax.swing.JTextField tfDescricao;
    private javax.swing.JTextField tfId;
    private javax.swing.JTextField tfPesquisar;
    private javax.swing.JFormattedTextField tfValor;
    // End of variables declaration//GEN-END:variables
}

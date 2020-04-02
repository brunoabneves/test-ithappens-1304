package DAO;

import model.ModelFormaPagamento;
import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.ModelFormaPagamento;
/**
*
* @author bruno
*/
public class DAOFormaPagamento extends ConexaoSQLite {

 /**
    * grava formaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    /**
     * Cadastrar uma formaPagamento no banco
     *
     * @param modelFormaPagamento
     * @return
     */
    public int cadastrarFormaPagamentoDAO(ModelFormaPagamento modelFormaPagamento) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO formaPagamento (tipoPagamento) VALUES ("
                    + "'" + modelFormaPagamento.getTipoPagamento()+ "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Retorna uma formaPagamento pelo codigo
     *
     * @param idFormaPagamento
     * @return modelFormaPagamento
     */
    public ModelFormaPagamento retornarFormaPagamentoDAO(int idFormaPagamento) {
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM formaPagamento WHERE idFormaPagamento = "
                    + "'" + idFormaPagamento + "'");

            while (this.getResultSet().next()) {
                modelFormaPagamento.setIdFormaPagamento(this.getResultSet().getInt(1));
                modelFormaPagamento.setTipoPagamento(this.getResultSet().getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelFormaPagamento;
    }
    
     /**
     * Retorna uma formaPagamento pelo codigo
     *
     * @param pNomeFormaPagamento
     * @return modelFormaPagamento
     */
    public ModelFormaPagamento retornarFormaPagamentoDAO(String pNomeFormaPagamento) {
        ModelFormaPagamento modelFormaPagamento = new ModelFormaPagamento();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM formaPagamento WHERE nome = "
                    + "'" + pNomeFormaPagamento + "'");

            while (this.getResultSet().next()) {
                modelFormaPagamento.setIdFormaPagamento(this.getResultSet().getInt(1));
                modelFormaPagamento.setTipoPagamento(this.getResultSet().getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelFormaPagamento;
    }

    /**
     * Retorna uma lista completa de formaPagamentos
     * @return listaModelFormaPagamento
     */
    public ArrayList<ModelFormaPagamento> retornaListaFormaPagamentosDAO(){
        ArrayList<ModelFormaPagamento> listaModelFormaPagamento = new ArrayList<>();
        ModelFormaPagamento modelformaPagamento = new ModelFormaPagamento();
        
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM formaPagamento");
            
            while (this.getResultSet().next()) {
                modelformaPagamento = new ModelFormaPagamento();
                
                modelformaPagamento.setIdFormaPagamento(this.getResultSet().getInt(1));
                modelformaPagamento.setTipoPagamento(this.getResultSet().getString(2));
                
                listaModelFormaPagamento.add(modelformaPagamento);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelFormaPagamento;
    }

   /**
     * Atualiza uma formaPagamento no banco
     *
     * @param modelFormaPagamento
     * @return bool
     */
    public boolean atualizarFormaPagamentoDAO(ModelFormaPagamento modelFormaPagamento) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE formaPagamento SET "
                    + "tipoPagamento = '" + modelFormaPagamento.getTipoPagamento()+ "'"
                    + "WHERE idFormaPagamento = '"+modelFormaPagamento.getIdFormaPagamento()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }
    
      /**
     * Excluir uma formaPagamento do banco
     *
     * @param idFormaPagamento
     * @return boolean
     */
    public boolean excluirFormaPagamentoDAO(int idFormaPagamento) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("DELETE FROM formaPagamento WHERE "
                    + "formaPagamento.idFormaPagamento = '" + idFormaPagamento + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

}
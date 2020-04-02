package controller;

import model.ModelFormaPagamento;
import DAO.DAOFormaPagamento;
import java.util.ArrayList;

/**
*
* @author bruno
*/
public class ControllerFormaPagamento {

    private DAOFormaPagamento daoFormaPagamento = new DAOFormaPagamento();

    /**
    * grava FormaPagamento
    * @param pModelFormaPagamento
    * @return int
    */
    public int salvarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.cadastrarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * recupera FormaPagamento
    * @param pIdFormaPagamento
    * @return ModelFormaPagamento
    */
    public ModelFormaPagamento getFormaPagamentoController(int pIdFormaPagamento){
        return this.daoFormaPagamento.retornarFormaPagamentoDAO(pIdFormaPagamento);
    }

    /**
    * recupera uma lista deFormaPagamento
    * @param pIdFormaPagamento
    * @return ArrayList
    */
    public ArrayList<ModelFormaPagamento> getListaFormaPagamentoController(){
        return this.daoFormaPagamento.retornaListaFormaPagamentosDAO();
    }

    /**
    * atualiza FormaPagamento
    * @param pModelFormaPagamento
    * @return boolean
    */
    public boolean atualizarFormaPagamentoController(ModelFormaPagamento pModelFormaPagamento){
        return this.daoFormaPagamento.atualizarFormaPagamentoDAO(pModelFormaPagamento);
    }

    /**
    * exclui FormaPagamento
    * @param pIdFormaPagamento
    * @return boolean
    */
    public boolean excluirFormaPagamentoController(int pIdFormaPagamento){
        return this.daoFormaPagamento.excluirFormaPagamentoDAO(pIdFormaPagamento);
    }
}
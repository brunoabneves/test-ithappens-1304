package controller;

import model.ModelCliente;
import DAO.DAOCliente;
import java.util.ArrayList;

/**
*
* @author bruno
*/
public class ControllerCliente {

    private DAOCliente daoCliente = new DAOCliente();

    /**
    * salva Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.cadastrarClienteDAO(pModelCliente);
    }

    /**
    * recupera Cliente
    * @param pIdCliente
    * @return ModelCliente
    */
    public ModelCliente RetornarClienteController(int pIdCliente){
        return this.daoCliente.retornarClienteDAO(pIdCliente);
    }

    /**
    * recupera uma lista completa de Cliente
    * @param pIdCliente
    * @return ArrayList
    */
    public ArrayList<ModelCliente> retornarListaClienteController(){
        return this.daoCliente.retornaListaClientesDAO();
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteController(ModelCliente pModelCliente){
        return this.daoCliente.atualizarClienteDAO(pModelCliente);
    }

    /**
    * exclui Cliente
    * @param pIdCliente
    * @return boolean
    */
    public boolean excluirClienteController(int pIdCliente){
        return this.daoCliente.excluirClienteDAO(pIdCliente);
    }
}
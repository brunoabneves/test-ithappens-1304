package controller;

import model.ModelFilial;
import DAO.DAOFilial;
import java.util.ArrayList;

/**
*
* @author bruno
*/
public class ControllerFilial {

    private DAOFilial daoFilial = new DAOFilial();

    /**
    * grava Filial
    * @param pModelFilial
    * @return int
    */
    public int salvarFilialController(ModelFilial pModelFilial){
        return this.daoFilial.cadastrarFilialDAO(pModelFilial);
    }

    /**
    * recupera Filial
    * @param pIdFilial
    * @return ModelFilial
    */
    public ModelFilial getFilialController(int pIdFilial){
        return this.daoFilial.retornarFilialDAO(pIdFilial);
    }
    
    /**
    * recupera Filial
    * @param pNomeFilial
    * @return ModelFilial
    */
    public ModelFilial getFilialController(String pNomeFilial){
        return this.daoFilial.retornarFilialDAO(pNomeFilial);
    }

    /**
    * recupera uma lista de Filial
    *
    * @return ArrayList
    */
    public ArrayList<ModelFilial> getListaFilialController(){
        return this.daoFilial.retornaListaFilialsDAO();
    }

    /**
    * atualiza Filial
    * @param pModelFilial
    * @return boolean
    */
    public boolean atualizarFilialController(ModelFilial pModelFilial){
        return this.daoFilial.atualizarFilialDAO(pModelFilial);
    }

    /**
    * exclui Filial
    * @param pIdFilial
    * @return boolean
    */
    public boolean excluirFilialController(int pIdFilial){
        return this.daoFilial.excluirFilialDAO(pIdFilial);
    }
}
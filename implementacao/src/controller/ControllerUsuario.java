package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;
import model.ModelFilial;

/**
*
* @author bruno
*/
public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.cadastrarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pIdUsuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pIdUsuario){
        return this.daoUsuario.retornarUsuarioDAO(pIdUsuario);
    }
    
      /**
    * recupera Usuário
    * @param pNomeUsuario
    * @return ModelFilial
    */
    public ModelUsuario getUsuarioController(String pNomeUsuario){
        return this.daoUsuario.retornarUsuarioDAO(pNomeUsuario);
    }

    /**
    * recupera uma lista de Usuario
    * @param pIdUsuario
    * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.retornaListaUsuariosDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    /**
    * exclui Usuario
    * @param pIdUsuario
    * @return boolean
    */
    public boolean excluirUsuarioController(int pIdUsuario){
        return this.daoUsuario.excluirUsuarioDAO(pIdUsuario);
    }
}
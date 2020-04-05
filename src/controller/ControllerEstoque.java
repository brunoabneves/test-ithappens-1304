package controller;

import model.ModelEstoque;
import DAO.DAOEstoque;
import java.util.ArrayList;

/**
*
* @author bruno
*/
public class ControllerEstoque {

    private DAOEstoque daoEstoque = new DAOEstoque();

    /**
    * grava Estoque
    * @param pModelEstoque
    * @return int
    */
    public int salvarEstoqueController(ModelEstoque pModelEstoque){
        return this.daoEstoque.cadastrarEstoqueDAO(pModelEstoque);
    }

    /**
    * recupera Estoque
    * @param pIdEstoque
    * @return ModelEstoque
    */
    public ModelEstoque getEstoqueController(int pIdEstoque){
        return this.daoEstoque.retornarEstoqueDAO(pIdEstoque);
    }
    
    /**
    * recupera Estoque
    * @param pIdEstoque
    * @return ModelEstoque
    */
    public ModelEstoque getEstoquePorFilialProdutoController(int pIdEstoque, int pIdProduto){
        return this.daoEstoque.retornarEstoquePorFilialProdutoDAO(pIdEstoque, pIdProduto);
    }

    /**
    * recupera uma lista deEstoque
    * @param pIdEstoque
    * @return ArrayList
    */
    public ArrayList<ModelEstoque> getListaEstoqueController(){
        return this.daoEstoque.retornaListaEstoquesDAO();
    }

    /**
    * atualiza Estoque
    * @param pModelEstoque
    * @return boolean
    */
    public boolean atualizarEstoqueController(ModelEstoque pModelEstoque){
        return this.daoEstoque.atualizarEstoqueDAO(pModelEstoque);
    }

    /**
    * exclui Estoque
    * @param pIdEstoque
    * @return boolean
    */
    public boolean excluirEstoqueController(int pIdEstoque){
        return this.daoEstoque.excluirEstoqueDAO(pIdEstoque);
    }

    public boolean atualizarDadoEstoqueController(ArrayList<ModelEstoque> listaModelEstoque) {
        return this.daoEstoque.atualizarDadoEstoqueDAO(listaModelEstoque);
    }

    public ModelEstoque getEstoquePorProdutoController(int idProduto) {
        return this.daoEstoque.getEstoquePorProdutoControllerDAO(idProduto);
    }
}
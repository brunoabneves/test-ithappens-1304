/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DaoProduto;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author bruno
 */
public class ControllerProduto {
    
    private DaoProduto daoProduto = new DaoProduto();
    
    /**
     * Salvar produto controller
     * @param modelProduto
     * @return 
     */
    public int salvarProdutoController(ModelProduto modelProduto){
         return this.daoProduto.cadastrarProdutoDAO(modelProduto);
    }
    
    /**
     * Excluir produto pelo código
     * @param idProduto
     * @return boolean
     */
    public boolean excluirProdutoController(int idProduto){
        return this.daoProduto.excluirProdutoDAO(idProduto);
    }
    
    /**
     * Alterar produto controller
     * @param modelProduto
     * @return 
     */
    public boolean atualizarProdutoController(ModelProduto modelProduto){
        return this.daoProduto.atualizarProdutoDAO(modelProduto);
    }
    
    /**
     * Retorna um  produto pelo código
     * @param idProduto
     * @return modelProduto
     */
    public ModelProduto retornarProdutoController(int idProduto){
        return this.daoProduto.retornarProdutoDAO(idProduto);
    }
    
    /**
     * Retorna um  produto pelo código
     * @param pDescProduto
     * @return modelProduto
     */
    public ModelProduto retornarProdutoController(String pDescProduto){
        return this.daoProduto.retornarProdutoDAO(pDescProduto);
    }
    
    /**
     * Retorna uma lista de produtos
     * @return lista modelProdutos
     */
    public ArrayList<ModelProduto> retornarListaProdutoController(){
        return this.daoProduto.retornaListaProdutosDAO();
    }
}

package controller;

import model.ModelPedidoEstoque;
import DAO.DAOPedidoEstoque;
import java.util.ArrayList;
import model.ModelEstoque;
import model.ModelEstoqueProduto;
import model.ModelProduto;

/**
*
* @author bruno
*/
public class ControllerPedidoEstoque {

    private DAOPedidoEstoque DaoPedidoEstoque = new DAOPedidoEstoque();

        public ModelPedidoEstoque getListaPedidoEstoqueController() {
        return this.DaoPedidoEstoque.retornaListaPedidoEstoqueDAO();
    }
        
        /**
    * grava um pedido
    * @param pModelPedidoEstoque
    * @return int
    */
    public int salvarPedidoEstoqueController(ModelPedidoEstoque pModelPedidoEstoque){
        return this.DaoPedidoEstoque.cadastrarPedidoEstoqueDAO(pModelPedidoEstoque);
    }
    
    /**
     * Retorna um  pdido de estoque pelo código
     * @param pDescProduto
     * @return modelProduto
     */
    public ModelPedidoEstoque retornarPedidoEstoqueController(int pPedidoEstoque){
        return this.DaoPedidoEstoque.retornarPedidoEstoqueDAO(pPedidoEstoque);
    }
}
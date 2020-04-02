package controller;

import model.ModelPedidoEstoque;
import DAO.DAOPedidoEstoque;
import java.util.ArrayList;
import model.ModelEstoque;
import model.ModelEstoqueProduto;

/**
*
* @author bruno
*/
public class ControllerPedidoEstoque {

    private DAOPedidoEstoque DaoPedidoEstoque = new DAOPedidoEstoque();

        public ArrayList<ModelPedidoEstoque> getListaPedidoEstoqueController() {
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
}
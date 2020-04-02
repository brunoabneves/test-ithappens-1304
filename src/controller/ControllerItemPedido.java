package controller;

import model.ModelItemPedido;
import DAO.DAOItemPedido;
import java.util.ArrayList;

/**
*
* @author bruno
*/
public class ControllerItemPedido {

    private DAOItemPedido daoItemPedido = new DAOItemPedido();

    /**
    * grava ItemPedido
    * @param pModelItemPedido
    * @return int
    */
    public int salvarItemPedidoController(ModelItemPedido pModelItemPedido){
        return this.daoItemPedido.cadastrarItemPedidoDAO(pModelItemPedido);
    }

    /**
    * recupera ItemPedido
    * @param pIdProduto
    * @return ModelItemPedido
    */
    public ModelItemPedido getItemPedidoController(int pIdProduto){
        return this.daoItemPedido.retornarItemPedidoDAO(pIdProduto);
    }

    /**
    * recupera uma lista deItemPedido
    * @param pStatus
    * @return ArrayList
    */
    public ArrayList<ModelItemPedido> getListaItemPedidoController(){
        return this.daoItemPedido.retornaListaItemPedidosDAO();
    }

    /**
    * atualiza ItemPedido
    * @param pModelItemPedido
    * @return boolean
    */
    public boolean atualizarItemPedidoController(ModelItemPedido pModelItemPedido){
        return this.daoItemPedido.atualizarItemPedidoDAO(pModelItemPedido);
    }

    /**
    * exclui ItemPedido
    * @param pIdProduto
    * @return boolean
    */
    public boolean excluirItemPedidoController(int pIdProduto){
        return this.daoItemPedido.excluirItemPedidoDAO(pIdProduto);
    }

    /**
     * Salva uma lista de produtos da venda
     * @param listaModelItemPedido
     * @return 
     */
    public boolean salvarItemPedidoController(ArrayList<ModelItemPedido> listaModelItemPedido) {
        return this.daoItemPedido.cadastrarItemPedidoDAO(listaModelItemPedido);
    }
}
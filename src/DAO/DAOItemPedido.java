package DAO;

import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import model.ModelItemPedido;
/**
*
* @author bruno
*/
public class DAOItemPedido extends ConexaoSQLite {

    /**
     * Cadastrar um item de Pedido no banco
     *
     * @param modelItemPedido
     * @return
     */
    public int cadastrarItemPedidoDAO(ModelItemPedido modelItemPedido) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO itemPedido (status, quantidade, valorUnitario, valorTotal, idProduto, idFormaPagamento) "
                    + "VALUES ("
                    + "'" +modelItemPedido.getStatus()+ "',"
                    + "'" +modelItemPedido.getQuantidade()+ "',"
                    + "'" +modelItemPedido.getValorUnitario()+"',"
                    + "'" +modelItemPedido.getValorTotal()+"',"
                    + "'" +modelItemPedido.getIdProduto()+"',"
                    + "'" +modelItemPedido.getIdFormaPagamento()+"')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Retorna um item de pedido pelo codigo
     *
     * @param idItemPedido
     * @return modelItemPedido
     */
    public ModelItemPedido retornarItemPedidoDAO(int idItemPedido) {
        ModelItemPedido modelItemPedido = new ModelItemPedido();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM itemPedido WHERE idItemPedido = "
                    + "'" + idItemPedido + "'");

            while (this.getResultSet().next()) {
                modelItemPedido.setStatus(this.getResultSet().getString(1));
                modelItemPedido.setQuantidade(this.getResultSet().getInt(2));
                modelItemPedido.setValorUnitario(this.getResultSet().getInt(3));
                modelItemPedido.setValorTotal(this.getResultSet().getInt(4));
                modelItemPedido.setIdProduto(this.getResultSet().getInt(5));
                modelItemPedido.setIdFormaPagamento(this.getResultSet().getInt(6));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelItemPedido;
    }

    /**
     * Retorna uma lista completa de itens de Pedidos
     * @return listaModelItemPedido
     */
    public ArrayList<ModelItemPedido> retornaListaItemPedidosDAO(){
        ArrayList<ModelItemPedido> listaModelItemPedido = new ArrayList<>();
        ModelItemPedido modelItemPedido = new ModelItemPedido();
        
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM itemPedido");
            
            while (this.getResultSet().next()) {
                modelItemPedido = new ModelItemPedido();
                
                modelItemPedido.setStatus(this.getResultSet().getString(1));
                modelItemPedido.setQuantidade(this.getResultSet().getInt(2));
                modelItemPedido.setValorUnitario(this.getResultSet().getInt(3));
                modelItemPedido.setValorTotal(this.getResultSet().getInt(4));
                modelItemPedido.setIdProduto(this.getResultSet().getInt(5));
                modelItemPedido.setIdFormaPagamento(this.getResultSet().getInt(6));
                
                listaModelItemPedido.add(modelItemPedido);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelItemPedido;
    }

   /**
     * Atualiza um item de Pedido no banco
     *
     * @param modelItemPedido
     * @return bool
     */
    public boolean atualizarItemPedidoDAO(ModelItemPedido modelItemPedido) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE itemPedido SET "
                    + "status = '" + modelItemPedido.getStatus()+ "', "
                    + "quantidade = '"+modelItemPedido.getQuantidade()+"', "
                    + "valorUnitario = '"+modelItemPedido.getValorUnitario()+"', "
                    + "valorTotal = '"+modelItemPedido.getValorTotal()+"', "
                    + "idProduto = '"+modelItemPedido.getIdProduto()+"', "
                    + "idFormaPagamento = '"+modelItemPedido.getIdFormaPagamento()+"'"
                    + "WHERE idProduto = '"+modelItemPedido.getIdProduto()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }
    
      /**
     * Excluir um itemPedido do banco
     *
     * @param idItemPedido
     * @return boolean
     */
    public boolean excluirItemPedidoDAO(int idItemPedido) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("DELETE FROM itemPedido WHERE "
                    + "itemPedido.idItemPedido = '" + idItemPedido + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

    public boolean cadastrarItemPedidoDAO(ArrayList<ModelItemPedido> listaModelItemPedido) {
        try {
            this.conecta();
            int cont = listaModelItemPedido.size();
            for (int i = 0; i < cont; i++) {
                 this.insertSQL("INSERT INTO itemPedido (status, quantidade, valorUnitario, valorTotal, idProduto, idFormaPagamento) "
                    + "VALUES ("
                    + "'" +listaModelItemPedido.get(i).getStatus()+ "',"
                    + "'" +listaModelItemPedido.get(i).getQuantidade()+ "',"
                    + "'" +listaModelItemPedido.get(i).getValorUnitario()+"',"
                    + "'" +listaModelItemPedido.get(i).getValorTotal()+"',"
                    + "'" +listaModelItemPedido.get(i).getIdProduto()+"',"
                    + "'" +listaModelItemPedido.get(i).getIdFormaPagamento()+"')"
                );
            }
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

}
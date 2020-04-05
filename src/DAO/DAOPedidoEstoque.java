package DAO;

import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelEstoque;
import model.ModelFilial;
import model.ModelPedidoEstoque;
import model.ModelProduto;
import model.ModelUsuario;
/**
*
* @author bruno
*/
public class DAOPedidoEstoque extends ConexaoSQLite {

    
     /**
     * Cadastrar um estoque no banco
     *
     * @param modelPedidoEstoque
     * @return
     */
    public int cadastrarPedidoEstoqueDAO(ModelPedidoEstoque modelPedidoEstoque) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO pedidoEstoque (tipo, idUsuario, idCliente, idFilial, observacao) VALUES ("
                    + "'" +modelPedidoEstoque.getTipo()+ "',"
                    + "'" +modelPedidoEstoque.getIdUsuario()+"',"
                    + "'" +modelPedidoEstoque.getIdCliente()+"',"
                    + "'" +modelPedidoEstoque.getIdFilial()+"',"
                    + "'" +modelPedidoEstoque.getObservacao()+"')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Retorna uma lista completa de pedidos de pedidoEstoque
     * @return listaModelPedidoEstoque
     */
    public ModelPedidoEstoque retornaListaPedidoEstoqueDAO(){
        ArrayList<ModelPedidoEstoque> listaModelPedidoEstoque = new ArrayList<>();
        ModelPedidoEstoque modelPedidoEstoque = new ModelPedidoEstoque();
        ModelEstoque modelEstoque = new ModelEstoque();
        ModelUsuario modelUsuario = new ModelUsuario();
        ModelCliente modelCliente = new ModelCliente();
        ModelFilial modelFilial = new ModelFilial();
        
        try {
            this.conecta();
            this.executarSQL("SELECT "
                    + "pedidoEstoque.idPedidoEstoque,"
                    + "pedidoEstoque.tipo,"
                    + "pedidoEstoque.idUsuario,"
                    + "pedidoEstoque.idCliente,"
                    + "pedidoEstoque.idFilial,"
                    + "pedidoEstoque.observacao,"
                    + "usuario.idUsuario,"
                    + "usuario.nome,"
                    + "cliente.idCliente,"
                    + "cliente.nome,"
                    + "filial.idFilial,"
                    + "filial.nome"
                    + " FROM "
                    + "pedidoEstoque INNER JOIN usuario "
                    + "ON pedidoEstoque.idUsuario = usuario.idUsuario "
                    + "INNER JOIN cliente ON pedidoEstoque.idCliente = cliente.idCliente "
                    + "INNER JOIN filial ON pedidoEstoque.idFilial = filial.idFilial;"
                    + ";"
            );
            
            while (this.getResultSet().next()) {
                modelUsuario = new ModelUsuario();
                modelCliente = new ModelCliente();
                modelFilial = new ModelFilial();
                modelPedidoEstoque = new ModelPedidoEstoque();
                
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
                
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
                
                modelFilial.setIdFilial(this.getResultSet().getInt(1));
                modelFilial.setNome(this.getResultSet().getString(2));
                
                modelPedidoEstoque.setIdPedidoEstoque(this.getResultSet().getInt(1));
                modelPedidoEstoque.setTipo(this.getResultSet().getString(2));
                modelPedidoEstoque.setIdUsuario(this.getResultSet().getInt(3));
                modelPedidoEstoque.setIdCliente(this.getResultSet().getInt(4));
                modelPedidoEstoque.setIdFilial(this.getResultSet().getInt(5));
                modelPedidoEstoque.setObservacao(this.getResultSet().getString(6));
                
                listaModelPedidoEstoque.add(modelPedidoEstoque);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelPedidoEstoque.get(listaModelPedidoEstoque.size()-1);
    }
    
    /**
     * Retorna um produto pelo codigo
     *
     * @param idProduto
     * @return modelProduto
     */
    public ModelPedidoEstoque retornarPedidoEstoqueDAO(int idPedidoEstoque) {
        ModelPedidoEstoque modelPedidoEstoque = new ModelPedidoEstoque();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM pedidoEstoque WHERE idPedidoEstoque = "
                    + "'" + idPedidoEstoque + "'");

            while (this.getResultSet().next()) {
                modelPedidoEstoque.setIdPedidoEstoque(this.getResultSet().getInt(1));
                modelPedidoEstoque.setTipo(this.getResultSet().getString(2));
                modelPedidoEstoque.setIdUsuario(this.getResultSet().getInt(3));
                modelPedidoEstoque.setIdCliente(this.getResultSet().getInt(4));
                modelPedidoEstoque.setIdFilial(this.getResultSet().getInt(5));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelPedidoEstoque;
    }

}
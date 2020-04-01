package DAO;

import model.ModelCliente;
import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.ModelProduto;
/**
*
* @author bruno
*/
public class DAOCliente extends ConexaoSQLite {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    /**
     * Cadastrar um cliente no banco
     *
     * @param modelCliente 
     * @return
     */
    public int cadastrarClienteDAO(ModelCliente modelCliente) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO cliente (nome) VALUES ("
                    + "'" + modelCliente.getNome()+ "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Retorna um cliente pelo codigo
     *
     * @param idCliente
     * @return modelProduto
     */
    public ModelCliente retornarClienteDAO(int idCliente) {
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM cliente WHERE idCliente = "
                    + "'" + idCliente + "'");

            while (this.getResultSet().next()) {
                modelCliente.setIdCliente(this.getResultSet().getInt(1));
                modelCliente.setNome(this.getResultSet().getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelCliente;
    }

    /**
     * Retorna uma lista completa de clientes
     * @return listaModelProduto
     */
    public ArrayList<ModelCliente> retornaListaClientesDAO(){
        ArrayList<ModelCliente> listaModelCliente = new ArrayList<>();
        ModelCliente modelcliente = new ModelCliente();
        
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM cliente");
            
            while (this.getResultSet().next()) {
                modelcliente = new ModelCliente();
                
                modelcliente.setIdCliente(this.getResultSet().getInt(1));
                modelcliente.setNome(this.getResultSet().getString(2));
                
                listaModelCliente.add(modelcliente);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelCliente;
    }

   /**
     * Atualiza um cliente no banco
     *
     * @param modelCliente
     * @return bool
     */
    public boolean atualizarClienteDAO(ModelCliente modelCliente) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE cliente SET "
                    + "nome = '" + modelCliente.getNome() + "'"
                    + "WHERE idCliente = '"+modelCliente.getIdCliente()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }
    
      /**
     * Excluir um cliente do banco
     *
     * @param idCliente
     * @return boolean
     */
    public boolean excluirClienteDAO(int idCliente) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("DELETE FROM cliente WHERE "
                    + "cliente.idCliente = '" + idCliente + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

}
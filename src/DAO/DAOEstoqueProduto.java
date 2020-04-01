/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import model.ModelEstoque;
import model.ModelEstoqueProduto;
import model.ModelProduto;

/**
 *
 * @author bruno
 */
public class DAOEstoqueProduto extends ConexaoSQLite{
    
    /**
     * Retorna uma lista completa de produtos
     * @return listaModelProduto
     */
    public ArrayList<ModelEstoqueProduto> retornaListaEstoqueProdutosDAO(){
        ArrayList<ModelEstoqueProduto> listaModelEstoqueProduto = new ArrayList<>();
        ModelProduto modelProduto = new ModelProduto();
        ModelEstoque modelEstoque = new ModelEstoque();
        ModelEstoqueProduto modelEstoqueProduto = new ModelEstoqueProduto();
        
        try {
            this.conecta();
            this.executarSQL("SELECT "
                    + "estoque.idEstoque,"
                    + "estoque.quantidade,"
                    + "estoque.idProduto,"
                    + "estoque.idFilial,"
                    + "produto.idProduto,"
                    + "produto.codBarras,"
                    + "produto.descricao,"
                    + "produto.valor"
                    + " FROM "
                    + "estoque INNER JOIN produto "
                    + "ON produto.idProduto = estoque.idProduto;"
                    + ";"
            );
            
            while (this.getResultSet().next()) {
                modelEstoque = new ModelEstoque();
                modelProduto = new ModelProduto();
                modelEstoqueProduto = new ModelEstoqueProduto();
                
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setCodBarras(this.getResultSet().getString(2));
                modelProduto.setDescricao(this.getResultSet().getString(3));
                modelProduto.setValor(this.getResultSet().getDouble(4));
                //Estoque
                modelEstoque.setIdEstoque(this.getResultSet().getInt(1));
                modelEstoque.setQuantidade(this.getResultSet().getInt(2));
                modelEstoque.setIdProduto(this.getResultSet().getInt(3));
                modelEstoque.setIdFilial(this.getResultSet().getInt(4));
                
                modelEstoqueProduto.setModelEstoque(modelEstoque);
                modelEstoqueProduto.setModelProduto(modelProduto);
                
                listaModelEstoqueProduto.add(modelEstoqueProduto);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelEstoqueProduto;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import model.ModelEstoque;
import model.ModelEstoqueFilial;
import model.ModelFilial;

/**
 *
 * @author bruno
 */
public class DAOEstoqueFilial extends ConexaoSQLite{
    /**
     * Retorna uma lista completa de filials
     * @return listaModelFilial
     */
    public ArrayList<ModelEstoqueFilial> retornaListaEstoqueFilialDAO(){
        ArrayList<ModelEstoqueFilial> listaModelEstoqueFilial = new ArrayList<>();
        ModelFilial modelFilial = new ModelFilial();
        ModelEstoque modelEstoque = new ModelEstoque();
        ModelEstoqueFilial modelEstoqueFilial = new ModelEstoqueFilial();
        
        try {
            this.conecta();
            this.executarSQL("SELECT "
                    + "estoque.idEstoque,"
                    + "estoque.quantidade,"
                    + "estoque.idFilial,"
                    + "estoque.idProduto,"
                    + "filial.idFilial,"
                    + "filial.nome"
                    + " FROM "
                    + "estoque INNER JOIN filial "
                    + "ON filial.idFilial = estoque.idFilial");
            
            while (this.getResultSet().next()) {
                modelEstoque = new ModelEstoque();
                modelFilial = new ModelFilial();
                modelEstoqueFilial = new ModelEstoqueFilial();
                
                modelFilial.setIdFilial(this.getResultSet().getInt(1));
                modelFilial.setNome(this.getResultSet().getString(2));
                //Estoque
                modelEstoque.setIdEstoque(this.getResultSet().getInt(1));
                modelEstoque.setQuantidade(this.getResultSet().getInt(2));
                modelEstoque.setIdFilial(this.getResultSet().getInt(3));
                modelEstoque.setIdFilial(this.getResultSet().getInt(4));
                
                modelEstoqueFilial.setModelEstoque(modelEstoque);
                modelEstoqueFilial.setModelFilial(modelFilial);
                
                listaModelEstoqueFilial.add(modelEstoqueFilial);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelEstoqueFilial;
    }
}

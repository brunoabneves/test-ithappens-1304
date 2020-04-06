/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import model.ModelProduto;

/**
 *
 * @author bruno
 */
public class DaoProduto extends ConexaoSQLite {

    /**
     * Cadastrar um produto no banco
     *
     * @param modelProduto
     * @return
     */
    public int cadastrarProdutoDAO(ModelProduto modelProduto) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO produto (codBarras, descricao, valor) VALUES ("
                    + "'" + modelProduto.getCodBarras() + "',"
                    + "'" + modelProduto.getDescricao() + "',"
                    + "'" + modelProduto.getValor() + "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }

    /**
     * Excluir um produto do banco
     *
     * @param idProduto
     * @return boolean
     */
    public boolean excluirProdutoDAO(int idProduto) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("DELETE FROM produto WHERE "
                    + "produto.idProduto = '" + idProduto + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

    /**
     * Atualiza um produto no banco
     *
     * @param modelProduto
     * @return bool
     */
    public boolean atualizarProdutoDAO(ModelProduto modelProduto) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE produto SET "
                    + "codBarras = '" + modelProduto.getCodBarras() + "',"
                    + "descricao = '" + modelProduto.getDescricao() + "',"
                    + "valor = '" + modelProduto.getValor() + "'"
                    + "WHERE idProduto = '" + modelProduto.getIdProduto() + "'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

    /**
     * Retorna um produto pelo codigo
     *
     * @param idProduto
     * @return modelProduto
     */
    public ModelProduto retornarProdutoDAO(int idProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM produto WHERE idProduto = "
                    + "'" + idProduto + "'");

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setCodBarras(this.getResultSet().getString(2));
                modelProduto.setDescricao(this.getResultSet().getString(3));
                modelProduto.setValor(this.getResultSet().getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelProduto;
    }
    
    /**
     * Retorna um produto pelo codigo
     *
     * @param pDescProduto
     * @return modelProduto
     */
    public ModelProduto retornarProdutoDAO(String pDescProduto) {
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM produto WHERE descricao = "
                    + "'" + pDescProduto + "'");

            while (this.getResultSet().next()) {
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setCodBarras(this.getResultSet().getString(2));
                modelProduto.setDescricao(this.getResultSet().getString(3));
                modelProduto.setValor(this.getResultSet().getDouble(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelProduto;
    }

    /**
     * Retorna uma lista completa de produtos
     * @return listaModelProduto
     */
    public ArrayList<ModelProduto> retornaListaProdutosDAO(){
        ArrayList<ModelProduto> listaModelProduto = new ArrayList<>();
        ModelProduto modelProduto = new ModelProduto();
        
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM produto");
            
            while (this.getResultSet().next()) {
                modelProduto = new ModelProduto();
                
                modelProduto.setIdProduto(this.getResultSet().getInt(1));
                modelProduto.setCodBarras(this.getResultSet().getString(2));
                modelProduto.setDescricao(this.getResultSet().getString(3));
                modelProduto.setValor(this.getResultSet().getDouble(4));
                
                listaModelProduto.add(modelProduto);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelProduto;
    }
    
    
}

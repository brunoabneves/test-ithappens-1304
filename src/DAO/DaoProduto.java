/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import conexoes.ConexaoSQLite;
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
            return this.insertSQL("INSERT INTO produto VALUES ("
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
    public boolean alterarProdutoDAO(ModelProduto modelProduto) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE produto SET"
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

}

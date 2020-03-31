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
public class DaoProduto extends ConexaoSQLite{
    
    public int cadastrarProdutoDAO(ModelProduto modelProduto){
        try{
            this.conecta();
            return this.insertSQL("INSERT INTO produto VALUES ("
                    + "'"+modelProduto.getIdProduto()+"',"
                    + "'"+modelProduto.getCodBarras()+"',"
                    + "'"+modelProduto.getDescricao()+"',"
                    + "'"+modelProduto.getValor()+"')"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.desconecta();
        }
    }
}

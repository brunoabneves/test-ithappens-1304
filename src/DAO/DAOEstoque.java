package DAO;

import model.ModelEstoque;
import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.ModelEstoque;
/**
*
* @author bruno
*/
public class DAOEstoque extends ConexaoSQLite {
   
    /**
     * Cadastrar um estoque no banco
     *
     * @param modelEstoque
     * @return
     */
    public int cadastrarEstoqueDAO(ModelEstoque modelEstoque) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO estoque (quantidade, idProduto, idFilial) VALUES ("
                    + "'" +modelEstoque.getQuantidade()+ "',"
                    + "'" +modelEstoque.getIdProduto()+"',"
                    + "'" +modelEstoque.getIdFilial()+"')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Retorna um estoque pelo codigo
     *
     * @param idEstoque
     * @return modelEstoque
     */
    public ModelEstoque retornarEstoqueDAO(int idEstoque) {
        ModelEstoque modelEstoque = new ModelEstoque();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM estoque WHERE idEstoque = "
                    + "'" + idEstoque + "'");

            while (this.getResultSet().next()) {
                modelEstoque.setIdEstoque(this.getResultSet().getInt(1));
                modelEstoque.setQuantidade(this.getResultSet().getInt(2));
                modelEstoque.setIdProduto(this.getResultSet().getInt(3));
                modelEstoque.setIdFilial(this.getResultSet().getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelEstoque;
    }
       
    /**
     * Retorna um estoque pelo codigo
     *
     * @param idEstoque
     * @return modelEstoque
     */
    public ModelEstoque retornarEstoquePorFilialDAO(int idEstoque) {
        ModelEstoque modelEstoque = new ModelEstoque();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM estoque WHERE idFilial = "
                    + "'" + idEstoque + "'");

            while (this.getResultSet().next()) {
                modelEstoque.setIdEstoque(this.getResultSet().getInt(1));
                modelEstoque.setQuantidade(this.getResultSet().getInt(2));
                modelEstoque.setIdProduto(this.getResultSet().getInt(3));
                modelEstoque.setIdFilial(this.getResultSet().getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelEstoque;
    }

    /**
     * Retorna uma lista completa de estoques
     * @return listaModelEstoque
     */
    public ArrayList<ModelEstoque> retornaListaEstoquesDAO(){
        ArrayList<ModelEstoque> listaModelEstoque = new ArrayList<>();
        ModelEstoque modelEstoque = new ModelEstoque();
        
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM estoque");
            
            while (this.getResultSet().next()) {
                modelEstoque = new ModelEstoque();
                
                modelEstoque.setIdEstoque(this.getResultSet().getInt(1));
                modelEstoque.setQuantidade(this.getResultSet().getInt(2));
                modelEstoque.setIdProduto(this.getResultSet().getInt(3));
                modelEstoque.setIdFilial(this.getResultSet().getInt(4));
                
                listaModelEstoque.add(modelEstoque);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelEstoque;
    }

   /**
     * Atualiza um estoque no banco
     *
     * @param modelEstoque
     * @return bool
     */
    public boolean atualizarEstoqueDAO(ModelEstoque modelEstoque) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE estoque SET "
                    + "quantidade = '" + modelEstoque.getQuantidade()+ "',"
                    + "idProduto = '"+modelEstoque.getIdProduto()+","
                    + "idFilial = '"+modelEstoque.getIdFilial()+"' "
                    + "WHERE idEstoque = '"+modelEstoque.getIdEstoque()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }
    
      /**
     * Excluir um estoque do banco
     *
     * @param idEstoque
     * @return boolean
     */
    public boolean excluirEstoqueDAO(int idEstoque) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("DELETE FROM estoque WHERE "
                    + "estoque.idEstoque = '" + idEstoque + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Altera um dado do estoque
     * @param listaModelEstoque
     * @return 
     */
    public boolean atualizarDadoEstoqueDAO(ArrayList<ModelEstoque> listaModelEstoque) {
        try {
            this.conecta();
            for (int i = 0; i < listaModelEstoque.size(); i++) {
                this.executarUpdateDeleteSQL("UPDATE estoque SET "
                    + "quantidade = '" + listaModelEstoque.get(i).getQuantidade()+ "'"
                    + "WHERE idEstoque = '"+listaModelEstoque.get(i).getIdEstoque()+"'"
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

    public ModelEstoque getEstoquePorProdutoControllerDAO(int idProduto) {
        ModelEstoque modelEstoque = new ModelEstoque();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM estoque WHERE estoque.idProduto = "
                    + "'" + idProduto + "'");

            while (this.getResultSet().next()) {
                modelEstoque.setIdEstoque(this.getResultSet().getInt(1));
                modelEstoque.setQuantidade(this.getResultSet().getInt(2));
                modelEstoque.setIdProduto(this.getResultSet().getInt(3));
                modelEstoque.setIdFilial(this.getResultSet().getInt(4));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelEstoque;
    }

}
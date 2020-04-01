package DAO;

import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import model.ModelFilial;
/**
*
* @author bruno
*/
public class DAOFilial extends ConexaoSQLite {

   /**
    * grava filial
    * @param pModelFilial
    * @return int
    */
    /**
     * Cadastrar uma filial no banco
     *
     * @param modelFilial
     * @return
     */
    public int cadastrarFilialDAO(ModelFilial modelFilial) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO filial (nome) VALUES ("
                    + "'" + modelFilial.getNome()+ "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Retorna uma filial pelo codigo
     *
     * @param idFilial
     * @return modelFilial
     */
    public ModelFilial retornarFilialDAO(int idFilial) {
        ModelFilial modelFilial = new ModelFilial();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM filial WHERE idFilial = "
                    + "'" + idFilial + "'");

            while (this.getResultSet().next()) {
                modelFilial.setIdFilial(this.getResultSet().getInt(1));
                modelFilial.setNome(this.getResultSet().getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelFilial;
    }

    /**
     * Retorna uma lista completa de filials
     * @return listaModelProduto
     */
    public ArrayList<ModelFilial> retornaListaFilialsDAO(){
        ArrayList<ModelFilial> listaModelFilial = new ArrayList<>();
        ModelFilial modelfilial = new ModelFilial();
        
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM filial");
            
            while (this.getResultSet().next()) {
                modelfilial = new ModelFilial();
                
                modelfilial.setIdFilial(this.getResultSet().getInt(1));
                modelfilial.setNome(this.getResultSet().getString(2));
                
                listaModelFilial.add(modelfilial);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelFilial;
    }

   /**
     * Atualiza uma filial no banco
     *
     * @param modelFilial
     * @return bool
     */
    public boolean atualizarFilialDAO(ModelFilial modelFilial) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE filial SET "
                    + "nome = '" + modelFilial.getNome() + "'"
                    + "WHERE idFilial = '"+modelFilial.getIdFilial()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }
    
      /**
     * Excluir uma filial do banco
     *
     * @param idFilial
     * @return boolean
     */
    public boolean excluirFilialDAO(int idFilial) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("DELETE FROM filial WHERE "
                    + "filial.idFilial = '" + idFilial + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

}
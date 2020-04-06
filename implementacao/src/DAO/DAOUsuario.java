package DAO;

import model.ModelUsuario;
import conexoes.ConexaoSQLite;
import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import model.ModelUsuario;
/**
*
* @author bruno
*/
public class DAOUsuario extends ConexaoSQLite {

    /**
    * grava usuario
    * @param pModelUsuario
    * @return int
    */
    /**
     * Cadastrar um usuario no banco
     *
     * @param modelUsuario
     * @return
     */
    public int cadastrarUsuarioDAO(ModelUsuario modelUsuario) {
        try {
            this.conecta();
            return this.insertSQL("INSERT INTO usuario (nome) VALUES ("
                    + "'" + modelUsuario.getNome()+ "')"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        } finally {
            this.desconecta();
        }
    }
    
    /**
     * Retorna um usuario pelo codigo
     *
     * @param idUsuario
     * @return modelUsuario
     */
    public ModelUsuario retornarUsuarioDAO(int idUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM usuario WHERE idUsuario = "
                    + "'" + idUsuario + "'");

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelUsuario;
    }
    
    /**
     * Retorna um usuario pelo nome
     *
     * @param idUsuario
     * @return modelUsuario
     */
    public ModelUsuario retornarUsuarioDAO(String pNomeUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM usuario WHERE nome = "
                    + "'" + pNomeUsuario + "'");

            while (this.getResultSet().next()) {
                modelUsuario.setIdUsuario(this.getResultSet().getInt(1));
                modelUsuario.setNome(this.getResultSet().getString(2));
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.desconecta();
        }
        return modelUsuario;
    }

    /**
     * Retorna uma lista completa de usuarios
     * @return listaModelProduto
     */
    public ArrayList<ModelUsuario> retornaListaUsuariosDAO(){
        ArrayList<ModelUsuario> listaModelUsuario = new ArrayList<>();
        ModelUsuario modelusuario = new ModelUsuario();
        
        try {
            this.conecta();
            this.executarSQL("SELECT * FROM usuario");
            
            while (this.getResultSet().next()) {
                modelusuario = new ModelUsuario();
                
                modelusuario.setIdUsuario(this.getResultSet().getInt(1));
                modelusuario.setNome(this.getResultSet().getString(2));
                
                listaModelUsuario.add(modelusuario);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            this.desconecta();
        }
        return listaModelUsuario;
    }

   /**
     * Atualiza um usuario no banco
     *
     * @param modelUsuario
     * @return bool
     */
    public boolean atualizarUsuarioDAO(ModelUsuario modelUsuario) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("UPDATE usuario SET "
                    + "nome = '" + modelUsuario.getNome() + "'"
                    + "WHERE idUsuario = '"+modelUsuario.getIdUsuario()+"'"
            );
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }
    
      /**
     * Excluir um usuario do banco
     *
     * @param idUsuario
     * @return boolean
     */
    public boolean excluirUsuarioDAO(int idUsuario) {
        try {
            this.conecta();
            return this.executarUpdateDeleteSQL("DELETE FROM usuario WHERE "
                    + "usuario.idUsuario = '" + idUsuario + "'");
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            this.desconecta();
        }
    }

}
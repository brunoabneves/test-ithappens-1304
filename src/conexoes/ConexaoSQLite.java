/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conexoes;

import java.sql.*;

/**
 *
 * @author bruno
 */
public class ConexaoSQLite {
    private Connection conexao;
    public Statement statement;
    public ResultSet resultSet;
    public PreparedStatement prep;
        
  public void conecta() throws Exception {
    Class.forName("org.sqlite.JDBC");
        setConexao(DriverManager.getConnection("jdbc:sqlite:DataBase.db"));
    statement = getConexao().createStatement();
        getConexao().setAutoCommit(false);
        getConexao().setAutoCommit(true);

  }
  
  public void exec(String sql) throws Exception {
   resultSet = statement.executeQuery(sql);
  }
  
  public void desconecta(){
    boolean result = true;
    
    try{
            getConexao().close();
        System.out.println("banco fechado");
    }
    catch(SQLException fecha)
    {
        System.out.println("Não foi possivel "+
                "fechar o banco de dados: "+fecha);
        result = false;
    }
  }
  
  public boolean executarSQL(String pSQL){
      try{
          this.setStatement(getConexao().createStatement());
          
          this.setResultSet(getStatement().executeQuery(pSQL));
      }catch (SQLException ex) {
          ex.printStackTrace();
          return false;
      }
      return true;
  }
  
  public boolean executarUpdateDeleteSQL(String pSQL){
      try {      
          //createStatement de con para criar o Statement
          this.setStatement(getConexao().createStatement());
          // Definido o Statement, executamos a query no banco de dados
          getStatement().executeUpdate(pSQL);
            
      } catch (SQLException ex) {
          ex.printStackTrace();
          return false;
      }
      return true;
  }
  
    /**
     * Executa insert SQL
     * @param pSQL
     * @return boolean
     */
    public int insertSQL(String pSQL){
        int status = 0;
        try {
            //createStatement de con para criar o Statement
            this.setStatement(getConexao().createStatement());

            // Definido o Statement, executamos a query no banco de dados
            this.getStatement().executeUpdate(pSQL);
            
            //consulta o ultimo id inserido
            this.setResultSet(this.getStatement().executeQuery("SELECT last_insert_id();"));
            
            //recupera o ultimo id inserido
            while(this.resultSet.next()){
                status = this.resultSet.getInt(1);
            }
            
            //retorna o ultimo id inserido
            return status;
        } catch (SQLException ex) {
            ex.printStackTrace();
            return status;
        }
    }

    /**
     * @return the statement
     */
    public Statement getStatement() {
        return statement;
    }

    /**
     * @return the resultSet
     */
    public ResultSet getResultSet() {
        return resultSet;
    }

    /**
     * @param statement the statement to set
     */
    public void setStatement(Statement statement) {
        this.statement = statement;
    }

    /**
     * @param resultSet the resultSet to set
     */
    public void setResultSet(ResultSet resultSet) {
        this.resultSet = resultSet;
    }

    /**
     * @return the conexao
     */
    public Connection getConexao() {
        return conexao;
    }

    /**
     * @param conexao the conexao to set
     */
    public void setConexao(Connection conexao) {
        this.conexao = conexao;
    }
}

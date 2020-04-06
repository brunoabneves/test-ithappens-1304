package model;
/**
*
* @author bruno
*/
public class ModelFilial {

    private int idFilial;
    private String nome;

    /**
    * Construtor
    */
    public ModelFilial(){}

    /**
    * seta o valor de idFilial
    * @param pIdFilial
    */
    public void setIdFilial(int pIdFilial){
        this.idFilial = pIdFilial;
    }
    /**
    * @return pk_idFilial
    */
    public int getIdFilial(){
        return this.idFilial;
    }

    /**
    * seta o valor de nome
    * @param pNome
    */
    public void setNome(String pNome){
        this.nome = pNome;
    }
    /**
    * @return nome
    */
    public String getNome(){
        return this.nome;
    }

    @Override
    public String toString(){
        return "ModelFilial {" + "::idFilial = " + this.idFilial + "::nome = " + this.nome +  "}";
    }
}
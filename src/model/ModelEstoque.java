package model;
/**
*
* @author bruno
*/
public class ModelEstoque {

    private int idEstoque;
    private int quantidade;
    private int idProduto;
    private int idFilial;

    /**
    * Construtor
    */
    public ModelEstoque(){}

    /**
    * seta o valor de idEstoque
    * @param pIdEstoque
    */
    public void setIdEstoque(int pIdEstoque){
        this.idEstoque = pIdEstoque;
    }
    /**
    * @return pk_idEstoque
    */
    public int getIdEstoque(){
        return this.idEstoque;
    }

    /**
    * seta o valor de quantidade
    * @param pQuantidade
    */
    public void setQuantidade(int pQuantidade){
        this.quantidade = pQuantidade;
    }
    /**
    * @return quantidade
    */
    public int getQuantidade(){
        return this.quantidade;
    }

    /**
    * seta o valor de idProduto
    * @param pIdProduto
    */
    public void setIdProduto(int pIdProduto){
        this.idProduto = pIdProduto;
    }
    /**
    * @return fk_idProduto
    */
    public int getIdProduto(){
        return this.idProduto;
    }

    /**
    * seta o valor de idFilial
    * @param pIdFilial
    */
    public void setIdFilial(int pIdFilial){
        this.idFilial = pIdFilial;
    }
    /**
    * @return fk_idFilial
    */
    public int getIdFilial(){
        return this.idFilial;
    }

    @Override
    public String toString(){
        return "ModelEstoque {" + "::idEstoque = " + this.idEstoque + "::quantidade = " + this.quantidade + "::idProduto = " + this.idProduto + "::idFilial = " + this.idFilial +  "}";
    }
}
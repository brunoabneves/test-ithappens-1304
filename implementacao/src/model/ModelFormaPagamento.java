package model;
/**
*
* @author bruno
*/
public class ModelFormaPagamento {

    private int idFormaPagamento;
    private String tipoPagamento;

    /**
    * Construtor
    */
    public ModelFormaPagamento(){}

    /**
    * seta o valor de idFormaPagamento
    * @param pIdFormaPagamento
    */
    public void setIdFormaPagamento(int pIdFormaPagamento){
        this.idFormaPagamento = pIdFormaPagamento;
    }
    /**
    * @return pk_idFormaPagamento
    */
    public int getIdFormaPagamento(){
        return this.idFormaPagamento;
    }

    /**
    * seta o valor de tipoPagamento
    * @param pTipoPagamento
    */
    public void setTipoPagamento(String pTipoPagamento){
        this.tipoPagamento = pTipoPagamento;
    }
    /**
    * @return tipoPagamento
    */
    public String getTipoPagamento(){
        return this.tipoPagamento;
    }

    @Override
    public String toString(){
        return "ModelFormaPagamento {" + "::idFormaPagamento = " + this.idFormaPagamento + "::tipoPagamento = " + this.tipoPagamento +  "}";
    }
}
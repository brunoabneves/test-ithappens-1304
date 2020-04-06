package model;
/**
*
* @author bruno
*/
public class ModelItemPedido {

    private String status;
    private int quantidade;
    private double valorUnitario;
    private double valorTotal;
    private int idFormaPagamento;
    private int idProduto;
    private int idPedidoEstoque;

    /**
    * Construtor
    */
    public ModelItemPedido(){}

    /**
    * seta o valor de status
    * @param pStatus
    */
    public void setStatus(String pStatus){
        this.status = pStatus;
    }
    /**
    * @return status
    */
    public String getStatus(){
        return this.status;
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
    * seta o valor de valorUnitario
    * @param pValorUnitario
    */
    public void setValorUnitario(double pValorUnitario){
        this.valorUnitario = pValorUnitario;
    }
    /**
    * @return valorUnitario
    */
    public double getValorUnitario(){
        return this.valorUnitario;
    }

    /**
    * seta o valor de valorTotal
    * @param pValorTotal
    */
    public void setValorTotal(double pValorTotal){
        this.valorTotal = pValorTotal;
    }
    /**
    * @return valorTotal
    */
    public double getValorTotal(){
        return this.valorTotal;
    }

    /**
    * seta o valor de idFormaPagamento
    * @param pIdFormaPagamento
    */
    public void setIdFormaPagamento(int pIdFormaPagamento){
        this.idFormaPagamento = pIdFormaPagamento;
    }
    /**
    * @return fk_idFormaPagamento
    */
    public int getIdFormaPagamento(){
        return this.idFormaPagamento;
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
    * seta o valor de idPedidoEstoque
    * @param pIdPedidoEstoque
    */
    public void setIdPedidoEstoque(int pIdPedidoEstoque){
        this.idPedidoEstoque = pIdPedidoEstoque;
    }
    /**
    * @return fk_idPedidoEstoque
    */
    public int getIdPedidoEstoque(){
        return this.idPedidoEstoque;
    }

    @Override
    public String toString(){
        return "ModelItemPedido {" + "::status = " + this.status + "::quantidade = " + this.quantidade + "::valorUnitario = " + this.valorUnitario + "::valorTotal = " + this.valorTotal + "::idFormaPagamento = " + this.idFormaPagamento + "::idProduto = " + this.idProduto + "::idPedidoEstoque = " + this.idPedidoEstoque +  "}";
    }
}
package model;

import java.util.ArrayList;

/**
*
* @author bruno
*/
public class ModelPedidoEstoque {

    private int idPedidoEstoque;
    private String tipo;
    private int idUsuario;
    private int idCliente;
    private int idFilial;
    private String observacao;
    
    private ArrayList<ModelPedidoEstoque> listaModelPedidoEstoque;

    /**
    * Construtor
    */
    public ModelPedidoEstoque(){}

    /**
     * @return the idPedidoEstoque
     */
    public int getIdPedidoEstoque() {
        return idPedidoEstoque;
    }

    /**
     * @param idPedidoEstoque the idPedidoEstoque to set
     */
    public void setIdPedidoEstoque(int idPedidoEstoque) {
        this.idPedidoEstoque = idPedidoEstoque;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the observacao
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * @param observacao the observacao to set
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * @return the listaModelPedidoEstoque
     */
    public ArrayList<ModelPedidoEstoque> getListaModelPedidoEstoque() {
        return listaModelPedidoEstoque;
    }

    /**
     * @param listaModelPedidoEstoque the listaModelPedidoEstoque to set
     */
    public void setListaModelPedidoEstoque(ArrayList<ModelPedidoEstoque> listaModelPedidoEstoque) {
        this.listaModelPedidoEstoque = listaModelPedidoEstoque;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the idCliente
     */
    public int getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the idFilial
     */
    public int getIdFilial() {
        return idFilial;
    }

    /**
     * @param idFilial the idFilial to set
     */
    public void setIdFilial(int idFilial) {
        this.idFilial = idFilial;
    }
    
    /**@Override
    public String toString(){
        return "ModelPedidoEstoque {" + "::idPedidoEstoque = " + this.getIdPedidoEstoque() + "::tipo = " + this.getTipo() + "::idUsuario = " + this.getIdUsuario() + "::idCliente = " + this.getIdCliente() + "::idFilial = " + this.getIdFilial() + "::observacao = " + this.getObservacao() +  "}";
    }**/
}
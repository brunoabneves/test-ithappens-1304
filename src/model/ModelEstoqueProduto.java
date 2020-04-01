/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class ModelEstoqueProduto {
    
    private ModelEstoque modelEstoque;
    private ModelProduto modelProduto;
    private ArrayList<ModelEstoqueProduto> listaModelEstoqueProduto;

    /**
     * @return the modelEstoque
     */
    public ModelEstoque getModelEstoque() {
        return modelEstoque;
    }

    /**
     * @param modelEstoque the modelEstoque to set
     */
    public void setModelEstoque(ModelEstoque modelEstoque) {
        this.modelEstoque = modelEstoque;
    }

    /**
     * @return the modelProduto
     */
    public ModelProduto getModelProduto() {
        return modelProduto;
    }

    /**
     * @param modelProduto the modelProduto to set
     */
    public void setModelProduto(ModelProduto modelProduto) {
        this.modelProduto = modelProduto;
    }

    /**
     * @return the listaModelEstoqueProduto
     */
    public ArrayList<ModelEstoqueProduto> getListaModelEstoqueProduto() {
        return listaModelEstoqueProduto;
    }

    /**
     * @param listaModelEstoqueProduto the listaModelEstoqueProduto to set
     */
    public void setListaModelEstoqueProduto(ArrayList<ModelEstoqueProduto> listaModelEstoqueProduto) {
        this.listaModelEstoqueProduto = listaModelEstoqueProduto;
    }
    
}

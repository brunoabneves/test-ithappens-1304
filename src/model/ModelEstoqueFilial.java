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
public class ModelEstoqueFilial {
    
    private ModelEstoque modelEstoque;
    private ModelFilial modelFilial;
    private ArrayList<ModelEstoqueFilial> listaModelEstoqueFilial;

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
     * @return the modelFilial
     */
    public ModelFilial getModelFilial() {
        return modelFilial;
    }

    /**
     * @param modelFilial the modelFilial to set
     */
    public void setModelFilial(ModelFilial modelFilial) {
        this.modelFilial = modelFilial;
    }

    /**
     * @return the listaModelEstoqueFilial
     */
    public ArrayList<ModelEstoqueFilial> getListaModelEstoqueFilial() {
        return listaModelEstoqueFilial;
    }

    /**
     * @param listaModelEstoqueFilial the listaModelEstoqueFilial to set
     */
    public void setListaModelEstoqueFilial(ArrayList<ModelEstoqueFilial> listaModelEstoqueFilial) {
        this.listaModelEstoqueFilial = listaModelEstoqueFilial;
    }
}

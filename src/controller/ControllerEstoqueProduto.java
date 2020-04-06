/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.DAOEstoqueProduto;
import java.util.ArrayList;
import model.ModelEstoqueProduto;

/**
 *
 * @author bruno
 */
public class ControllerEstoqueProduto {
    
    private DAOEstoqueProduto DaoEstoqueProduto = new DAOEstoqueProduto();
    
    public ArrayList<ModelEstoqueProduto> getListaEstoqueProdutoController() {
        return this.DaoEstoqueProduto.retornaListaEstoqueProdutosDAO();
    }
    
}

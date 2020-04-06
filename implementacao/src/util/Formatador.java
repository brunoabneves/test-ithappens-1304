/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

/**
 *
 * @author bruno
 */
public class Formatador {
    /**
     * converte a virgula de uma string para ponto
     * @param string
     * @return double
     */
    public double converteVirgulaParaPonto(String string){
        String retorno = new String();
        int tamanhoString = string.length();
        for (int i = 0; i < tamanhoString; i++) {
            if(string.charAt(i) == ','){
                retorno += '.';
            }else{
                retorno += string.charAt(i);
            }
        }
        return Double.parseDouble(retorno);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 * Classe que executa as funções das regras de negócios.
 * @author Douglas.Collioni
 */
public class CalcModel {

    private int numero1;
    private int numero2;
    private int resultado;
    
    public CalcModel() {
    }
    
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
    
    public int getResultado() {
        return this.resultado;
    }
    
    /**
     * Soma os valores do numero1 e numero2 e retorna esse valor para o resultado.
     */
    public void somar() {
        this.resultado = this.numero1 + this.numero2;
    }
    
    /**
     * Atualiza o numero1, numero2 e resultado para zero.
     */
    public void limpar() {
        this.numero1 = this.numero2 = this.resultado = 0;
    }
}

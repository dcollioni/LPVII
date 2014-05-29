/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

/**
 *
 * @author Professor
 */
public class ContaModel {
    private String tipo;
    private boolean cartaoCredito;
    private boolean seguroCartao;
    private boolean talaoCheques;

    public boolean isCartaoCredito() {
        return cartaoCredito;
    }

    public void setCartaoCredito(boolean cartaoCredito) {
        this.cartaoCredito = cartaoCredito;
    }

    public boolean isSeguroCartao() {
        return seguroCartao;
    }

    public void setSeguroCartao(boolean seguroCartao) {
        this.seguroCartao = seguroCartao;
    }

    public boolean isTalaoCheques() {
        return talaoCheques;
    }

    public void setTalaoCheques(boolean talaoCheques) {
        this.talaoCheques = talaoCheques;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String cartao, seguro, talao;
        
        cartao = cartaoCredito ? "Sim" : "Não";
        seguro = seguroCartao ? "Sim" : "Não";
        talao = talaoCheques ? "Sim" : "Não";
        
        return "ContaModel{" +
                "tipo=" + tipo +
                ", cartaoCredito=" + cartao +
                ", seguroCartao=" + seguro +
                ", talaoCheques=" + talao + '}';
    }
}

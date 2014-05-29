/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;

/**
 *
 * @author Professor
 */
public class QuizModel {
    private String[] GABARITO = { "B", "C", "B" };
    private ArrayList respostas;
    private int respostasCertas;

    public int getRespostasCertas() {
        return respostasCertas;
    }

    public void setRespostasCertas(int respostasCertas) {
        this.respostasCertas = respostasCertas;
    }

    public ArrayList getRespostas() {
        return respostas;
    }

    public void setRespostas(ArrayList respostas) {
        this.respostas = respostas;
    }
    
    public void calcularResultado() {
        respostasCertas = 0;
        
        for (int i = 0; i < respostas.size(); i++) {
            if (respostas.get(i) == GABARITO[i]) {
                respostasCertas++;
            }
        }
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.*;
import view.*;

/**
 * Classe que controla os eventos da view.
 * @author Douglas.Collioni
 */
public class CalcController {
    
    private final CalcModel model;
    private final CalcView  view;
    
    /**
     * 
     * @param model
     * @param view 
     */
    public CalcController(CalcModel model, CalcView view) {
        this.model = model;
        this.view  = view;
        
        this.view.adicionarBotaoSomarListener(new SomarListener());
        this.view.adicionarBotaoLimparListener(new LimparListener());
        
        model.limpar();
        view.atualizarView();
    }
    
    /**
     * Sub-classe que trata o evento clique do botão somar.
     * Atualiza a model com os valores da view,
     * executa o método somar da model,
     * e atualiza a view com os valores da model.
     */
    class SomarListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            view.atualizarModel();
            model.somar();
            view.atualizarView();
        }
    } // fecha classe SomarListener
    
    /**
     * Sub-classe que trata o evento clique do botão limpar.
     * Executa o método limpar da model,
     * e atualiza a view com os valores da model.
     */
    class LimparListener implements ActionListener {
        
        @Override
        public void actionPerformed(ActionEvent e) {
            
            model.limpar();
            view.atualizarView();
        }
    } // fecha classe LimparListener
}

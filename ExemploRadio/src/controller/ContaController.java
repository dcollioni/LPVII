/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.ContaModel;
import view.ContaView;

/**
 *
 * @author Professor
 */
public class ContaController {
    private final ContaModel model;
    private final ContaView view;
    
    public ContaController(ContaModel model,
                           ContaView view) {
        this.model = model;
        this.view = view;
        
        view.adicionarBotaoOKListener(new OkListener());
    } // fecha ContaController
    
    class OkListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            view.atualizarModel();
            view.mostrarMensagem();
        } // fecha actionPerformed
        
    } // fecha OkListener
}

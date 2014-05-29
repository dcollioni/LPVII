/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploradio;

import controller.ContaController;
import model.ContaModel;
import view.ContaView;

/**
 *
 * @author Professor
 */
public class ExemploRadio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaModel model = new ContaModel();
        
        ContaView view = new ContaView(model);
        view.setVisible(true);
        
        ContaController controller = new ContaController(model, view);
    }
    
}

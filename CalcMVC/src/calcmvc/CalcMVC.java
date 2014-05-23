/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcmvc;

import controller.*;
import model.*;
import view.*;

/**
 * Classe que inicializa as variáveis da aplicação
 * @author Douglas.Collioni
 */
public class CalcMVC {
    
    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        CalcView view = new CalcView(model);
        CalcController controller = new CalcController(model, view);
        
        view.setVisible(true);
    }
}

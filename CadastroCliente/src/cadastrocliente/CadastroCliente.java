/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cadastrocliente;

/**
 *
 * @author Professor
 */
public class CadastroCliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Cria a janela de cadastro.
        CadastroClienteView view = new
            CadastroClienteView();
        
        // Mostra a janela
        view.setVisible(true);
    }
    
}

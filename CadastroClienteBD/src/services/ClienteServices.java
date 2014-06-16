/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package services;

import dao.ClienteDao;
import dao.DaoFactory;
import java.sql.SQLException;
import model.Cliente;

/**
 *
 * @author Professor
 */
public class ClienteServices {
    
    public void inserirCliente(Cliente c)
            throws SQLException {
        
        // Pega o objeto ClienteDao da factory
        ClienteDao clienteDao = 
                DaoFactory.getClienteDao();
        /*
            Aqui teríamos que validar o objeto
            cliente e todas as suas propriedades.
        */
        clienteDao.inserirCliente(c);
        
    } // fecha método
} // fecha classe

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

/**
 *
 * @author Professor
 */
public class DaoFactory {
    
    private static ClienteDao clienteDao =
            new ClienteDao();

    public static ClienteDao getClienteDao() {
        return clienteDao;
    } // fecha método
    
} // fecha classe

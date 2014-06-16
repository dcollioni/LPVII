/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package persistence;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Professor
 */
public class ConexaoBanco {
    private static String URL = "jdbc:mysql://localhost:3306/aula9?zeroDateTimeBehavior=convertToNull";
    private static String USUARIO = "root";
    private static String SENHA = "123456";
    
    // Método que efetua a conexão com o MySQL
    public static Connection getConexao()
            throws SQLException {
        
        Connection c = null;
        
        try {
            c = DriverManager.getConnection(URL, USUARIO, SENHA);
        }
        catch (SQLException e) {
            throw new SQLException(
               "Erro ao conectar: " + 
               e.getMessage()
            );
        } // fecha catch
        
        return c;
    } // fecha método
} // fecha classe

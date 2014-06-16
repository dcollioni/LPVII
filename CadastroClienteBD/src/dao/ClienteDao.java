/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import model.Cliente;
import persistence.ConexaoBanco;

/**
 *
 * @author Professor
 */
public class ClienteDao {
    
    // Método que insere um cliente
    public void inserirCliente(Cliente c)
            throws SQLException {
        
        // Buscando conexão com o banco
        Connection con = ConexaoBanco.getConexao();
        
        // Criando objeto que executa SQL
        Statement stat = con.createStatement();
        
        try {
            // String que conterá o SQL
            String sql;
            
            // Montando o comando SQL
            sql = "insert into cliente (nome, cidade)" +
                    " values ('"+ c.getNome() +"', '"+ c.getCidade() +"') ";
            
            // Executando o SQL
            stat.execute(sql);
        } // fecha try
        catch (SQLException e) {
            throw new SQLException(
                "Erro ao inserir cliente: " + e.getMessage()
            );
        } // fecha catch
        finally {
            // O finally sempre será executado
            // mesmo que caia no catch.
            
            // Fechando a conexão
            con.close();
            
            // Fechando o comando
            stat.close();
            
        } // fecha finally
        
    } // fecha método
    
} // fecha classe

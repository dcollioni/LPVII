/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
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
    
    // Método para buscar clientes no banco
    public ArrayList<Cliente> consultarClientes()
        throws SQLException {
        // Cria um array vazio de clientes
        ArrayList<Cliente> clientes = new
            ArrayList<>();
        
        // Buscando conexão com o banco
        Connection con = ConexaoBanco.getConexao();
        
        // Criando objeto que executa SQL
        Statement stat = con.createStatement();
        
        try {
            // Cria o comando select
            String sql = "select * from cliente";
            
            // Executa o comando sql
            // e retorna os resultados
            ResultSet resultados =
                    stat.executeQuery(sql);
            
            while (resultados.next()) {
                // Pega os dados da linha
                int codigo = resultados.getInt(1);
                String nome = resultados.getString(2);
                String cidade = resultados.getString(3);
                
                // Cria um objeto cliente com os dados
                Cliente c = new Cliente();
                c.setCodigo(codigo);
                c.setNome(nome);
                c.setCidade(cidade);
                
                // Adiciona no array
                clientes.add(c);
            }
        }
        catch (SQLException e) {
            throw new SQLException(
                "Erro ao consultar: " +
                e.getMessage()
            );
        }
        finally {
            con.close();
            stat.close();
        }
        
        return clientes;
    } // fecha método
    
} // fecha classe

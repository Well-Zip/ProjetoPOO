/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import connection.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.bean.Cliente;

/**
 *
 * @author artur
 */
public class ClienteDAO {
    public void create(Cliente c) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO clientes(nome,sobrenome,cpf_cnpj,telefone,endereco,numero,bairro,complemento,cidade,estado,cep) VALUES(?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobrenome());
            stmt.setString(3, c.getCpf_cnpj());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEndereco());
            stmt.setString(6, c.getNumero());
            stmt.setString(7, c.getBairro());
            stmt.setString(8, c.getComplemento());
            stmt.setString(9, c.getCidade());
            stmt.setString(10, c.getEstado());
            stmt.setString(11, c.getCep());
            
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Cliente> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes ORDER BY idcliente ASC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
                
                 
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
    
    //Buscar Com filtro
    
    public List<Cliente> readNome(String nome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE nome LIKE ?");
            stmt.setString(1, nome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
                
                
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
    
    public List<Cliente> readSobrenome(String sobrenome) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE sobrenome LIKE ?");
            stmt.setString(1, sobrenome+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
                
                
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

    }
    
    public List<Cliente> readCPF_CNPJ(String cpf_cnpj) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE cpf_cnpj LIKE ?");
            stmt.setString(1, cpf_cnpj+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                
                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
                
                
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

   

    }
    
    //BLOCO TESTE
    public List<Cliente> readonylID(int id) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Cliente> clientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM clientes WHERE idcliente = ?");
            stmt.setInt(1, id);
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Cliente cliente = new Cliente();
                
                

                cliente.setIdcliente(rs.getInt("idcliente"));
                cliente.setNome(rs.getString("nome"));
                cliente.setSobrenome(rs.getString("sobrenome"));
                cliente.setCpf_cnpj(rs.getString("cpf_cnpj"));
                cliente.setEndereco(rs.getString("telefone"));
                cliente.setEndereco(rs.getString("endereco"));
                cliente.setNumero(rs.getString("numero"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setComplemento(rs.getString("complemento"));
                
                cliente.setCidade(rs.getString("cidade"));
                cliente.setEstado(rs.getString("estado"));
                cliente.setCep(rs.getString("cep"));
                
                clientes.add(cliente);
            }

        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return clientes;

   

    }
   
    //FIM BLOCO
    
    public void update(Cliente c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
       
            stmt = con.prepareStatement("UPDATE clientes SET nome = ? ,sobrenome = ?,cpf_cnpj = ?,telefone = ?,endereco = ?,numero = ?,bairro = ?, complemento = ?,cidade = ?, estado = ?,  cep = ?  WHERE idcliente = ?");
            stmt.setString(1, c.getNome());
            stmt.setString(2, c.getSobrenome());
            stmt.setString(3, c.getCpf_cnpj());
            stmt.setString(4, c.getTelefone());
            stmt.setString(5, c.getEndereco());
            stmt.setString(6, c.getNumero());
            stmt.setString(7, c.getBairro());
            stmt.setString(8, c.getComplemento());
            stmt.setString(9, c.getCidade());
            stmt.setString(10,c.getEstado());
            stmt.setString(11, c.getCep());
            stmt.setInt(12, c.getIdcliente());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Cliente c) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM clientes WHERE idcliente = ?");
            stmt.setInt(1, c.getIdcliente());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    
}

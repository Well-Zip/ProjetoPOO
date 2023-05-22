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
import model.bean.Fornecedor;

public class FornecedorDAO {
     public void create(Fornecedor f) {
        
        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("INSERT INTO fornecedores (razao_social,nome_fantasia,cnpj,endereco,numero,bairro,complemento ,cidade ,estado,cep )VALUES(?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, f.getRazao_social());
            stmt.setString(2, f.getNome_fantasia());
            stmt.setString(3, f.getCnpj());
            stmt.setString(4, f.getEndereco());
            stmt.setString(5, f.getNumero ());
            stmt.setString(6, f.getBairro());
            stmt.setString(7, f.getComplemento());
            stmt.setString(8, f.getCidade());
            stmt.setString(9, f.getEstado());
            stmt.setString(10, f.getCep());
            
            
            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Salvo com sucesso!");
        } catch (SQLException ex) {
            System.out.println(ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }

    public List<Fornecedor> read() {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedores ORDER BY idfornecedor ASC");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(rs.getInt("idfornecedor"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                
                
                fornecedor.setCnpj(rs.getString("cnpj"));
                
                 
                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return fornecedores;

    }
    
    //Buscar Com filtro
    
    public List<Fornecedor> readRazaoSocial(String razaoS) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedores WHERE razao_social  LIKE ?");
            stmt.setString(1, razaoS+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(rs.getInt("idfornecedor"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return fornecedores;

    }
    
    public List<Fornecedor> readCNPJ(String cnpj) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedores WHERE cnpj LIKE ?");
            stmt.setString(1, cnpj+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(rs.getInt("idfornecedor"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return fornecedores;

    }
    
    public List<Fornecedor> readFantasia(String fantasia) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Fornecedor> fornecedores = new ArrayList<>();

        try {
            stmt = con.prepareStatement("SELECT * FROM fornecedores WHERE nome_fantasia LIKE ?");
            stmt.setString(1, fantasia+"%");
            
            rs = stmt.executeQuery();

            while (rs.next()) {

                Fornecedor fornecedor = new Fornecedor();

                fornecedor.setId(rs.getInt("idfornecedor"));
                fornecedor.setRazao_social(rs.getString("razao_social"));
                fornecedor.setNome_fantasia(rs.getString("nome_fantasia"));
                fornecedor.setCnpj(rs.getString("cnpj"));
                fornecedores.add(fornecedor);
            }

        } catch (SQLException ex) {
            Logger.getLogger(FornecedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return fornecedores;

    }
    
    public void update(Fornecedor f) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
       
            stmt = con.prepareStatement("UPDATE fornecedores SET razao_social = ? ,nome_fantasia = ?,cnpj = ?,endereco = ?,numero = ?,bairro = ?, complemento = ?,cidade = ?, estado = ?,  cep = ?  WHERE idfornecedor = ?");
            stmt.setString(1, f.getRazao_social());
            stmt.setString(2, f.getNome_fantasia());
            stmt.setString(3, f.getCnpj());
            stmt.setString(4, f.getEndereco());
            stmt.setString(5, f.getNumero());
            stmt.setString(6, f.getBairro());
            stmt.setString(7, f.getComplemento());
            stmt.setString(8, f.getCidade());
            stmt.setString(9, f.getEstado());
            stmt.setString(10, f.getCep());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
    public void delete(Fornecedor f) {

        Connection con = ConnectionFactory.getConnection();
        
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("DELETE FROM fornecedores WHERE idfornecedor = ?");
            stmt.setInt(1, f.getId());

            stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir: " + ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt);
        }

    }
}

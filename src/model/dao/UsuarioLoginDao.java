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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Samuelson
 */
public class UsuarioLoginDao {
    
    private String ADM;

    public String getADM() {
        return ADM;
    }

    public void setADM(String ADM) {
        this.ADM = ADM;
    }

    public boolean checkLogin(String login, String senha) {

        Connection con = ConnectionFactory.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        boolean check = false;

        try {

            stmt = con.prepareStatement("SELECT * FROM usuarios WHERE usuario = ? and senha = ?");
            stmt.setString(1, login);
            stmt.setString(2, senha);

            rs = stmt.executeQuery();

            if (rs.next()) {
                setADM(rs.getString("super"));

                
                check = true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioLoginDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConnectionFactory.closeConnection(con, stmt, rs);
        }

        return check;

    }}

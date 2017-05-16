/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.riskgmserverapi;

/**
 *
 * @author ASUS
 */

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserCRUD {
    
     public static boolean create(Connection conexion, User usuario) throws SQLException {
        try {
            
            PreparedStatement consulta;

            consulta = conexion.prepareStatement("INSERT INTO user (username, password, email) VALUES(?, ?, ?)");
            consulta.setString(1, usuario.getUsername());
            consulta.setString(2, usuario.getPassword());
            consulta.setString(3, usuario.getEmail());
            
            System.out.println(usuario.toString());
            consulta.executeUpdate();
            return true;
            
        } catch (SQLException ex) {
            throw new SQLException(ex);
        }
    }
    
}

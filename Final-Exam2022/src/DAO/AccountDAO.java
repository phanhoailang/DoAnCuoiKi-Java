/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Database.JDBCUtil;
import Model.Account;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ASUS
 */
public class AccountDAO {
    public AccountDAO(){
        
    }
    public static AccountDAO getInstance() {
        return new AccountDAO();
    }
    public Account findAccount(Account acc) {
        Connection conn = JDBCUtil.getConnection();
        String sql = "Select * from Account where [user name] = ?";
        try {
            PreparedStatement st = conn.prepareStatement(sql);
            st.setString(1, acc.getUserName());
            ResultSet rs = st.executeQuery();
            while(rs.next()) {
                String userName = rs.getString("user name");
                String password = rs.getString("password");
                return new Account(userName, password);
            }
            return null;
        } catch (SQLException ex) {
            return null;
        } finally {
            JDBCUtil.closeConnection(conn);
        }
        
        
    }

    
}
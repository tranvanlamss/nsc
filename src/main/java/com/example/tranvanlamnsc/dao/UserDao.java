package com.example.tranvanlamnsc.dao;

import com.example.tranvanlamnsc.model.User;
import com.example.tranvanlamnsc.util.ConnectionUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    Connection connection = ConnectionUtils.getConnection();
    public String getUser(String pName, String password) {
        User user = null;
        String sql = "select * from users where username = '"+pName +"' and password = '" +password +"'";
                  return sql   ;
//        String sql = "select * from users where username = ? and password = ?";
//        try {
//            PreparedStatement ps = connection.prepareStatement(sql);
//            ps.setString(1, pName);
//            ps.setString(2, password);
//            ResultSet rs = ps.executeQuery();
//            while (rs.next()){
//                String name = rs.getString("username");
//                String pass = rs.getString("password");
//                user = new User(name, pass);
//            }
//        } catch (SQLException throwables) {
//            throwables.printStackTrace();
//        }
//        return user;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gombing.in.Services;

import com.gombing.in.Interface.LevelInterface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MaulanaKevinPradana
 */
public class LevelService implements LevelInterface{
    
    private Connection con;
    private final String sql_getId = "SELECT id FROM public.level WHERE level = ?",
            sql_getLevel = "SELECT level FROM public.level";

    public void setCon(Connection con) {
        this.con = con;
    }

    @Override
    public int getId(String name) throws SQLException {
        int hasil = 0;
        try {
            PreparedStatement st = con.prepareStatement(sql_getId);
            st.setString(1, name);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                hasil = rs.getInt(1);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return hasil;
    }
    
    @Override
    public ArrayList<String> fillComboBoxLevel() throws SQLException {
        ArrayList<String> list = new ArrayList<>();
        try {
            list = new ArrayList<>();
            PreparedStatement st = con.prepareStatement(sql_getLevel);
            ResultSet rs = st.executeQuery();
            while (rs.next()) {
                list.add(rs.getString(1));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ERROR : " + e,"Error",JOptionPane.ERROR_MESSAGE);
        }
        return list;
    }
}

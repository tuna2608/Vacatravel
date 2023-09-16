/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Visitor;

/**
 *
 * @author tuna
 */
public class VisitorDB {

    static Connection con = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;

    public static Visitor findVisitor(String email, String pass) {
        String sql = "Select * FROM VisitorInfo where Email = ? and PASSWORD = ?";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Visitor(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getNString(4), rs.getString(5), rs.getString(6), rs.getNString(7));
            }
        } catch (Exception ex) {
            Logger.getLogger(VisitorDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Visitor newVisitor(Visitor v) {
        String sql = "INSERT INTO VisitorInfo (Name, Age, Gender, Email, Password, Address)\n"
                + "VALUES (?, ?, ?, ?, ?, ?);";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setNString(1, v.getName());
            ps.setInt(2, v.getAge());
            ps.setNString(3, v.getGender());
            ps.setString(4, v.getEmail());
            ps.setString(5, v.getPassword());
            ps.setNString(6, v.getAddress());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Visitor(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getNString(4), rs.getString(5), rs.getString(6), rs.getNString(7));
            }
        } catch (Exception ex) {

        }
        return null;
    }

    public static Visitor findVById(int vid) {
        String sql = "SELECT * FROM VisitorInfo where VID = ?";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, vid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Visitor(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getNString(4), rs.getString(5), rs.getString(6), rs.getNString(7));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        VisitorDB vdb = new VisitorDB();
        Visitor v = vdb.findVById(100);
//        Visitor v = new Visitor("Nguyễn Huy Hoàng", 25, "Male", "hoang@gmail.com", "hoang", "Đà Nẵng");
//        Visitor vNew = vdb.newVisitor(v);

        
        System.out.println(v);
    }
}

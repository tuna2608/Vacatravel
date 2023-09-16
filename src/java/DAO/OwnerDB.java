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
import model.Owner;

/**
 *
 * @author tuna
 */
public class OwnerDB {

    static Connection con = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;

    public static Owner findOwner(String email, String pass) {
        String sql = "Select * FROM OwnerInfo where Email = ? and PASSWORD = ?";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, email);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Owner(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getNString(4), rs.getString(5), rs.getString(6), rs.getNString(7));
            }
        } catch (Exception ex) {
            Logger.getLogger(OwnerDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static Owner newOwner(Owner o) {
        String sql = "INSERT INTO OwnerInfo (Name, Age, Gender, Email, Password, Address)\n"
                + "VALUES (?,?,?,?,?,?);";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setNString(1, o.getName());
            ps.setInt(2, o.getAge());
            ps.setNString(3, o.getGender());
            ps.setString(4, o.getEmail());
            ps.setString(5, o.getPassword());
            ps.setNString(6, o.getAddress());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Owner(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getNString(4), rs.getString(5), rs.getString(6), rs.getNString(7));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static Owner findOById(int oid) {
        String sql = "SELECT * FROM OwnerInfo where OID = ?";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, oid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Owner(rs.getInt(1), rs.getNString(2), rs.getInt(3), rs.getNString(4), rs.getString(5), rs.getString(6), rs.getNString(7));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

    public static void main(String[] args) {
        OwnerDB odb = new OwnerDB();
//        Owner o = new Owner("Nguyễn Huy Hoàng", 25, "Male", "hoang132@gmail.com", "hoang", "Đà Nẵng");
//        Owner oNew = vdb.newOwner(o);
        Owner o = OwnerDB.findOById(10);
        System.out.println(o);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Feedback;
import model.Hotel;

/**
 *
 * @author tuna
 */
public class FeedbackDB {
    static Connection con = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    
    public Feedback newFeedback(Feedback f) {
        String sql = "INSERT INTO Feedback (VID, HID, star, content)\n" 
                +"VALUES (?,?,?,?);";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,f.getVID());
            ps.setInt(2, f.getHID());
            ps.setInt(3, f.getStar());
            ps.setNString(4,f.getContent());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Feedback(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getNString(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<Feedback> findById(int hid) {
        ArrayList<Feedback> fList = new ArrayList<>();
        String sql = "SELECT * FROM Feedback where HID = ?";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,hid);
            rs = ps.executeQuery();
            while (rs.next()) {
                fList.add (new Feedback(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getInt(4),rs.getNString(5)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return fList;
    }
    
    public static void main(String[] args) {
        FeedbackDB fdb = new FeedbackDB();
//        Hotel h = db.findById(115);
        ArrayList<Feedback> fList = fdb.findById(1000);
//        System.out.println(h);
        System.out.println(fList);

    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import model.Comment;


/**
 *
 * @author tuna
 */
public class CommentDB {
    static Connection con = null;
    static PreparedStatement ps = null;
    static ResultSet rs = null;
    
    public Comment newComment(Comment c) {
        String sql = "INSERT INTO Comment (UID, HID, content)\n" 
                +"VALUES (?,?,?);";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,c.getUID());
            ps.setInt(2,c.getHID());
            ps.setNString(3,c.getContent());
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                return new Comment(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getNString(4),rs.getDate(5));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }
    
    public ArrayList<Comment> findByHId(int hid) {
        ArrayList<Comment> cList = new ArrayList<>();
        String sql = "SELECT * FROM Comment where HID = ?";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1,hid);
            rs = ps.executeQuery();
            while (rs.next()) {
                cList.add (new Comment(rs.getInt(1),rs.getInt(2),rs.getInt(3),rs.getNString(4),rs.getDate(5)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return cList;
    }
    
    public static void main(String[] args) {
        CommentDB cdb = new CommentDB();
//        Hotel h = db.findById(115);
        ArrayList<Comment> cList = cdb.findByHId(1000);
//        System.out.println(h);
        System.out.println(cList);

    }
}

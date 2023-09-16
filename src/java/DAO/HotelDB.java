/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Hotel;

public class HotelDB {

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Hotel> listAll() {
        List<Hotel> hList = new ArrayList<>();
        String sql = "SELECT HID, OID, [Name], [address], priceMax, priceMin, [background] FROM Hotel;";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                hList.add(new Hotel(rs.getInt(1), rs.getInt(2), rs.getNString(3), rs.getNString(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return hList;
    }
    
public List<Hotel> searchName(String value) {
    List<Hotel> hList = new ArrayList<>();
    String sql = "SELECT HID, OID, [Name], [address], priceMax, priceMin, [background] FROM Hotel where name LIKE ?;";
    try {
        con = (Connection) new DBContext().getConnection();
        ps = con.prepareStatement(sql);
        ps.setString(1, "%" + value + "%"); // Sử dụng toán tử % để tìm kiếm tên chứa giá trị 'value'
        rs = ps.executeQuery();
        while (rs.next()) {
            hList.add(new Hotel(rs.getInt(1), rs.getInt(2), rs.getNString(3), rs.getNString(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return hList;
}

    
   public List<Hotel> searchMinPrice(int price) {
    List<Hotel> hList = new ArrayList<>();
    String sql = "SELECT HID, OID, [Name], [address], priceMax, priceMin, [background] FROM Hotel where priceMin > ?;";
    try {
        con = (Connection) new DBContext().getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, price); // Truyền giá trị tham số 'price' vào câu truy vấn
        rs = ps.executeQuery();
        while (rs.next()) {
            hList.add(new Hotel(rs.getInt(1), rs.getInt(2), rs.getNString(3), rs.getNString(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return hList;
}

    
    public List<Hotel> searchMaxPrice(int price) {
         List<Hotel> hList = new ArrayList<>();
    String sql = "SELECT HID, OID, [Name], [address], priceMax, priceMin, [background] FROM Hotel where priceMax < ?;";
    try {
        con = (Connection) new DBContext().getConnection();
        ps = con.prepareStatement(sql);
        ps.setInt(1, price); // Truyền giá trị tham số 'price' vào câu truy vấn
        rs = ps.executeQuery();
        while (rs.next()) {
            hList.add(new Hotel(rs.getInt(1), rs.getInt(2), rs.getNString(3), rs.getNString(4), rs.getInt(5), rs.getInt(6), rs.getString(7)));
        }
    } catch (Exception e) {
        System.out.println(e);
    }
    return hList;
    }
    
    public Hotel findById(int hid) {
        String sql = "SELECT * FROM Hotel where HID = ?";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(sql);
            ps.setInt(1, hid);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Hotel(
                        rs.getInt(1), rs.getInt(2), rs.getNString(3), rs.getNString(4),
                        rs.getNString(5), rs.getString(6), rs.getInt(7), rs.getInt(8),
                        rs.getString(9), rs.getString(10), rs.getString(11), rs.getString(12),
                        rs.getString(13), rs.getString(14), rs.getString(15), rs.getString(16),
                        rs.getString(17), rs.getString(18), rs.getString(19)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        return null;
    }

public void addHotel(Hotel hotel) {
    try {
        String query = "INSERT INTO Hotel(OID, name, describe, address, phone, pricemax, pricemin, restaurant, gym, pool, pet, bar, sauna, background, image1, image2, image3, image4) "
                     + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        con = new DBContext().getConnection();
        ps = con.prepareStatement(query);
        ps.setInt(1, hotel.getOID());
        ps.setString(2, hotel.getName());
        ps.setString(3, hotel.getDescribe());
        ps.setString(4, hotel.getAddress());
        ps.setString(5, hotel.getPhone());
        ps.setInt(6, hotel.getPricemax());
        ps.setInt(7, hotel.getPricemin());
        ps.setString(8, hotel.getRestaurant());
        ps.setString(9, hotel.getGym());
        ps.setString(10, hotel.getPool());
        ps.setString(11, hotel.getPet());
        ps.setString(12, hotel.getBar());
        ps.setString(13, hotel.getSauna());
        ps.setString(14, hotel.getBackground());
        ps.setString(15, hotel.getImage1());
        ps.setString(16, hotel.getImage2());
        ps.setString(17, hotel.getImage3());
        ps.setString(18, hotel.getImage4());
        ps.executeUpdate();
        con.close();
        ps.close();
    } catch (Exception e) {
        System.out.println(e);
    }
}

    public int getPlace() {
        String query = "SELECT MAX(HID) AS MAX FROM Hotel";
        try {
            con = (Connection) new DBContext().getConnection();
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return rs.getInt("max") + 1;
            }
        } catch (Exception e) {

        }
        return 0;
    }

public static void main(String[] args) {
        HotelDB db = new HotelDB();
    // Tạo đối tượng Hotel với dữ liệu ngẫu nhiên
        System.out.println(db.searchMinPrice(100));
}
}

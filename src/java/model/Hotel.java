/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;

/**
 *
 * @author tuna
 */
public class Hotel implements Serializable {
    private int HID;
    private int OID;
    private String name;
    private String describe;
    private String address;
    private String phone;
    private int pricemax;
    private int pricemin;
    private String restaurant;
    private String gym;
    private String pool;
    private String pet;
    private String bar;
    private String sauna;
    private String background;
    private String image1;
    private String image2;
    private String image3;
    private String image4;

    public Hotel() {
    }

    public Hotel(int HID, int OID, String name, String address, int pricemax, int pricemin, String background) {
        this.HID = HID;
        this.OID = OID;
        this.name = name;
        this.address = address;
        this.pricemax = pricemax;
        this.pricemin = pricemin;
        this.background = background;
    }

    @Override
    public String toString() {
        return "Hotel{" + "HID=" + HID + ", OID=" + OID + ", name=" + name + ", describe=" + describe + ", address=" + address + ", phone=" + phone + ", pricemax=" + pricemax + ", pricemin=" + pricemin + ", restaurant=" + restaurant + ", gym=" + gym + ", pool=" + pool + ", pet=" + pet + ", bar=" + bar + ", sauna=" + sauna + ", background=" + background + ", image1=" + image1 + ", image2=" + image2 + ", image3=" + image3 + ", image4=" + image4 + '}';
    }


    public Hotel(int HID, int OID, String name, String describe, String address, String phone, int pricemax, int pricemin, String restaurant, String gym, String pool, String pet, String bar, String sauna, String background, String image1, String image2, String image3, String image4) {
        this.HID = HID;
        this.OID = OID;
        this.name = name;
        this.describe = describe;
        this.address = address;
        this.phone = phone;
        this.pricemax = pricemax;
        this.pricemin = pricemin;
        this.restaurant = restaurant;
        this.gym = gym;
        this.pool = pool;
        this.pet = pet;
        this.bar = bar;
        this.sauna = sauna;
        this.background = background;
        this.image1 = image1;
        this.image2 = image2;
        this.image3 = image3;
        this.image4 = image4;
    }

    public int getHID() {
        return HID;
    }

    public void setHID(int HID) {
        this.HID = HID;
    }

    public int getOID() {
        return OID;
    }

    public void setOID(int OID) {
        this.OID = OID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getPricemax() {
        return pricemax;
    }

    public void setPricemax(int pricemax) {
        this.pricemax = pricemax;
    }

    public int getPricemin() {
        return pricemin;
    }

    public void setPricemin(int pricemin) {
        this.pricemin = pricemin;
    }

    public String getRestaurant() {
        return restaurant;
    }

    public void setRestaurant(String restaurant) {
        this.restaurant = restaurant;
    }

    public String getGym() {
        return gym;
    }

    public void setGym(String gym) {
        this.gym = gym;
    }

    public String getPool() {
        return pool;
    }

    public void setPool(String pool) {
        this.pool = pool;
    }

    public String getPet() {
        return pet;
    }

    public void setPet(String pet) {
        this.pet = pet;
    }

    public String getBar() {
        return bar;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public String getSauna() {
        return sauna;
    }

    public void setSauna(String sauna) {
        this.sauna = sauna;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getImage1() {
        return image1;
    }

    public void setImage1(String image1) {
        this.image1 = image1;
    }

    public String getImage2() {
        return image2;
    }

    public void setImage2(String image2) {
        this.image2 = image2;
    }

    public String getImage3() {
        return image3;
    }

    public void setImage3(String image3) {
        this.image3 = image3;
    }

    public String getImage4() {
        return image4;
    }

    public void setImage4(String image4) {
        this.image4 = image4;
    }

    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.VisitorDB;
import java.io.Serializable;

/**
 *
 * @author tuna
 */
public class Visitor implements Serializable {
    private int VID;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String password;
    private String address;

    public Visitor() {
    }
    
    public Visitor(int VID, Visitor v) {
        this.VID = VID;
        this.name = v.name;
        this.age = v.age;
        this.gender = v.gender;
        this.email = v.email;
        this.password = v.password;
        this.address = v.address;
    }

    public Visitor(String name, int age, String gender, String email, String password, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public Visitor(int VID, String name, int age, String gender, String email, String password, String address) {
        this.VID = VID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.address = address;
    }

    public int getVID() {
        return VID;
    }

    public void setVID(int VID) {
        this.VID = VID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Visitor{" + "VID=" + VID + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", password=" + password + ", address=" + address + '}';
    }
    
    
}

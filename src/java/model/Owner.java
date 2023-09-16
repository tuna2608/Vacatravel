/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import DAO.OwnerDB;
import java.io.Serializable;

/**
 *
 * @author tuna
 */
public class Owner implements Serializable {
    private int OID;
    private String name;
    private int age;
    private String gender;
    private String email;
    private String password;
    private String address;

    public Owner() {
    }
    
    public Owner(int OID, Owner o) {
        this.OID = OID;
        this.name = o.name;
        this.age = o.age;
        this.gender = o.gender;
        this.email = o.email;
        this.password = o.password;
        this.address = o.address;
    }

    public Owner(String name, int age, String gender, String email, String password, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.address = address;
    }
    
    

    public Owner(int OID, String name, int age, String gender, String email, String password, String address) {
        this.OID = OID;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.email = email;
        this.password = password;
        this.address = address;
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
        return "Owner{" + "OID=" + OID + ", name=" + name + ", age=" + age + ", gender=" + gender + ", email=" + email + ", password=" + password + ", address=" + address + '}';
    }
    
    
}

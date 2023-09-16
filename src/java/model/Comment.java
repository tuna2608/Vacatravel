/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.io.Serializable;
import java.sql.Date;

/**
 *
 * @author tuna
 */
public class Comment implements Serializable  {
    private int CID;
    private int UID;
    private int HID;
    private String content;
    private Date doc;
    

    public Comment() {
    }

    public Comment(int UID, int HID, String content) {
        this.UID = UID;
        this.HID = HID;
        this.content = content;
    }
    
    

    public Comment(int CID, int UID, int HID, String content, Date doc) {
        this.CID = CID;
        this.UID = UID;
        this.HID = HID;
        this.content = content;
        this.doc = doc;
    }

    public Comment(int UID, int HID, String content, Date doc) {
        this.UID = UID;
        this.HID = HID;
        this.content = content;
        this.doc = doc;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    public int getHID() {
        return HID;
    }

    public void setHID(int HID) {
        this.HID = HID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getDoc() {
        return doc;
    }

    public void setDoc(Date doc) {
        this.doc = doc;
    }
    
}
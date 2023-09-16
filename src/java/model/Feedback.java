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
public class Feedback implements Serializable  {
    private int FID;
    private int VID;
    private int HID;
    private int star;
    private String content;

    public Feedback() {
    }

    public Feedback(int VID, int HID, int star, String content) {
        this.VID = VID;
        this.HID = HID;
        this.star = star;
        this.content = content;
    }

    public Feedback(int FID, int VID, int HID, int star, String content) {
        this.FID = FID;
        this.VID = VID;
        this.HID = HID;
        this.star = star;
        this.content = content;
    }

    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public int getVID() {
        return VID;
    }

    public void setVID(int VID) {
        this.VID = VID;
    }

    public int getHID() {
        return HID;
    }

    public void setHID(int HID) {
        this.HID = HID;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
    
    
}

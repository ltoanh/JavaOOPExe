/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class MatHang implements Serializable{
    private int maHang;
    private String tenHang, nhomHang;
    private float giaMua,giaBan;
    private static int sMa = 1000;

    public MatHang(String tenHang, String nhomHang, float giaMua, float giaBan) {
        this.maHang = sMa++;
        this.tenHang = tenHang;
        this.nhomHang = nhomHang;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public String getTenHang() {
        return tenHang;
    }

    public static void setsMa(int sMa) {
        MatHang.sMa = sMa;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            maHang, tenHang, nhomHang, giaMua, giaBan
        };
    }
    
}

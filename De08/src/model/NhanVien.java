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
public class NhanVien implements Serializable{
    private int maNV;
    private String hoTen, diaChi, soDT;
    private static int sMa = 1000;

    public NhanVien(String hoTen, String diaChi, String soDT) {
        this.maNV = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }

    public int getMaNV() {
        return maNV;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    public static void setsMa(int sMa) {
        NhanVien.sMa = sMa;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            maNV, hoTen, diaChi, soDT
        };
    }
}

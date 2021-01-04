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
    private int maNhanVien;
    private String hoTen, diaChi, soDienThoai;
    private int bacLuong;
    private static int sMa = 1000;

    public NhanVien(String hoTen, String diaChi, String soDienThoai, int bacLuong) {
        this.maNhanVien = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDienThoai = soDienThoai;
        this.bacLuong = bacLuong;
    }

    public int getMaNhanVien() {
        return maNhanVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public static void setsMa(int sMa) {
        NhanVien.sMa = sMa;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            maNhanVien, hoTen, diaChi, soDienThoai, bacLuong
        };
    }
    
}

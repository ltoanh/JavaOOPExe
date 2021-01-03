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
public class HanhKhach implements Serializable{
    private int maHK;
    private String hoTen, diaChi, loaiKhach;
    private static int sMa = 100000;

    public HanhKhach(String hoTen, String diaChi, String loaiKhach) {
        this.maHK = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiKhach = loaiKhach;
    }

    public int getMaHK() {
        return maHK;
    }

    public String getHoTen() {
        return hoTen;
    }

    public static void setsMa(int sMa) {
        HanhKhach.sMa = sMa;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            maHK, hoTen, diaChi, loaiKhach
        };
    }
}

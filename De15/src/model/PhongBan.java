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
public class PhongBan implements Serializable {

    private int maPhongBan;
    private String tenPhong, moTa;
    private int heSoCongViec;
    private static int sMa = 100;

    public PhongBan(String tenPhong, String moTa, int heSoCongViec) {
        this.maPhongBan = sMa++;
        this.tenPhong = tenPhong;
        this.moTa = moTa;
        this.heSoCongViec = heSoCongViec;
    }

    public int getMaPhongBan() {
        return maPhongBan;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public static void setsMa(int sMa) {
        PhongBan.sMa = sMa;
    }

    public Object[] toObjects() {
        return new Object[]{
            maPhongBan, tenPhong, moTa, heSoCongViec
        };
    }
}

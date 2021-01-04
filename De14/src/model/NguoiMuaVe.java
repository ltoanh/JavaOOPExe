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
public class NguoiMuaVe implements Serializable {

    private int maNguoiMua;
    private String hoTen, diaChi, loai;
    private static int sMa = 10000;

    public NguoiMuaVe(String hoTen, String diaChi, String loai) {
        this.maNguoiMua = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loai = loai;
    }

    public int getMaNguoiMua() {
        return maNguoiMua;
    }

    public String getHoTen() {
        return hoTen;
    }

    public static void setsMa(int sMa) {
        NguoiMuaVe.sMa = sMa;
    }

    public Object[] toObjects() {
        return new Object[]{
            maNguoiMua, hoTen, diaChi, loai
        };
    }
}

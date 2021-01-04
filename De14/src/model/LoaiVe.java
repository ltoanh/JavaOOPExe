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
public class LoaiVe implements Serializable{
    private int maVe;
    private String loaiVe;
    private float donGia;
    private static int sMa = 10000;

    public LoaiVe(String loaiVe, float donGia) {
        this.maVe = sMa++;
        this.loaiVe = loaiVe;
        this.donGia = donGia;
    }

    public int getMaVe() {
        return maVe;
    }

    public String getLoaiVe() {
        return loaiVe;
    }
    
    public static void setsMa(int sMa) {
        LoaiVe.sMa = sMa;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            maVe, loaiVe, donGia
        };
    }
}

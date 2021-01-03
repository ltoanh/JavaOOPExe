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

    private int maLoai;
    private String moTa;
    private float giaBan;
    private static int sMa = 100;

    public LoaiVe(String moTa, float giaBan) {
        this.maLoai = sMa++;
        this.moTa = moTa;
        this.giaBan = giaBan;
    }

    public int getMaLoai() {
        return maLoai;
    }

    public static void setsMa(int sMa) {
        LoaiVe.sMa = sMa;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            maLoai, moTa, giaBan
        };
    }
}

package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class MatHang implements Serializable {

    private int ma;
    private String ten, nhom;
    private float giaMua, giaBan;
    private static int sMa = 1;

    public MatHang(String ten, String nhom, float giaMua, float giaBan) {
        this.ma = sMa++;
        this.ten = ten;
        this.nhom = nhom;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public float getGiaMua() {
        return giaMua;
    }

    public float getGiaBan() {
        return giaBan;
    }

    
    public static void setsMa(int sMa) {
        MatHang.sMa = sMa;
    }

    public String formatMa() {
        return String.format("%04d", ma);
    }

    public Object[] toObjects() {
        return new Object[]{
            formatMa(), ten, nhom, giaMua, giaBan
        };
    }
}

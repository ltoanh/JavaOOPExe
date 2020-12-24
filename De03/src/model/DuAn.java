package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class DuAn implements Serializable{
    private int ma;
    private String ten, kieu;
    private float tong;
    private static int sMa = 1;

    public DuAn(String ten, String kieu, float tong) {
        this.ma = sMa++;
        this.ten = ten;
        this.kieu = kieu;
        this.tong = tong;
    }
    
    public String formatMa(){
        return String.format("%05d", ma);
    }
    
    public Object[] toObject(){
        return new Object[]{
            formatMa(), ten, kieu, tong
        };
    }

    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        DuAn.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }
    
    
}

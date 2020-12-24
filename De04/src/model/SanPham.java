package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class SanPham implements Serializable{
    private int ma;
    private String ten;
    private float gia;
    private static int sMa = 1;

    public SanPham(String ten, float gia) {
        this.ma = sMa++;
        this.ten = ten;
        this.gia = gia;
    }
    
    public String formatMa(){
        return String.format("%05d", ma);
    }
    
    public Object[] toObject() {
        return new Object[]{
            formatMa(), ten, gia
        };
    }
    
    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        SanPham.sMa = sMa;
    }
    
    public String getTen() {
        return ten;
    }
}

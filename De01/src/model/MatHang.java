package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class MatHang implements Serializable{
    private int ma;
    private String ten, nhom;
    private float gia;
    private static int sMa = 1;

    public MatHang(String ten, String nhom, float gia) {
        this.ma = sMa++;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
    }
    
    public String formatMa(){
        return String.format("%04d", ma);
    }
    
    public Object[] tObject(){
        return new Object[]{
            formatMa(), ten, nhom, gia
        };
    }

    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        MatHang.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }
    
    
}

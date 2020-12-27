package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class KhachHang implements Serializable{
    private int ma;
    private String ten, diaChi, nhom;
    private static int sMa = 1;

    public KhachHang(String ten, String diaChi, String nhom) {
        this.ma = sMa++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.nhom = nhom;
    }
    
    public String formatMa(){
        return String.format("%05d", ma);
    }
    
    public Object[] toObject(){
        return new Object[]{
            formatMa(), ten, diaChi, nhom
        };
    }

    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        KhachHang.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }
    
    
}

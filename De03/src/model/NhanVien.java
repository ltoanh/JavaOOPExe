package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class NhanVien implements Serializable{
    private int ma;
    private String ten, diaChi, chuyenMon;
    private static int sMa = 1;

    public NhanVien(String ten, String diaChi, String chuyenMon) {
        this.ma = sMa++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.chuyenMon = chuyenMon;
    }
    
    public String formatMa(){
        return String.format("%05d", ma);        
    }
    
    public Object[] toObject(){
        return new Object[]{
            formatMa(), ten, diaChi, chuyenMon
        };
    }

    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        NhanVien.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }
    
    
}

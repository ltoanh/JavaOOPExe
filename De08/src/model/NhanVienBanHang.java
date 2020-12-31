package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class NhanVienBanHang implements Serializable{
    private int ma;
    private String ten, diaChi, soDT;
    private static int sMa = 1;

    public NhanVienBanHang(String ten, String diaChi, String soDT) {
        this.ma = sMa++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }
    
    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }    
    public static void setsMa(int sMa) {
        NhanVienBanHang.sMa = sMa;
    }
    
    public String formatMa(){
        return String.format("%04d", ma);
    }
    
    public Object[] toObjects(){
        return new Object[]{
            formatMa(), ten, diaChi, soDT
        };
    }
}

package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class KhachHang implements Serializable{
    private int ma;
    private String hoTen, diaChi, soDT;
    private static int sMa = 1;

    public KhachHang(String hoTen, String diaChi, String soDT) {
        this.ma = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
    }
    
    public String formatMa(){
        return String.format("%05d", ma);
    }
    
    public Object[] tObject(){
        return new Object[]{
            formatMa(), hoTen, diaChi, soDT
        };
    }

    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        KhachHang.sMa = sMa;
    }

    public String getHoTen() {
        return hoTen;
    }
    
    
}

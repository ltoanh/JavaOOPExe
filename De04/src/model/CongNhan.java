package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class CongNhan implements Serializable {

    private int ma;
    private String ten, diaChi, ca;
    private static int sMa = 1;

    public CongNhan(String ten, String diaChi, String ca) {
        this.ma = sMa++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ca = ca;
    }

    public String formatMa() {
        return String.format("%05d", ma);
    }

    public Object[] toObject() {
        return new Object[]{
            formatMa(), ten, diaChi, ca
        };
    }

    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        CongNhan.sMa = sMa;
    }

    public String getTen() {
        return ten;
    }
    
    
}

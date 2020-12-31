package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class CongNhan implements Serializable {

    private int ma;
    private String ten, diaChi, soDT;
    private int bac;
    private static int sMa = 1;

    public CongNhan(String ten, String diaChi, String soDT, int bac) {
        this.ma = sMa++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.bac = bac;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getBac() {
        return bac;
    }

    public static void setsMa(int sMa) {
        CongNhan.sMa = sMa;
    }

    public String formatMa() {
        return String.format("%04d", ma);
    }

    public Object[] toObjects() {
        return new Object[]{
            formatMa(), ten, diaChi, soDT, bac
        };
    }
}

package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class SinhVien implements Serializable {

    private int ma;
    private String ten, diaChi, ngaySinh, lop;
    private static int sMa = 1;

    public SinhVien(String ten, String diaChi, String ngaySinh, String lop) {
        this.ma = sMa++;
        this.ten = ten;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
        this.lop = lop;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public static void setsMa(int sMa) {
        SinhVien.sMa = sMa;
    }

    public String formatMa() {
        return String.format("%05d", ma);
    }

    public Object[] toObjects() {
        return new Object[]{
            formatMa(), ten, diaChi, ngaySinh, lop
        };
    }
}

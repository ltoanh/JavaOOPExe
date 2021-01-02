package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class KhachHang implements Serializable {

    private int maKhachHang;
    private String hoTen, diaChi, nhomKhachHang;
    private static int sMa = 10000;

    public KhachHang(String hoTen, String diaChi, String nhomKhachHang) {
        this.maKhachHang = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.nhomKhachHang = nhomKhachHang;
    }

    public int getMaKhachHang() {
        return maKhachHang;
    }

    public String getHoTen() {
        return hoTen;
    }

    public static void setsMa(int sMa) {
        KhachHang.sMa = sMa;
    }

    public Object[] toObjects() {
        return new Object[]{
            maKhachHang, hoTen, diaChi, nhomKhachHang
        };
    }
}

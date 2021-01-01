package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class PhongVien implements Serializable{
    private int maPhongVien;
    private String hoTen, diaChi, loaiPhongVien;
    private static int sMa = 1;

    public PhongVien(String hoTen, String diaChi, String loaiPhongVien) {
        this.maPhongVien = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.loaiPhongVien = loaiPhongVien;
    }

    public int getMaPhongVien() {
        return maPhongVien;
    }

    public String getHoTen() {
        return hoTen;
    }

    public static void setsMa(int sMa) {
        PhongVien.sMa = sMa;
    }
    
    public String formatMa(){
        return String.format("%05d", maPhongVien);
    }
    
    public Object[] toObjects(){
        return new Object[]{
            formatMa(), hoTen, diaChi, loaiPhongVien
        };
    }
}

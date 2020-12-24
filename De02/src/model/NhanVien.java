package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class NhanVien implements Serializable{
    private int maNV;
    private String hoTen, diaChi, soDT;
    private int bacLuong;
    private static int sMa = 1;

    public NhanVien() {
        sMa = 1;
    }

    public NhanVien(String hoTen, String diaChi, String soDT, int bacLuong) {
        this.maNV = sMa++;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.soDT = soDT;
        this.bacLuong = bacLuong;
    }

    public int getMaNV() {
        return maNV;
    }

    public void setMaNV(int maNV) {
        this.maNV = maNV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getSoDT() {
        return soDT;
    }

    public void setSoDT(String soDT) {
        this.soDT = soDT;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }

    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        NhanVien.sMa = sMa;
    }
    
    public String formatMa(){
        return String.format("%04d", maNV);
    }
    
    public Object[] toObject(){
        return new Object[]{
            formatMa(),
            hoTen,
            diaChi,
            soDT,
            bacLuong
        };
    }
}

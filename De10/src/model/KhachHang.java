package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class KhachHang implements Serializable{
    private int ma;
    private String ten, loaiXeMuonThue;
    private int soXe;
    private static int sMa = 1;

    public KhachHang(String ten, String loaiXeMuonThue, int soXe) {
        this.ma = sMa++;
        this.ten = ten;
        this.loaiXeMuonThue = loaiXeMuonThue;
        this.soXe = soXe;
    }

    public int getMa() {
        return ma;
    }

    public String getLoaiXeMuonThue() {
        return loaiXeMuonThue;
    }

    public String getTen() {
        return ten;
    }

    public int getSoXe() {
        return soXe;
    }

    public static void setsMa(int sMa) {
        KhachHang.sMa = sMa;
    }
    
    public String formatMa(){
        return String.format("%03d", ma);
    }
    
    public Object[] toObjects(){
        return new Object[]{
            formatMa(), ten, loaiXeMuonThue, soXe
        };
    }
}

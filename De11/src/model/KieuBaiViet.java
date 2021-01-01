package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class KieuBaiViet implements Serializable{
    private int maKieuBai;
    private String tenKieuBai;
    private float donGia;
    private static int sMa = 1;

    public KieuBaiViet(String tenKieuBai, float donGia) {
        this.maKieuBai = sMa++;
        this.tenKieuBai = tenKieuBai;
        this.donGia = donGia;
    }

    public int getMaKieuBai() {
        return maKieuBai;
    }

    public String getTenKieuBai() {
        return tenKieuBai;
    }

    public static void setsMa(int sMa) {
        KieuBaiViet.sMa = sMa;
    }
    
    public String formatMa(){
        return String.format("%03d", maKieuBai);
    }
    
    public Object[] toObjects(){
        return new Object[]{
            formatMa(), tenKieuBai, donGia
        };
    }
}

package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class PhongBan implements Serializable{

    private int maPB;
    private String ten, moTa;
    private int heSo;
    private static int sMa = 1;

    public PhongBan() {
        sMa = 1;
    }

    public PhongBan(String ten, String moTa, int heSo) {
        this.maPB = sMa++;
        this.ten = ten;
        this.moTa = moTa;
        this.heSo = heSo;
    }

    public int getMaPB() {
        return maPB;
    }

    public void setMaPB(int maPB) {
        this.maPB = maPB;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public int getHeSo() {
        return heSo;
    }

    public void setHeSo(int heSo) {
        this.heSo = heSo;
    }

    public static int getsMa() {
        return sMa;
    }

    public static void setsMa(int sMa) {
        PhongBan.sMa = sMa;
    }

    public String formatMa() {
        return String.format("%03d", maPB);
    }

    public Object[] toObject() {
        return new Object[]{
            formatMa(),
            ten,
            moTa,
            heSo
        };
    }
}

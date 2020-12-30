package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class MonHoc implements Serializable {

    private int ma;
    private String ten;
    private int so;
    private String loai;
    private static int sMa = 1;

    public MonHoc(String ten, int so, String loai) {
        this.ma = sMa++;
        this.ten = ten;
        this.so = so;
        this.loai = loai;
    }

    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public int getSo() {
        return so;
    }

    
    public static void setsMa(int sMa) {
        MonHoc.sMa = sMa;
    }

    public String formatMa() {
        return String.format("%03d", ma);
    }

    public Object[] toObjects() {
        return new Object[]{
            formatMa(), ten, so, loai
        };
    }
}

package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class DichVu implements Serializable{
    private int ma;
    private String ten;
    private float gia;
    private int donVi;
    private static int sMa = 1;

    public DichVu(String ten, float gia, int donVi) {
        this.ma = sMa++;
        this.ten = ten;
        this.gia = gia;
        this.donVi = donVi;
    }
    
    public String formatMa(){
        return String.format("%03d", ma);
    }
    
    public Object[] toObject(){
        return new Object[]{
            formatMa(), ten, gia, donVi
        };
    }
    
    public int getMa() {
        return ma;
    }

    public static void setsMa(int sMa) {
        DichVu.sMa = sMa;
    }
    
    public String getTen() {
        return ten;
    }
}

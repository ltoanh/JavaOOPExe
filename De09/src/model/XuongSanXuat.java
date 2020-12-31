package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class XuongSanXuat implements Serializable{
    private int ma;
    private String ten, moTa;
    private float heSo;
    private static int sMa = 1;

    public XuongSanXuat(String ten, String moTa, float heSo) {
        this.ma = sMa++;
        this.ten = ten;
        this.moTa = moTa;
        this.heSo = heSo;
    }
    
    public int getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public float getHeSo() {
        return heSo;
    }
    
    public static void setsMa(int sMa) {
        XuongSanXuat.sMa = sMa;
    }
    
    public String formatMa(){
        return String.format("%03d", ma);
    }
    
    public Object[] toObjects(){
        return new Object[]{
            formatMa(), ten, moTa, heSo
        };
    }
}

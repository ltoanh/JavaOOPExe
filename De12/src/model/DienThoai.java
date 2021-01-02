package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class DienThoai implements Serializable{
    private int ma;
    private String hangSanXuat, model;
    private float donGia;
    private static int sMa = 10000;

    public DienThoai(String hangSanXuat, String model, float donGia) {
        this.ma = sMa++;
        this.hangSanXuat = hangSanXuat;
        this.model = model;
        this.donGia = donGia;
    }

    public int getMa() {
        return ma;
    }

    public String getModel() {
        return model;
    }

    public static void setsMa(int sMa) {
        DienThoai.sMa = sMa;
    }
    
    public Object[] tObjects(){
        return new Object[]{
            ma, hangSanXuat, model, donGia
        };
    }
}

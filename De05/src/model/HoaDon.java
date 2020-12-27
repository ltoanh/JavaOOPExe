package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class HoaDon implements Serializable{
    private KhachHang khachHang;
    private MatHang matHang;
    private int so;

    public HoaDon(KhachHang khachHang, MatHang matHang, int so) {
        this.khachHang = khachHang;
        this.matHang = matHang;
        this.so = so;
    }

    public Object[] toObject(){
        return new Object[]{
            khachHang.getTen(), matHang.getTen(), so
        };
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public MatHang getMatHang() {
        return matHang;
    }

    public int getSo() {
        return so;
    }
    
    
}

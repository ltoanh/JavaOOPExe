package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class HoaDon implements Serializable{
    private KhachHang khachHang;
    private DienThoai dienThoai;
    private int soLuong;

    public HoaDon(KhachHang khachHang, DienThoai dienThoai, int soLuong) {
        this.khachHang = khachHang;
        this.dienThoai = dienThoai;
        this.soLuong = soLuong;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            khachHang.getHoTen(), dienThoai.getModel(), soLuong
        };
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
    
}

package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class HoaDon implements Serializable{
    private KhachHang khach;
    private DichVu dichVu;
    private int soluong;

    public HoaDon(KhachHang khach, DichVu dichVu, int soluong) {
        this.khach = khach;
        this.dichVu = dichVu;
        this.soluong = soluong;
    }
    
    public Object[] toObject(){
        return new Object[]{
            khach.getTen(), dichVu.getTen(), soluong
        };
    }

    public KhachHang getKhach() {
        return khach;
    }

    public DichVu getDichVu() {
        return dichVu;
    }

    public int getSoluong() {
        return soluong;
    }
    
    
}

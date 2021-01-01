package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class BangSapXep implements Serializable{
    private KhachHang khachHang;
    private OTo oTo;
    private int soNgayThue;

    public BangSapXep(KhachHang khachHang, OTo oTo, int soNgayThue) {
        this.khachHang = khachHang;
        this.oTo = oTo;
        this.soNgayThue = soNgayThue;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public OTo getoTo() {
        return oTo;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            khachHang.getTen(), oTo.getKieuXe(), soNgayThue, khachHang.getSoXe()
        };
    }
}

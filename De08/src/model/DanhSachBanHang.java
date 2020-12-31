package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class DanhSachBanHang implements Serializable{
    private NhanVienBanHang nhanVienBanHang;
    private MatHang matHang;
    private int so;

    public DanhSachBanHang(NhanVienBanHang nhanVienBanHang, MatHang matHang, int so) {
        this.nhanVienBanHang = nhanVienBanHang;
        this.matHang = matHang;
        this.so = so;
    }

    public NhanVienBanHang getNhanVienBanHang() {
        return nhanVienBanHang;
    }

    public MatHang getMatHang() {
        return matHang;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            nhanVienBanHang.getTen(), matHang.getTen(), so
        };
    }

    public int getSo() {
        return so;
    }

    @Override
    public String toString() {
        return nhanVienBanHang.getTen() + "\t" + matHang.getTen() + "\t" + so + "\n";
    }
    
    
}

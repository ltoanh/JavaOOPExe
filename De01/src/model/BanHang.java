package model;

import java.io.Serializable;
import java.util.Map;

/**
 *
 * @author whiwf
 */
public class BanHang implements Serializable {

    private KhachHang khachHang;
    private MatHang hang;
    private int so;

    public BanHang(KhachHang khachHang, MatHang hang, int so) {
        this.khachHang = khachHang;
        this.hang = hang;
        this.so = so;
    }

    public Object[] toObject() {
        return new Object[]{
            khachHang.getHoTen(), hang.getTen(), so
        };
    }

    public int getSo() {
        return so;
    }

    public MatHang getHang() {
        return hang;
    }

    public KhachHang getKhachHang() {
        return khachHang;
    }

    public void setSo(int so) {
        this.so = so;
    }

    @Override
    public String toString() {
        return khachHang.getHoTen() + "\t" + hang.getTen() + "\t" + so + "\t" + hang.getGia() + '\n';
    }

}

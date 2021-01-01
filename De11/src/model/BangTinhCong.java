package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class BangTinhCong implements Serializable {

    private PhongVien phongVien;
    private KieuBaiViet kieuBaiViet;
    private int soLuong;

    public BangTinhCong(PhongVien phongVien, KieuBaiViet kieuBaiViet, int soLuong) {
        this.phongVien = phongVien;
        this.kieuBaiViet = kieuBaiViet;
        this.soLuong = soLuong;
    }

    public PhongVien getPhongVien() {
        return phongVien;
    }

    public KieuBaiViet getKieuBaiViet() {
        return kieuBaiViet;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public Object[] toObjects() {
        return new Object[]{
            phongVien.getHoTen(), kieuBaiViet.getTenKieuBai(), soLuong
        };
    }
}

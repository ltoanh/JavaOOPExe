/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class BangDanhSachBanHang implements Serializable {

    private NhanVien nhanVien;
    private MatHang hang;
    private int soLuong;

    public BangDanhSachBanHang(NhanVien nhanVien, MatHang hang, int soLuong) {
        this.nhanVien = nhanVien;
        this.hang = hang;
        this.soLuong = soLuong;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public MatHang getHang() {
        return hang;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public Object[] toObjects() {
        return new Object[]{
            nhanVien.getHoTen(), hang.getTenHang(), soLuong
        };
    }

}

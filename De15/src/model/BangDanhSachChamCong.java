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
public class BangDanhSachChamCong implements Serializable{
    private NhanVien nhanVien;
    private PhongBan phongBan;
    private int soNgayLam;

    public BangDanhSachChamCong(NhanVien nhanVien, PhongBan phongBan, int soNgayLam) {
        this.nhanVien = nhanVien;
        this.phongBan = phongBan;
        this.soNgayLam = soNgayLam;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            nhanVien.getHoTen(), phongBan.getTenPhong(), soNgayLam
        };
    }
}

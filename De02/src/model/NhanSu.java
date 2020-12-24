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
public class NhanSu implements Serializable{
    private NhanVien nhanVien;
    private PhongBan phongBan;
    private int ngay;

    public NhanSu() {
    }

    public NhanSu(NhanVien nhanVien, PhongBan phongBan, int ngay) {
        this.nhanVien = nhanVien;
        this.phongBan = phongBan;
        this.ngay = ngay;
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public void setNhanVien(NhanVien nhanVien) {
        this.nhanVien = nhanVien;
    }

    public PhongBan getPhongBan() {
        return phongBan;
    }

    public void setPhongBan(PhongBan phongBan) {
        this.phongBan = phongBan;
    }

    public int getNgay() {
        return ngay;
    }

    public void setNgay(int ngay) {
        this.ngay = ngay;
    }
    
    public Object[] toObject(){
        return new Object[]{
            nhanVien.formatMa(), nhanVien.getHoTen(), 
            phongBan.formatMa(), ngay
        };
    }
}

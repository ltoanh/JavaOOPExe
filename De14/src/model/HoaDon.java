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
public class HoaDon implements Serializable{
    private NguoiMuaVe nguoiMuaVe;
    private LoaiVe ve;
    private int soLuong;

    public HoaDon(NguoiMuaVe nguoiMuaVe, LoaiVe ve, int soLuong) {
        this.nguoiMuaVe = nguoiMuaVe;
        this.ve = ve;
        this.soLuong = soLuong;
    }

    public NguoiMuaVe getNguoiMuaVe() {
        return nguoiMuaVe;
    }

    public LoaiVe getVe() {
        return ve;
    }

    public int getSoLuong() {
        return soLuong;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            nguoiMuaVe.getHoTen(), ve.getLoaiVe(), soLuong
        };
    }
}

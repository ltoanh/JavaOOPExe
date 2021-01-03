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
public class BangKeBanVe implements Serializable{
    private HanhKhach khach;
    private LoaiVe ve;

    public BangKeBanVe(HanhKhach khach, LoaiVe ve) {
        this.khach = khach;
        this.ve = ve;
    }

    public HanhKhach getKhach() {
        return khach;
    }

    public LoaiVe getVe() {
        return ve;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            khach.getHoTen(), ve.getMaLoai()
        };
    }
}

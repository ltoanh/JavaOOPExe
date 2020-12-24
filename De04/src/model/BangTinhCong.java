package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class BangTinhCong implements Serializable{
    private CongNhan congNhan;
    private SanPham sanPham;
    private int so;

    public BangTinhCong(CongNhan congNhan, SanPham sanPham, int so) {
        this.congNhan = congNhan;
        this.sanPham = sanPham;
        this.so = so;
    }
    
    public CongNhan getCongNhan() {
        return congNhan;
    }

    public SanPham getSanPham() {
        return sanPham;
    }

    public int getSo() {
        return so;
    }
    
    
    public Object[] toObject() {
        return new Object[]{
            congNhan.getTen(), sanPham.getTen(), so
        };
    }
}

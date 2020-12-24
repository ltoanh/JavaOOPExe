package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class BangPhanCong implements Serializable{
    private NhanVien nhanVien;
    private DuAn duAn;
    private String viTri;
    private int ngay;

    public BangPhanCong(NhanVien nhanVien, DuAn duAn, String viTri, int ngay) {
        this.nhanVien = nhanVien;
        this.duAn = duAn;
        this.viTri = viTri;
        this.ngay = ngay;
    }
    
    public Object[] toObject(){
        return new Object[]{
            nhanVien.getTen(), duAn.getTen(), viTri, ngay
        };
    }

    public NhanVien getNhanVien() {
        return nhanVien;
    }

    public DuAn getDuAn() {
        return duAn;
    }

    public int getNgay() {
        return ngay;
    }
    
    
}

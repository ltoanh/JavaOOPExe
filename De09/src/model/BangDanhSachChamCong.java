package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class BangDanhSachChamCong implements Serializable{
    private CongNhan congNhan;
    private XuongSanXuat xuong;
    private int ngay;

    public BangDanhSachChamCong(CongNhan congNhan, XuongSanXuat xuong, int ngay) {
        this.congNhan = congNhan;
        this.xuong = xuong;
        this.ngay = ngay;
    }

    public CongNhan getCongNhan() {
        return congNhan;
    }

    public XuongSanXuat getXuong() {
        return xuong;
    }

    public int getNgay() {
        return ngay;
    }
    
    public Object[] toObjects(){
        return new Object[]{
            congNhan.getTen(), xuong.getTen(), ngay
        };
    }

    @Override
    public String toString() {
        return congNhan.getTen() + "\t" + xuong.getTen() + "\t" + ngay + '\n';
    }
    
    
}

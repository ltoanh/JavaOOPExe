package model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author whiwf
 */
public class BangDiem implements Serializable{
    private SinhVien sinhVien;
    private MonHoc monHoc;
    private float diem;

    public BangDiem(SinhVien sinhVien, MonHoc monHoc, float diem) {
        this.sinhVien = sinhVien;
        this.monHoc = monHoc;
        this.diem = diem;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public MonHoc getMonHoc() {
        return monHoc;
    }

    public float getDiem() {
        return diem;
    }
    
    
    public Object[] toObjects(){
        return new Object[]{
            sinhVien.getTen(), monHoc.getTen(), diem
        };
    } 

    @Override
    public String toString() {
        return sinhVien.getTen() + "\t" + monHoc.getTen() + "\t" + diem + "\t" + monHoc.getSo() + "\n";
    }
    
    
}

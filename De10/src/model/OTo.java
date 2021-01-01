package model;

import java.io.Serializable;

/**
 *
 * @author whiwf
 */
public class OTo implements Serializable {

    private int ma;
    private String kieuXe;
    private float muctTien;
    private int soXe;
    private static int sMa = 1;

    public OTo(String kieuXe, float muctTien, int soXe) {
        this.ma = sMa++;
        this.kieuXe = kieuXe;
        this.muctTien = muctTien;
        this.soXe = soXe;
    }

    public int getMa() {
        return ma;
    }

    public String getKieuXe() {
        return kieuXe;
    }

    public int getSoXe() {
        return soXe;
    }

    public static void setsMa(int sMa) {
        OTo.sMa = sMa;
    }

    public void setSoXe(int soXe) {
        this.soXe = soXe;
    }

    public String formatMa() {
        return String.format("%04d", ma);
    }

    public Object[] toobObjects() {
        return new Object[]{
            formatMa(), kieuXe, muctTien, soXe
        };
    }
}

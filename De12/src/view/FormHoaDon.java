package view;

import io.IOFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DienThoai;
import model.HoaDon;
import model.KhachHang;

/**
 *
 * @author whiwf
 */
public class FormHoaDon extends javax.swing.JPanel implements ViewInterface{

    /**
     * Creates new form FormHoaDon
     */
    private DefaultTableModel model;
    private List<HoaDon> listHD;
    private List<KhachHang> listKH;
    private List<DienThoai> listDT;
    private final String FILEHD = "HOADON.TXT", FILEKH = "KH.TXT", FILEDT = "MOBI.TXT";
    
    public FormHoaDon() {
        initComponents();
        String colsString[] = {"Ten KH", "Model DT", "So luong"};
        model = new DefaultTableModel(colsString, 0);
        table.setModel(model);
        
        listHD = new ArrayList<>();
        btnFalse();
    }

    private void initCbData(){
        listKH = new ArrayList<>();
        listDT = new ArrayList<>();
        
        try{
            listKH = IOFile.readFilie(FILEKH);
            listDT = IOFile.readFilie(FILEDT);
            if(listKH.isEmpty() || listDT.isEmpty())
                throw new InputMismatchException();
            initItemToCb(cbDT, listDT);
            initItemToCb(cbKH, listKH);
            btnTrue();
        } catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null, "khong co du lieu");
        }
    }
    
    private<T> void initItemToCb(JComboBox cb, List<T> list){
        cb.removeAllItems();
        for(T t : list){
            if(t instanceof KhachHang){
                cb.addItem(((KhachHang) t).getMaKhachHang() + "");
            } else if(t instanceof DienThoai){
                cb.addItem(((DienThoai) t).getMa() + "");
            }
        }
    }
    private void clearData(){
        tfSo.setText("");
    }
    
    private void btnTrue(){
        btnLuu.setEnabled(true);
        btnHuy.setEnabled(true);
    }
    
    private void btnFalse(){
        btnLuu.setEnabled(false);
        btnHuy.setEnabled(false);
    }
    
    private String formatStringInput(String s){
        return s.replaceAll("\\s+", " ").trim();
    }
    
    private<T> T findByMa(int ma, List<T> list){
        for(T t : list){
            if(t instanceof KhachHang){
                if(((KhachHang) t).getMaKhachHang() == ma)
                    return t;
            } else if(t instanceof DienThoai){
                if(((DienThoai) t).getMa() == ma)
                    return t;
            }
        }
        return null;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        cbKH = new javax.swing.JComboBox<>();
        cbDT = new javax.swing.JComboBox<>();
        tfSo = new javax.swing.JTextField();
        btnThem = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(table);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Them"));

        jLabel1.setText("Ma KH");

        jLabel2.setText("Ma DT");

        jLabel3.setText("So luong");

        btnLuu.setText("Luu");
        btnLuu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLuuActionPerformed(evt);
            }
        });

        btnHuy.setText("Huy");
        btnHuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHuyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cbKH, 0, 263, Short.MAX_VALUE)
                    .addComponent(cbDT, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfSo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addComponent(btnHuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 142, Short.MAX_VALUE)
                .addComponent(btnLuu)
                .addGap(84, 84, 84))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tfSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnHuy))
                .addContainerGap())
        );

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        jLabel4.setText("Sap xep theo:");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Ten KH");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("So luong");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(187, 187, 187)
                                .addComponent(btnThem))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton1)
                        .addGap(28, 28, 28)
                        .addComponent(jRadioButton2)))
                .addContainerGap(47, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnThem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 382, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2))
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        clearData();
        initCbData();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        int maKH = Integer.parseInt((String) cbKH.getSelectedItem());
        int maDT = Integer.parseInt((String) cbDT.getSelectedItem());
        boolean isOk = true;
        String soLuong = "";
        int so = 0;
        try{
            soLuong = formatStringInput(tfSo.getText());
            if(soLuong.length() == 0)
                throw new IOException();
            so = Integer.parseInt(soLuong);
            if(so <= 0)
                throw new InputMismatchException();
        } catch(IOException e){
            JOptionPane.showMessageDialog(null, "So luong khong de trong");
            isOk = false;
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "So luong chi nhap so");
            isOk = false;
        } catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null, "So luong phai lon hon 0");
            isOk = false;
        }
        if(isOk){
            try{
                KhachHang khach = findByMa(maKH, listKH);
                DienThoai dienThoai = findByMa(maDT, listDT);
                HoaDon hoaDon = new HoaDon(khach, dienThoai, so);
                addToList(hoaDon, listHD);
                IOFile.writeFile(FILEHD, listHD);
                clearData();
                btnFalse();
            } catch(NullPointerException e){
                JOptionPane.showMessageDialog(null, "khong tim thay du lieu");
            }
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        clearData();
        btnFalse();
    }//GEN-LAST:event_btnHuyActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        try{
            listHD = IOFile.readFilie(FILEHD);
            if(listHD.isEmpty())
                throw new InputMismatchException();
            Collections.sort(listHD, (h1, h2) -> {
                return h1.getKhachHang().getHoTen().compareToIgnoreCase(h2.getKhachHang().getHoTen());
            });
            showData(listHD, model);
        } catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null, "Khong co du lieu");
            buttonGroup1.clearSelection();
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        try{
            listHD = IOFile.readFilie(FILEHD);
            if(listHD.isEmpty())
                throw new InputMismatchException();
            Collections.sort(listHD, (h1, h2) -> {
                int so1 = h1.getSoLuong();
                int so2 = h2.getSoLuong();
                return so2 < so1 ? -1 : so2 > so1 ? 1 : 0;
            });
            showData(listHD, model);
        } catch(InputMismatchException e){
            JOptionPane.showMessageDialog(null, "Khong co du lieu");
            buttonGroup1.clearSelection();
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbDT;
    private javax.swing.JComboBox<String> cbKH;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfSo;
    // End of variables declaration//GEN-END:variables

    @Override
    public <T> void addToList(T t, List<T> ls) {
        ls.add(t);
        showData(ls, model);
    }

    @Override
    public <T> void showData(List<T> ls, DefaultTableModel md) {
        md.setRowCount(0);
        for(T t : ls){
            if(t instanceof HoaDon){
                md.addRow(((HoaDon) t).toObjects());
            }
        }
    }
}
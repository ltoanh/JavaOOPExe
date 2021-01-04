/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import io.IOFile;
import java.io.IOException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.PhongBan;

/**
 *
 * @author whiwf
 */
public class FormPhongBan extends javax.swing.JPanel implements ViewInterface {

    /**
     * Creates new form FormPhongBan
     */
    private DefaultTableModel model;
    private List<PhongBan> list;
    private final String FILEPB = "PB.TXT";
    private final int SOHESO = 20;

    public FormPhongBan() {
        initComponents();
        String cols[] = {"Ma phong", "Ten phong", "Mo ta", "He so"};
        model = new DefaultTableModel(cols, 0);
        table.setModel(model);
        initCbData();
        initListData();
        btnFalse();
    }

    private void initCbData() {
        cbHeSo.removeAllItems();
        for (int i = 1; i <= SOHESO; ++i) {
            cbHeSo.addItem(i + "");
        }
    }

    private void initListData() {
        list = new ArrayList<>();
        list = IOFile.readFile(FILEPB);
        if (!list.isEmpty()) {
            showData(list, model);
            int ma = list.get(list.size() - 1).getMaPhongBan()+ 1;
            PhongBan.setsMa(ma);
        }
    }

    private void btnTrue() {
        btnLuu.setEnabled(true);
        btnHuy.setEnabled(true);

    }

    private void btnFalse() {
        btnLuu.setEnabled(false);
        btnHuy.setEnabled(false);

    }

    private void clearData() {
        tfTen.setText("");
        tfMoTa.setText("");
    }

    private boolean isFormattedString(String s, String regex) {
        String checkArr[] = s.split(" ");
        for (String check : checkArr) {
            if (!check.matches(regex)) {
                return false;
            }
        }
        return true;
    }

    private String formatInputString(String s) {
        return s.replaceAll("\\s+", " ").trim();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnThem = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tfTen = new javax.swing.JTextField();
        tfMoTa = new javax.swing.JTextField();
        btnLuu = new javax.swing.JButton();
        btnHuy = new javax.swing.JButton();
        cbHeSo = new javax.swing.JComboBox<>();

        btnThem.setText("Them");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

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

        jLabel1.setText("Ten phong");

        jLabel2.setText("Mo ta");

        jLabel4.setText("He so");

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
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tfTen)
                    .addComponent(tfMoTa, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
                    .addComponent(cbHeSo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btnHuy)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 154, Short.MAX_VALUE)
                .addComponent(btnLuu)
                .addGap(79, 79, 79))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tfTen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tfMoTa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbHeSo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLuu)
                    .addComponent(btnHuy))
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(btnThem)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnThem))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        clearData();
        btnTrue();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnLuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLuuActionPerformed
        // TODO add your handling code here:
        String ten = "", moTa = "";
        int heSo = 0;
        boolean isOk = true;
        try {
            ten = formatInputString(tfTen.getText());
            if (ten.length() == 0) {
                throw new IOException();
            }
            String regexTen = "^[a-zA-Z]+$";
            if (!isFormattedString(ten, regexTen)) {
                throw new InputMismatchException();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "ten khong de trong");
            isOk = false;
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "ten chi co ky tu chu");
            isOk = false;
        }
        try {
            moTa = formatInputString(tfMoTa.getText());
            if (moTa.length() == 0) {
                throw new IOException();
            }
            String regexMoTa = "^[a-zA-Z0-9]+$";
            if (!isFormattedString(moTa, regexMoTa)) {
                throw new InputMismatchException();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Mo ta khong de trong");
            isOk = false;
        } catch (InputMismatchException e) {
            JOptionPane.showMessageDialog(null, "Mo ta nhap sai dinh dang");
            isOk = false;
        }

        try {
            heSo = Integer.parseInt((String) cbHeSo.getSelectedItem());
        } catch (NullPointerException e) {
            JOptionPane.showMessageDialog(null, "Bac luong khong co du lieu");
            isOk = false;
        }

        if (isOk) {
            PhongBan nhanVien = new PhongBan(ten, moTa, heSo);
            addToList(nhanVien, list);
            clearData();
            btnFalse();
            IOFile.writeFile(FILEPB, list);
        }
    }//GEN-LAST:event_btnLuuActionPerformed

    private void btnHuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHuyActionPerformed
        // TODO add your handling code here:
        clearData();
        btnFalse();
    }//GEN-LAST:event_btnHuyActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHuy;
    private javax.swing.JButton btnLuu;
    private javax.swing.JButton btnThem;
    private javax.swing.JComboBox<String> cbHeSo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField tfMoTa;
    private javax.swing.JTextField tfTen;
    // End of variables declaration//GEN-END:variables

    @Override
    public <T> void addToList(T t, List<T> ls) {
        ls.add(t);
        showData(ls, model);
    }

    @Override
    public <T> void showData(List<T> ls, DefaultTableModel md) {
        md.setRowCount(0);
        for (T t : ls) {
            if (t instanceof PhongBan) {
                md.addRow(((PhongBan) t).toObjects());
            }
        }
    }
}

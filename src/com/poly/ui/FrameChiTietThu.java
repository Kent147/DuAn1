/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ui;

import com.poly.dao.ChiTietThuDAO;
import com.poly.dao.DateHelper;
import com.poly.dao.LoaiThuDAO;
import com.poly.helper.NumberHelper;
import com.poly.helper.ShareHelper;
import com.poly.model.ChiTietThu;
import com.poly.model.HoaDonThu;
import com.poly.model.LoaiThu;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author THANHLONG
 */
public class FrameChiTietThu extends javax.swing.JFrame {

    /**
     * Creates new form FrameChiTietChi
     *
     * @param hoaDonChi
     */
    public FrameChiTietThu(HoaDonThu hoaDonThu) {
        this.hoaDonThu = hoaDonThu;
        initComponents();
        init();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        pnlFooter = new javax.swing.JPanel();
        btnThoat = new javax.swing.JButton();
        pnlMain = new javax.swing.JPanel();
        pnlTop = new javax.swing.JPanel();
        lblInfo = new javax.swing.JLabel();
        lblDatetime = new javax.swing.JLabel();
        pnlBottom = new javax.swing.JPanel();
        lblTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhsach = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        pnlHeader.setBackground(new java.awt.Color(0, 153, 51));
        pnlHeader.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pnlHeader.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT));

        lblTitle.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblTitle.setForeground(new java.awt.Color(255, 255, 255));
        lblTitle.setText("CHI TIẾT THU");
        lblTitle.setPreferredSize(new java.awt.Dimension(170, 70));
        pnlHeader.add(lblTitle);

        getContentPane().add(pnlHeader, java.awt.BorderLayout.PAGE_START);

        pnlFooter.setPreferredSize(new java.awt.Dimension(578, 50));
        pnlFooter.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT, 10, 10));

        btnThoat.setText("Thoát");
        btnThoat.setPreferredSize(new java.awt.Dimension(100, 30));
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });
        pnlFooter.add(btnThoat);

        getContentPane().add(pnlFooter, java.awt.BorderLayout.PAGE_END);

        pnlMain.setLayout(new java.awt.BorderLayout());

        pnlTop.setPreferredSize(new java.awt.Dimension(578, 50));
        pnlTop.setLayout(new java.awt.GridLayout(1, 0));

        lblInfo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblInfo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblInfo.setText("Tên:");
        pnlTop.add(lblInfo);

        lblDatetime.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblDatetime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDatetime.setText("NgàyThu:");
        pnlTop.add(lblDatetime);

        pnlMain.add(pnlTop, java.awt.BorderLayout.PAGE_START);

        pnlBottom.setPreferredSize(new java.awt.Dimension(579, 50));
        java.awt.FlowLayout flowLayout1 = new java.awt.FlowLayout(java.awt.FlowLayout.RIGHT);
        flowLayout1.setAlignOnBaseline(true);
        pnlBottom.setLayout(flowLayout1);

        lblTotal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotal.setText("Tổng Tiền:");
        lblTotal.setPreferredSize(new java.awt.Dimension(300, 50));
        pnlBottom.add(lblTotal);

        pnlMain.add(pnlBottom, java.awt.BorderLayout.PAGE_END);

        tblDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "STT", "Loại Thu", "Số Tiền", "Mô Tả"
            }
        ));
        jScrollPane1.setViewportView(tblDanhsach);

        pnlMain.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlMain, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        this.dispose();
    }//GEN-LAST:event_formWindowClosing

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrameChiTietThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrameChiTietThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrameChiTietThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrameChiTietThu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrameChiTietThu(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDatetime;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JPanel pnlBottom;
    private javax.swing.JPanel pnlFooter;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JPanel pnlTop;
    private javax.swing.JTable tblDanhsach;
    // End of variables declaration//GEN-END:variables

    HoaDonThu hoaDonThu;
    List<LoaiThu> listLoaiThu = new ArrayList<>();
    List<ChiTietThu> listChiTietThu = new ArrayList<>();
    ChiTietThuDAO chiTietThuDAO = new ChiTietThuDAO();
    
    private void init() {
        this.setTitle("CHI TIẾT THU");
        this.setLocationRelativeTo(null);
        this.loadAll();
        this.lblInfo.setText("<html><b>" + "Người Thu: </b>" + ShareHelper.nguoiDung.getHoten() + "</html>");
        this.lblDatetime.setText("<html><b>" + "Ngày Thu: </b>" + DateHelper.toStringFullDate(hoaDonThu.getNgaythu()) + "</html>");
        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
    }
    
    private void loadAll() {
        loadLoaiChi();
        loadChiTietChi();
    }
    
    private void loadLoaiChi() {
        if (!listLoaiThu.isEmpty()) {
            listLoaiThu.clear();
        }
        listLoaiThu = new LoaiThuDAO().getListLoaiThu();
    }
    
    private void loadChiTietChi() {
        if (!listChiTietThu.isEmpty()) {
            listChiTietThu.clear();
        }
        listChiTietThu = chiTietThuDAO.findByMaHD(hoaDonThu.getIdhdthu());
        fillToTable();
    }
    
    private void fillToTable() {
        DefaultTableModel model = (DefaultTableModel) tblDanhsach.getModel();
        model.setRowCount(0);
        int count = 0;
        int total = 0;
        for (ChiTietThu thu : listChiTietThu) {
            Vector row = new Vector();
            row.add(++count);
            for (LoaiThu loaiThu : listLoaiThu) {
                if (thu.getLoaiThu().getMaloaithu()== loaiThu.getMaloaithu()) {
                    row.add(loaiThu.getTenloaithu());
                    break;
                }
            }
            row.add(NumberHelper.convertToPrice(thu.getSotien()));
            total += thu.getSotien();
            row.add(thu.getMota());
            model.addRow(row);
        }
        lblTotal.setText("<html><b>Tổng tiền: </b>" + NumberHelper.convertToPrice(total) + "</html>");
        tblDanhsach.setModel(model);
    }
    
}

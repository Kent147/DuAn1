/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.poly.ui;

import com.poly.dao.DateHelper;
import com.poly.dao.NguoiDungDAO;
import com.poly.helper.ShareHelper;
import com.poly.helper.TableHelper;
import com.poly.model.NguoiDung;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

/**
 *
 * @author root
 */
public class PanelQLNguoiDung extends javax.swing.JPanel {

    /**
     * Creates new form ThemNguoiDungJPanel
     */
    public static PanelQLNguoiDung nguoidung;

    public PanelQLNguoiDung() {
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

        pnlTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDanhsach = new javax.swing.JTable();
        pnlHeader = new javax.swing.JPanel();
        lblTitle = new javax.swing.JLabel();
        btnThem = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(1000, 600));
        setLayout(new java.awt.BorderLayout());

        tblDanhsach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tên Người Dùng", "Họ Tên", "Giới Tính", "NgàySinh", "Số Điện Thoại", "Vai Trò", "Xoá"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDanhsach.setShowVerticalLines(false);
        tblDanhsach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDanhsachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblDanhsach);

        javax.swing.GroupLayout pnlTableLayout = new javax.swing.GroupLayout(pnlTable);
        pnlTable.setLayout(pnlTableLayout);
        pnlTableLayout.setHorizontalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 976, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlTableLayout.setVerticalGroup(
            pnlTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                .addContainerGap())
        );

        add(pnlTable, java.awt.BorderLayout.CENTER);

        pnlHeader.setPreferredSize(new java.awt.Dimension(967, 70));

        lblTitle.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblTitle.setText("QUẢN LÝ NGƯỜI DÙNG");

        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/poly/icon/add.png"))); // NOI18N
        btnThem.setText("   Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 799, Short.MAX_VALUE)
                .addGap(60, 60, 60)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        add(pnlHeader, java.awt.BorderLayout.PAGE_START);
    }// </editor-fold>//GEN-END:initComponents

    private void tblDanhsachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDanhsachMouseClicked
        if (evt.getClickCount() == 2) {
            int index = tblDanhsach.getSelectedRow();
            new FrameNguoiDung(list.get(index)).setVisible(true);
        }
    }//GEN-LAST:event_tblDanhsachMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        new FrameNguoiDung(null).setVisible(true);
    }//GEN-LAST:event_btnThemActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThem;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlTable;
    private javax.swing.JTable tblDanhsach;
    // End of variables declaration//GEN-END:variables

    List<NguoiDung> list = new ArrayList<>();

    private void init() {
        nguoidung = this;
        loadAll();
        tableUI();
    }

    private void tableUI() {
        tblDanhsach.setRowHeight(25);
        TableCellRenderer rendererFromHeader = tblDanhsach.getTableHeader().getDefaultRenderer();
        JLabel headerLabel = (JLabel) rendererFromHeader;
        headerLabel.setHorizontalAlignment(JLabel.CENTER);
    }

    public void loadAll() {
        if (!list.isEmpty()) {
            list.clear();
        }
        list = new NguoiDungDAO().getListNguoiDung();
        fillToTable();
    }

    private void fillToTable() {
        System.out.println("FillToTable");
        if (list != null) {
            DefaultTableModel model = (DefaultTableModel) tblDanhsach.getModel();
            ActionListener actionListener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    System.out.println(tblDanhsach.getSelectedRow());
                    delete(String.valueOf(tblDanhsach.getValueAt(tblDanhsach.getSelectedRow(), 0)));
                }
            };
            tblDanhsach.getColumnModel().getColumn(6).setCellRenderer(new TableHelper(tblDanhsach, 6, actionListener));
            model.setRowCount(0);
            for (NguoiDung x : list) {
                Object[] row = new Object[]{x.getUsername(),
                    x.getHoten(),
                    x.getGioitinh() == true ? "Nam" : "Nữ",
                    DateHelper.toString(x.getNgaysinh()),
                    x.getSodienthoai(),
                    x.getVaitro() == true ? "Quản Trị Viên" : "Người Dùng"};
                model.addRow(row);
            }
        }
    }

    private void delete(String username) {
        int choose = JOptionPane.showConfirmDialog(this, "Bạn có muốn xoá user", "Hệ thống quản lý đào tạo",
                JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (choose == JOptionPane.YES_OPTION) {
            if (!username.equals(ShareHelper.nguoiDung.getUsername())) {
                new NguoiDungDAO().deleteNguoiDung(username);
                loadAll();
                return;
            }
            JOptionPane.showMessageDialog(this, "Bạn không được xoá chính bạn !!!", "Thông báo", 
                        JOptionPane.ERROR_MESSAGE);
        }
    }
}

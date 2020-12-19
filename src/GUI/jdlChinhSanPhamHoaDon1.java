/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.ChuyenDoi;
import DTO.DTOSanPham;
import static GUI.pnldonbanhang.cbbKhachHang1;
import static GUI.pnldonbanhang.tblChiTietHoaDon1;
import static GUI.pnldonbanhang.txtTongTien1;
import static GUI.pnldonbanhang.cbbKhachHang1;
import static GUI.pnldonbanhang.tblChiTietHoaDon1;


/**
 *
 * @author Administrator
 */
public class jdlChinhSanPhamHoaDon1 extends javax.swing.JDialog {

    /**
     * Creates new form jdlChinhSanPhamPhieuNhap
     */
    public jdlChinhSanPhamHoaDon1(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        int dongDuocChon = tblChiTietHoaDon1.getSelectedRow();
            spnSoLuong1.setValue(tblChiTietHoaDon1.getValueAt(dongDuocChon, 6));

        
        DTO.DTOKhachHang khl = BLL.BLLKhachHang.GetTenKH(cbbKhachHang1.getSelectedItem().toString());
        DTO.DTOLoaiKhachHang lkh = BLL.BLLKhachHang.GetMaLoaiKH(khl.getIdLoaiKhachHang());
        txtUuDai1.setText(lkh.getUuDai());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlChucNang1 = new javax.swing.JPanel();
        lblSoLuong3 = new javax.swing.JLabel();
        spnSoLuong1 = new javax.swing.JSpinner();
        lblGhiChu1 = new javax.swing.JLabel();
        txtUuDai1 = new javax.swing.JTextField();
        lblSoLuong4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        btnOK1 = new javax.swing.JButton();
        btnThoat1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));

        pnlChucNang1.setBackground(new java.awt.Color(255, 255, 255));
        pnlChucNang1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        pnlChucNang1.setForeground(new java.awt.Color(255, 255, 255));
        pnlChucNang1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pnlChucNang1FocusGained(evt);
            }
        });

        lblSoLuong3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSoLuong3.setText("Số Lượng");

        spnSoLuong1.setValue(1);

        lblGhiChu1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblGhiChu1.setForeground(new java.awt.Color(255, 255, 255));

        txtUuDai1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        txtUuDai1.setEnabled(false);
        txtUuDai1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtUuDai1KeyReleased(evt);
            }
        });

        lblSoLuong4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        lblSoLuong4.setText("Ưu Đãi");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("%");

        btnOK1.setBackground(new java.awt.Color(204, 255, 204));
        btnOK1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnOK1.setForeground(new java.awt.Color(0, 153, 0));
        btnOK1.setText("OK");
        btnOK1.setToolTipText("");
        btnOK1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOK1ActionPerformed(evt);
            }
        });

        btnThoat1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnThoat1.setText("Thoát");
        btnThoat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoat1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Chỉnh thông sản phẩm hóa đơn");
        jLabel4.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        javax.swing.GroupLayout pnlChucNang1Layout = new javax.swing.GroupLayout(pnlChucNang1);
        pnlChucNang1.setLayout(pnlChucNang1Layout);
        pnlChucNang1Layout.setHorizontalGroup(
            pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(pnlChucNang1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChucNang1Layout.createSequentialGroup()
                        .addGroup(pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSoLuong3)
                            .addComponent(lblSoLuong4))
                        .addGap(18, 18, 18)
                        .addGroup(pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlChucNang1Layout.createSequentialGroup()
                                .addComponent(txtUuDai1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(spnSoLuong1)))
                    .addComponent(jSeparator2)
                    .addComponent(jSeparator1)
                    .addGroup(pnlChucNang1Layout.createSequentialGroup()
                        .addComponent(btnOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlChucNang1Layout.createSequentialGroup()
                                .addComponent(lblGhiChu1)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(btnThoat1, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE))))
                .addContainerGap())
        );
        pnlChucNang1Layout.setVerticalGroup(
            pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlChucNang1Layout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlChucNang1Layout.createSequentialGroup()
                        .addComponent(spnSoLuong1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtUuDai1, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                        .addGap(61, 61, 61))
                    .addGroup(pnlChucNang1Layout.createSequentialGroup()
                        .addComponent(lblSoLuong3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSoLuong4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(55, 55, 55)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlChucNang1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThoat1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOK1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblGhiChu1)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChucNang1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlChucNang1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtUuDai1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUuDai1KeyReleased

    }//GEN-LAST:event_txtUuDai1KeyReleased

    private void btnOK1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOK1ActionPerformed
        int dongDuocChon = tblChiTietHoaDon1.getSelectedRow();

        int MaSP = Integer.parseInt(tblChiTietHoaDon1.getValueAt(dongDuocChon, 0).toString());

        DTOSanPham sp = BLL.BLLSanPham.GetMaSP(MaSP);

        boolean kiemTra = false;
        int soLuong = 0;
        double UuDai = 0;
        soLuong = (int) spnSoLuong1.getValue();
        if (soLuong < 1) {
            ThongBaoCanhBao.ThongBao("Số lượng mua phải lớn hơn 0", "Lỗi dữ liệu");
            kiemTra = false;
            return;
        } else if (soLuong > sp.getTonKho()) {
            ThongBaoCanhBao.ThongBao("Số lượng hàng trong kho chỉ còn " + sp.getTonKho() + "", "Thông Báo");
            kiemTra = false;
            return;
        } else {

            kiemTra = true;
        }
        UuDai = Double.parseDouble(txtUuDai1.getText());
        if (UuDai < 0 || UuDai > 100) {
            ThongBaoCanhBao.ThongBao("Chiết khấu chỉ được trong khoảng 0 - 100%", "Lỗi dữ liệu");
            kiemTra = false;
            return;
        } else {
            kiemTra = true;
        }
        int ChietKhauNhap = Integer.parseInt(txtUuDai1.getText());

        UuDai = ChietKhauNhap * 0.1;
        int slmoi = Integer.parseInt(spnSoLuong1.getValue().toString());


        double tongTien = BLL.BLLHoaDon.SuaSanPhamVaoChiTietHoaDon(tblChiTietHoaDon1, sp, slmoi, UuDai);
        double TongTien = BLL.ChuyenDoi.ChuyenTien(txtTongTien1.getText());
        double TongTienThanhToan = tongTien + TongTien;
        txtTongTien1.setText(ChuyenDoi.DinhDangTien(TongTienThanhToan));
        double UuDaiBanDau = ChuyenDoi.ChuyenSangSo(txtUuDai1.getText());
        for (int i = 0; i < tblChiTietHoaDon1.getRowCount(); i++) {
            double UuDaiBang = ChuyenDoi.ChuyenSangSo(tblChiTietHoaDon1.getValueAt(i, 8).toString());
            double UuDaiCuoi = UuDaiBanDau + UuDaiBang;
            txtUuDai1.setText(ChuyenDoi.DinhDangTien(UuDaiCuoi));
        }

        this.dispose();
    }//GEN-LAST:event_btnOK1ActionPerformed

    private void btnThoat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoat1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnThoat1ActionPerformed

    private void pnlChucNang1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pnlChucNang1FocusGained

    }//GEN-LAST:event_pnlChucNang1FocusGained

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
            java.util.logging.Logger.getLogger(jdlChinhSanPhamHoaDon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdlChinhSanPhamHoaDon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdlChinhSanPhamHoaDon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdlChinhSanPhamHoaDon1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdlChinhSanPhamHoaDon1 dialog = new jdlChinhSanPhamHoaDon1(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOK1;
    private javax.swing.JButton btnThoat1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblGhiChu1;
    private javax.swing.JLabel lblSoLuong3;
    private javax.swing.JLabel lblSoLuong4;
    private javax.swing.JPanel pnlChucNang1;
    public static javax.swing.JSpinner spnSoLuong1;
    public static javax.swing.JTextField txtUuDai1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import BLL.BLLChamCong;
import BLL.BLLKhachHang;
import BLL.BLLNguoiDung;
import BLL.BLLNhaCungCap;
import BLL.BLLPhatLuong;
import BLL.ChuyenDoi;
import DAO.DBConection;
import DTO.DTOPhieuThuChi;
import DTO.MyCombobox;
import static GUI.pnlthongke.soTrangThuChi;
import static GUI.pnlthongke.tblThuChi;
import static GUI.pnlthongke.trangThuChi;
import static GUI.pnlthongke.txtTimKiemTC;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.UIManager;

/**
 *
 * @author KMB1604
 */
public class jdlThemphieuthuchi extends javax.swing.JDialog {

    /**
     * Creates new form jdlUngLuong
     */
    public jdlThemphieuthuchi(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
         try {
            for (UIManager.LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception ex) {

        }
        initComponents();
        DBConection db = new DBConection();
        jLabel18.setText("Chọn đối tượng nhân viên");
            BLLNguoiDung.DoDuLieuVaoCBBNguoiDung(jComboBox2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel39 = new javax.swing.JPanel();
        jPanel40 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel41 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton25 = new javax.swing.JButton();
        jButton26 = new javax.swing.JButton();
        jPanel42 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jPanel43 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel44 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jPanel46 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jPanel47 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel39.setBackground(new java.awt.Color(255, 255, 255));
        jPanel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel40.setBackground(new java.awt.Color(255, 255, 255));
        jPanel40.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Thêm phiếu Thu - Chi");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jPanel41.setBackground(new java.awt.Color(255, 255, 255));
        jPanel41.setLayout(new java.awt.BorderLayout());

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Chọn loại phiếu");
        jLabel15.setPreferredSize(new java.awt.Dimension(106, 20));
        jPanel41.add(jLabel15, java.awt.BorderLayout.PAGE_START);

        jPanel1.setLayout(new javax.swing.BoxLayout(jPanel1, javax.swing.BoxLayout.LINE_AXIS));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Phiếu Thu", "Phiếu Chi" }));
        jPanel1.add(jComboBox3);

        jPanel41.add(jPanel1, java.awt.BorderLayout.CENTER);

        jButton25.setText("Tạo phiếu");
        jButton25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton25ActionPerformed(evt);
            }
        });

        jButton26.setText("Hủy");
        jButton26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton26ActionPerformed(evt);
            }
        });

        jPanel42.setBackground(new java.awt.Color(255, 255, 255));
        jPanel42.setLayout(new java.awt.BorderLayout());

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tên hạng mục");
        jLabel16.setPreferredSize(new java.awt.Dimension(106, 20));
        jPanel42.add(jLabel16, java.awt.BorderLayout.PAGE_START);
        jPanel42.add(jTextField1, java.awt.BorderLayout.CENTER);

        jPanel43.setBackground(new java.awt.Color(255, 255, 255));
        jPanel43.setLayout(new java.awt.BorderLayout());

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Chọn loại đối tượng");
        jLabel17.setPreferredSize(new java.awt.Dimension(106, 20));
        jPanel43.add(jLabel17, java.awt.BorderLayout.PAGE_START);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nhân viên", "Nhà cung cấp", "Khách hàng" }));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel43.add(jComboBox1, java.awt.BorderLayout.CENTER);

        jPanel44.setBackground(new java.awt.Color(255, 255, 255));
        jPanel44.setLayout(new java.awt.BorderLayout());

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Chọn đối tượng");
        jLabel18.setPreferredSize(new java.awt.Dimension(106, 20));
        jPanel44.add(jLabel18, java.awt.BorderLayout.PAGE_START);

        jPanel44.add(jComboBox2, java.awt.BorderLayout.CENTER);

        jPanel46.setBackground(new java.awt.Color(255, 255, 255));
        jPanel46.setLayout(new java.awt.BorderLayout());

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Giá trị");
        jLabel20.setPreferredSize(new java.awt.Dimension(106, 20));
        jPanel46.add(jLabel20, java.awt.BorderLayout.PAGE_START);

        jTextField3.setText("5000000");
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel46.add(jTextField3, java.awt.BorderLayout.CENTER);

        jPanel47.setBackground(new java.awt.Color(255, 255, 255));
        jPanel47.setLayout(new java.awt.BorderLayout());

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Ghi chú");
        jLabel21.setPreferredSize(new java.awt.Dimension(106, 20));
        jPanel47.add(jLabel21, java.awt.BorderLayout.PAGE_START);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jPanel47.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout jPanel40Layout = new javax.swing.GroupLayout(jPanel40);
        jPanel40.setLayout(jPanel40Layout);
        jPanel40Layout.setHorizontalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator3)
                    .addComponent(jPanel41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel40Layout.createSequentialGroup()
                        .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel42, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel43, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel44, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel46, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel47, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel40Layout.setVerticalGroup(
            jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel40Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel41, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel43, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel44, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel42, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel46, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel47, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton26, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel39Layout = new javax.swing.GroupLayout(jPanel39);
        jPanel39.setLayout(jPanel39Layout);
        jPanel39Layout.setHorizontalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel39Layout.setVerticalGroup(
            jPanel39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel39, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  
      
    private void jButton25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton25ActionPerformed
           if (jComboBox1.getSelectedItem().equals("Nhân viên")) {          
        String soHoaDon;
        DateFormat dateFormat = new SimpleDateFormat("YYYYMMDDhhmmss");
         MyCombobox mbHangSP = (MyCombobox) jComboBox2.getSelectedItem();
        Date d = new Date();
        
        soHoaDon = "PTC" + dateFormat.format(d);
        String LoaiPhieu = jComboBox3.getSelectedItem().toString();
        int doituong = Integer.parseInt(mbHangSP.Value.toString());
        String hangmucthuchi = jTextField1.getText();
        Double giatri = ChuyenDoi.ChuyenTien(jTextField3.getText());
        String ghichu = jTextField3.getText();
        
          if (BLL.BLLThuChi.KiemTraThuChiNV(soHoaDon, doituong, LoaiPhieu, hangmucthuchi, giatri, ghichu)) {
              DTOPhieuThuChi tc = new DTOPhieuThuChi(soHoaDon, LoaiPhieu, hangmucthuchi, doituong, giatri, ghichu);
            BLL.BLLThuChi.ThemThuChiNV(tc);
            ThongBaoCanhBao.ThongBao("Thêm phiếu "+LoaiPhieu +" nhân viên thành công", "Thông báo");
            this.dispose();
            pnlthongke.jComboBox1.setSelectedIndex(0);
               trangThuChi = 0;
            BLL.BLLThuChi.HienThiPhieuThuChi( pnlthongke.tblThuChi,  pnlthongke.txtTimKiemTC.getText(), pnlthongke.trangThuChi);
            pnlthongke.trangThuChi1 = 1;
             pnlthongke.btnNext4.setEnabled(true);
             pnlthongke.btnLast4.setEnabled(true);
             pnlthongke.btnFirst4.setEnabled(false);
             pnlthongke.btnBack4.setEnabled(false);
             pnlthongke.lblCountPage4.setText( pnlthongke.trangThuChi1 +"/"+  pnlthongke.soTrangThuChi+"");
             pnlthongke.lblNumberPage4.setText( pnlthongke.trangThuChi1+"");
        }
        
        }else  if (jComboBox1.getSelectedItem().equals("Khách hàng")) {
            
        String soHoaDon;
        DateFormat dateFormat = new SimpleDateFormat("YYYYMMDDhhmmss");
         MyCombobox mbHangSP = (MyCombobox) jComboBox2.getSelectedItem();
        Date d = new Date();
        
        soHoaDon = "PTC" + dateFormat.format(d);
        String LoaiPhieu = jComboBox3.getSelectedItem().toString();
        int doituong = Integer.parseInt(mbHangSP.Value.toString());
        String hangmucthuchi = jTextField1.getText();
        Double giatri = ChuyenDoi.ChuyenTien(jTextField3.getText());
        String ghichu = jTextArea1.getText();
        
          if (BLL.BLLThuChi.KiemTraThuChiKH(soHoaDon, doituong, LoaiPhieu, hangmucthuchi, giatri, ghichu)) {
              DTOPhieuThuChi tc = new DTOPhieuThuChi(soHoaDon, doituong, LoaiPhieu, hangmucthuchi, giatri, ghichu);
            BLL.BLLThuChi.ThemThuChiNV(tc);
            ThongBaoCanhBao.ThongBao("Thêm phiếu "+LoaiPhieu +" khách hàng thành công", "Thông báo");
              this.dispose();
               pnlthongke.jComboBox1.setSelectedIndex(0);
               trangThuChi = 0;
            BLL.BLLThuChi.HienThiPhieuThuChi( pnlthongke.tblThuChi,  pnlthongke.txtTimKiemTC.getText(), pnlthongke.trangThuChi);
            pnlthongke.trangThuChi1 = 1;
             pnlthongke.btnNext4.setEnabled(true);
             pnlthongke.btnLast4.setEnabled(true);
             pnlthongke.btnFirst4.setEnabled(false);
             pnlthongke.btnBack4.setEnabled(false);
             pnlthongke.lblCountPage4.setText( pnlthongke.trangThuChi1 +"/"+  pnlthongke.soTrangThuChi+"");
             pnlthongke.lblNumberPage4.setText( pnlthongke.trangThuChi1+"");
        }
        }else{
          
                  
        String soHoaDon;
        DateFormat dateFormat = new SimpleDateFormat("YYYYMMDDhhmmss");
         MyCombobox mbHangSP = (MyCombobox) jComboBox2.getSelectedItem();
        Date d = new Date();
        
        soHoaDon = "PTC" + dateFormat.format(d);
        String LoaiPhieu = jComboBox3.getSelectedItem().toString();
        int doituong = Integer.parseInt(mbHangSP.Value.toString());
        String hangmucthuchi = jTextField1.getText();
        Double giatri = ChuyenDoi.ChuyenTien(jTextField3.getText());
        String ghichu = jTextField3.getText();      
          if (BLL.BLLThuChi.KiemTraThuChiNCC(soHoaDon, doituong, LoaiPhieu, hangmucthuchi, giatri, ghichu)) {
              DTOPhieuThuChi tc = new DTOPhieuThuChi(soHoaDon, LoaiPhieu, doituong, hangmucthuchi, giatri, ghichu);
            BLL.BLLThuChi.ThemThuChiNV(tc);
            ThongBaoCanhBao.ThongBao("Thêm phiếu "+LoaiPhieu +" nhà cung cấp thành công", "Thông báo");
              this.dispose();
              pnlthongke.jComboBox1.setSelectedIndex(0);
               trangThuChi = 0;
            BLL.BLLThuChi.HienThiPhieuThuChi( pnlthongke.tblThuChi,  pnlthongke.txtTimKiemTC.getText(), pnlthongke.trangThuChi);
            pnlthongke.trangThuChi1 = 1;
             pnlthongke.btnNext4.setEnabled(true);
             pnlthongke.btnLast4.setEnabled(true);
             pnlthongke.btnFirst4.setEnabled(false);
             pnlthongke.btnBack4.setEnabled(false);
             pnlthongke.lblCountPage4.setText( pnlthongke.trangThuChi1 +"/"+  pnlthongke.soTrangThuChi+"");
             pnlthongke.lblNumberPage4.setText( pnlthongke.trangThuChi1+"");
        }
            
        }
       
        
        
    }//GEN-LAST:event_jButton25ActionPerformed

    private void jButton26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton26ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton26ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        try {
              if (jComboBox1.getSelectedItem().equals("Nhân viên")) {
            jLabel18.setText("Chọn đối tượng nhân viên");
            BLLNguoiDung.DoDuLieuVaoCBBNguoiDung(jComboBox2);
        
        }else  if (jComboBox1.getSelectedItem().equals("Khách hàng")) {
            jLabel18.setText("Chọn đối tượng khách hàng");
            BLLKhachHang.DoDuLieuVaoCBBKhachHang(jComboBox2);
        }else{
             jLabel18.setText("Chọn đối tượng nhà cung cấp");
            BLLNhaCungCap.DoDuLieuVaoCBBNhaCungCap(jComboBox2);
        }
        } catch (Exception e) {
        }
      
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
     
    }//GEN-LAST:event_jTextField3KeyReleased

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
            java.util.logging.Logger.getLogger(jdlThemphieuthuchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jdlThemphieuthuchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jdlThemphieuthuchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jdlThemphieuthuchi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                jdlThemphieuthuchi dialog = new jdlThemphieuthuchi(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButton25;
    private javax.swing.JButton jButton26;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel39;
    private javax.swing.JPanel jPanel40;
    private javax.swing.JPanel jPanel41;
    private javax.swing.JPanel jPanel42;
    private javax.swing.JPanel jPanel43;
    private javax.swing.JPanel jPanel44;
    private javax.swing.JPanel jPanel46;
    private javax.swing.JPanel jPanel47;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField3;
    // End of variables declaration//GEN-END:variables
}

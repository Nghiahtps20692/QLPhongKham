/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhongKham.ui;

import PhongKham.dao.TaiKhoanDao;
import PhongKham.entity.TaiKhoanPK;
import PhongKham.utils.Auth;
import PhongKham.utils.MsgBox;
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

import org.eclipse.jdt.internal.compiler.ast.ReturnStatement;

/**
 *
 * @author Asus k550j
 */
public class DangNhap extends javax.swing.JDialog { 

    /**
     * Creates new form LoginJDialog
     */
    public DangNhap(java.awt.Frame clinic, boolean modal) {
        super(clinic, modal);
        initComponents();
        init();
    }

    public DangNhap(java.awt.Frame clinic, boolean modal, String maNV, String pass) {
        super(clinic, modal);
        initComponents();
        init();
        txtUsername.setText(maNV);
        txtPassword.setText(pass);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        chkCheck = new javax.swing.JCheckBox();
        lblForget = new javax.swing.JLabel();
        btnKetThuc1 = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        btnDangNhap2 = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jPanel3 = new javax.swing.JPanel();
        lblHidenPass = new javax.swing.JLabel();
        lblShowPass = new javax.swing.JLabel();
        btnQR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Quản Lý Phòng Khám - Đăng nhập");
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhongKham/Hinh/Benhvien.png"))); // NOI18N

        jPanel5.setBackground(new java.awt.Color(25, 118, 211));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Login");
        jPanel5.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 47, 420, 41));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("Hello! Let's get started");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 420, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(199, 226, 255));
        jLabel12.setText("Username");
        jPanel5.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 123, 341, -1));

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("_________________________________________");
        jLabel15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel15KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 147, 290, 39));

        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhongKham/Hinh/icons8_user_20px_1.png"))); // NOI18N
        jPanel5.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 150, 40, 39));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(199, 226, 255));
        jLabel19.setText("Password");
        jPanel5.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 192, 341, -1));

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("_________________________________________");
        jLabel20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
        });
        jLabel20.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jLabel20KeyPressed(evt);
            }
        });
        jPanel5.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 216, 290, 40));

        chkCheck.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        chkCheck.setForeground(new java.awt.Color(199, 226, 255));
        chkCheck.setText("Remember Password");
        chkCheck.setOpaque(false);
        chkCheck.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCheckActionPerformed(evt);
            }
        });
        jPanel5.add(chkCheck, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, -1, -1));

        lblForget.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        lblForget.setForeground(new java.awt.Color(199, 226, 255));
        lblForget.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblForget.setText("Forget Password?");
        lblForget.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblForget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblForgetMouseClicked(evt);
            }
        });
        jPanel5.add(lblForget, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 121, 27));

        btnKetThuc1.setBackground(new java.awt.Color(255, 255, 255));
        btnKetThuc1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnKetThuc1.setForeground(new java.awt.Color(25, 118, 211));
        btnKetThuc1.setText("Cancel");
        btnKetThuc1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnKetThuc1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKetThucActionPerformed(evt);
            }
        });
        jPanel5.add(btnKetThuc1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 330, 150, 40));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Sign Up");
        jLabel22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 122, -1));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(199, 226, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel23.setText("Don't have an account?");
        jPanel5.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, 213, -1));

        btnDangNhap2.setBackground(new java.awt.Color(255, 255, 255));
        btnDangNhap2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnDangNhap2.setForeground(new java.awt.Color(25, 118, 211));
        btnDangNhap2.setText("LOGIN");
        btnDangNhap2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDangNhap2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhap1ActionPerformed(evt);
            }
        });
        jPanel5.add(btnDangNhap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 150, 40));

        txtUsername.setBackground(new java.awt.Color(25, 118, 211));
        txtUsername.setForeground(new java.awt.Color(255, 255, 255));
        txtUsername.setBorder(null);
        txtUsername.setCaretColor(new java.awt.Color(255, 255, 255));
        txtUsername.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUsernameMousePressed(evt);
            }
        });
        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });
        jPanel5.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 139, 230, 30));

        txtPassword.setBackground(new java.awt.Color(25, 118, 211));
        txtPassword.setForeground(new java.awt.Color(255, 255, 255));
        txtPassword.setBorder(null);
        txtPassword.setCaretColor(new java.awt.Color(255, 255, 255));
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });
        jPanel5.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 209, 230, 30));

        jPanel3.setBackground(new java.awt.Color(25, 118, 211));
        jPanel3.setLayout(new java.awt.CardLayout());

        lblHidenPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhongKham/Hinh/icons8_invisible_20px_1.png"))); // NOI18N
        lblHidenPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblHidenPassMousePressed(evt);
            }
        });
        jPanel3.add(lblHidenPass, "card2");

        lblShowPass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhongKham/Hinh/icons8_eye_20px_1.png"))); // NOI18N
        lblShowPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                lblShowPassMousePressed(evt);
            }
        });
        jPanel3.add(lblShowPass, "card3");

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, 40, 40));

        btnQR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PhongKham/Hinh/qr-code.png"))); // NOI18N
        btnQR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQRActionPerformed(evt);
            }
        });
        jPanel5.add(btnQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 80, 80));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
//        if (!txtUsername.getText().equals(""))
//            dangNhap();
    }//GEN-LAST:event_formWindowOpened

    private void btnDangNhap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhap1ActionPerformed
        // TODO add your handling code here:
        
        this.dangNhap();

    }//GEN-LAST:event_btnDangNhap1ActionPerformed

    private void btnKetThucActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKetThucActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_btnKetThucActionPerformed

    private void chkCheckActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCheckActionPerformed
        // TODO add your handling code here:
//        if(txtPassword != null){
//            txtpassword.setEchoChar((char)0);
//        }else{
//            txtpassword.setEchoChar('*');
//        }

    }//GEN-LAST:event_chkCheckActionPerformed

    private void lblShowPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblShowPassMousePressed
        statusPass(true);
    }//GEN-LAST:event_lblShowPassMousePressed

    private void lblForgetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblForgetMouseClicked
        // TODO add your handling code here:
        DangNhap.this.dispose();
        DangNhapForget dn = new DangNhapForget();
        dn.setVisible(true);


    }//GEN-LAST:event_lblForgetMouseClicked

    private void lblHidenPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblHidenPassMousePressed
        statusPass(false);
    }//GEN-LAST:event_lblHidenPassMousePressed

    private void jLabel15KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel15KeyPressed

    }//GEN-LAST:event_jLabel15KeyPressed

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel20KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel20KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel20KeyPressed

    private void btnQRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQRActionPerformed
        // TODO add your handling code here:
        this.dispose();
        new ScanQRJFrame().setVisible(true);
                    

    }//GEN-LAST:event_btnQRActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUsernameActionPerformed

    private void txtUsernameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUsernameMousePressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUsernameMousePressed

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dangNhap();
        }
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            dangNhap();
        }
    }//GEN-LAST:event_txtPasswordKeyPressed

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
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(() -> {
            DangNhap dialog = new DangNhap(new javax.swing.JFrame(), true);
            dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                @Override
                public void windowClosing(java.awt.event.WindowEvent e) {
                    System.exit(0);
                }
            });
            dialog.setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap2;
    private javax.swing.JButton btnKetThuc1;
    private javax.swing.JButton btnQR;
    private javax.swing.JCheckBox chkCheck;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblForget;
    private javax.swing.JLabel lblHidenPass;
    private javax.swing.JLabel lblShowPass;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    void init() {
        setLocationRelativeTo(null);

    }

    TaiKhoanDao dao = new TaiKhoanDao();

    public  void dangNhap() {
    	
        String SDT = txtUsername.getText();
        String matKhau = new String(txtPassword.getPassword());
        chkCheck.setSelected(false);
            TaiKhoanPK TaiKhoanPK = dao.selectById(SDT);
        if (TaiKhoanPK == null) {
            MsgBox.alert(this, "Sai tên đăng nhập!");
                   } else if (!matKhau.equals(TaiKhoanPK.getMatKhau())) {
            MsgBox.alert(this, "Sai mật khẩu!");
           
        } else {
        	
        	 
            Auth.user = TaiKhoanPK;
            this.dispose();
//            new ClinicPK().setVisible(true);

        }
    }

    public  boolean dangNhap1(String tk1, String mk1) {
    	
         tk1 = txtUsername.getText();
         mk1 = new String(txtPassword.getPassword());
        chkCheck.setSelected(false);
            TaiKhoanPK TaiKhoanPK = dao.selectById(tk1);
        if (TaiKhoanPK == null) {
        	System.out.println("Sai tên đăng nhập!");
            return false;
        } else if (!mk1.equals(TaiKhoanPK.getMatKhau())) {
            
            System.out.println("Sai mật khẩu!");
            return false;
        } else {
        	Auth.user = TaiKhoanPK;
        	 this.dispose();
        	return  true;
//            new ClinicPK().setVisible(true);
        }
    }
    
    public void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc ứng dụng?")) {
            System.exit(0);
        }
    }

    private void statusPass(boolean st) {
        lblShowPass.setVisible(!st);
        lblHidenPass.setVisible(st);
        if (st) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }
    
    
   
}
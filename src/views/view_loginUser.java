/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author basirudin
 */
public class view_loginUser extends javax.swing.JFrame {

    /**
     * Creates new form view_loginUser
     */
    public view_loginUser() {
        initComponents();
    }

    public void btnMasukListener(ActionListener e) {
        this.btn_masuk.addActionListener(e);
    }

    public String getUsername() {
        return tf_username.getText();
    }

    public String getPassword() {
        String password = "";
        char passwordArray[] = this.tf_password.getPassword();
        for (int i = 0; i < passwordArray.length; i++) {
            password += passwordArray[i];
        }
        return password;
    }

    public void pesanLogin(String pesan) {
        JOptionPane.showMessageDialog(this, pesan);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tf_username = new javax.swing.JTextField();
        btn_masuk = new javax.swing.JButton();
        tf_password = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN ADMIN & OPERATOR");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_username.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_username.setText("admin");
        tf_username.setBorder(null);
        getContentPane().add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 65, 235, 20));

        btn_masuk.setBorder(null);
        btn_masuk.setContentAreaFilled(false);
        btn_masuk.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(btn_masuk, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 380, 30));

        tf_password.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tf_password.setText("admin");
        tf_password.setBorder(null);
        getContentPane().add(tf_password, new org.netbeans.lib.awtextra.AbsoluteConstraints(139, 115, 235, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginPemilik.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(view_loginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_loginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_loginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_loginUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_loginUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_masuk;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPasswordField tf_password;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}

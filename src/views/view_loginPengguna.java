/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author basirudin
 */
public class view_loginPengguna extends javax.swing.JFrame {

    /**
     * Creates new form view_loginPengguna
     */
    public view_loginPengguna() {
        initComponents();
    }

    public void btnMulaiListener(ActionListener e) {
        this.btn_mulai.addActionListener(e);
    }

    public JButton getMulai() {
        return btn_mulai;
    }

    public JTextField getUsername() {
        return tf_username;
    }

    public JTextField getID() {
        return tf_id;
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
        btn_mulai = new javax.swing.JButton();
        tf_id = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LOGIN PENGGUNA WARNET");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tf_username.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        tf_username.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tf_username.setText("Basir");
        tf_username.setBorder(null);
        tf_username.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        tf_username.setOpaque(false);
        getContentPane().add(tf_username, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 95, 360, 30));

        btn_mulai.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_mulai.setBorder(null);
        btn_mulai.setBorderPainted(false);
        btn_mulai.setContentAreaFilled(false);
        btn_mulai.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_mulai.setFocusable(false);
        getContentPane().add(btn_mulai, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 145, 380, 30));

        tf_id.setEditable(false);
        tf_id.setBorder(null);
        tf_id.setFocusable(false);
        tf_id.setOpaque(false);
        getContentPane().add(tf_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 19, 33, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/loginPengguna.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(view_loginPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_loginPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_loginPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_loginPengguna.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_loginPengguna().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_mulai;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField tf_id;
    private javax.swing.JTextField tf_username;
    // End of variables declaration//GEN-END:variables
}

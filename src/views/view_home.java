/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.awt.event.ActionListener;

/**
 *
 * @author basirudin
 */
public class view_home extends javax.swing.JFrame {

    /**
     * Creates new form view_home
     */
    public view_home() {
        initComponents();
    }

    public void btnPenggunaListener(ActionListener e) {
        this.btn_pengguna.addActionListener(e);
    }

    public void btnPemilikListener(ActionListener e) {
        this.btn_pemilik.addActionListener(e);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_pengguna = new javax.swing.JButton();
        btn_pemilik = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HALAMAN UTAMA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_pengguna.setBorder(null);
        btn_pengguna.setContentAreaFilled(false);
        btn_pengguna.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pengguna.setFocusable(false);
        getContentPane().add(btn_pengguna, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 95, 380, 40));

        btn_pemilik.setBorder(null);
        btn_pemilik.setContentAreaFilled(false);
        btn_pemilik.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_pemilik.setFocusable(false);
        getContentPane().add(btn_pemilik, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 380, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/home.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
            java.util.logging.Logger.getLogger(view_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(view_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(view_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(view_home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new view_home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_pemilik;
    private javax.swing.JButton btn_pengguna;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}

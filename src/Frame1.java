/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Frame1 extends javax.swing.JFrame {

    /**
     * Creates new form Frame1
     */
    public Frame1() {
        initComponents();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        hb1 = new javax.swing.JTextField();
        hb2 = new javax.swing.JTextField();
        hb3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        diskon = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(51, 255, 0));
        jPanel1.setLayout(null);

        jLabel1.setText("Pembayaran");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(260, 20, 100, 30);

        jLabel2.setText("Harga Barang 1");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 60, 90, 30);

        jLabel3.setText("Harga Barang 2");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(100, 110, 90, 30);

        jLabel4.setText("Harga Barang 3");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(100, 160, 90, 40);

        jButton1.setBackground(new java.awt.Color(51, 255, 0));
        jButton1.setText("Prosses");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 270, 90, 30);
        jPanel1.add(hb1);
        hb1.setBounds(220, 60, 160, 30);
        jPanel1.add(hb2);
        hb2.setBounds(220, 110, 160, 30);
        jPanel1.add(hb3);
        hb3.setBounds(220, 170, 160, 30);

        TA.setEditable(false);
        TA.setColumns(20);
        TA.setRows(5);
        jScrollPane1.setViewportView(TA);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(60, 320, 410, 180);

        jLabel5.setText("Discount");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(100, 220, 70, 20);

        diskon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diskonActionPerformed(evt);
            }
        });
        jPanel1.add(diskon);
        diskon.setBounds(220, 220, 160, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 700, 530);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int brg1 = Integer.parseInt(hb1.getText());
        int brg2 = Integer.parseInt(hb2.getText());
        int brg3 = Integer.parseInt(hb3.getText());
        int totalharga = brg1 + brg2 + brg3;
        int discount = Integer.parseInt(diskon.getText());
        int totalpembayaran = totalharga - ((totalharga/100)*discount);
        
        TA.setText("Harga Barang 1 = "+brg1+"\nHarga Barang 2 = "+brg2+"\nHarga Barang 3 = "+brg3+"\nTotal Harga = "+totalharga+"\nDiscount = "+discount+"%\nTotal Pembayaran = "+totalpembayaran);
        
        
        
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void diskonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diskonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diskonActionPerformed

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
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea TA;
    private javax.swing.JTextField diskon;
    private javax.swing.JTextField hb1;
    private javax.swing.JTextField hb2;
    private javax.swing.JTextField hb3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

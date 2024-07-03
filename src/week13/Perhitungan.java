package week13;
import javax.swing.JOptionPane;

public class Perhitungan extends javax.swing.JFrame {

    public Perhitungan() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelNama = new javax.swing.JLabel();
        TxtNama = new javax.swing.JTextField();
        LabelPenjumlahan = new javax.swing.JLabel();
        Angka1 = new javax.swing.JTextField();
        Angka2 = new javax.swing.JTextField();
        Penjumlahan = new javax.swing.JButton();
        TxtHasilPenjumlahan = new javax.swing.JLabel();
        LabelSamaDengan = new javax.swing.JLabel();
        LabelLuasLingkaran = new javax.swing.JLabel();
        txtPiLuasLingkaran = new javax.swing.JTextField();
        Btnperkalian = new javax.swing.JButton();
        AngkaLuasLingkaran = new javax.swing.JTextField();
        LabelSamaDengan2 = new javax.swing.JLabel();
        TxtHasilLuasLingkaran = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelNama.setText("Nama");

        TxtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtNamaActionPerformed(evt);
            }
        });

        LabelPenjumlahan.setText("Penjumlahan");

        Angka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka1ActionPerformed(evt);
            }
        });

        Angka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Angka2ActionPerformed(evt);
            }
        });

        Penjumlahan.setText("+");
        Penjumlahan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PenjumlahanActionPerformed(evt);
            }
        });

        LabelSamaDengan.setText("=");

        LabelLuasLingkaran.setText("Luas Lingkaran");

        txtPiLuasLingkaran.setText("3.14");
        txtPiLuasLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPiLuasLingkaranActionPerformed(evt);
            }
        });

        Btnperkalian.setText("x");
        Btnperkalian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnperkalianActionPerformed(evt);
            }
        });

        AngkaLuasLingkaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AngkaLuasLingkaranActionPerformed(evt);
            }
        });

        LabelSamaDengan2.setText("=");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPiLuasLingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Btnperkalian)
                        .addGap(18, 18, 18)
                        .addComponent(AngkaLuasLingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LabelSamaDengan2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtHasilLuasLingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LabelLuasLingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Angka1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(Penjumlahan)
                        .addGap(18, 18, 18)
                        .addComponent(Angka2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelSamaDengan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TxtHasilPenjumlahan, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(94, 94, 94))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(LabelPenjumlahan, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)))
                        .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNama)
                    .addComponent(TxtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addComponent(LabelPenjumlahan)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Angka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Angka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Penjumlahan)
                    .addComponent(TxtHasilPenjumlahan)
                    .addComponent(LabelSamaDengan))
                .addGap(36, 36, 36)
                .addComponent(LabelLuasLingkaran)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPiLuasLingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btnperkalian)
                    .addComponent(AngkaLuasLingkaran, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelSamaDengan2)
                    .addComponent(TxtHasilLuasLingkaran))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnperkalianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnperkalianActionPerformed
        // TODO add your handling code here:
        if (TxtNama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama belum diisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
           try {
        double pi = Double.parseDouble(txtPiLuasLingkaran.getText());
        double radius = Double.parseDouble(AngkaLuasLingkaran.getText());
        
        double luas = pi * radius * radius;
        
        TxtHasilLuasLingkaran.setText(String.valueOf(luas));               
           } catch (NumberFormatException e) {
               JOptionPane.showMessageDialog(this, "Input angka tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
           }
        }

    }//GEN-LAST:event_BtnperkalianActionPerformed

    private void TxtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtNamaActionPerformed

    private void Angka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Angka1ActionPerformed

    private void PenjumlahanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PenjumlahanActionPerformed
        if (TxtNama.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Nama belum diisi", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                int angka1 = Integer.parseInt(Angka1.getText());
                int angka2 = Integer.parseInt(Angka2.getText());
                
                int hasil = angka1 + angka2;
                
                TxtHasilPenjumlahan.setText(String.valueOf(hasil));
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Input angka tidak valid", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_PenjumlahanActionPerformed

    private void Angka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Angka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Angka2ActionPerformed

    private void txtPiLuasLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPiLuasLingkaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPiLuasLingkaranActionPerformed

    private void AngkaLuasLingkaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AngkaLuasLingkaranActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AngkaLuasLingkaranActionPerformed

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
            java.util.logging.Logger.getLogger(Perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Perhitungan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Perhitungan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Angka1;
    private javax.swing.JTextField Angka2;
    private javax.swing.JTextField AngkaLuasLingkaran;
    private javax.swing.JButton Btnperkalian;
    private javax.swing.JLabel LabelLuasLingkaran;
    private javax.swing.JLabel LabelNama;
    private javax.swing.JLabel LabelPenjumlahan;
    private javax.swing.JLabel LabelSamaDengan;
    private javax.swing.JLabel LabelSamaDengan2;
    private javax.swing.JButton Penjumlahan;
    private javax.swing.JLabel TxtHasilLuasLingkaran;
    private javax.swing.JLabel TxtHasilPenjumlahan;
    private javax.swing.JTextField TxtNama;
    private javax.swing.JTextField txtPiLuasLingkaran;
    // End of variables declaration//GEN-END:variables
}

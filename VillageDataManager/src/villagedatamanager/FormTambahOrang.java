/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package villagedatamanager;

/**
 *
 * @author HP 14 - BS001TX
 */
public class FormTambahOrang extends javax.swing.JFrame {

    /**
     * Creates new form FormTambahOrang
     */
    private ControlOrang controlorang;
    private int idorg;
    private int norumah;
    private String notelp;
    private String namaorg;
    private String alamat;
    public FormTambahOrang(ControlOrang passctrlorang) {
        initComponents();
        this.controlorang = passctrlorang;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        namatextfield = new javax.swing.JTextField();
        idtextfield = new javax.swing.JTextField();
        norumahtextfield = new javax.swing.JTextField();
        buttontambah = new javax.swing.JButton();
        buttonback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        notelptextfield = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        alamattextfield = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        namatextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namatextfieldActionPerformed(evt);
            }
        });

        norumahtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                norumahtextfieldActionPerformed(evt);
            }
        });

        buttontambah.setText("Tambah");
        buttontambah.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttontambahMouseClicked(evt);
            }
        });

        buttonback.setText("Back");
        buttonback.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                buttonbackMouseClicked(evt);
            }
        });

        jLabel1.setText("Nama");

        jLabel2.setText("ID");

        jLabel3.setText("NoRumah");

        notelptextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                notelptextfieldActionPerformed(evt);
            }
        });

        jLabel4.setText("NoTelp");

        jLabel5.setText("Form Penambahan Orang");

        jLabel6.setText("Alamat");

        alamattextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alamattextfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel3))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(notelptextfield)
                                    .addComponent(alamattextfield)
                                    .addComponent(namatextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(idtextfield)
                                    .addComponent(norumahtextfield)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(buttontambah)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(buttonback)))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(namatextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idtextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(norumahtextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notelptextfield, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alamattextfield, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonback)
                    .addComponent(buttontambah))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttontambahMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttontambahMouseClicked
        // TODO add your handling code here:]
        this.namaorg = namatextfield.getText();
        this.norumah = Integer.parseInt(norumahtextfield.getText());
        this.notelp = notelptextfield.getText();
        this.alamat = alamattextfield.getText();
        this.idorg = Integer.parseInt(idtextfield.getText());
        controlorang.tambahOrang(this.idorg, this.norumah, this.notelp, this.alamat, this.namaorg);
        System.out.print(this.namaorg);
        namatextfield.setText("");
        norumahtextfield.setText("");
        notelptextfield.setText("");
        idtextfield.setText("");
        alamattextfield.setText("");        
    }//GEN-LAST:event_buttontambahMouseClicked

    private void buttonbackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_buttonbackMouseClicked
        // TODO add your handling code here:
        this.dispose();        
    }//GEN-LAST:event_buttonbackMouseClicked

    private void namatextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namatextfieldActionPerformed
        // TODO add your handling code here:
        this.namaorg = namatextfield.getText();
    }//GEN-LAST:event_namatextfieldActionPerformed

    private void norumahtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_norumahtextfieldActionPerformed
        // TODO add your handling code here:
        this.norumah = Integer.parseInt(norumahtextfield.getText());
    }//GEN-LAST:event_norumahtextfieldActionPerformed

    private void notelptextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_notelptextfieldActionPerformed
        // TODO add your handling code here:
        this.notelp = notelptextfield.getText();
    }//GEN-LAST:event_notelptextfieldActionPerformed

    private void alamattextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alamattextfieldActionPerformed
        // TODO add your handling code here:
        this.alamat = alamattextfield.getText();
    }//GEN-LAST:event_alamattextfieldActionPerformed
    public void empty()
    {
    }
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
            java.util.logging.Logger.getLogger(FormTambahOrang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormTambahOrang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormTambahOrang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormTambahOrang.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new FormTambahOrang().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamattextfield;
    private javax.swing.JButton buttonback;
    private javax.swing.JButton buttontambah;
    private javax.swing.JTextField idtextfield;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField namatextfield;
    private javax.swing.JTextField norumahtextfield;
    private javax.swing.JTextField notelptextfield;
    // End of variables declaration//GEN-END:variables
}

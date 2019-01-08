package uasprojek;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class dokter extends javax.swing.JFrame {

    private Connection koneksi;
    private koneksi konek = new koneksi();
    ResultSet rss;
    Statement stt;
    
    public dokter() {
        initComponents();
    }

   public void save(){
    
    konek.dbkoneksi();
    
    int kode = Integer.parseInt(kode_dokter.getText());
    String nama = nama_dokter.getText();
    String jeniskell="";
    
        if (jeniskelamin_dokter.getSelectedItem()=="LAKI-LAKI"){jeniskell="LAKI-LAKI";}
        else if (jeniskelamin_dokter.getSelectedItem()=="PEREMPUAN"){jeniskell="PEREMPUAN";}
        String jeniskel = String.valueOf(jeniskell);
        
    String alamat = alamat_dokter.getText();
    String kota   = kota_dokter.getText();
    String notelp = notelp_dokter.getText();
    
    try{
        
        stt = (Statement) konek.getkoneksi().createStatement();
        String insert = "insert into datadokter values"
            + "('"+kode+"','"+nama+"','"+jeniskel+"','"+alamat+"','"+kota+"','"+notelp+"')";
            
            stt.executeUpdate(insert);
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Dimasukan");
    
    }catch(Exception f){
        JOptionPane.showMessageDialog(null, "Data Gagal Dimasukan"+f);
        System.out.println(f.getMessage());
    }tampil();
    }
    
   public void tampil(){
    konek.dbkoneksi();
     
        DefaultTableModel tabel = new DefaultTableModel();
        
        tabel.addColumn("KODE");
        tabel.addColumn("NAMA");
        tabel.addColumn("JENIS KELAMIN");
        tabel.addColumn("ALAMAT");
        tabel.addColumn("KOTA");
        tabel.addColumn("NO TELP");
        tabel_dokter.setModel(tabel);
        
         try{
            
            String select = "select * from datadokter";
            stt= konek.getkoneksi().createStatement();
            rss = stt.executeQuery(select);
        while (rss.next()){
               tabel.addRow(new Object[]{
                    rss.getString(1),
                    rss.getString(2),
                    rss.getString(3),
                    rss.getString(4),
                    rss.getString(5),
                    rss.getString(6)});
            tabel_dokter.setModel(tabel);
        }
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Gagal Output"+c);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        kode_dokter = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        nama_dokter = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jeniskelamin_dokter = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        notelp_dokter = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        kota_dokter = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        alamat_dokter = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_dokter = new javax.swing.JTable();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Rod", 0, 21)); // NOI18N
        jLabel1.setText("DATA DOKTER");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(163, 163, 163)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jPanel3.setBackground(new java.awt.Color(153, 153, 153));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        kode_dokter.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel2.setText("KODE DOKTER");

        jLabel3.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel3.setText("NAMA DOKTER");

        nama_dokter.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel5.setText("JENIS KELAMIN");

        jeniskelamin_dokter.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jeniskelamin_dokter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "LAKI-LAKI", "PEREMPUAN" }));

        jLabel7.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel7.setText("NO TELPHONE");

        notelp_dokter.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel9.setText("KOTA");

        kota_dokter.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel10.setText("ALAMAT");

        alamat_dokter.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(kode_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(nama_dokter)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(0, 1, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel5)
                            .addComponent(jLabel9)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamat_dokter)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kota_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(notelp_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jeniskelamin_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)))))
                .addGap(99, 99, 99))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kode_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jeniskelamin_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alamat_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(17, 17, 17)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kota_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notelp_dokter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("REGIS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabel_dokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3", "4", "5", "6"
            }
        ));
        tabel_dokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_dokterMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_dokter);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATABASE", jPanel4);

        save.setBackground(new java.awt.Color(0, 0, 0));
        save.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        edit.setBackground(new java.awt.Color(0, 0, 0));
        edit.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.setMaximumSize(new java.awt.Dimension(61, 21));
        delete.setMinimumSize(new java.awt.Dimension(61, 21));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        reset.setBackground(new java.awt.Color(0, 0, 0));
        reset.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.setMaximumSize(new java.awt.Dimension(61, 21));
        reset.setMinimumSize(new java.awt.Dimension(61, 21));
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        refresh.setBackground(new java.awt.Color(0, 0, 0));
        refresh.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        refresh.setForeground(new java.awt.Color(255, 255, 255));
        refresh.setText("REFRESH");
        refresh.setMaximumSize(new java.awt.Dimension(61, 21));
        refresh.setMinimumSize(new java.awt.Dimension(61, 21));
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        back.setBackground(new java.awt.Color(0, 0, 0));
        back.setFont(new java.awt.Font("Arial Black", 0, 12)); // NOI18N
        back.setForeground(new java.awt.Color(255, 102, 255));
        back.setText("BACK");
        back.setMaximumSize(new java.awt.Dimension(61, 21));
        back.setMinimumSize(new java.awt.Dimension(61, 21));
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTabbedPane1)
                            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(90, 90, 90)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(59, 59, 59))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabel_dokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_dokterMouseClicked
        // TODO add your handling code here:
        try{
        int baris = tabel_dokter.rowAtPoint(evt.getPoint());
        
        String dokter   = tabel_dokter.getValueAt(baris, 0).toString();
        String nama     = tabel_dokter.getValueAt(baris, 1).toString();
        String jeniskel = tabel_dokter.getValueAt(baris, 2).toString();
        String alamat   = tabel_dokter.getValueAt(baris, 3).toString();
        String kota     = tabel_dokter.getValueAt(baris, 4).toString();
        String notelp   = tabel_dokter.getValueAt(baris, 5).toString();
        
        
        kode_dokter.setText(dokter);
        nama_dokter.setText(nama);
        jeniskelamin_dokter.setSelectedItem(jeniskel);
        alamat_dokter.setText(alamat);
        kota_dokter.setText(kota);
        notelp_dokter.setText(notelp);
        
        }catch(Exception f){
    
        JOptionPane.showMessageDialog(rootPane, "Gagal Memilih"+f);    
       }
    }//GEN-LAST:event_tabel_dokterMouseClicked

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
        konek.dbkoneksi();

        int kode = Integer.parseInt(kode_dokter.getText());
        String nama = nama_dokter.getText();
        String jeniskell="";

        if (jeniskelamin_dokter.getSelectedItem()=="LAKI-LAKI"){jeniskell="LAKI-LAKI";}
        else if (jeniskelamin_dokter.getSelectedItem()=="PEREMPUAN"){jeniskell="PEREMPUAN";}
        String jeniskel = String.valueOf(jeniskell);

      
        String alamat = alamat_dokter.getText();
        String kota   = kota_dokter.getText();
        String notelp = notelp_dokter.getText();

        try{
            stt = (Statement) konek.getkoneksi().createStatement();

            String update = "UPDATE datadokter SET"

            +"`kode_dokter`='"+kode+"',"
            +"`nama_dokter`='"+nama+"',"
            +"`jenis_kelamin`='"+jeniskel+"',"
            +"`alamat_dokter`='"+alamat+"',"
            +"`kota_dokter`='"+kota+"',"
            +"`notelp_dokter`='"+notelp+"'"
            +"WHERE kode_dokter='"+kode+"'";

            stt.executeUpdate(update);

            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");

        }catch(Exception f){
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit"+f);

        }
        tampil();

    }//GEN-LAST:event_editActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        konek.dbkoneksi();
        try{
            stt = (Statement) konek.getkoneksi().createStatement();

            String delete = "Delete From datadokter Where kode_dokter = "
            + "('"+kode_dokter.getText()+"')";

            stt.executeUpdate(delete);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");

        }catch(Exception f){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+f);

        }
        tampil();
    }//GEN-LAST:event_deleteActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        kode_dokter.setText("");
        nama_dokter.setText("");
        jeniskelamin_dokter.setSelectedItem("-");
        alamat_dokter.setText("");
        kota_dokter.setText("");
        notelp_dokter.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_refreshActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        // TODO add your handling code here:
        new menu().show();
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

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
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dokter.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dokter().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_dokter;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jeniskelamin_dokter;
    private javax.swing.JTextField kode_dokter;
    private javax.swing.JTextField kota_dokter;
    private javax.swing.JTextField nama_dokter;
    private javax.swing.JTextField notelp_dokter;
    private javax.swing.JButton refresh;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel_dokter;
    // End of variables declaration//GEN-END:variables
}

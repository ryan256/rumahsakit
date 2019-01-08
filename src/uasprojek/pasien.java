package uasprojek;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class pasien extends javax.swing.JFrame {

    private Connection koneksi;
    private koneksi konek = new koneksi();
    ResultSet rss;
    Statement stt;
    
    public pasien() {
        initComponents();
    }
    
    public void save(){
    
    konek.dbkoneksi();
    
    int kode = Integer.parseInt(kode_pasien.getText());
    String nama = nama_pasien.getText();
    String jeniskell="";
    
        if (jeniskelamin_pasien.getSelectedItem()=="LAKI-LAKI"){jeniskell="LAKI-LAKI";}
        else if (jeniskelamin_pasien.getSelectedItem()=="PEREMPUAN"){jeniskell="PEREMPUAN";}
        String jeniskel = String.valueOf(jeniskell);
        
    int umur = Integer.parseInt(umur_pasien.getText());
    String alamat = alamat_pasien.getText();
    String notelp = notelp_pasien.getText();
    
    try{
        
        stt = (Statement) konek.getkoneksi().createStatement();
        String insert = "insert into datapasien values"
            + "('"+kode+"','"+nama+"','"+jeniskel+"','"+umur+"','"+alamat+"','"+notelp+"')";
            
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
        tabel.addColumn("UMUR");
        tabel.addColumn("ALAMAT");
        tabel.addColumn("NO TELP");
        tabel_pasien.setModel(tabel);
        
        try{
            
            String select = "select * from datapasien";
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
            tabel_pasien.setModel(tabel);
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
        jLabel2 = new javax.swing.JLabel();
        kode_pasien = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nama_pasien = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        alamat_pasien = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        umur_pasien = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jeniskelamin_pasien = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        notelp_pasien = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_pasien = new javax.swing.JTable();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        refresh = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setFont(new java.awt.Font("Rod", 0, 21)); // NOI18N
        jLabel1.setText("DATA PASIEN");

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

        jLabel2.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel2.setText("KODE PASIEN");

        kode_pasien.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel3.setText("NAMA PASIEN");

        nama_pasien.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel4.setText("UMUR");

        alamat_pasien.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel5.setText("JENIS KELAMIN");

        umur_pasien.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel6.setText("ALAMAT");

        jeniskelamin_pasien.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jeniskelamin_pasien.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "LAKI-LAKI", "PEREMPUAN" }));

        jLabel7.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        jLabel7.setText("NO TELPHONE");

        notelp_pasien.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

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
                            .addComponent(nama_pasien)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(kode_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(0, 15, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(alamat_pasien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(umur_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jeniskelamin_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(notelp_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(99, 99, 99))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(kode_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nama_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jeniskelamin_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(14, 14, 14)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(umur_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(alamat_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(notelp_pasien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addContainerGap(55, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("REGIS", jPanel3);

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));

        tabel_pasien.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N
        tabel_pasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "1", "2", "3", "4", "5", "6"
            }
        ));
        tabel_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pasienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_pasien);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1))
                .addContainerGap(28, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(save, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(edit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(84, 84, 84)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(save, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(4, 4, 4)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(edit, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 550));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
         konek.dbkoneksi();
        
        int kode = Integer.parseInt(kode_pasien.getText());
        String nama = nama_pasien.getText();
        String jeniskell="";
    
            if (jeniskelamin_pasien.getSelectedItem()=="LAKI-LAKI"){jeniskell="LAKI-LAKI";}
            else if (jeniskelamin_pasien.getSelectedItem()=="PEREMPUAN"){jeniskell="PEREMPUAN";}
            String jeniskel = String.valueOf(jeniskell);
        
        int umur = Integer.parseInt(umur_pasien.getText());
        String alamat = alamat_pasien.getText();
        String notelp = notelp_pasien.getText();
        
        try{
            stt = (Statement) konek.getkoneksi().createStatement();
         
            String update = "UPDATE datapasien SET"
                    
            +"`kode_pasien`='"+kode+"',"
            +"`nama_pasien`='"+nama+"',"
            +"`jenis_kelamin`='"+jeniskel+"',"
            +"`umur_pasien`='"+umur+"',"
            +"`alamat_pasien`='"+alamat+"',"
            +"`notelp_pasien`='"+notelp+"'"        
            +"WHERE kode_pasien='"+kode+"'";
            
            stt.executeUpdate(update);
            
            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");

        }catch(Exception f){
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit"+f);

        }
        tampil();
        
    }//GEN-LAST:event_editActionPerformed

    private void tabel_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pasienMouseClicked
        // TODO add your handling code here:
        try{
        int baris = tabel_pasien.rowAtPoint(evt.getPoint());
        
        String pasien   = tabel_pasien.getValueAt(baris, 0).toString();
        String nama     = tabel_pasien.getValueAt(baris, 1).toString();
        String jeniskel = tabel_pasien.getValueAt(baris, 2).toString();
        String umur     = tabel_pasien.getValueAt(baris, 3).toString();
        String alamat   = tabel_pasien.getValueAt(baris, 4).toString();
        String notelp   = tabel_pasien.getValueAt(baris, 5).toString();
        
        
        kode_pasien.setText(pasien);
        nama_pasien.setText(nama);
        jeniskelamin_pasien.setSelectedItem(jeniskel);
        umur_pasien.setText(umur);
        alamat_pasien.setText(alamat);
        notelp_pasien.setText(notelp);
        
        }catch(Exception f){
    
        JOptionPane.showMessageDialog(rootPane, "Gagal Memilih"+f);    
       }
    }//GEN-LAST:event_tabel_pasienMouseClicked

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        kode_pasien.setText("");
        nama_pasien.setText("");
        jeniskelamin_pasien.setSelectedItem("-");
        umur_pasien.setText("");
        alamat_pasien.setText("");
        notelp_pasien.setText("");
    }//GEN-LAST:event_resetActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        // TODO add your handling code here:
        save();
    }//GEN-LAST:event_saveActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_refreshActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        konek.dbkoneksi();
        try{
            stt = (Statement) konek.getkoneksi().createStatement();
         
            String delete = "Delete From datapasien Where kode_pasien = "
            + "('"+kode_pasien.getText()+"')";
             
            stt.executeUpdate(delete);
            JOptionPane.showMessageDialog(null, "Data Berhasil Dihapus");

        }catch(Exception f){
            JOptionPane.showMessageDialog(null, "Data Gagal Dihapus"+f);

        }
        tampil();
    }//GEN-LAST:event_deleteActionPerformed

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
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pasien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pasien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField alamat_pasien;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JComboBox<String> jeniskelamin_pasien;
    private javax.swing.JTextField kode_pasien;
    private javax.swing.JTextField nama_pasien;
    private javax.swing.JTextField notelp_pasien;
    private javax.swing.JButton refresh;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JTable tabel_pasien;
    private javax.swing.JTextField umur_pasien;
    // End of variables declaration//GEN-END:variables
}

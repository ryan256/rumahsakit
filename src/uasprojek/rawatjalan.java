
package uasprojek;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class rawatjalan extends javax.swing.JFrame {

    private Connection koneksi;
    private koneksi konek = new koneksi();
    ResultSet rss;
    Statement stt;
    
    public rawatjalan() {
        initComponents();
    }

    public void save(){
    konek.dbkoneksi();
    
    int koderawatjalan = Integer.parseInt(kode_rawatjalan.getText());
    int kodedokter     = Integer.parseInt(kode_dokter_.getText());
    int kodepasien     = Integer.parseInt(kode_pasien_.getText());
    int kodeperawat    = Integer.parseInt(kode_obat_.getText());
    
  
    String nama_dokter = nama_dokter_.getText();
    String nama_pasien = nama_pasien_.getText();
    String nama_perawat = nama_obat_.getText();
    String tanggalperiksa = tanggal_periksa.getText();
        
        try{
        
        stt = (Statement) konek.getkoneksi().createStatement();
        String insert = "insert into rawatjalan values"
           + "('"+koderawatjalan+"','"+kodedokter+"','"+nama_dokter+"','"+kodepasien+"','"
           +nama_pasien+"','"+kodeperawat+"','"+nama_perawat+"','"
           +tanggalperiksa+"')";
            
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
        
        tabel.addColumn("KODE RAWAT JALAN");
        tabel.addColumn("KODE DOKTER");
        tabel.addColumn("NAMA DOKTER");
        tabel.addColumn("KODE PASIEN");
        tabel.addColumn("NAMA PASIEN");
        tabel.addColumn("KODE OBAT");
        tabel.addColumn("NAMA OBAT");
        tabel.addColumn("TANGGAL PERIKSA");
        tabel_rawatjalan.setModel(tabel);
        
         try{
            
            String select = "select * from rawatjalan";
            stt= konek.getkoneksi().createStatement();
            rss = stt.executeQuery(select);
        while (rss.next()){
               tabel.addRow(new Object[]{
                    rss.getString(1),
                    rss.getString(2),
                    rss.getString(3),
                    rss.getString(4),
                    rss.getString(5),
                    rss.getString(6),
                    rss.getString(7),
                    rss.getString(8)});
            tabel_rawatjalan.setModel(tabel);
        }
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Gagal Output"+c);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        kode_pasien_ = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        nama_pasien_ = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        kode_obat_ = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        nama_obat_ = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        tanggal_periksa = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        kode_dokter_ = new javax.swing.JTextField();
        nama_dokter_ = new javax.swing.JTextField();
        kode_rawatjalan = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel9 = new javax.swing.JPanel();
        isi_dokter2 = new javax.swing.JScrollPane();
        tabel_dokter = new javax.swing.JTable();
        REFRESH2 = new javax.swing.JButton();
        add2 = new javax.swing.JButton();
        jPanel10 = new javax.swing.JPanel();
        isil_pasien2 = new javax.swing.JScrollPane();
        tabel_pasien = new javax.swing.JTable();
        REFRESH3 = new javax.swing.JButton();
        add3 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        isi_obat2 = new javax.swing.JScrollPane();
        tabel_obat = new javax.swing.JTable();
        REFRESH1 = new javax.swing.JButton();
        add1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabel_rawatjalan = new javax.swing.JTable();
        save = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        save1 = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        back = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Rod", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("FORM RAWAT JALAN");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(88, 88, 88))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, 410, -1));

        jTabbedPane1.setBackground(new java.awt.Color(0, 0, 0));
        jTabbedPane1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jTabbedPane1.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel8.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel8.setText("KODE PASIEN");

        kode_pasien_.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        jLabel9.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel9.setText("NAMA PASIEN");

        nama_pasien_.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        jLabel10.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel10.setText("KODE OBAT");

        kode_obat_.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        jLabel11.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel11.setText("NAMA OBAT");

        nama_obat_.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        jLabel12.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel12.setText("TANGGAL PERIKSA");

        tanggal_periksa.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        jLabel14.setFont(new java.awt.Font("Rod", 0, 11)); // NOI18N
        jLabel14.setText("yyyy-MM-dd");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nama_obat_, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(kode_obat_, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(20, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(kode_pasien_, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama_pasien_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel12)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(tanggal_periksa, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel11))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(kode_pasien_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(nama_pasien_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(kode_obat_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(nama_obat_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel14)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(tanggal_periksa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(115, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 153));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel4.setText("KODE RAWAT JALAN");

        jLabel7.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel7.setText("KODE DOKTER");

        jLabel15.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N
        jLabel15.setText("NAMA DOKTER");

        kode_dokter_.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        nama_dokter_.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        kode_rawatjalan.setFont(new java.awt.Font("Rod", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kode_rawatjalan, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nama_dokter_, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(kode_dokter_, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kode_rawatjalan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(kode_dokter_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(nama_dokter_, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(22, 22, 22))
        );

        jTabbedPane1.addTab("REGIS", jPanel2);

        jPanel7.setBackground(new java.awt.Color(102, 102, 102));

        jTabbedPane2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jTabbedPane2.setFont(new java.awt.Font("Rod", 0, 11)); // NOI18N

        jPanel9.setBackground(new java.awt.Color(153, 153, 153));

        tabel_dokter.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_dokter.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_dokterMouseClicked(evt);
            }
        });
        isi_dokter2.setViewportView(tabel_dokter);

        REFRESH2.setText("REFRESH");
        REFRESH2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESH2ActionPerformed(evt);
            }
        });

        add2.setText("ADD");
        add2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isi_dokter2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(REFRESH2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REFRESH2)
                    .addComponent(add2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isi_dokter2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane2.addTab("DATABASE DOKTER", jPanel9);

        jPanel10.setBackground(new java.awt.Color(153, 153, 153));

        tabel_pasien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_pasien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_pasienMouseClicked(evt);
            }
        });
        isil_pasien2.setViewportView(tabel_pasien);

        REFRESH3.setText("REFRESH");
        REFRESH3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESH3ActionPerformed(evt);
            }
        });

        add3.setText("ADD");
        add3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isil_pasien2, javax.swing.GroupLayout.DEFAULT_SIZE, 676, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(REFRESH3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(add3, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REFRESH3)
                    .addComponent(add3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isil_pasien2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane2.addTab("DATABASE PASIEN", jPanel10);

        jPanel8.setBackground(new java.awt.Color(153, 153, 153));

        tabel_obat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2"
            }
        ));
        tabel_obat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_obatMouseClicked(evt);
            }
        });
        isi_obat2.setViewportView(tabel_obat);

        REFRESH1.setText("REFRESH");
        REFRESH1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESH1ActionPerformed(evt);
            }
        });

        add1.setText("ADD");
        add1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(REFRESH1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(isi_obat2, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(110, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(REFRESH1)
                    .addComponent(add1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(isi_obat2, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37))
        );

        jTabbedPane2.addTab("DATABASE OBAT", jPanel8);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane2)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        jTabbedPane1.addTab("ALL DATABASE", jPanel7);

        jPanel4.setBackground(new java.awt.Color(102, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jScrollPane1.setBackground(new java.awt.Color(153, 153, 153));
        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jScrollPane1.setFont(new java.awt.Font("Rod", 0, 12)); // NOI18N

        tabel_rawatjalan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel_rawatjalan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabel_rawatjalanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabel_rawatjalan);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 723, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("DATABASE RAWAT JALAN", jPanel4);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 730, 430));

        save.setBackground(new java.awt.Color(51, 51, 51));
        save.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("SAVE");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 560, 80, 40));

        edit.setBackground(new java.awt.Color(51, 51, 51));
        edit.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        edit.setForeground(new java.awt.Color(255, 255, 255));
        edit.setText("EDIT");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        getContentPane().add(edit, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 610, 80, 40));

        reset.setBackground(new java.awt.Color(51, 51, 51));
        reset.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        reset.setForeground(new java.awt.Color(255, 255, 255));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 600, 80, 40));

        save1.setBackground(new java.awt.Color(51, 51, 51));
        save1.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        save1.setForeground(new java.awt.Color(255, 255, 255));
        save1.setText("REFRESH");
        save1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save1ActionPerformed(evt);
            }
        });
        getContentPane().add(save1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 550, 100, 40));

        delete.setBackground(new java.awt.Color(51, 51, 51));
        delete.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 610, 90, 40));

        back.setBackground(new java.awt.Color(51, 51, 51));
        back.setFont(new java.awt.Font("Rod", 1, 14)); // NOI18N
        back.setForeground(new java.awt.Color(204, 0, 51));
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 560, 80, 40));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/HD-Background.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed

        save();

    }//GEN-LAST:event_saveActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        konek.dbkoneksi();

        int koderawatjalan  = Integer.parseInt(kode_rawatjalan.getText());
        int kodedokter  = Integer.parseInt(kode_dokter_.getText());
        int kodepasien  = Integer.parseInt(kode_pasien_.getText());
        int kodeobat = Integer.parseInt(kode_obat_.getText());
        
        String nama_dokter = nama_dokter_.getText();
        String nama_pasien = nama_pasien_.getText();
        String nama_obat = nama_obat_.getText();
        String tanggalperiksa = tanggal_periksa.getText();

        try{
            stt = (Statement) konek.getkoneksi().createStatement();

            String update = "UPDATE rawatjalan SET"
            +"`kode_rawatjalan`='"+koderawatjalan+"',"
            +"`kode_dokter`='"+kodedokter+"',"
            +"`nama_dokter_`='"+nama_dokter+"',"
            +"`kode_pasien`='"+kodepasien+"',"
            +"`nama_pasien_`='"+nama_pasien+"',"
            +"`kode_obat`='"+kodeobat+"',"
            +"`nama_obat`='"+nama_obat+"',"
            +"`tanggal_periksa`='"+tanggalperiksa+"'"
            +"WHERE kode_rawatjalan='"+koderawatjalan+"'";

            stt.executeUpdate(update);

            JOptionPane.showMessageDialog(null, "Data Berhasil Diedit");

        }catch(Exception f){
            JOptionPane.showMessageDialog(null, "Data Gagal Diedit"+f);

        }
        tampil();
    }//GEN-LAST:event_editActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        kode_rawatjalan.setText("");
        kode_dokter_.setText("");
        nama_dokter_.setText("");
        kode_pasien_.setText("");
        nama_pasien_.setText("");
        kode_obat_.setText("");
        nama_obat_.setText("");
        tanggal_periksa.setText("");

    }//GEN-LAST:event_resetActionPerformed

    private void save1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save1ActionPerformed
        // TODO add your handling code here:
        tampil();
    }//GEN-LAST:event_save1ActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed

        konek.dbkoneksi();
        try{
            stt = (Statement) konek.getkoneksi().createStatement();

            String delete = "Delete From rawatjalan Where kode_rawatjalan = "
            + "('"+kode_rawatjalan.getText()+"')";

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

    private void add3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add3ActionPerformed
        // TODO add your handling code here:
        new pasien().show();
        this.dispose();
    }//GEN-LAST:event_add3ActionPerformed

    private void REFRESH3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESH3ActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_REFRESH3ActionPerformed

    private void tabel_pasienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_pasienMouseClicked
        // TODO add your handling code here:
        try{
            int baris = tabel_pasien.rowAtPoint(evt.getPoint());

            String pasien   = tabel_pasien.getValueAt(baris, 0).toString();
            String nama     = tabel_pasien.getValueAt(baris, 1).toString();

            kode_pasien_.setText(pasien);
            nama_pasien_.setText(nama);

        }catch(Exception f){

            JOptionPane.showMessageDialog(rootPane, "Gagal Memilih"+f);
        }
    }//GEN-LAST:event_tabel_pasienMouseClicked

    private void add2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add2ActionPerformed
        // TODO add your handling code here:
        new dokter().show();
        this.dispose();
    }//GEN-LAST:event_add2ActionPerformed

    private void REFRESH2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESH2ActionPerformed
        // TODO add your handling code here:
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
    }//GEN-LAST:event_REFRESH2ActionPerformed

    private void tabel_dokterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_dokterMouseClicked
        // TODO add your handling code here:
        try{
            int baris = tabel_dokter.rowAtPoint(evt.getPoint());

            String dokter   = tabel_dokter.getValueAt(baris, 0).toString();
            String nama     = tabel_dokter.getValueAt(baris, 1).toString();

            kode_dokter_.setText(dokter);
            nama_dokter_.setText(nama);

        }catch(Exception f){

            JOptionPane.showMessageDialog(rootPane, "Gagal Memilih"+f);
        }
    }//GEN-LAST:event_tabel_dokterMouseClicked

    private void add1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add1ActionPerformed
        // TODO add your handling code here:
        new obat().show();
        this.dispose();
    }//GEN-LAST:event_add1ActionPerformed

    private void REFRESH1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESH1ActionPerformed
        // TODO add your handling code here:
        konek.dbkoneksi();

        DefaultTableModel tabel = new DefaultTableModel();

        tabel.addColumn("KODE");
        tabel.addColumn("NAMA");
        tabel_obat.setModel(tabel);

        try{

            String select = "select * from dataresep";
            stt= konek.getkoneksi().createStatement();
            rss = stt.executeQuery(select);
            while (rss.next()){
                tabel.addRow(new Object[]{
                    rss.getString(1),
                    rss.getString(2)});
            tabel_obat.setModel(tabel);
        }
        }catch(Exception c){
            JOptionPane.showMessageDialog(null,"Gagal Output"+c);
        }
    }//GEN-LAST:event_REFRESH1ActionPerformed

    private void tabel_obatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_obatMouseClicked
        // TODO add your handling code here:
        try{
            int baris = tabel_obat.rowAtPoint(evt.getPoint());

            String obat   = tabel_obat.getValueAt(baris, 0).toString();
            String nama     = tabel_obat.getValueAt(baris, 1).toString();

            kode_obat_.setText(obat);
            nama_obat_.setText(nama);

        }catch(Exception f){

            JOptionPane.showMessageDialog(rootPane, "Gagal Memilih"+f);
        }
    }//GEN-LAST:event_tabel_obatMouseClicked

    private void tabel_rawatjalanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabel_rawatjalanMouseClicked
        // TODO add your handling code here:
        try{
        int baris = tabel_rawatjalan.rowAtPoint(evt.getPoint());
        
        String rawatjalan    = tabel_rawatjalan.getValueAt(baris, 0).toString();
        String kodedokter    = tabel_rawatjalan.getValueAt(baris, 1).toString();
        String namadokter    = tabel_rawatjalan.getValueAt(baris, 2).toString();
        String kodepasien    = tabel_rawatjalan.getValueAt(baris, 3).toString();
        String namapasien    = tabel_rawatjalan.getValueAt(baris, 4).toString();
        String kodeobat      = tabel_rawatjalan.getValueAt(baris, 5).toString();
        String namaobat      = tabel_rawatjalan.getValueAt(baris, 6).toString();
        String tanggalperiksa= tabel_rawatjalan.getValueAt(baris, 7).toString();
        
        kode_rawatjalan.setText(rawatjalan);
        kode_dokter_.setText(kodedokter);
        nama_dokter_.setText(namadokter);
        kode_pasien_.setText(kodepasien);
        nama_pasien_.setText(namapasien);
        kode_obat_.setText(kodeobat);
        nama_obat_.setText(namaobat);
        tanggal_periksa.setText(tanggalperiksa);
       
        
        }catch(Exception f){
    
        JOptionPane.showMessageDialog(rootPane, "Gagal Memilih"+f);    
       }
    }//GEN-LAST:event_tabel_rawatjalanMouseClicked

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
            java.util.logging.Logger.getLogger(rawatjalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(rawatjalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(rawatjalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(rawatjalan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new rawatjalan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton REFRESH1;
    private javax.swing.JButton REFRESH2;
    private javax.swing.JButton REFRESH3;
    private javax.swing.JButton add1;
    private javax.swing.JButton add2;
    private javax.swing.JButton add3;
    private javax.swing.JButton back;
    private javax.swing.JLabel background;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JScrollPane isi_dokter2;
    private javax.swing.JScrollPane isi_obat2;
    private javax.swing.JScrollPane isil_pasien2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField kode_dokter_;
    private javax.swing.JTextField kode_obat_;
    private javax.swing.JTextField kode_pasien_;
    private javax.swing.JTextField kode_rawatjalan;
    private javax.swing.JTextField nama_dokter_;
    private javax.swing.JTextField nama_obat_;
    private javax.swing.JTextField nama_pasien_;
    private javax.swing.JButton reset;
    private javax.swing.JButton save;
    private javax.swing.JButton save1;
    private javax.swing.JTable tabel_dokter;
    private javax.swing.JTable tabel_obat;
    private javax.swing.JTable tabel_pasien;
    private javax.swing.JTable tabel_rawatjalan;
    private javax.swing.JTextField tanggal_periksa;
    // End of variables declaration//GEN-END:variables
}

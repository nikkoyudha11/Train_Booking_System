/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package train_booking_system;

import com.mysql.jdbc.Connection;
import java.awt.Color;
import static java.awt.Color.red;
import static java.awt.Color.white;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



/**
 *
 * @author W10-15082021
 */
public class gui_duduk extends javax.swing.JFrame {
    String nama_kereta,asl,brngkt, jam_brngkt,jam_tiba,tjn;
    int harga, numpang;
    String VA1,VA2;
    String[] Tduduk;
    int selectedDuduk = 1;

    public String[] getTduduk(){
        return Tduduk;
    }
    
    public void setTduduk(String Tduduk[]){
        this.Tduduk = Tduduk;
    }

    public String getVA1() {
        return VA1;
    }

    public void setVA1(String VA1) {
        this.VA1 = VA1;
    }

    public String getVA2() {
        return VA2;
    }

    public void setVA2(String VA2) {
        this.VA2 = VA2;
    }

    gui_duduk(String nama_kereta, String asl, String brngkt, String jam_brngkt, String jam_tiba, int harga, String tjn, int numpang) {
        initComponents();
        setNama_kereta(nama_kereta);
        setAsl(asl);
        setBrngkt(brngkt);
        setJam_brngkt(jam_brngkt);
        setJam_tiba(jam_tiba);
        setHarga(harga);
        setTjn(tjn);
        setNumpang(numpang);
        KoneksiDatabase();
        tampilkan_data(nama_kereta, asl, brngkt, jam_brngkt, jam_tiba, harga, tjn, numpang);
        
        
    }

    public String getNama_kereta() {
        return nama_kereta;
    }

    public void setNama_kereta(String nama_kereta) {
        this.nama_kereta = nama_kereta;
    }

    public String getAsl() {
        return asl;
    }

    public void setAsl(String asl) {
        this.asl = asl;
    }

    public String getBrngkt() {
        return brngkt;
    }

    public void setBrngkt(String brngkt) {
        this.brngkt = brngkt;
    }

    public String getJam_brngkt() {
        return jam_brngkt;
    }

    public void setJam_brngkt(String jam_brngkt) {
        this.jam_brngkt = jam_brngkt;
    }

    public String getJam_tiba() {
        return jam_tiba;
    }

    public void setJam_tiba(String jam_tiba) {
        this.jam_tiba = jam_tiba;
    }

    public String getTjn() {
        return tjn;
    }

    public void setTjn(String tjn) {
        this.tjn = tjn;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getNumpang() {
        return numpang;
    }

    public void setNumpang(int numpang) {
        this.numpang = numpang;
    }
    /**
     * Creates new form gui_duduk
     */
    public gui_duduk() {
        initComponents();
       
    }
    private void KoneksiDatabase(){
        try{
            //MENENTUKAN DRIVER DATABASE
            Class.forName("com.mysql.jdbc.Driver");
            //UNTUK MENGKONEKSIKAN DATABASE SERVER
            
            DriverManager.getConnection("jdbc:mysql://localhost:3306/kereta", "root", "");
            JOptionPane.showMessageDialog(null, "KONEKSI BERHASIL");
        }
        catch(Exception e){
            System.out.println("Yah gagal"+ e.getMessage());
        }
    }
    public void tampilkan_data(String nama_kereta, String asl, String brngkt, String jam_brngkt, String jam_tiba, int harga, String tjn, int numpang){
        
        try{
            String sql = "SELECT seat"
                    + " FROM pembeli WHERE nama_kereta = '"+nama_kereta+
                    "'AND dari = '"+asl+"' AND tujuan = '"+tjn+
                    "' AND tanggal = '"+brngkt+"' AND jadwal_brngkt = '"
                    +jam_brngkt+"'";
            java.sql.Connection con = (Connection)konfig.configDB();
            java.sql.Statement St = con.createStatement();
            java.sql.ResultSet Rs = St.executeQuery(sql);
            while(Rs.next()) {Rs.getString(1);
            if (Rs.getString(1).equals(A1.getText())){
                A1.setEnabled(false);
            }
            if (Rs.getString(1).equals(A2.getText())){
                A2.setEnabled(false);
            }
            if (Rs.getString(1).equals(A3.getText())){
                A3.setEnabled(false);
            }
            if (Rs.getString(1).equals(A4.getText())){
                A4.setEnabled(false);
            }
            if (Rs.getString(1).equals(A5.getText())){
                A5.setEnabled(false);
            }
            if (Rs.getString(1).equals(B1.getText())){
                B1.setEnabled(false);
            }
            if (Rs.getString(1).equals(B2.getText())){
                B2.setEnabled(false);
            }
            if (Rs.getString(1).equals(B3.getText())){
                B3.setEnabled(false);
            }
            if (Rs.getString(1).equals(B4.getText())){
                B4.setEnabled(false);
            }
            if (Rs.getString(1).equals(B5.getText())){
                B5.setEnabled(false);
            }
            if (Rs.getString(1).equals(C1.getText())){
                C1.setEnabled(false);
            }
            if (Rs.getString(1).equals(C2.getText())){
                C2.setEnabled(false);
            }
            if (Rs.getString(1).equals(C3.getText())){
                C3.setEnabled(false);
            }
            if (Rs.getString(1).equals(C4.getText())){
                C4.setEnabled(false);
            }
            if (Rs.getString(1).equals(C5.getText())){
                C5.setEnabled(false);
            }
            if (Rs.getString(1).equals(D1.getText())){
                D1.setEnabled(false);
            }
            if (Rs.getString(1).equals(D2.getText())){
                D2.setEnabled(false);
            }
            if (Rs.getString(1).equals(D3.getText())){
                D3.setEnabled(false);
            }
            if (Rs.getString(1).equals(D4.getText())){
                D4.setEnabled(false);
            }
            if (Rs.getString(1).equals(D5.getText())){
                D5.setEnabled(false);
            }
            }
            

                
        }
        catch(SQLException e){
            System.out.println("Error : "+e.getMessage());
            }
    }

    
    /*void pilih(int numpang){
        for(int i=0; i<numpang;i++){
        A1.setEnabled(true);
        A2.setEnabled(true);
        A3.setEnabled(true);
        A4.setEnabled(true);
        A5.setEnabled(true);
        B1.setEnabled(true);
        B2.setEnabled(true);
        B3.setEnabled(true);
        B4.setEnabled(true);
        B5.setEnabled(true);
        C1.setEnabled(true);
        C2.setEnabled(true);
        C3.setEnabled(true);
        C4.setEnabled(true);
        C5.setEnabled(true);
        D5.setEnabled(true);
        D4.setEnabled(true);
        D2.setEnabled(true);
        D1.setEnabled(true);
        D3.setEnabled(true);
        
        
        
            }
        
        
    }*/

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        A1 = new javax.swing.JToggleButton();
        A2 = new javax.swing.JToggleButton();
        A3 = new javax.swing.JToggleButton();
        A4 = new javax.swing.JToggleButton();
        A5 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        B1 = new javax.swing.JToggleButton();
        B2 = new javax.swing.JToggleButton();
        B3 = new javax.swing.JToggleButton();
        B4 = new javax.swing.JToggleButton();
        B5 = new javax.swing.JToggleButton();
        C1 = new javax.swing.JToggleButton();
        C2 = new javax.swing.JToggleButton();
        C3 = new javax.swing.JToggleButton();
        C4 = new javax.swing.JToggleButton();
        C5 = new javax.swing.JToggleButton();
        D5 = new javax.swing.JToggleButton();
        D4 = new javax.swing.JToggleButton();
        D2 = new javax.swing.JToggleButton();
        D1 = new javax.swing.JToggleButton();
        D3 = new javax.swing.JToggleButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        kembali_duduk = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        A1.setText("A1");
        A1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A1ActionPerformed(evt);
            }
        });

        A2.setText("A2");
        A2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A2ActionPerformed(evt);
            }
        });

        A3.setText("A3");
        A3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A3ActionPerformed(evt);
            }
        });

        A4.setText("A4");
        A4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A4ActionPerformed(evt);
            }
        });

        A5.setText("A5");
        A5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                A5ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("A");

        B1.setText("B1");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("B2");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        B3.setText("B3");
        B3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B3ActionPerformed(evt);
            }
        });

        B4.setText("B4");
        B4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B4ActionPerformed(evt);
            }
        });

        B5.setText("B5");
        B5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B5ActionPerformed(evt);
            }
        });

        C1.setText("C1");
        C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C1ActionPerformed(evt);
            }
        });

        C2.setText("C2");
        C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C2ActionPerformed(evt);
            }
        });

        C3.setText("C3");
        C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C3ActionPerformed(evt);
            }
        });

        C4.setText("C4");
        C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C4ActionPerformed(evt);
            }
        });

        C5.setText("C5");
        C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                C5ActionPerformed(evt);
            }
        });

        D5.setText("D5");
        D5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D5ActionPerformed(evt);
            }
        });

        D4.setText("D4");
        D4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D4ActionPerformed(evt);
            }
        });

        D2.setText("D2");
        D2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D2ActionPerformed(evt);
            }
        });

        D1.setText("D1");
        D1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D1ActionPerformed(evt);
            }
        });

        D3.setText("D3");
        D3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                D3ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("B");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("C");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setText("D");

        jPanel1.setBackground(new java.awt.Color(102, 102, 255));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Pilih Tempat Duduk");

        kembali_duduk.setBackground(new java.awt.Color(102, 102, 255));
        kembali_duduk.setForeground(new java.awt.Color(255, 255, 255));
        kembali_duduk.setText("Kembali");
        kembali_duduk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kembali_dudukActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(kembali_duduk)
                .addGap(60, 60, 60)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(kembali_duduk, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(A1)
                    .addComponent(B1)
                    .addComponent(C1)
                    .addComponent(D1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(A2)
                        .addGap(70, 70, 70)
                        .addComponent(A3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(A5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B2)
                        .addGap(70, 70, 70)
                        .addComponent(B3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(B5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(C2)
                        .addGap(70, 70, 70)
                        .addComponent(C3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(C5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(D2)
                        .addGap(70, 70, 70)
                        .addComponent(D3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(D5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(A1)
                    .addComponent(A2)
                    .addComponent(A3)
                    .addComponent(A4)
                    .addComponent(A5)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(B5)
                    .addComponent(B4)
                    .addComponent(B3)
                    .addComponent(B2)
                    .addComponent(B1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(C5)
                    .addComponent(C4)
                    .addComponent(C3)
                    .addComponent(C2)
                    .addComponent(C1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(D5)
                    .addComponent(D4)
                    .addComponent(D3)
                    .addComponent(D2)
                    .addComponent(D1)
                    .addComponent(jLabel4))
                .addContainerGap(222, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void A1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A1ActionPerformed
        // TODO add your handling code here:
        
        
            
        
        if(A1.getBackground().equals(red)){
            A1.setBackground(new Color(240,240,240));
            selectedDuduk--;
            
        }
        else if(selectedDuduk<=numpang){
            A1.setBackground(red);
        selectedDuduk++;}
        
    }//GEN-LAST:event_A1ActionPerformed

    private void A2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A2ActionPerformed
        // TODO add your handling code here:
        
        
        if(A2.getBackground().equals(red)){
            A2.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            A2.setBackground(red);
        selectedDuduk++;}
        
        
    }//GEN-LAST:event_A2ActionPerformed

    private void A3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A3ActionPerformed
        // TODO add your handling code here:
        
        if(A3.getBackground().equals(red)){
            A3.setBackground(white);
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            A3.setBackground(red);
        selectedDuduk++;}
        
    }//GEN-LAST:event_A3ActionPerformed

    private void A4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A4ActionPerformed
        // TODO add your handling code here:
        
        if(A4.getBackground().equals(red)){
            A4.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            A4.setBackground(red);
        selectedDuduk++;}
        
        
    }//GEN-LAST:event_A4ActionPerformed

    private void A5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_A5ActionPerformed
        // TODO add your handling code here:
        
        if(A5.getBackground().equals(red)){
            A5.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            A5.setBackground(red);
        selectedDuduk++;}
        
        
    }//GEN-LAST:event_A5ActionPerformed

    private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed
        // TODO add your handling code here:
        if(B1.getBackground().equals(red)){
            B1.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){B1.setBackground(red);
        selectedDuduk++;}
        
    }//GEN-LAST:event_B1ActionPerformed

    private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed
        // TODO add your handling code here:
        if(B2.getBackground().equals(red)){
            B2.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){B2.setBackground(red);
        selectedDuduk++;}
    }//GEN-LAST:event_B2ActionPerformed

    private void B3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B3ActionPerformed
        // TODO add your handling code here:
        if(B3.getBackground().equals(red)){
            B3.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            B3.setBackground(red);
        selectedDuduk++;}
        
        
    }//GEN-LAST:event_B3ActionPerformed

    private void B4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B4ActionPerformed
        // TODO add your handling code here:
        if(B4.getBackground().equals(red)){
            B4.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            B4.setBackground(red);
        selectedDuduk++;}
       
        
    }//GEN-LAST:event_B4ActionPerformed

    private void B5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B5ActionPerformed
        // TODO add your handling code here:
        if(B5.getBackground().equals(red)){
            B5.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            B5.setBackground(red);
        selectedDuduk++;}
        
        
    }//GEN-LAST:event_B5ActionPerformed

    private void C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C1ActionPerformed
        // TODO add your handling code here:
        if(C1.getBackground().equals(red)){
            C1.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            C1.setBackground(red);
        selectedDuduk++;}
    }//GEN-LAST:event_C1ActionPerformed

    private void C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C2ActionPerformed
        // TODO add your handling code here:
        if(C2.getBackground().equals(red)){
            C2.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){C2.setBackground(red);
        selectedDuduk++;}
    }//GEN-LAST:event_C2ActionPerformed

    private void C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C3ActionPerformed
        // TODO add your handling code here:
        if(C3.getBackground().equals(red)){
            C3.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            C3.setBackground(red);
        selectedDuduk++;}
    }//GEN-LAST:event_C3ActionPerformed

    private void C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C4ActionPerformed
        // TODO add your handling code here:
       if(C4.getBackground().equals(red)){
            C4.setBackground(white);
            selectedDuduk--;
        }
       else if(selectedDuduk<=numpang){
           C4.setBackground(red);
        selectedDuduk++;}
       
    }//GEN-LAST:event_C4ActionPerformed

    private void C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_C5ActionPerformed
        // TODO add your handling code here:
        if(C5.getBackground().equals(red)){
            C5.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){C5.setBackground(red);
        selectedDuduk++;}
        
    }//GEN-LAST:event_C5ActionPerformed

    private void D5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D5ActionPerformed
        // TODO add your handling code here:
        if(D5.getBackground().equals(red)){
            D1.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            D5.setBackground(red);
        selectedDuduk++;}
        
    }//GEN-LAST:event_D5ActionPerformed

    private void D4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D4ActionPerformed
        // TODO add your handling code here:
        if(D4.getBackground().equals(red)){
            D4.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            D4.setBackground(red);
        selectedDuduk++;}
    }//GEN-LAST:event_D4ActionPerformed

    private void D2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D2ActionPerformed
        // TODO add your handling code here:
        if(D2.getBackground().equals(red)){
            D2.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            D2.setBackground(red);
        selectedDuduk++;}
        
    }//GEN-LAST:event_D2ActionPerformed

    private void D1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D1ActionPerformed
        // TODO add your handling code here:
        if(D1.getBackground().equals(red)){
            D1.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            D1.setBackground(red);
        selectedDuduk++;}

    }//GEN-LAST:event_D1ActionPerformed

    private void D3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_D3ActionPerformed
        // TODO add your handling code here:
        if(D3.getBackground().equals(red)){
            D3.setBackground(new Color(240,240,240));
            selectedDuduk--;
        }
        else if(selectedDuduk<=numpang){
            D3.setBackground(red);
        selectedDuduk++;}
       
    }//GEN-LAST:event_D3ActionPerformed

    private void kembali_dudukActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kembali_dudukActionPerformed
        // TODO add your handling code here:
        java.util.List<String> lis = new ArrayList<String>();
        input_penumpang GA1 = new input_penumpang(nama_kereta,asl,brngkt,jam_brngkt,jam_tiba,harga, tjn, numpang);
        if(A1.getBackground().equals(red)){
            lis.add(A1.getText());
            }
        if(A2.getBackground().equals(red)){
           lis.add(A2.getText());
        }
        if(A3.getBackground().equals(red)){
           lis.add(A3.getText());
        }
        if(A4.getBackground().equals(red)){
           lis.add(A4.getText());
        }
        if(A5.getBackground().equals(red)){
           lis.add(A5.getText());
        }
        if(B1.getBackground().equals(red)){
           lis.add(B1.getText());
        }
        if(B2.getBackground().equals(red)){
           lis.add(B2.getText());
        }
        if(B3.getBackground().equals(red)){
           lis.add(B3.getText());
        }
        if(B4.getBackground().equals(red)){
           lis.add(B4.getText());
        }
        if(B5.getBackground().equals(red)){
           lis.add(B5.getText());
        }
        if(C1.getBackground().equals(red)){
           lis.add(C1.getText());
        }
        if(C2.getBackground().equals(red)){
           lis.add(C2.getText());
        }
        if(C3.getBackground().equals(red)){
           lis.add(C3.getText());
        }
        if(C4.getBackground().equals(red)){
           lis.add(C4.getText());
        }
        if(C5.getBackground().equals(red)){
           lis.add(C5.getText());
        }
        if(D1.getBackground().equals(red)){
           lis.add(D1.getText());
        }
        if(D2.getBackground().equals(red)){
           lis.add(D2.getText());
        }
        if(D3.getBackground().equals(red)){
           lis.add(D3.getText());
        }
        if(D4.getBackground().equals(red)){
           lis.add(D4.getText());
        }
        if(D5.getBackground().equals(red)){
           lis.add(D5.getText());
        }
        
        GA1.setList(lis);
        
        this.setVisible(false);
            GA1.setVisible(true);
    }//GEN-LAST:event_kembali_dudukActionPerformed

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
            java.util.logging.Logger.getLogger(gui_duduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gui_duduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gui_duduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gui_duduk.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gui_duduk().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton A1;
    private javax.swing.JToggleButton A2;
    private javax.swing.JToggleButton A3;
    private javax.swing.JToggleButton A4;
    private javax.swing.JToggleButton A5;
    private javax.swing.JToggleButton B1;
    private javax.swing.JToggleButton B2;
    private javax.swing.JToggleButton B3;
    private javax.swing.JToggleButton B4;
    private javax.swing.JToggleButton B5;
    private javax.swing.JToggleButton C1;
    private javax.swing.JToggleButton C2;
    private javax.swing.JToggleButton C3;
    private javax.swing.JToggleButton C4;
    private javax.swing.JToggleButton C5;
    private javax.swing.JToggleButton D1;
    private javax.swing.JToggleButton D2;
    private javax.swing.JToggleButton D3;
    private javax.swing.JToggleButton D4;
    private javax.swing.JToggleButton D5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kembali_duduk;
    // End of variables declaration//GEN-END:variables
}

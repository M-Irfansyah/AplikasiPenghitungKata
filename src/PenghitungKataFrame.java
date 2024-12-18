
import java.awt.event.ActionEvent;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author asus
 */
public class PenghitungKataFrame extends javax.swing.JFrame {

    /**
     * Creates new form PenghitungKataFrame
     */
    public PenghitungKataFrame() {
        initComponents();
        jtaKata.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) { hitungText(); }
            public void removeUpdate(DocumentEvent e) { hitungText(); }
            public void insertUpdate(DocumentEvent e) { hitungText(); }
        });    
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
        jKataMuncul = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jKata = new javax.swing.JLabel();
        jKalimat = new javax.swing.JLabel();
        jParagraf = new javax.swing.JLabel();
        jKarakter = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaKata = new javax.swing.JTextArea();
        jtfCari = new javax.swing.JTextField();
        btnCari = new javax.swing.JButton();
        btnHitung = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jKata1 = new javax.swing.JLabel();
        jKalimat1 = new javax.swing.JLabel();
        jParagraf1 = new javax.swing.JLabel();
        jKarakter1 = new javax.swing.JLabel();
        jKataMuncul1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Penghitung Kata");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 36)); // NOI18N
        jLabel1.setText("Aplikasi Penghitung Kata");

        jKataMuncul.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Cari Kata :");

        jKata.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jKalimat.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jParagraf.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jKarakter.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jtaKata.setColumns(20);
        jtaKata.setRows(5);
        jScrollPane1.setViewportView(jtaKata);

        jtfCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        btnCari.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnCari.setText("Cari");
        btnCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCariActionPerformed(evt);
            }
        });

        btnHitung.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHitung.setText("Hitung");
        btnHitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHitungActionPerformed(evt);
            }
        });

        btnHapus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnKeluar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnKeluar.setText("Keluar");
        btnKeluar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKeluarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Masukkan Teks :");

        jKata1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKata1.setText("Jumlah kata       :");

        jKalimat1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKalimat1.setText("Jumlah Kalimat   :");

        jParagraf1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jParagraf1.setText("Jumlah Paragraf  :");

        jKarakter1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKarakter1.setText("Jumlah Karakter  :");

        jKataMuncul1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jKataMuncul1.setText("Jumlah Kata Muncul  :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnKeluar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(386, 386, 386)
                                        .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addComponent(jtfCari, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jKalimat1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jKalimat))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jKata1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jKata))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jParagraf1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(jParagraf))
                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                    .addComponent(jKarakter1)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(jKarakter))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGap(29, 29, 29)
                                            .addComponent(btnHitung, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCari, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jKataMuncul1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jKataMuncul, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(174, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(btnHapus)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnHitung)
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jKata1)
                            .addComponent(jKata))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jKalimat1)
                            .addComponent(jKalimat))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jParagraf)
                            .addComponent(jParagraf1))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jKarakter)
                            .addComponent(jKarakter1))
                        .addGap(51, 51, 51)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfCari, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCari)
                    .addComponent(jKataMuncul, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jKataMuncul1))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnKeluar))
                .addContainerGap(113, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHitungActionPerformed
     // Tambahkan ActionListener pada tombol "Hitung"
    btnHitung.addActionListener((ActionEvent e) -> {
        hitungText(); // Memanggil metode countText() ketika tombol ditekan
    });
    }//GEN-LAST:event_btnHitungActionPerformed

    private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCariActionPerformed
    btnCari.addActionListener((ActionEvent e) -> {
           CariKata();
        });
    }//GEN-LAST:event_btnCariActionPerformed

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
      btnSimpan.addActionListener((ActionEvent e) -> {
            SimpanFile();
        });
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKeluarActionPerformed
    System.exit(0);
    }//GEN-LAST:event_btnKeluarActionPerformed

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
     btnHapus.addActionListener((ActionEvent e) -> {
        jtaKata.setText("");  // Mengosongkan JTextArea
        // Mereset label hasil perhitungan
        jKata.setText("0");
        jKarakter.setText("0");
        jKalimat.setText("0");
        jParagraf.setText("0");
        jKataMuncul.setText("0");
        jtfCari.setText(""); // Mengosongkan JTextField untuk pencarian kata
    });
    }//GEN-LAST:event_btnHapusActionPerformed
    private void hitungText() {
        String text = jtaKata.getText();

        // Hitung jumlah kata
        int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;

        // Hitung jumlah karakter
        int charCount = text.length();

        // Hitung jumlah kalimat menggunakan pemisah .!? untuk mengenali akhir kalimat
        int sentenceCount = text.isEmpty() ? 0 : text.split("[.!?]").length;

        // Hitung jumlah paragraf berdasarkan garis baru ganda sebagai pemisah
        int paragraphCount = text.isEmpty() ? 0 : text.split("\\n+").length;

        // Update JLabel dengan hasil perhitungan
        jKata.setText("" + wordCount);
        jKarakter.setText("" + charCount);
        jKalimat.setText("" + sentenceCount);
        jParagraf.setText("" + paragraphCount);
        
    }
    
    // Method to search a specific word
    private void CariKata() {
        String text = jtaKata.getText();
        String searchWord = jtfCari.getText();
        int count = 0;

        if (!searchWord.isEmpty()) {
            String[] words = text.split("\\s+");
            for (String word : words) {
                if (word.equalsIgnoreCase(searchWord)) {
                    count++;
                }
            }
        }
        
        jKataMuncul.setText(" " + count);
    }

     // Method to save the text and results to a file
    private void SimpanFile() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan Hasil Penghitungan");
    int userSelection = fileChooser.showSaveDialog(this);
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
       
            writer.write("Teks:\n" + jtaKata.getText() + "\n\n");
            writer.write("Jumlah Kata: " + jKata.getText() + "\n");
            writer.write("Jumlah Karakter: " + jKarakter.getText() + "\n");
            writer.write("Jumlah Kalimat: " + jKalimat.getText() + "\n");
            writer.write("Jumlah Paragraf: " + jParagraf.getText() + "\n");
            writer.write("Pencarian Kata '" + jtfCari.getText() + "': " + jKataMuncul.getText() + "\n");
            JOptionPane.showMessageDialog(this, "Hasil berhasil disimpan ke hasil_penghitungan.txt");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan file: " + e.getMessage());
        }
        }
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
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PenghitungKataFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PenghitungKataFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCari;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnHitung;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jKalimat;
    private javax.swing.JLabel jKalimat1;
    private javax.swing.JLabel jKarakter;
    private javax.swing.JLabel jKarakter1;
    private javax.swing.JLabel jKata;
    private javax.swing.JLabel jKata1;
    private javax.swing.JLabel jKataMuncul;
    private javax.swing.JLabel jKataMuncul1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jParagraf;
    private javax.swing.JLabel jParagraf1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jtaKata;
    private javax.swing.JTextField jtfCari;
    // End of variables declaration//GEN-END:variables
}

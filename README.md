# AplikasiPenghitungKata
 Tugas 5 - M.irfansyah(2210010176)
## Deskripsi Program
Aplikasi ini adalah sebuah program GUI berbasis Java yang memungkinkan pengguna untuk menghitung jumlah kata, karakter, kalimat, dan paragraf dari teks yang dimasukkan. Aplikasi ini dirancang untuk memberikan hasil secara real-time atau setelah tombol "Hitung" ditekan. Selain itu, aplikasi memiliki fitur tambahan seperti pencarian kata tertentu dalam teks dan menyimpan hasil ke file.
# Komponen GUI:
• JFrame

• JPanel

• JLabel

• JTextArea

• JScrollPane

• JButton

Fitur Utama

Input Teks:
Pengguna dapat memasukkan teks melalui komponen JTextArea yang dibungkus dalam JScrollPane.

Perhitungan:
Hitung jumlah kata, karakter, kalimat, dan paragraf.
Hasil ditampilkan menggunakan beberapa komponen JLabel.

Pencarian Kata:
Fitur untuk mencari kata tertentu dalam teks.

Simpan Hasil:
Opsi untuk menyimpan teks dan hasil perhitungan ke dalam file.

Real-time Count:
Menggunakan DocumentListener untuk memperbarui perhitungan secara langsung saat teks dimodifikasi.

## Penjelasan Kode

•  Tombol untuk menghitung jumlah kata, karakter, kalimat, dan paragraf
```
private void btnHitungActionPerformed(java.awt.event.ActionEvent evt) {                                          
    btnHitung.addActionListener((ActionEvent e) -> {
        hitungText(); // Memanggil metode hitungText() untuk perhitungan teks
    });
}                                         
```
• Tombol untuk mencari kata tertentu dalam teks
```
private void btnCariActionPerformed(java.awt.event.ActionEvent evt) {                                        
    btnCari.addActionListener((ActionEvent e) -> {
        CariKata(); // Memanggil metode CariKata() untuk mencari kata
    });
}                                       
```
•  Button untuk menyimpan teks dan hasil perhitungan ke file
```
private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {                                          
    btnSimpan.addActionListener((ActionEvent e) -> {
        SimpanFile(); // Memanggil metode SimpanFile() untuk menyimpan file
    });
}                                         
```
•  Button untuk keluar dari aplikasi
```
private void btnKeluarActionPerformed(java.awt.event.ActionEvent evt) {                                          
    System.exit(0); // Menutup aplikasi
}                                         
```
•  Button untuk menghapus semua teks dan mengosongkan hasil perhitungan
```
private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {                                         
    btnHapus.addActionListener((ActionEvent e) -> {
        jtaKata.setText("");  // Mengosongkan JTextArea
        // Mereset semua label hasil perhitungan menjadi 0
        jKata.setText("0");
        jKarakter.setText("0");
        jKalimat.setText("0");
        jParagraf.setText("0");
        jKataMuncul.setText("0");
        jtfCari.setText(""); // Mengosongkan JTextField untuk pencarian kata
    });
}                                        
```
• Method untuk menghitung jumlah kata, karakter, kalimat, dan paragraf
```
private void hitungText() {
    String text = jtaKata.getText(); // Mengambil teks dari JTextArea

    // Hitung jumlah kata
    int wordCount = text.isEmpty() ? 0 : text.split("\\s+").length;

    // Hitung jumlah karakter
    int charCount = text.length();

    // Hitung jumlah kalimat berdasarkan tanda baca akhir kalimat
    int sentenceCount = text.isEmpty() ? 0 : text.split("[.!?]").length;

    // Hitung jumlah paragraf berdasarkan baris baru ganda
    int paragraphCount = text.isEmpty() ? 0 : text.split("\\n+").length;

    // Update JLabel dengan hasil perhitungan
    jKata.setText("" + wordCount);
    jKarakter.setText("" + charCount);
    jKalimat.setText("" + sentenceCount);
    jParagraf.setText("" + paragraphCount);
}
```
• Method untuk mencari kata tertentu dalam teks
```
private void CariKata() {
    String text = jtaKata.getText(); // Mengambil teks dari JTextArea
    String searchWord = jtfCari.getText(); // Mengambil kata yang dicari dari JTextField
    int count = 0;

    if (!searchWord.isEmpty()) {
        // Memisahkan teks menjadi array kata-kata
        String[] words = text.split("\\s+");
        for (String word : words) {
            if (word.equalsIgnoreCase(searchWord)) {
                count++; // Menambahkan jumlah jika kata ditemukan
            }
        }
    }
    
    jKataMuncul.setText(" " + count); // Menampilkan hasil jumlah kata yang ditemukan
}
```
• Method untuk menyimpan teks dan hasil perhitungan ke file
```
private void SimpanFile() {
    JFileChooser fileChooser = new JFileChooser();
    fileChooser.setDialogTitle("Simpan Hasil Penghitungan");
    int userSelection = fileChooser.showSaveDialog(this); // Membuka dialog penyimpanan file
    
    if (userSelection == JFileChooser.APPROVE_OPTION) {
        try (FileWriter writer = new FileWriter(fileChooser.getSelectedFile())) {
            // Menulis teks dan hasil perhitungan ke dalam file
            writer.write("Teks:\n" + jtaKata.getText() + "\n\n");
            writer.write("Jumlah Kata: " + jKata.getText() + "\n");
            writer.write("Jumlah Karakter: " + jKarakter.getText() + "\n");
            writer.write("Jumlah Kalimat: " + jKalimat.getText() + "\n");
            writer.write("Jumlah Paragraf: " + jParagraf.getText() + "\n");
            writer.write("Pencarian Kata '" + jtfCari.getText() + "': " + jKataMuncul.getText() + "\n");
            JOptionPane.showMessageDialog(this, "Hasil berhasil disimpan ke file");
        } catch (IOException e) {
            JOptionPane.showMessageDialog(this, "Gagal menyimpan file: " + e.getMessage());
        }
    }
}
```
• Text Area
```
public PenghitungKataFrame() {
        initComponents();
        jtaKata.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent e) { hitungText(); }
            public void removeUpdate(DocumentEvent e) { hitungText(); }
            public void insertUpdate(DocumentEvent e) { hitungText(); }
        });    
    }
```
## Contoh Gambar Project Setelah di Run
![penghitung kata](https://github.com/user-attachments/assets/2e40d6da-25cd-40f8-a34e-cddfaaea932c)

## Indikator Penilaian:

| No  | Komponen         |  Persentase  |
| :-: | --------------   |   :-----:    |
|  1  | Komponen GUI     |    10    |
|  2  | Logika Program   |    20    |
|  3  |  Events          |    10    |
|  4  | Kesesuaian UI    |    20    |
|  5  | Memenuhi Variasi |    40    |
|     | TOTAL        | 100 |

## Pembuat

Nama  : M.Irfansyah

NPM   : 2210010176

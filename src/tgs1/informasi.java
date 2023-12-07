package tgs1;

import javax.swing.table.DefaultTableModel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
        
 /**
 *
 * @author ASUS
 */
public abstract class informasi {
    private String namaPasien;
    private String alamat;
    private String nomorRekamMedis;
    private String nomorKamar;
    private String diagnosa;
    private String tanggalMasuk;
    private String tanggalKeluar;

    // Konstruktor tanpa parameter
    public informasi() {

    }

    // Konstruktor dengan parameter dasar
    public informasi(String namaPasien, String alamat, String nomorRekamMedis) {
        this.namaPasien = namaPasien;
        this.alamat = alamat;
        this.nomorRekamMedis = nomorRekamMedis;
    }

    // Konstruktor dengan parameter lengkap
    public informasi(String namaPasien, String alamat, String nomorRekamMedis, String nomorKamar, String diagnosa, String tanggalMasuk, String tanggalKeluar) {
        this.namaPasien = namaPasien;
        this.alamat = alamat;
        this.nomorRekamMedis = nomorRekamMedis;
        this.nomorKamar = nomorKamar;
        this.diagnosa = diagnosa;
        this.tanggalMasuk = tanggalMasuk;
        this.tanggalKeluar = tanggalKeluar;
    }

    // Metode getter dan setter untuk setiap atribut

    public String getNamaPasien() {
        return namaPasien;
    }

    public void setNamaPasien(String namaPasien) {
        this.namaPasien = namaPasien;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getNomorRekamMedis() {
        return nomorRekamMedis;
    }

    public void setNomorRekamMedis(String nomorRekamMedis) {
        this.nomorRekamMedis = nomorRekamMedis;
    }

    public String getNomorKamar() {
        return nomorKamar;
    }

    public void setNomorKamar(String nomorKamar) {
        this.nomorKamar = nomorKamar;
    }

    public String getDiagnosa() {
        return diagnosa;
    }

    public void setDiagnosa(String diagnosa) {
        this.diagnosa = diagnosa;
    }

    public String getTanggalMasuk() {
        return tanggalMasuk;
    }

    public void setTanggalMasuk(String tanggalMasuk) {
        this.tanggalMasuk = tanggalMasuk;
    }

    public String getTanggalKeluar() {
        return tanggalKeluar;
    }

    public void setTanggalKeluar(String tanggalKeluar) {
        this.tanggalKeluar = tanggalKeluar;
    }

    // Abstract method to display information
    public abstract void tampilkanInfo();

   public String generateInfo() {
    return "Nama Pasien : " + namaPasien + "\n" +
           "Alamat : " + alamat + "\n" +
           "Nomor Rekam Medis : " + nomorRekamMedis + "\n" +
           "Nomor Kamar : " + nomorKamar + "\n" +
           "Diagnosa : " + diagnosa + "\n" +
           "Tanggal Masuk : " + tanggalMasuk + "\n" +
           "Tanggal Keluar : " + tanggalKeluar + "\n";
}

    
    // Metode untuk menampilkan informasi buku
    public void displayInfo() {
    System.out.println("Nama Pasien: " + namaPasien);
    System.out.println("Alamat: " + alamat);
    System.out.println("Nomor Rekam Medis: " + nomorRekamMedis);
    System.out.println("Nomor Kamar: " + nomorKamar);
    System.out.println("Diagnosa: " + diagnosa);
    System.out.println("Tanggal Masuk: " + tanggalMasuk);
    System.out.println("Tanggal Keluar: " + tanggalKeluar);
}
}










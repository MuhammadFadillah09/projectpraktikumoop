
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs1;

/**
 *
 * @author ASUS
 */
public class Dokter extends informasi {
       private String namaDokter;
       private String spesialis;

    // Konstruktor dengan parameter
    public Dokter(String namaPasien, String alamat, String nomorRekamMedis, String namaDokter, String spesialis) {
        super(namaPasien, alamat, nomorRekamMedis);
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
    }

    Dokter(String namaDokter, String Spesialis) {
        this.namaDokter = namaDokter;
        this.spesialis = spesialis;
    }

    // Metode setter
    public void setNamaDokter(String namaDokter) {
        this.namaDokter = namaDokter;
    }

    public void setSpesialis(String spesialis) {
        this.spesialis = spesialis;
    }

    // Metode getter
    public String getNamaDokter() {
        return namaDokter;
    }

    public String getSpesialis() {
        return spesialis;
    }

    // Override metode tampilkanInfo untuk menambahkan informasi dokter
    @Override
    public void tampilkanInfo() {
        System.out.println("Nama Pasien: " + getNamaPasien());
        System.out.println("Alamat: " + getAlamat());
        System.out.println("Nomor Rekam Medis: " + getNomorRekamMedis());
        System.out.println("Nomor Kamar: " + getNomorKamar());
        System.out.println("Diagnosa: " + getDiagnosa());
        System.out.println("Tanggal Masuk: " + getTanggalMasuk());
        System.out.println("Tanggal Keluar: " + getTanggalKeluar());
        System.out.println("Nama Dokter: " + namaDokter);
        System.out.println("Spesialis: " + spesialis);
    }
}




    


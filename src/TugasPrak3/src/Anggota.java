/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 62821
 */
public class Anggota extends Buku {
    // Atribut tambahan untuk menyimpan informasi anggota
    private int nomorAnggota;
    private String alamat;

    // Konstruktor untuk membuat objek anggota dengan informasi
    public Anggota(String judul, String pengarang, int tahunTerbit, int nomorAnggota, String alamat) {
        super(judul, pengarang, tahunTerbit); // Memanggil konstruktor dari superclass
        this.nomorAnggota = nomorAnggota;
        this.alamat = alamat;
    }

    // Metode getter untuk mengakses atribut privat anggota
    public int getNomorAnggota() {
        return nomorAnggota;
    }

    public String getAlamat() {
        return alamat;
    }

    // Metode untuk menampilkan informasi anggota, termasuk informasi dari superclass Buku
    public void displayInfoAnggota() {
        super.displayInfo(); // Memanggil metode displayInfo dari superclass
        System.out.println("Nomor Anggota: " + nomorAnggota);
        System.out.println("Alamat: " + alamat);
    }
    
    @Override
    public String generateInfo() {
        return super.generateInfo() + // Call the generateInfo method from the superclass
               "Nomor Anggota: " + nomorAnggota + "\n" +
               "Alamat: " + alamat + "\n";
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 62821
 */
public class Buku {
    // Atribut untuk menyimpan informasi buku
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private String penerbit;
    private int jumlahHalaman;

    // Konstruktor untuk membuat objek buku dengan informasi
    public Buku(String judul, String pengarang, int tahunTerbit) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
    }

    // Overloaded constructor for method overloading
    public Buku(String judul, String pengarang, int tahunTerbit, String penerbit, int jumlahHalaman) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.penerbit = penerbit;
        this.jumlahHalaman = jumlahHalaman;
    }
    
    // Metode getter untuk mengakses atribut privat
    public String getJudul() {
        return judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    // Getter methods for the new attributes
    public String getPenerbit() {
        return penerbit;
    }

    public int getJumlahHalaman() {
        return jumlahHalaman;
    }
    
    public String generateInfo() {
        return "Judul: " + judul + "\n" +
               "Pengarang: " + pengarang + "\n" +
               "Tahun Terbit: " + tahunTerbit + "\n";
    }
    
    // Metode untuk menampilkan informasi buku
    public void displayInfo() {
        System.out.println("Judul: " + judul);
        System.out.println("Pengarang: " + pengarang);
        System.out.println("Tahun Terbit: " + tahunTerbit);
    }
}

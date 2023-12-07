/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 62821
 */
public class Petugas extends Buku {
    // Atribut tambahan untuk menyimpan informasi petugas
    private String namaPetugas;
    private String posisi;

    // Konstruktor untuk membuat objek petugas dengan informasi
    public Petugas(String judul, String pengarang, int tahunTerbit, String namaPetugas, String posisi) {
        super(judul, pengarang, tahunTerbit); // Memanggil konstruktor dari superclass
        this.namaPetugas = namaPetugas;
        this.posisi = posisi;
    }

    // Metode getter untuk mengakses atribut privat petugas
    public String getNamaPetugas() {
        return namaPetugas;
    }

    public String getPosisi() {
        return posisi;
    }

    // Metode untuk menampilkan informasi petugas, termasuk informasi dari superclass Buku
    public void displayInfoPetugas() {
        super.displayInfo(); // Memanggil metode displayInfo dari superclass
        System.out.println("Nama Petugas: " + namaPetugas);
        System.out.println("Posisi: " + posisi);
    }
    @Override
    public String generateInfo() {
        return super.generateInfo() + // Call the generateInfo method from the superclass
               "Nama Petugas: " + namaPetugas + "\n" +
               "Posisi: " + posisi + "\n";
    }
}

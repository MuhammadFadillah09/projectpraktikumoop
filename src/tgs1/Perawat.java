/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgs1;

/**
 *
 * @author ASUS
 */
public class Perawat extends GUI_Informasi {
     String namaPerawat;

    public Perawat(String namaPerawat) {
        this.namaPerawat = namaPerawat;
    }

    // Metode-metode lain yang diperlukan untuk perawat
void setnamaPerawat(String namaPerawat) {
        this.namaPerawat = namaPerawat;
    }
    
    public String getNamaPerawat() {
        return namaPerawat;
    }
}


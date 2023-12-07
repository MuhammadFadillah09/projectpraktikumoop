package tgs1;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Main_PasienRumahSakit {
  public static void main(String[] args) {
 LocalDate tanggalSekarang = LocalDate.now();
 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
 String tanggalFormat = tanggalSekarang.format(formatter);
 informasi pasien = new informasi();
 pasien.setNamaPasien("Muhammad Fadillah");
 pasien.setAlamat("Karangploso");
 pasien.setNomorRekamMedis("RM99890");
 pasien.setNomorKamar("Kamar 101");
 pasien.setDiagnosa("Demam");
 pasien.setTanggalMasuk("01-10-2023");
 pasien.setTanggalKeluar("05-10-2023");
 System.out.println("DATA PASIEN RUMAH SAKIT");
 System.out.println("TANGGAL INFORMASI : " + tanggalFormat);
 System.out.println("===================");
 System.out.println("");
 System.out.println("Nama Pasien : " + pasien.getNamaPasien());
 System.out.println("Alamat : " + pasien.getAlamat());
 System.out.println("Nomor Rekam Medis : " + pasien.getNomorRekamMedis());
 System.out.println("Nomor Kamar : " + pasien.getNomorKamar());
 System.out.println("Diagnosa : " + pasien.getDiagnosa());
 System.out.println("Tanggal Masuk : " + pasien.getTanggalMasuk());
 System.out.println("Tanggal Keluar : " + pasien.getTanggalKeluar());
 }
}




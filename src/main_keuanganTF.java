/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPrak;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;



/**
 *
 * @author USER
 */
public class main_keuanganTF {

      public static void main(String[] args){
      LocalDate tanggalSekarang = LocalDate.now();
      DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
      String tanggalFormat = tanggalSekarang.format(formatter);
         
         
         
         Keuangan TF = new Keuangan();
         TF.infNamapengirim ("Viramadita Arthamia Putri");
         TF.infNamapenerima ("Nadia");
         TF.infnamabankpenerima("BNI");
         TF.infnorek("260404");
         TF.inftotalbayar ("Rp.1.000.000");
         TF.infnote("Pembayaran Kost");
         TF.infkatasandi ("2626");
         
         System.out.println("TRANSFER");
         System.out.println("TANGGAL TRANSAKSI : " + tanggalFormat);
         System.out.println("===================");
         System.out.println("");
         System.out.println("Nama Pengirim : "+TF.printnamapengirim());
         System.out.println("Nama Penerima : "+TF.printnamapenerima());
         System.out.println("Nama Bank Penerima : "+TF.printbankpenerima());
         System.out.println("Nomor Rekening Penerima : "+TF.printnorek());
         System.out.println("Total Payment : "+TF.printtotalbayar());
         System.out.println("Note : "+TF.printnaote());
         System.out.println("Kata Sandi : "+TF.printkatasandi() );
   
     }

   
}

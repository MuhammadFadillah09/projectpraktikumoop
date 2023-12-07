/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectPrak;

/**
 *
 * @author USER
 */
public class Keuangan {
    String namapengirim,namapenerima,namabankpenerima,note;
   String totalbayar,tanggalsekarang,norek, katasandi, tanggalformat;
   
    
    void infNamapengirim(String Nama_Pengirim){
    this.namapengirim  = Nama_Pengirim;
}
    void infNamapenerima(String Nama_Penerima){
    this.namapenerima = Nama_Penerima;
    }
    void infnamabankpenerima(String Nama_Bank_Penerima){
    this.namabankpenerima =  Nama_Bank_Penerima;
    }
    void infnote(String Note){
    this.note =  Note;
    }
    void inftanggalsekarang(String Tanggal_dan_tahun){
    this.tanggalsekarang =  Tanggal_dan_tahun;
    }
    
    void infnorek(String Nomor_rek){
    this.norek =  Nomor_rek;
    }
     void inftotalbayar(String Total_pembayaran){
    this.totalbayar =  Total_pembayaran;
    }
     
     void infkatasandi(String Kata_sandi){
    this.katasandi  = Kata_sandi;
     }
     
     
      
    
       String printnamapengirim(){
        return namapengirim;
    }
    String printnamapenerima(){
        return namapenerima;
    }
    String printbankpenerima(){
        return namabankpenerima;
    }
    String printnaote(){
        return note;
    }
   String printtotalbayar(){
        return totalbayar;
    }
    
    String printtanggalsekarang(){
        return tanggalsekarang;
    }
    String printnorek(){
        return norek;
    }    

    String printkatasandi(){
        return katasandi;
    }  
   

   
}

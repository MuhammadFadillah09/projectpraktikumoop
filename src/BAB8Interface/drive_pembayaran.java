/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bab8interface;


/**
 *
 * @author Computer 8
 */
public class drive_pembayaran {
    public static void main(String[]args){
        Pembayaran payment;
               payment = new P0001();
               payment.tampilanmember();
               
               cash Cash = new cash();
               kredit credit = new kredit();
               emoney Emoney = new emoney();
               
               if(payment instanceof P0001){
                   P0001 p0001 = (P0001)payment;
               
               System.out.println("Jenis Member = " + p0001.member(p0001));
               System.out.println("Total Pembelian = " + p0001.hitpembayaran(500000));
               p0001.bayar = 600000;
               p0001.jenisPembayaran(Cash);
                       }
    }
}

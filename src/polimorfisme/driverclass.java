/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polimorfisme;

/**
 *
 * @author Computer 8
 */
public class driverclass {
    public static void main(String[]args){
        Manusia manusia = new Manusia();
        
        Buah apel = new Apel();
        Buah pisang = new Pisang();
        
        manusia.makanbuah(apel);
        manusia.makanbuah(pisang);
    }
}

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
public class Pisang extends Buah{
    public Pisang(){
        this.nama = "Pisang";
    }
    void makanbuah(){
        System.out.println(nama + " dimakan dengan dikupas kulit pisang sebelum dimakan.");
    }
}

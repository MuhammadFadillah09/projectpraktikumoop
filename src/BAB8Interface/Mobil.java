/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8Interface;

/**
 *
 * @author Lenovo
 */
public class Mobil extends Kendaraan implements Berjalan{
    public Mobil (String merek){
        super(merek);
    }
    @Override
    void carabergerak(){
        System.out.println("Bergerak Maju melalu roda yang bersentuhan langsung dengan permukaan tanah");
    }
    @Override
    void kecepatanMax(){
        System.out.println("500km/h");
    }
    @Override
    public void berjalan(){
        System.out.println("Mobil "+getMerek()+" Sedang berjalan di jalan raya");
    }
}

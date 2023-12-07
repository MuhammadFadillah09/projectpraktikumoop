/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAB8Interface;

/**
 *
 * @author Lenovo
 */
public class Pesawat extends Kendaraan implements Berjalan, Terbang{
    public Pesawat (String merek){
        super(merek);
    }
    
    @Override
    void carabergerak(){
        System.out.println("Pesawat Bergerak dalam udara dengan menggunakan mesin mesin yang memungkinkan untuk terbang");
    }
    @Override
    void kecepatanMax(){
        System.out.println("900km/h ");
    }
    @Override
    public void berjalan(){
        System.out.println("Pesawat"+getMerek()+" Berjalan maju melalui roda yang bersentuhan langsung dengan permukaan tanah");
    }
    
    @Override
    public void terbang(){
        System.out.println("Psawat"+getMerek()+" mesin yang berkecepatan tinggi,baling2 dan sayap aerodinamic memungkinkan nya pesawat untuk lepas landas");
    }
    
}

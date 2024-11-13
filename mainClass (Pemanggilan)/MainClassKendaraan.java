/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas4;

/**
 *
 * @author LENOVO
 */
public class MainClassKendaraan {
    public static void main(String[] args) {
        Motor mo = new Motor ();
        Mobil mb = new Mobil();
        Bis bs = new Bis ();
        
        
       
       mo.Merk = "Supra Bapak";
       mo.Platkendaraan = "AG 777 AWW";
       System.out.println("Merk           = "+mo.Merk);
       System.out.println("Plat kendaraan = "+mo.Platkendaraan);
       mo.pertalite();
       mb.maju();
       System.out.println("\n");
       
       
       mb.Merk ="Kijang";
       mb.Platkendaraan = "AG 0000 MO";
       System.out.println("Merk           = "+mb.Merk);
       System.out.println("Plat kendaraan = "+mb.Platkendaraan);
       mb.Solar();
       mb.maju();
       System.out.println("\n");
       
       bs.Merk = "Marcedez Benz";
       bs.Platkendaraan = "AG 69 JP";
       System.out.println("Merk           = "+bs.Merk);
       System.out.println("Plat kendaraan = "+bs.Platkendaraan);
       bs.solar2();
       bs.maju();
       
    }
       
        
    
}

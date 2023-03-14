/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

/**
 *
 * @author User
 */
public class MultipleConstructor {

    public static void main(String[] args) {
        // Kubus
        Kubus kubus1 = new Kubus();
        Kubus kubus2 = new Kubus(5.0);
        
        System.out.println("Volume Kubus 1 :" + kubus1.GetVolume());
        System.out.println("Volume Kubus 2 :" + kubus2.GetVolume());
        
        // Balok
        Balok balok1 = new Balok();
        Balok balok2 = new Balok(15.0, 10.0, 5.0);
        
        System.out.println("Volume Balok 1 :" + balok1.GetVolume());
        System.out.println("Volume Balok 2 :" + balok2.GetVolume());
        
        // Tabung
        Tabung tabung1 = new Tabung();
        Tabung tabung2 = new Tabung(14.0, 20.0);
        
        System.out.println("Volume Tabung 1 :" + tabung1.GetVolume());
        System.out.println("Volume Tabung 2 :" + tabung2.GetVolume());
        
        // Limas Segi Empat
        LimasSegiEmpat limasSegiEmpat1 = new LimasSegiEmpat();
        LimasSegiEmpat limasSegiEmpat2 = new LimasSegiEmpat(7.0, 10.0);
        
        System.out.println("Volume Limas Segi Empat 1 :" + limasSegiEmpat1.GetVolume());
        System.out.println("Volume Limas Segi Empat 2 :" + limasSegiEmpat2.GetVolume());
        
        // Bola
        Bola bola1 = new Bola();
        Bola bola2 = new Bola(14.0);
        
        System.out.println("Volume Bola 1 :" + bola1.GetVolume());
        System.out.println("Volume Bola 2 :" + bola2.GetVolume());
        
    }
}

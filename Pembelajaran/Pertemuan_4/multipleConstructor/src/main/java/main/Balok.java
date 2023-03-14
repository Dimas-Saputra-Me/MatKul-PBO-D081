/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author User
 */
public class Balok {
    private double panjang, lebar, tinggi, volume;
    
    // Constructor
    public Balok(){
        this.panjang = 10.0;
        this.lebar = 8.0;
        this.tinggi = 3.0;
    }
    
    public Balok(double panjang, double lebar, double tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    // Method
    public void SetPanjang(double panjang){
        this.panjang = panjang;
    }
    
    public void SetLebar(double lebar){
        this.lebar = lebar;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = this.panjang * this.lebar * this.tinggi;
    }
    
    public double GetVolume(){
        if(this.volume == 0.0) this.ComputeAndSetVolume();
        return this.volume;
    }
}

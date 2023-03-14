/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author User
 */
public class Kubus {
    private double sisi, volume;
    
    // Constructor
    public Kubus(){
        this.sisi = 5.0;
    }
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    
    // Method
    public void SetSisi(double sisiBaru){
        this.sisi = sisiBaru;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = Math.pow(sisi, 3);
    }
    
    public double GetVolume(){
        if(this.volume == 0.0) this.ComputeAndSetVolume();
        return this.volume;
    }
}

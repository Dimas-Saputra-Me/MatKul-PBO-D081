/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.tugas5;

/**
 *
 * @author User
 */
public class Tabung {
    private double radius, tinggi, volume;
    
    // Constructor
    public Tabung(){
        this.radius = 7.0;
        this.tinggi = 30.0;
    }
    
    public Tabung(double radius, double tinggi){
        this.radius = radius;
        this.tinggi = tinggi;
    }
    
    // Method
    public void SetRadius(double radius){
        this.radius = radius;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = Math.PI * this.radius * this.radius * this.tinggi;
    }
    
    public double GetVolume(){
        if(this.volume == 0.0) this.ComputeAndSetVolume();
        return this.volume;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author User
 */
public class LimasSegiEmpat {
    private double sisi, tinggi, volume;
    
    // Constructor
    public LimasSegiEmpat(){
        this.sisi = 5.0;
        this.tinggi = 7.0;
    }
    
    public LimasSegiEmpat(double sisi, double tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
    }
    
    // Method
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    
    public void SetTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = 1/3 * this.sisi * this.sisi * this.tinggi;
    }
    
    public double GetVolume(){
        if(this.volume == 0.0) this.ComputeAndSetVolume();
        return this.volume;
    }
    
}

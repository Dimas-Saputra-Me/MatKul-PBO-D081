/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.constructorkubus;

/**
 *
 * @author User
 */
public class Kubus {
    double sisi, volume;
    
    public Kubus(double sisi){
        this.sisi = sisi;
    }
    
    public void SetSisi(double sisi){
        this.sisi = sisi;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = Math.pow(this.sisi, 3);
    }
    
    public double GetVolume(){
        return this.volume;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author User
 */
public class Bola {
    private double radius, volume;
    
    // Constrcutor
    public Bola(){
        this.radius = 10.0;
    }
    
    public Bola(double radius){
        this.radius = radius;
    }
    
    // Method
    public void SetRadius(double radius){
        this.radius = radius;
    }
    
    public void ComputeAndSetVolume(){
        this.volume = 4/3 * Math.PI * Math.pow(radius, 3);
    }
    
    public double GetVolume(){
        if(this.volume == 0.0) this.ComputeAndSetVolume();
        return this.volume;
    }
}

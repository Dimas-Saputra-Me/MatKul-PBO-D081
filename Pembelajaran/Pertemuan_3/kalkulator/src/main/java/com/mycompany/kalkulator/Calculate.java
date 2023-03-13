/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulator;

/**
 *
 * @author User
 */
public class Calculate {
    double angka1, angka2;
    
    // Constructor
    public Calculate(double angka1, double angka2){
        this.angka1 = angka1;
        this.angka2 = angka2;
    }
    
    // Method
    public double tambah(){
        return this.angka1 + this.angka2;
    }
    
    public double kurangi(){
        return this.angka1 - this.angka2;
    }
    
    public double kali(){
        return this.angka1 * this.angka2;
    }
    
    public double bagi(){
        return this.angka1 / this.angka2;
    }
    
    public double modulo(){
        return this.angka1 % this.angka2;
    }
    
}

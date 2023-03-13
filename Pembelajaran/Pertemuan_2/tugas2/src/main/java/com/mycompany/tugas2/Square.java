/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;

/**
 *
 * @author User
 */
public class Square {
    protected double lengthOfSide;
    
    // Constructor
    protected Square(double lengthOfSide){
        this.lengthOfSide = lengthOfSide;
    }
    
    // Method
    protected double calculateArea(){
        return this.lengthOfSide * this.lengthOfSide;
    }
    
    protected double calculatePerimeter(){
        return this.lengthOfSide * 4;
    }
}

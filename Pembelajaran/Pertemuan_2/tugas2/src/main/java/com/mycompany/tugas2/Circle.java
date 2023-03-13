/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tugas2;

/**
 *
 * @author User
 */
public class Circle {
    protected double radius;
    
    // Constructor
    protected Circle(double radius){
        this.radius = radius;
    }
    
    // Method
    protected double calculateArea(){
        return Math.PI * radius * radius;
    }
    
    protected double calculatePerimeter(){
        return 2 * Math.PI * radius;
    }
}

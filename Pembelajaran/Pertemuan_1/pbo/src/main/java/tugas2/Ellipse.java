/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author User
 */
public class Ellipse {
    protected double semiMajorAxis;
    protected double semiMinorAxis;
    
    // Constructor
    protected Ellipse(double semiMajorAxis, double semiMinorAxis){
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;   
    }
    
    // Method
    protected double calculateArea(){
        return Math.PI * (this.semiMajorAxis * this.semiMinorAxis) ;
    }
    
    protected double calculatePerimeter(){
        return Math.PI * (this.semiMajorAxis + this.semiMinorAxis);
    }
}

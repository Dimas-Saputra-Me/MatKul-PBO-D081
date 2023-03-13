/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas2;

/**
 *
 * @author User
 */
public class Rectangle {
   protected double height;
   protected double width;
    
    // Constructor
    protected Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }
    
    // Method
    protected double calculateArea(){
        return this.height * this.width;
    }
    
    protected double calculatePerimeter(){
        return (this.height + this.width) * 2;
    }
}

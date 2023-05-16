/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.overloadingoverriding.overloading;

/**
 *
 * @author User
 */
public class Vector3 {
    protected int[] xyz = new int[3];
    
    // Constructor
    public Vector3(int x, int y, int z){
        this.xyz[0] = x;
        this.xyz[1] = y;
        this.xyz[2] = z;
    }
    
    // Method
    public int[] kaliVector(int skalar){
        return new int[]{
            this.xyz[0] * skalar, 
            this.xyz[1] * skalar, 
            this.xyz[2] * skalar
        };
    }
    
    public int[] kaliVector(int[] xyz){
        return new int[]{
            this.xyz[0] * xyz[0],
            this.xyz[1] * xyz[1],
            this.xyz[2] * xyz[2]
        };
    }
    
}

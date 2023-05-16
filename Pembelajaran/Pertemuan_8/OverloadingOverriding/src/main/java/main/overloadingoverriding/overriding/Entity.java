/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.overloadingoverriding.overriding;

/**
 *
 * @author User
 */
public class Entity {
    protected int id;
    protected int[] position = new int[2];
    
    // Constroctur
    public Entity(int id, int x, int y){
        this.id = id;
        this.position[0] = x;
        this.position[1] = y;
    }
    
    // Method (Overloading)
    public void move(int x, int y){
        this.position[0] += x;
        this.position[1] += y;
        System.out.println("Position (" + this.position[0] + "," + this.position[1] + ")");
    }
    
    public void move(int x){
        this.position[0] += x;
        System.out.println("Position (" + this.position[0] + "," + this.position[1] + ")");
    }
}

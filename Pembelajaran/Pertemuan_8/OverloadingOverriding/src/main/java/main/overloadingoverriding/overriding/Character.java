/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.overloadingoverriding.overriding;

/**
 *
 * @author User
 */
public class Character extends Entity {
    protected int level, health;
    
    // Constructor
    public Character(int id, int x, int y, int level, int health){
        super(id, x, y);
        this.level = level;
        this.health = health;
    }
    
    // Method (Overloading)
    public void speak(){
        System.out.println("Hello! Welcome to this game!");
    }
    
    public void speak(String text){
        System.out.println("Hello! Welcome to this game! " + text);
    }
}

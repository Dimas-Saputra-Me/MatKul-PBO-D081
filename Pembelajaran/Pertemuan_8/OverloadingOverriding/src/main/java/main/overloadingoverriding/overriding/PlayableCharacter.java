/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.overloadingoverriding.overriding;

/**
 *
 * @author User
 */
public class PlayableCharacter extends Character{
    protected String name, element;
    
    // Constructor
    public PlayableCharacter(int id, int x, int y, int level, int health, String name, String element){
        super(id, x, y, level, health);
        this.name = name;
        this.element = element;
    }
    
    // Method
    @Override
    public void speak(){
        System.out.println("Hello I'm " + this.name + " I have " + this.element + " vision");
    }
        // Overloading
    public void attack(){
        System.out.println("Attacking! Using basic attack!");
    }
    
    public void attack(String weapon){
        System.out.println("Attacking! Using " + weapon + "!");
    }
}

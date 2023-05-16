/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.abstractclass;

/**
 *
 * @author User
 */
public abstract class Hewan {
//     public String nickname;
//    
//    // Constructor
//    public Hewan(String nickname){
//        this.nickname = nickname;
//    }
//    
//    // Method
//    public abstract void speak();
//    public abstract void move();

/* -------------------------------------------------- */
//    public void test(){
//        System.out.println("Test");
//    }
    
 /* -------------------------------------------------- */
     // Method abstract
    public abstract void speak();
    public abstract void berjalan();
    
    // Method bukan abstract
    public void makan(){
        System.out.println("nyam nyam...");
    }
    
    // Method bukan abstract
    public void tidur(){
        System.out.println("zzz...zzz...zzz...");
    }
    
}

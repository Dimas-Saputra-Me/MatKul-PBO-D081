/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.pertemuan5;

/**
 *
 * @author User
 */
public class Pertemuan5 {

    public static void main(String[] args) {
        String name[] = {"Hadi", "Joel", "Siti", "Sukanto"};
        
        System.out.println(name.length);
        
        for(String temp : name){
            System.out.println(("Hadi".equals(temp)) ? "Lah Hadi?" : "");
            
            System.out.print(temp);
            System.out.print(", ");
        }
    }
}

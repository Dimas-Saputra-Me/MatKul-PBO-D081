/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.overloadingoverriding.overloading;

import java.util.Arrays;

/**
 *
 * @author User
 */
public class Overloading {

     public static void main() {
         Vector3 vector3 = new Vector3(3, 7, 9);
         System.out.println("Vector awal: (3, 7, 9)");
         
         // Perkalian Skalar
         System.out.print("Perkalian Skalar x3: ");
         System.out.println(Arrays.toString(vector3.kaliVector(3)));
         
         // Perkalian Vector
         System.out.print("Perkalian Vector x(2, 6, 4): ");
         System.out.println(Arrays.toString(vector3.kaliVector(new int[] {2, 6, 4})));
    }
}

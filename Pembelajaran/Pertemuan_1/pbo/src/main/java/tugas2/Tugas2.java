/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package tugas2;

import java.util.*;

/**
 *
 * @author User
 */
public class Tugas2 {

    public static void main(String[] args) {        
        Scanner readInput = new Scanner(System.in);
        
        /* PERSEGI */
        System.out.println("===   PERSEGI   ===");
        double lengthOfSide;
        System.out.print("Masukkan sisi persegi: "); lengthOfSide = readInput.nextDouble();
        
        Square persegi = new Square(lengthOfSide);
        System.out.println("Luas persegi adalah " + persegi.calculateArea());
        System.out.println("Keliling persegi adalah " + persegi.calculatePerimeter());
        System.out.print("\n\n");
        
        
        /* PERSEGI PANJANG */
        System.out.println("===   PERSEGI PANJANG   ===");
        double height, width;
        System.out.print("Masukkan panjang persegi panjang: "); height = readInput.nextDouble();
        System.out.print("Masukkan lebar persegi panjang: "); width = readInput.nextDouble();
        
        Rectangle perseiPanjang = new Rectangle(height, width);
        System.out.println("Luas persegi panjang adalah " + perseiPanjang.calculateArea());
        System.out.println("Keliling persegi panjang adalah " + perseiPanjang.calculatePerimeter());
        System.out.print("\n\n");
        
        /* LINGKARAN */
        System.out.println("===   LINGKARAN   ===");
        double radius;
        System.out.print("Masukkan jari-jari lingkaran: "); radius = readInput.nextDouble();
        
        Circle lingkaran = new Circle(radius);
        System.out.println("Luas lingkaran adalah " + lingkaran.calculateArea());
        System.out.println("Keliling lingkaran adalah " + lingkaran.calculatePerimeter());
        System.out.print("\n\n");
        
        
        /* OVAL */
        System.out.println("===   OVAL   ===");
        double semiMajoraxis, semiMinorAxis;
        System.out.print("Masukkan sumbu semi mayor oval: "); semiMajoraxis = readInput.nextDouble();
        System.out.print("Masukkan sumbu semi minor lingkaran: "); semiMinorAxis = readInput.nextDouble();
        
        
        Ellipse oval = new Ellipse(semiMajoraxis, semiMinorAxis);
        System.out.println("Luas oval adalah " + oval.calculateArea());
        System.out.println("Keliling oval adalah " + oval.calculatePerimeter());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main.overloadingoverriding;

import java.util.Scanner;
import main.overloadingoverriding.overloading.Overloading;
import main.overloadingoverriding.overriding.Overriding;

/**
 *
 * @author User
 */
public class OverloadingOverriding {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("1. Tugas Overloading\n2. Tugas Overriding\nJalankan tugas ke-");
        int pilihanTugas = sc.nextInt();
        
        if(pilihanTugas == 1){
            Overloading.main();
        } else if(pilihanTugas == 2){
            Overriding.main();
        } else {
            System.out.println("Pilihan Tidak Valid!");
        }
    }
}

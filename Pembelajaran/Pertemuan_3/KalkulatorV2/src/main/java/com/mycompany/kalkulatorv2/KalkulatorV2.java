/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.kalkulatorv2;

import java.util.*;

/**
 *
 * @author User
 */
public class KalkulatorV2 {

    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        
        System.out.println("Masukkan perhitungan: ");
        String expressionCalculation = readInput.nextLine();

        try {
            KalkulatorManual kalkulatorManual = new KalkulatorManual(expressionCalculation);
            System.out.println("Hasil dari " + kalkulatorManual.calculate());
        } catch(Exception e) {
            KalkulatorLibrary kalkulatorLibrary = new KalkulatorLibrary(expressionCalculation);
            System.out.println(kalkulatorLibrary.calculate());
        }

    }
}

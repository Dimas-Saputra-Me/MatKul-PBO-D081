/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulatorv2;

import net.objecthunter.exp4j.ExpressionBuilder;

/**
 *
 * @author User
 */
public class KalkulatorLibrary {

    private String calculation;

    // Constructor
    public KalkulatorLibrary(String calculation) {
        this.calculation = calculation;
    }

    // Method hitung
    public double calculate() {
        double result = new ExpressionBuilder(this.calculation)
                .build()
                .evaluate();
        
        return result;
    }

}

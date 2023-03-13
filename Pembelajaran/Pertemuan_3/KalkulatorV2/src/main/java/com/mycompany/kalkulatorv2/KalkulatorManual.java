/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.kalkulatorv2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
ADD
minus calculation
bracket calculation

*/

/**
 *
 * @author User
 */
public class KalkulatorManual {
    private String calculation;
    
    // Constructor
    public KalkulatorManual(String calculation){
        this.calculation = calculation;
    }
    
    // Method
    public double calculate(){
        String[] calculationArr = this.calculation.split("(?<=[-+*/()])|(?=[-+*/()])");
        List<String> calculationList = new ArrayList<String>(Arrays.asList(calculationArr));
        
        int index = 0;
        
        // Perhitungan perkalian
        while(calculationList.contains("*")){
            int opIdx = calculationList.indexOf("*");
            
            double tmp = Double.parseDouble(calculationList.get(opIdx-1)) * Double.parseDouble(calculationList.get(opIdx+1));
            calculationList.remove(opIdx);
            calculationList.remove(opIdx);
            
            calculationList.set(opIdx-1, String.valueOf(tmp));
        }
        
        // Perhitungan pembagian
        while(calculationList.contains("/")){
            int opIdx = calculationList.indexOf("/");
            
            double tmp = Double.parseDouble(calculationList.get(opIdx-1)) / Double.parseDouble(calculationList.get(opIdx+1));
            calculationList.remove(opIdx);
            calculationList.remove(opIdx);
            
            calculationList.set(opIdx-1, String.valueOf(tmp));
        }
        
        // Perhitungan Penjumlahan dan Pengurangan
        double res = Double.parseDouble(calculationList.get(0));
        for (int i = 1; i < calculationList.size(); i++) {
            if("+".equals(calculationList.get(i))){
                res += Double.parseDouble(calculationList.get(i+1)); i++;
            }
            
            if("-".equals(calculationList.get(i))){
                res -= Double.parseDouble(calculationList.get(i+1)); i++;
            }
            
        }
        
        return res;
    }
    
}

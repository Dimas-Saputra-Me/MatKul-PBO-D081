/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.constructorkubus;

/**
 *
 * @author User
 */
public class ConstructorKubus {

    public static void main(String[] args) {
        Kubus kub = new Kubus(2);
        kub.ComputeAndSetVolume();
        System.out.println(kub.GetVolume());
    }
}

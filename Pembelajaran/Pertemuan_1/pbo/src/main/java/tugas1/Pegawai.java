/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

/**
 *
 * @author User
 */
public class Pegawai extends Manusia {
    
    protected String departemen;
    protected String pengalaman;
    protected String skill;
    
    // Constructor
    public Pegawai(String nama, String alamat, String departemen, String pengalaman, String skill){
        super(nama, alamat);
        this.departemen = departemen;
        this.pengalaman = pengalaman;
        this.skill = skill;
    }
    
    // Method Get gaji
    protected int getGaji(){
        int gaji = 0;
        
         // Penambahan gaji menurut departemen
        switch(this.departemen){
            case "it" -> gaji += 8000000;
            case "hrd" -> gaji += 5000000;
            case "finance" -> gaji += 4000000;
        }
        
        // Penambahan gaji menurut pengalaman
        switch(this.pengalaman){
            case "pemula" -> gaji += 500000;
            case "menengah" -> gaji += 1000000;
            case "expert" -> gaji += 2000000;
        }

        // Penambahan gaji menurut skill
        switch(this.skill){
            case "web" -> gaji += 1000000;
            case "mobile" -> gaji += 2000000;
            case "desktop" -> gaji += 2500000;
        }     
        
        return gaji;
    }
    
    @Override
    protected void perkenalan(){
        super.perkenalan();
        System.out.println("Saya bekerja di departemen " + this.departemen.toUpperCase() + " dengan pengalaman " + this.pengalaman.toUpperCase() + " dan skill " + this.skill.toUpperCase());
    }
}

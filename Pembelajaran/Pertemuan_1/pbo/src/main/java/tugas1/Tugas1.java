package tugas1;

import java.util.*;
/**
 *
 * @author User
 */
public class Tugas1 {
    
    public static void main(String[] args) {
        Scanner readInput = new Scanner(System.in);
        
        String nama, alamat, departemen, pengalaman, skill;
        System.out.println("======= Pegawai =======");
        System.out.print("Masukkan nama: "); nama = readInput.nextLine();
        System.out.print("Masukkan alamat: "); alamat = readInput.nextLine();
        System.out.println("| IT | HRD | Finance |");
        System.out.print("Masukkan departemen: "); departemen = readInput.nextLine().toLowerCase();
        System.out.println("| Pemula | Menengah | Expert |");
        System.out.print("Masukkan pengalaman: "); pengalaman = readInput.nextLine().toLowerCase();
        System.out.println("| Web | Mobile | Desktop |");
        System.out.print("Masukkan skill: "); skill = readInput.nextLine().toLowerCase();
        
        Pegawai pegawai1 = new Pegawai(nama, alamat, departemen, pengalaman, skill);
        
        System.out.println("Gaji pegawai: " + pegawai1.getGaji());
        pegawai1.perkenalan();
    }
}

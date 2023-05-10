/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package main.uts;

import java.util.ArrayList;
import java.util.Scanner;

/*
    IDENTITAS MAHASISWA 
    Nama    : Dimas Saputra
    NPM     : 21081010151
    Kelas    : PBO D
*/

/**
 *
 * @author User
 */
public class Uts {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Halte> halte = new ArrayList<>();
        Bus bus = new Bus();
        ArrayList<Penumpang> penumpang = new ArrayList<>();

        // INPUT HALTE
        System.out.println("-------------------------------------");
        System.out.println("INPUT HALTE");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan \"EXIT\" ketika sudah selesai input halte, Masukkan Halte secara linear berurutan");

        boolean loopHalte = true;
        while (loopHalte) {
            System.out.print("Masukkan lokasi halte: ");
            String lokasi = sc.nextLine();

            if ("exit".equals(lokasi.toLowerCase())) {
                loopHalte = false;
            } else {
                halte.add(new Halte(lokasi));
            }
        }

        // INPUT PENUMPANG
        System.out.println("-------------------------------------");
        System.out.println("INPUT PENUMPANG");
        System.out.println("-------------------------------------");
        System.out.println("Masukkan \"EXIT\" pada kolom nama ketika sudah selesai input nama");

        boolean loopPenumpang = true;
        while (loopPenumpang) {
            System.out.print("Masukkan nama penumpang: ");
            String nama = sc.nextLine();

            if ("exit".equals(nama.toLowerCase())) {
                loopPenumpang = false;
            } else {
                System.out.print("Masukkan lokasi sekarang penumpang: ");
                String dari = sc.nextLine();
                System.out.print("Masukkan lokasi tujuan penumpang: ");
                String tujuan = sc.nextLine();

                penumpang.add(new Penumpang(nama, dari, tujuan));
            }
        }
        
        // Output
        System.out.println("-------------------------------------");
        System.out.println("OUTPUT");
        System.out.println("-------------------------------------");
        // Bus Jalan (Loop Halte)
        halte.forEach((Halte h) -> {
            // Update lokasi bus
            bus.lokasi = h.getLokasi();
            
            // Penumpang turun
            int penumpangTurun = bus.removePenumpang();
            
            // Penumpang Naik
            penumpang.forEach((Penumpang p) -> {
                if(p.dari.equals(h.getLokasi())) bus.addPenumpang(p);
            });
            
            h.printHalte(penumpang, bus.getPenumpang(), penumpangTurun);
        });

    }

}

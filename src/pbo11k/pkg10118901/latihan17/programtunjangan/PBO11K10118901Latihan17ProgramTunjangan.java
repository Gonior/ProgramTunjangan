/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo11k.pkg10118901.latihan17.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author
 * NAMA             : Dedi cahya
 * NIM              : 10118901
 * KELAS            : IF11K
 * Tentang Program  : Menghitung tunjangan dengan syarat sudah menikah
 */
public class PBO11K10118901Latihan17ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);  
        double gaji,tunjangan, totalGaji = 0;
        
        System.out.println("==========Program Tunjangan===========");
        System.out.print("Berapa gaji pokok anda perbulan: Rp.");
        gaji = input.nextDouble();
        System.out.print("Status anda ? (Menikah/Belum)  : ");
        String status = input.next();
        if (!status.equals("Menikah")) 
            tunjangan = 0;
        else 
            tunjangan = 0.35 * gaji;
        
        totalGaji = gaji + tunjangan;
        System.out.println("");
        System.out.println("======Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok              : Rp."+ gaji);
        System.out.println("Tunjangan               : Rp."+ tunjangan);
        System.out.println("Total Gaji              : Rp."+ totalGaji);
        System.out.println("(Developed by : Dedi cahya)");
        
    }
    
}

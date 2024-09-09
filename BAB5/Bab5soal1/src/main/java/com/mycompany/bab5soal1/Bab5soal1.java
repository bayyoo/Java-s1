/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal1;

/**
 *
 * @author bayu asoy
 */
import java.util.Scanner;
import java.text.DecimalFormat; // maaf pak saya bingung pas gaji saya masukin 100000 gabisa yaudah saya ini aja pake format desimal, maaf ga sesuai pak
public class Bab5soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         // maaf pak saya bingung pas gaji saya masukin 100000 gabisa yaudah saya ini aja pake format desimal, maaf ga sesuai pak
        
          System.out.println("### Pendataan Karyawan PT. Petani Kode ###");
        System.out.print("Nama karyawan: ");
        String nama = scanner.nextLine();
        System.out.print("Alamat: ");
        String alamat = scanner.nextLine();        
        System.out.print("Usia: ");
        int usia = scanner.nextInt();
        System.out.print("Gaji: ");
        double gaji = scanner.nextDouble();
        
         DecimalFormat formatter = new DecimalFormat("#,###");
         String formattedGaji = formatter.format(gaji);
        
        System.out.println("\nData Karyawan:");
        System.out.println("Nama Karyawan: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("Gaji: Rp " + formattedGaji);
        
        // Menutup scanner
        scanner.close();
    }
}

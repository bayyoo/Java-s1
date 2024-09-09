/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5soal2;

/**
 *
 * @author bayu asoy
 */

import java.util.Scanner; //ini buat ambil input dari pengguna

public class Bab5soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //ini buat ngebaca input pengguna
        
        // minta pengguna masukin nilai alas segitiga 
        System.out.println("Masukin Nilai Alas: ");
        double alas = input.nextDouble(); // menyimpan nilai alas
        
        //meminta pengguna masukin nilai tinggi segitiga 
        System.out.println("Masukin Nilai Tinggi: "); 
        double tinggi = input.nextDouble(); // menyimpan nilai tinggi
        
        // ini perkaliannya dengan rumus alas kali tinggi
        double luas = (alas * tinggi) / 2;
        
        // HasiLmya euy
        System.out.println("Luas Segitiga: " + luas);
    }
}

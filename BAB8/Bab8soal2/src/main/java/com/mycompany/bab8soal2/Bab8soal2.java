/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal2;

/**
 *
 * @author bayu asoy
 */

import java.util.Scanner;

public class Bab8soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk tahun akhir
        System.out.print("Tahun Akhir ?: ");
        int endYear = scanner.nextInt();  // Membaca tahun akhir dari pengguna
        
        // Meminta input dari pengguna untuk tahun awal
        System.out.print("Tahun Awal ?: ");
        int startYear = scanner.nextInt();  // Membaca tahun awal dari pengguna

        // Menggunakan perulangan for untuk menampilkan tahun dari akhir ke awal
        for (int i = endYear; i >= startYear; i--) {
            // Menampilkan hasil nilai tahun yang mundur setiap perulangan
            System.out.println(i);
        }

        // Menutup scanner setelah digunakan
        scanner.close();
    }
}

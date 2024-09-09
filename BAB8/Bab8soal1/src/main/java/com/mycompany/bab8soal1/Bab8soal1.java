/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8soal1;

/**
 *
 * @author bayu asoy
 */

import java.util.Scanner;
public class Bab8soal1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input dari pengguna untuk nilai awal
        System.out.print("Nilai Awal ?: ");
        int start = scanner.nextInt();  // Membaca nilai awal dari pengguna
        
        // Meminta input dari pengguna untuk nilai akhir
        System.out.print("Nilai Akhir ?: ");
        int end = scanner.nextInt();  // Membaca nilai akhir dari pengguna

        // Menggunakan perulangan for untuk menampilkan angka dengan pertambahan 5
        for (int i = start; i <= end; i += 5) {
            // Menampilkan hasil nilai i yang bertambah 5 setiap perulangan
            System.out.println(i);
        }

        // Menutup scanner setelah digunakan
        scanner.close();
    }
}

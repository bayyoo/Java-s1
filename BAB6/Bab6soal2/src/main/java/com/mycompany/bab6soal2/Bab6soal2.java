/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal2;

/**
 *
 * @author bayu asoy
 */
import java.util.Scanner;

public class Bab6soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        
        System.out.print("NIM  : "); // Menampilkan pertanyaan "NIM?" di layar
        String nim = input.nextLine(); // Menyimpan input pengguna untuk NIM sebagai String
        
        System.out.print("NAMA  : "); // Menampilkan pertanyaan "NAMA?" di layar
        String nama = input.nextLine(); // Menyimpan input pengguna untuk Nama sebagai String
        
        System.out.print("NILAI  : "); // Menampilkan pertanyaan "NILAI?" di layar
        int nilai = input.nextInt(); // Menyimpan input pengguna untuk Nilai sebagai int
        
        String grade; // Mendeklarasikan variabel grade untuk menyimpan nilai dalam huruf (A, B, C, dll.)
        String statusLulus; // Mendeklarasikan variabel statusLulus untuk menyimpan status Lulus atau Tidak Lulus
        
        // Logika untuk menentukan grade dan status lulus berdasarkan nilai
        if (nilai < 50) {
            grade = "Tidak Lulus"; // Jika nilai kurang dari 50, maka grade adalah "Tidak Lulus"
            statusLulus = "Tidak Lulus"; // Status kelulusan adalah "Tidak Lulus"
        } else if (nilai >= 50 && nilai < 60) {
            grade = "D"; // Jika nilai antara 50 dan 59, maka grade adalah "D"
            statusLulus = "Tidak Lulus"; // Status kelulusan tetap "Tidak Lulus"
        } else if (nilai >= 60 && nilai < 70) {
            grade = "C"; // Jika nilai antara 60 dan 69, maka grade adalah "C"
            statusLulus = "Tidak Lulus"; // Status kelulusan tetap "Tidak Lulus"
        } else if (nilai >= 70 && nilai < 80) {
            grade = "B"; // Jika nilai antara 70 dan 79, maka grade adalah "B"
            statusLulus = "Lulus"; // Status kelulusan adalah "Lulus"
        } else if (nilai >= 80 && nilai < 90) {
            grade = "A"; // Jika nilai antara 80 dan 89, maka grade adalah "A"
            statusLulus = "Lulus"; // Status kelulusan adalah "Lulus"
        } else if (nilai >= 90 && nilai <= 100) {
            grade = "A+"; // Jika nilai antara 90 dan 100, maka grade adalah "A+"
            statusLulus = "Lulus"; // Status kelulusan adalah "Lulus"
        } else {
            grade = "Data Nilai Salah!"; // Jika nilai di luar rentang 0-100, dianggap salah
            statusLulus = "N/A"; // Status tidak tersedia karena nilai tidak valid
        }
        
        // Output untuk menampilkan grade kepada pengguna
        System.out.println("Grade: " + grade); // Menampilkan grade di layar
        
        // Jika statusLulus tidak sama dengan "N/A", tampilkan status kelulusan
        if (!statusLulus.equals("N/A")) {
            System.out.println("Status: " + statusLulus); // Menampilkan status kelulusan di layar
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6soal1;

/**
 *
 * @author bayu asoy
 */
import java.util.Scanner;


public class Bab6soal1 {

    public static void main(String[] args) {
        // Membuat objek Scanner untuk mengambil input dari pengguna melalui keyboard
        Scanner input = new Scanner(System.in);
        
        // Meminta pengguna untuk memasukkan NIM dan menyimpannya ke variabel 'nim'
        System.out.print("NIM ? : ");
        String nim = input.nextLine(); // Menggunakan nextLine() agar bisa membaca input string
        
        // Meminta pengguna untuk memasukkan NAMA dan menyimpannya ke variabel 'nama'
        System.out.print("NAMA ? : ");
        String nama = input.nextLine(); // Menggunakan nextLine() agar bisa membaca input string
        
        // Meminta pengguna untuk memasukkan NILAI dan menyimpannya ke variabel 'nilai'
        System.out.print("NILAI ? : ");
        int nilai = input.nextInt(); // Menggunakan nextInt() untuk membaca input angka
        
        // Mengecek nilai yang dimasukkan pengguna dan menentukan grade berdasarkan nilai tersebut
        if (nilai < 50) { // Jika nilai kurang dari 50, tampilkan "Tidak Lulus"
            System.out.println("grade: Tidak Lulus");
        } else if (nilai >= 50 && nilai < 60) { // Jika nilai antara 50 dan 59, tampilkan grade "D"
            System.out.println("grade: D");
        } else if (nilai >= 60 && nilai < 70) { // Jika nilai antara 60 dan 69, tampilkan grade "C"
            System.out.println("grade: C");
        } else if (nilai >= 70 && nilai < 80) { // Jika nilai antara 70 dan 79, tampilkan grade "B"
            System.out.println("grade: B");
        } else if (nilai >= 80 && nilai < 90) { // Jika nilai antara 80 dan 89, tampilkan grade "A"
            System.out.println("grade: A");
        } else if (nilai >= 90 && nilai < 100) { // Jika nilai antara 90 dan 99, tampilkan grade "A+"
            System.out.println("grade: A+"); 
        } else {
            // Jika nilai di luar rentang 0-100, tampilkan pesan "Data Nilai Salah!"
            System.out.println("Data Nilai Salah!");
        }
    }
}
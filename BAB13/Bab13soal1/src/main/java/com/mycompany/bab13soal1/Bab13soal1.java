/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal1;

/**
 *
 * @author bayu
 */

class KalkulatorSederhana {
    // Method untuk penjumlahan
    int tambah(int a, int b) {
        return a + b;
    }

    // Method untuk pengurangan
    int kurang(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    int kali(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    int bagi(int a, int b) {
        return a / b;
    }
}

public class Bab13soal1 {
    public static void main(String[] args) {
        KalkulatorSederhana objek = new KalkulatorSederhana();
        
        // Pengujian operasi matematika
        System.out.println("Hasil Pertambahan: " + objek.tambah(20, 10));
        System.out.println("Hasil Pengurangan: " + objek.kurang(20, 10));
        System.out.println("Hasil Perkalian: " + objek.kali(20, 10));
        System.out.println("Hasil Pembagian: " + objek.bagi(20, 10));
    }
}
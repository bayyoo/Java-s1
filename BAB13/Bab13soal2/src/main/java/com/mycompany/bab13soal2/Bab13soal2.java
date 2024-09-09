/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab13soal2;

/**
 *
 * @author USER
 */
class Segitiga {
    // Method untuk menghitung luas dengan alas dan tinggi
    double hitungLuas(double alas, double tinggi) {
        return (alas * tinggi) / 2;
    }

    // Method untuk menghitung luas segitiga sama sisi
    double hitungLuas(double sisi) {
        return (Math.sqrt(3) / 4) * sisi * sisi;
    }
}

public class Bab13soal2 {
    public static void main(String[] args) {
        Segitiga objek = new Segitiga();
        
        // Pengujian menghitung luas dengan alas dan tinggi
        System.out.println("Luas Segitiga dengan alas dan tinggi: " + objek.hitungLuas(10, 5));
        
        // Pengujian menghitung luas segitiga sama sisi
        System.out.println("Luas Segitiga sama sisi: " + objek.hitungLuas(6));
    }
}

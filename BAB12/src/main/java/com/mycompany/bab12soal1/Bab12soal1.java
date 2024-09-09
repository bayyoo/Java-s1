/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab12soal1;

/**
 *
 * @author bayu
 */

// Parent class Pegawai
class Pegawai {
    // Atribut dasar untuk gaji, tunjangan makan, dan transport
    float gaji = 4000000;
    float tunjanganMakan = 400000;
    float transport = 500000;
}

// Child class SystemAnalyst yang mewarisi dari Pegawai
class SystemAnalyst extends Pegawai {
    // Atribut bonus khusus untuk System Analyst
    int bonus = 1000000;
    
    // Method untuk menghitung total gaji
    float hitungGajiTotal() {
        // Menghitung total gaji dengan menambahkan gaji, bonus, tunjangan makan, dan transport
        return gaji + bonus + tunjanganMakan + transport;
    }
}

public class Bab12soal1 {

    public static void main(String[] args) {
        // Membuat objek SystemAnalyst
        SystemAnalyst SA = new SystemAnalyst();
        
        // Output detail gaji, bonus, tunjangan makan, dan transport
        System.out.println("Gaji System Analyst: " + SA.gaji);
        System.out.println("Bonus: " + SA.bonus);
        System.out.println("Tunjangan Makan: " + SA.tunjanganMakan);
        System.out.println("Transport: " + SA.transport);
        
        // Output gaji total yang sudah dihitung
        System.out.println("Gaji Total: " + SA.hitungGajiTotal());
    }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab14soal1dan2;

/**
 *
 * @author USER
 */

// Class utama yang berisi method main
public class Bab14soal1dan2 {
    public static void main(String[] args) {
        // Membuat objek dari class burung
        burung objekBurung = new burung(); 
        
        // Memanggil method abstract yang telah diimplementasikan
        objekBurung.suara();
        
        // Memanggil method non-abstract dari parent class
        objekBurung.suara2();
    }
}

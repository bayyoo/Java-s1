/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal1;

/**
 *
 * @author bayu asoy
 */
public class Bab7soal1 {
    
    public static void main(String[] args) {
        int day = 2; // Mendeklarasikan variabel 'day' dengan nilai 2
        
        switch (day) { // Memasukkan 'day' ke dalam switch
            case 1: 
                System.out.println("Sabtu"); // Jika day = 1, cetak Sabtu
                break;
            case 2: 
                System.out.println("Minggu"); // Jika day = 2, cetak Minggu
                break;
            default: 
                System.out.println("Hari tidak ditemukan"); // Jika tidak cocok, cetak ini
        }
    }
}

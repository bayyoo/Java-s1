/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal1;

/**
 *
 * @author USER
 */
public class Bab9soal1 {

    public static void main(String[] args) {
        // Inisialisasi variabel untuk loop luar
        int i = 1;
        
        // Loop luar menggunakan while
        while (i <= 5) {
            // Inisialisasi variabel untuk loop dalam
            int j = 1;
            
            // Loop dalam menggunakan while
            while (j <= i) {
                System.out.print("* ");
                j++;  // Increment j
            }
            
            System.out.println();  // Pindah ke baris baru
            i++;  // Increment i
        }
    }
}

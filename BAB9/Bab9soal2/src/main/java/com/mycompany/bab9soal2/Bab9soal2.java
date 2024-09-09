/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9soal2;

/**
 *
 * @author USER
 */

import java.util.Scanner;

public class Bab9soal2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Meminta input dari pengguna
        System.out.print("Masukkan bilangan awal: ");
        int awal = scanner.nextInt();
        
        System.out.print("Masukkan bilangan akhir: ");
        int akhir = scanner.nextInt();
        
        System.out.print("Hasil deret bilangan: ");
        
        // Loop menggunakan while
        while (awal <= akhir) {
            System.out.print(awal);
            
            // Jika nilai awal setelah increment tidak lebih besar dari nilai akhir, cetak koma
            if (awal + 5 <= akhir) {
                System.out.print(", ");
            }
            
            // Increment nilai awal dengan 5
            awal += 5;
        }
        
        scanner.close();
    }
}

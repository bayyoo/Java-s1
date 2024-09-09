/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7soal2;

/**
 *
 * @author bayu asoy
 */

import java.util.Scanner;

public class Bab7soal2 {

public class NestedSwitchScanner {
    
}
    public static void main(String[] args) {
        // Membuat Scanner untuk mengambil input dari pengguna
        Scanner input = new Scanner(System.in);
        
        // Meminta input NIM, Nama, Tahun, dan Peminatan dari pengguna
        System.out.print("NIM : ");
        String nim = input.nextLine();
        
        System.out.print("NAMA : ");
        String nama = input.nextLine();
        
        System.out.print("TAHUN : ");
        int tahun = input.nextInt();
        
        System.out.print("PILIH PEMINATAN (C, E, M) : ");
        char peminatan = input.next().charAt(0);
        
        // Switch pertama untuk tahun
        switch(tahun) {
            case 1:
                System.out.println("Bahasa Inggris, Matematika, Sains");
                break;
            case 2:
                switch(peminatan) {
                    case 'C':
                        System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
                        break;
                    case 'E':
                        System.out.println("Algoritma, Logika Informatika");
                        break;
                    case 'M':
                        System.out.println("DBMS, Manajemen Proyek");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                }
                break;
            case 3:
                switch(peminatan) {
                    case 'C':
                        System.out.println("Organisasi Komputer, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Perancangan Sistem, Pemrograman WEB");
                        break;
                    case 'M':
                        System.out.println("Pemrograman Mobile, Pemrograman Java 2");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                }
                break;
            case 4:
                switch(peminatan) {
                    case 'C':
                        System.out.println("Komunikasi Data, MultiMedia");
                        break;
                    case 'E':
                        System.out.println("Sistem Terdistribusi, Image Processing");
                        break;
                    case 'M':
                        System.out.println("SIM, Sistem Jaringan");
                        break;
                    default:
                        System.out.println("Peminatan tidak valid");
                }
                break;
            default:
                System.out.println("Tahun tidak valid");
        }
    }
}

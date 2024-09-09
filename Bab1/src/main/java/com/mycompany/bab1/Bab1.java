/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab1;

/**
 *
 * @author bayu asoy
 */
public class Bab1 {

    public static void main(String[] args) {
        // Menampilkan pertanyaan
        System.out.println("1. Jelaskan apa itu JRE? Apa kegunaannya!");
        System.out.println("2. Jelaskan apa itu JDK?");
        System.out.println("3. Jelaskan apa itu Java Virtual Machine?");
        System.out.println("4. Jelaskan tahap membuat proyek aplikasi baru dan class baru di NetBeans!");
        System.out.println("5. Berdasarkan jenis, aplikasi apa saja yang dapat dibuat dengan menggunakan pemrograman Java?");
        System.out.println("6. Berdasarkan platform, platform apa saja pada Java?\n");

        // Menampilkan jawaban
        System.out.println("Jawaban:");
        System.out.println("1. JRE (Java Runtime Environment) adalah bagian dari Java Development Kit (JDK) yang menyediakan lingkungan eksekusi untuk menjalankan aplikasi Java. "
                         + "Fungsinya adalah memuat kelas, memverifikasi akses memori, dan mengambil sumber daya yang diperlukan.");
        
        System.out.println("2. JDK (Java Development Kit) adalah perangkat lengkap untuk mengembangkan aplikasi Java. "
                         + "JDK mencakup JRE serta alat-alat pengembangan lainnya seperti compiler (javac), JavaDoc, dan debugger.");
        
        System.out.println("3. Java Virtual Machine (JVM) adalah mesin virtual yang mengeksekusi bytecode Java. "
                         + "JVM memungkinkan program Java untuk berjalan di berbagai sistem operasi tanpa perlu mengubah kodenya.");
        
        System.out.println("4. Tahap membuat proyek aplikasi baru di NetBeans: \n"
                         + "   a. Buka NetBeans. \n"
                         + "   b. Pilih 'File' > 'New Project'. \n"
                         + "   c. Pilih kategori 'Java' dan proyek 'Java Application'. \n"
                         + "   d. Beri nama proyek, lalu klik 'Finish'. \n"
                         + "   e. Untuk membuat class baru, klik kanan pada folder 'Source Packages', pilih 'New' > 'Java Class', beri nama class, dan klik 'Finish'.");
        
        System.out.println("5. Berdasarkan jenis, aplikasi yang dapat dibuat menggunakan Java meliputi: \n"
                         + "   a. Aplikasi Standalone (seperti media player, antivirus). \n"
                         + "   b. Aplikasi Web (seperti sistem reservasi tiket, aplikasi e-commerce). \n"
                         + "   c. Aplikasi Enterprise (seperti sistem perbankan). \n"
                         + "   d. Aplikasi Mobile (menggunakan Android SDK).");
        
        System.out.println("6. Berdasarkan platform, Java terdiri dari: \n"
                         + "   a. Java SE (Standard Edition) untuk aplikasi desktop. \n"
                         + "   b. Java EE (Enterprise Edition) untuk aplikasi web dan enterprise. \n"
                         + "   c. Java ME (Micro Edition) untuk aplikasi mobile dan embedded systems. \n"
                         + "   d. JavaFX untuk aplikasi desktop dan aplikasi berbasis media yang lebih modern.");
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab11soal1dan2;

/**
 *
 * @author bayu
 */

import java.util.Scanner;

public class Bab11soal1dan2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data karyawan
        System.out.print("Masukkan ID Karyawan: ");
        String idKaryawan = input.nextLine();

        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = input.nextLine();

        System.out.print("Masukkan Golongan Karyawan (1-5): ");
        int golongan = input.nextInt();

        // Membuat objek karyawan
        karyawan karyawan = new karyawan(idKaryawan, namaKaryawan, golongan);

        // Menampilkan informasi karyawan
        karyawan.tampilkanInfo();
    }
}

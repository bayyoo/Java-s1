package com.mycompany.bab11soal1dan2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bayu
 */
import java.util.Scanner;

public class karyawan {
    // Atribut
    private String idkaryawan;
    private String namakaryawan;
    private int golongan;
    private String jabatan;
    private double gajiPokok;

    // Constructor berparameter
    public karyawan(String idkaryawan, String namakaryawan, int golongan) {
        this.idkaryawan = idkaryawan;
        this.namakaryawan = namakaryawan;
        this.golongan = golongan;
        setJabatanDanGaji(golongan); // Tentukan jabatan dan gaji berdasarkan golongan
    }

    // Method untuk menentukan jabatan dan gaji pokok berdasarkan golongan
    private void setJabatanDanGaji(int golongan) {
        switch (golongan) {
            case 1:
                this.jabatan = "Assisten Staff";
                this.gajiPokok = 3000000;
                break;
            case 2:
                this.jabatan = "Staff";
                this.gajiPokok = 3500000;
                break;
            case 3:
                this.jabatan = "Supervisor";
                this.gajiPokok = 4000000;
                break;
            case 4:
                this.jabatan = "Assisten Manager";
                this.gajiPokok = 5000000;
                break;
            case 5:
                this.jabatan = "Manager";
                this.gajiPokok = 6000000;
                break;
            default:
                this.jabatan = "Tidak dikenal";
                this.gajiPokok = 0;
                break;
        }
    }

    // Method untuk menampilkan informasi karyawan
    public void tampilkanInfo() {
        System.out.println("ID Karyawan : " + idkaryawan);
        System.out.println("Nama Karyawan : " + namakaryawan);
        System.out.println("Golongan : " + golongan);
        System.out.println("Jabatan : " + jabatan);
        System.out.println("Gaji Pokok : " + gajiPokok);
    }
}

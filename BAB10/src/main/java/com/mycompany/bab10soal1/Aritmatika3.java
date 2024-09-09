package com.mycompany.bab10soal1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author bayu
 */

import java.math.BigInteger;

public class Aritmatika3 {

    // Method untuk pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    // Method untuk perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    // Method untuk pembagian
    public int pembagian(int a, int b) {
        // Pastikan b tidak 0 untuk menghindari pembagian dengan nol
        if (b == 0) {
            System.out.println("Pembagian dengan nol tidak diperbolehkan.");
            return 0;
        }
        return a / b;
    }

    // Method untuk pangkat
    public BigInteger pangkat(int a, int b) {
        BigInteger base = BigInteger.valueOf(a);
        BigInteger result = BigInteger.ONE;

        for (int i = 0; i < b; i++) {
            result = result.multiply(base);
        }

        return result;
    }
}

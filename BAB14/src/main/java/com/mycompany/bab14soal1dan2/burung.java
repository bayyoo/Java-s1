package com.mycompany.bab14soal1dan2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */

// Class burung yang meng-extend class abstrakhewan
public class burung extends abstrakhewan {
    // Implementasi method abstract dari class abstrakhewan
    @Override
    public void suara() {
        System.out.println("Suara Burung mencicit");
    }
}

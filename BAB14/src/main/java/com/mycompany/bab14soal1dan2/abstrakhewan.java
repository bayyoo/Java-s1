package com.mycompany.bab14soal1dan2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author USER
 */
    // Class abstract yang memiliki method abstract dan method konkrit
public abstract class abstrakhewan {
    // Method abstract yang harus diimplementasikan oleh subclass
    public abstract void suara(); 
    
    // Method konkrit yang dapat digunakan oleh subclass
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}


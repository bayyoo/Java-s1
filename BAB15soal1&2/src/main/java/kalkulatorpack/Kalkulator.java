/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kalkulatorpack;

/**
 *
 * @author USER
 */
public class Kalkulator {
    
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public int pengurangan(int a, int b) {
        return a - b;
    }

    public float pembagian(float a, float b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Tidak dapat membagi dengan nol");
            return 0;
        }
    }

    public float perkalian(float a, float b) {
        return a * b;
    }
}
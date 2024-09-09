// Main.java
class OperasiAritmatika extends Aritmatika {

    // Constructor yang memanggil constructor dari superclass
    public OperasiAritmatika(double A, double B) {
        super(A, B); // memanggil constructor Aritmatika
    }

    // Override method penjumlahan
    @Override
    protected double penjumlahan() {
        return super.A + super.B;
    }

    // Override method pengurangan
    @Override
    protected double pengurangan() {
        return super.A - super.B;
    }

    // Override method perkalian
    @Override
    protected double perkalian() {
        return super.A * super.B;
    }

    // Override method pembagian
    @Override
    protected double pembagian() {
        if (super.B != 0) {
            return super.A / super.B;
        } else {
            System.out.println("Error: Pembagian dengan nol!");
            return 0;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Buat objek dari class OperasiAritmatika
        OperasiAritmatika operasi = new OperasiAritmatika(9.5, 2.5);

        // Panggil method untuk penjumlahan, pengurangan, perkalian, dan pembagian
        System.out.println("Penjumlahan: " + operasi.penjumlahan());
        System.out.println("Pengurangan: " + operasi.pengurangan());
        System.out.println("Perkalian: " + operasi.perkalian());
        System.out.println("Pembagian: " + operasi.pembagian());
    }
}

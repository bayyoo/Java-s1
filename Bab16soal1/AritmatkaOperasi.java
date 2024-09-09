// Kelas abstrak untuk operasi aritmatika
abstract class Aritmatika {
    // Metode protected untuk penjumlahan
    protected abstract double penjumlahan(double a, double b);

    // Metode protected untuk pengurangan
    protected abstract double pengurangan(double a, double b);

    // Metode protected untuk perkalian
    protected abstract double perkalian(double a, double b);

    // Metode protected untuk pembagian
    protected abstract double pembagian(double a, double b);
}

// Kelas konkret yang mengimplementasikan metode abstrak
class AritmatikaOperasi extends Aritmatika {
    // Implementasi metode penjumlahan
    @Override
    protected double penjumlahan(double a, double b) {
        return a + b;
    }

    // Implementasi metode pengurangan
    @Override
    protected double pengurangan(double a, double b) {
        return a - b;
    }

    // Implementasi metode perkalian
    @Override
    protected double perkalian(double a, double b) {
        return a * b;
    }

    // Implementasi metode pembagian, dengan pengecekan untuk pembagian dengan nol
    @Override
    protected double pembagian(double a, double b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Tidak bisa membagi dengan nol!");
            return 0;
        }
    }
}

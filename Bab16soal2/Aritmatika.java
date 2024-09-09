// Aritmatika.java
class Aritmatika {
    // Variabel A dan B protected, hanya bisa diakses oleh subclass
    protected double A;
    protected double B;

    // Constructor untuk menginisialisasi A dan B
    public Aritmatika(double A, double B) {
        this.A = A;
        this.B = B;
    }

    // Method protected untuk penjumlahan (akan di-override)
    protected double penjumlahan() {
        return A + B;
    }

    // Method protected untuk pengurangan (akan di-override)
    protected double pengurangan() {
        return A - B;
    }

    // Method protected untuk perkalian (akan di-override)
    protected double perkalian() {
        return A * B;
    }

    // Method protected untuk pembagian (akan di-override)
    protected double pembagian() {
        return A / B;
    }
}

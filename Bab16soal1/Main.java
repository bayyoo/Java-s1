// Kelas utama untuk menjalankan program
public class Main {
    public static void main(String[] args) {
        // Membuat objek dari kelas AritmatikaOperasi
        AritmatikaOperasi operasi = new AritmatikaOperasi();

        // Mendefinisikan dua bilangan A = 9.5 dan B = 2.5
        double a = 9.5;
        double b = 2.5;

        // Menampilkan hasil penjumlahan
        System.out.println("Penjumlahan: " + operasi.penjumlahan(a, b));

        // Menampilkan hasil pengurangan
        System.out.println("Pengurangan: " + operasi.pengurangan(a, b));

        // Menampilkan hasil perkalian
        System.out.println("Perkalian: " + operasi.perkalian(a, b));

        // Menampilkan hasil pembagian
        System.out.println("Pembagian: " + operasi.pembagian(a, b));
    }
}

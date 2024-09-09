import java.util.Scanner;

public class ArrayLengthWithInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Meminta input jumlah kota
        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = scanner.nextInt();
        scanner.nextLine();  // Konsumsi karakter enter

        // Membuat array untuk menyimpan nama-nama kota
        String[] kota = new String[jumlahKota];

        // Input nama-nama kota
        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = scanner.nextLine();
        }

        // Menampilkan kota-kota yang dimasukkan
        System.out.println("Kota-kota yang dimasukkan:");
        for (String city : kota) {
            System.out.println(city);
        }
        
        scanner.close();
    }
}

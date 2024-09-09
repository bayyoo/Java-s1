public class Contoh {
    public static void main(String[] args) {
        try {
            // Kode yang tidak menimbulkan exception
            Float data = 500 / 15f; // pembagi adalah float
            System.out.println("Hasil pembagian: " + data);
        } catch (NullPointerException e) {
            // Penanganan exception jika terjadi
            System.out.println("Exception ditangani: " + e.getMessage());
        } finally {
            // Kode yang selalu dieksekusi, baik terjadi exception atau tidak
            System.out.println("Blok finally akan selalu di eksekusi");
        }

        // Output yang ditampilkan setelah blok try-catch-finally
        System.out.println("Program selesai.");
    }
}
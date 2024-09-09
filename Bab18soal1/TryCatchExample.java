public class TryCatchExample {
    public static void main(String[] args) {
        try {
            // Kode yang mungkin menimbulkan exception
            int result = 10 / 0; // Ini akan menimbulkan ArithmeticException
        } catch (ArithmeticException e) {
            // Menangani exception
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        
        // Kode ini tetap dieksekusi meskipun terjadi exception
        System.out.println("Program selesai.");
    }
}
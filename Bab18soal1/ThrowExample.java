public class ThrowExample {
    // Metode yang memvalidasi usia
    public static void validateAge(int age) {
        if (age < 18) {
            // Melempar exception jika usia kurang dari 18
            throw new ArithmeticException("Usia tidak mencukupi untuk voting.");
        } else {
            System.out.println("Usia cukup untuk voting.");
        }
    }

    public static void main(String[] args) {
        try {
            // Memanggil metode validasi usia
            validateAge(16); // Ini akan melempar exception
        } catch (ArithmeticException e) {
            // Menangani exception
            System.out.println("Exception ditangkap: " + e.getMessage());
        }
        
        System.out.println("Program selesai.");
    }
}

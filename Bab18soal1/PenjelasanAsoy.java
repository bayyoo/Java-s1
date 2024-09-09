public class PenjelasanAsoy {
    
    public static void main(String[] args) {
        // Contoh penggunaan try-catch
        System.out.println("Contoh penggunaan try-catch:");
        try {
            // Kode yang mungkin menyebabkan exception
            int result = 10 / 0; // Ini akan menyebabkan ArithmeticException
        } catch (ArithmeticException e) {
            // Menangani exception
            System.out.println("Exception ditangani di blok catch:");
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        
        // Contoh penggunaan throw
        System.out.println("\nContoh penggunaan throw:");
        try {
            validateAge(15); // Menggunakan nilai yang tidak valid untuk melempar exception
        } catch (ArithmeticException e) {
            // Menangani exception yang dilempar
            System.out.println("Exception ditangani di blok catch:");
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }

        // Penjelasan perbedaan antara try-catch dan throw
        System.out.println("\nPenjelasan Perbedaan:");
        System.out.println("1. `try-catch`: Digunakan untuk menangani exception yang mungkin terjadi pada bagian kode tertentu.");
        System.out.println("   - Jika exception terjadi, blok `catch` akan menangani dan memberikan penanganan yang sesuai.");
        System.out.println("   - Ini membantu mencegah program berhenti secara tiba-tiba dan memberikan pesan kesalahan yang lebih informatif.");
        
        System.out.println("2. `throw`: Digunakan untuk melemparkan exception secara eksplisit dari dalam metode atau bagian kode.");
        System.out.println("   - Dengan `throw`, kita dapat memaksa program untuk menghentikan eksekusi dan mengalihkan kontrol ke blok `catch` yang menangani exception tersebut.");
        System.out.println("   - Ini memungkinkan pengembang untuk menangani kondisi yang tidak terduga atau tidak valid dalam kode dan memberikan penanganan khusus.");
    }
    
    // Metode yang melempar exception
    public static void validateAge(int age) {
        if (age < 18) {
            // Lemparkan exception jika usia kurang dari 18
            throw new ArithmeticException("Usia tidak memenuhi syarat. Anda harus berusia minimal 18 tahun.");
        } else {
            System.out.println("Usia valid untuk registrasi.");
        }
    }
}

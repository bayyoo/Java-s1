public class CountryCapitalArray {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi array 2 dimensi dengan nama negara dan ibu kota
        String[][] negaraDanIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Menampilkan negara dan ibu kotanya
        for (int i = 0; i < negaraDanIbukota.length; i++) {
            System.out.println("Ibukota " + negaraDanIbukota[i][0] + " adalah " + negaraDanIbukota[i][1]);
        }
    }
}

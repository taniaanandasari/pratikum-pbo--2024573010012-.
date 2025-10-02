package modul_2;

public class VariabelDemo {
            public static void main(String[] args) {
                // Mendeklarasikan dan menginisialisasi variabel
                int umur = 20;
                double tinggi = 175.5;
                char grade = 'A';
                boolean lulus = true;
                String nama = "John Doe";

                // Menampilkan nilai variabel
                System.out.println("Nama: " + nama);
                System.out.println("Umur: " + umur + " tahun");
                System.out.println("Tinggi: " + tinggi + " cm");
                System.out.println("Grade: " + grade);
                System.out.println("Lulus: " + lulus);

                // Operasi Aritmatika
                int a = 10;
                int b = 5;

                System.out.println("\n=== Operasi Aritmatika ===");
                System.out.println("a + b = " + (a + b));
                System.out.println("a - b = " + (a - b));
                System.out.println("a * b = " + (a * b));
                System.out.println("a / b = " + (a / b));
                System.out.println("a % b = " + (a % b));

                // Type Casting Data
                System.out.println("\n=== Casting Tipe Data ===");
                double nilaiDouble = 9.8;
                int nilaiInt = (int) nilaiDouble; // Explicit Casting

                System.out.println("Nilai double: " + nilaiDouble);
                System.out.println("Setelah casting ke int: " + nilaiInt);

                // Automatic Promotion
                short shortVar = 100;
                byte byteVar = 50;
                // Hasil penjumlahan short dan byte secara otomatis dipromosikan ke int
                int hasil = byteVar + shortVar;

                System.out.println("\nbyte + short = hasil (tipe int): " + hasil);
            }
}

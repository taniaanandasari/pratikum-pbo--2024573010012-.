package modul_3;

public class MethodDasar {

    // Langkah 1: Method tanpa parameter (Void Method)
    public static void tampilkanHeader() {
        System.out.println("===============================");
        System.out.println(" PROGRAM KALKULATOR SEDERHANA ");
        System.out.println("===============================");
    }

    // Langkah 2: Method dengan parameter (Void Method)
    public static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.printf("%.2f %s %.2f = %.2f\n", a, operasi, b, hasil);
    }

    // Langkah 3: Method dengan return value
    public static double tambah(double a, double b) {
        return a + b;
    }

    public static double kurang(double a, double b) {
        return a - b;
    }

    public static double kali(double a, double b) {
        return a * b;
    }

    public static double bagi(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Pembagian dengan nol tidak diizinkan.");
            return 0;
        }
        return a / b;
    }

    // Langkah 4: Method untuk validasi angka
    public static boolean validasiAngka(double angka) {
        // Memastikan angka bukan NaN (Not a Number) dan bukan Infinite
        return !(Double.isNaN(angka) || Double.isInfinite(angka));
    }

    public static void main(String[] args) {
        // Panggil method tanpa return value
        tampilkanHeader();

        double x = 15.50;
        double y = 4.20;

        if (validasiAngka(x) && validasiAngka(y)) {
            double hasilTambahan = tambah(x, y);
            double hasilKurang = kurang(x, y);
            double hasilKali = kali(x, y);
            double hasilBagi = bagi(x, y);

            tampilkanHasil("+", x, y, hasilTambahan);
            tampilkanHasil("-", x, y, hasilKurang);
            tampilkanHasil("*", x, y, hasilKali);
            tampilkanHasil("/", x, y, hasilBagi);
        }
    }
}
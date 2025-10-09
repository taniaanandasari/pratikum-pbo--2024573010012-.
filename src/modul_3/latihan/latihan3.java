package modul_3.latihan;

public class latihan3 {

    // Method header program
    public static void tampilkanHeader() {
        System.out.println("==============================");
        System.out.println("     PROGRAM KALKULATOR LENGKAP    ");
        System.out.println("==============================");
    }

    // Method void untuk menampilkan hasil operasi
    public static void tampilkanHasil(String operasi, double a, double b, double hasil) {
        System.out.printf("%.2f %s %.2f = %.2f\n", a, operasi, b, hasil);
    }

    // Method untuk operasi dasar
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
        if (validasiPembagian(b)) {
            return a / b;
        } else {
            System.out.println("Error: Pembagian dengan nol tidak diperbolehkan!");
            return 0;
        }
    }

    // 🔹 Method baru untuk operasi pangkat
    public static double pangkat(double a, double b) {
        return Math.pow(a, b);
    }

    // 🔹 Method baru untuk akar kuadrat
    public static double akar(double a) {
        if (a < 0) {
            System.out.println("Error: Akar dari bilangan negatif tidak valid!");
            return 0;
        }
        return Math.sqrt(a);
    }

    // 🔹 Method validasi pembagian nol
    public static boolean validasiPembagian(double b) {
        return b != 0;
    }

    public static void main(String[] args) {
        tampilkanHeader();

        double x = 16;
        double y = 4;

        // Operasi dasar
        double hasilTambah = tambah(x, y);
        double hasilKurang = kurang(x, y);
        double hasilKali = kali(x, y);
        double hasilBagi = bagi(x, y);
        double hasilPangkat = pangkat(x, y);
        double hasilAkar = akar(x);

        // Tampilkan hasil
        tampilkanHasil("+", x, y, hasilTambah);
        tampilkanHasil("-", x, y, hasilKurang);
        tampilkanHasil("*", x, y, hasilKali);
        tampilkanHasil("/", x, y, hasilBagi);
        System.out.printf("%.2f ^ %.2f = %.2f\n", x, y, hasilPangkat);
        System.out.printf("√%.2f = %.2f\n", x, hasilAkar);
    }
}
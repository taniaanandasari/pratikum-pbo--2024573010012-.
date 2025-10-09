package modul_3.latihan;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] nilai = new double[10];
        double total = 0;
        double tertinggi, terendah;

        System.out.println("Masukkan nilai ujian 10 siswa:");

        for (int i = 0; i < nilai.length; i++) {
            System.out.print("Nilai siswa ke-" + (i+1) + ": ");
            nilai[i] = input.nextDouble();
            total += nilai[i];
        }

        double ratarata = total / nilai.length;
        tertinggi = nilai[0];
        terendah = nilai[0];

        for (int i = 1; i < nilai.length; i++) {
            if (nilai[i] > tertinggi) {
                tertinggi = nilai[i];
            }
            if (nilai[i] < terendah) {
                terendah = nilai[i];
            }
        }

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Rata-rata nilai: " + ratarata);
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
    }
}

package modul_3.latihan;
import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi data
        String[] namaSiswa = {"Alice", "Bob", "Charlie"};
        String[] mataPelajaran = {"Matematika", "Bahasa Indonesia", "IPA", "IPS"};
        int[][] nilaiSiswa = new int[3][4];

        // Input nilai siswa
        System.out.println("=== INPUT NILAI SISWA ===");
        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.println("Masukkan nilai untuk " + namaSiswa[i] + ":");
            for (int j = 0; j < mataPelajaran.length; j++) {
                System.out.print(mataPelajaran[j] + ": ");
                nilaiSiswa[i][j] = input.nextInt();
            }
            System.out.println();
        }

        // Menampilkan tabel nilai siswa
        System.out.println("\n=== TABEL NILAI SISWA ===");
        System.out.printf("%-12s", "Nama");
        for (String mapel : mataPelajaran) {
            System.out.printf("%-15s", mapel);
        }
        System.out.println("Rata-rata");

        for (int i = 0; i < namaSiswa.length; i++) {
            System.out.printf("%-12s", namaSiswa[i]);
            int total = 0;
            for (int j = 0; j < mataPelajaran.length; j++) {
                System.out.printf("%-15d", nilaiSiswa[i][j]);
                total += nilaiSiswa[i][j];
            }
            double rataRata = total / (double) mataPelajaran.length;
            System.out.printf("%.2f\n", rataRata);
        }

        // Menampilkan mata pelajaran dengan nilai tertinggi untuk setiap siswa
        System.out.println("\n=== MATA PELAJARAN NILAI TERTINGGI SETIAP SISWA ===");
        for (int i = 0; i < namaSiswa.length; i++) {
            int nilaiTertinggi = nilaiSiswa[i][0];
            String mapelTertinggi = mataPelajaran[0];

            for (int j = 1; j < mataPelajaran.length; j++) {
                if (nilaiSiswa[i][j] > nilaiTertinggi) {
                    nilaiTertinggi = nilaiSiswa[i][j];
                    mapelTertinggi = mataPelajaran[j];
                }
            }
            System.out.println(namaSiswa[i] + " mendapat nilai tertinggi pada " + mapelTertinggi + " (" + nilaiTertinggi + ")");
        }

        // Menghitung rata-rata nilai untuk setiap mata pelajaran
        System.out.println("\n=== RATA-RATA NILAI SETIAP MATA PELAJARAN ===");
        for (int j = 0; j < mataPelajaran.length; j++) {
            int total = 0;
            for (int i = 0; i < namaSiswa.length; i++) {
                total += nilaiSiswa[i][j];
            }
            double rataMapel = total / (double) namaSiswa.length;
            System.out.println(mataPelajaran[j] + ": " + String.format("%.2f", rataMapel));
        }

        input.close();
    }
}
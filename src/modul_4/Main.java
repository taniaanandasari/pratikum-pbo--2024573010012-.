package modul_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("--------------------------------------------------");
        System.out.println("  SISTEM KARTU RENCANA STUDI (KRS) UJI COBA");
        System.out.println("--------------------------------------------------");

        // Input data Mahasiswa
        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("NIM: ");
        String nim = input.nextLine();

        System.out.print("Jurusan: ");
        String jurusan = input.nextLine();

        // Membuat object Mahasiswa
        Mahasiswa mhs = new Mahasiswa(nama, nim, jurusan, 0.0);

        // Membuat object KRS (maksimal 10 mata kuliah)
        RencanaKartuStudi krs = new RencanaKartuStudi(mhs, 10);

        // Menu KRS
        boolean running = true;

        while (running) {
            System.out.println("-----------------------------------------");
            System.out.println("        M E N U   K R S                 |");
            System.out.println("----------------------------------------|");
            System.out.println("1. Tambah Mata Kuliah                   |");
            System.out.println("2. Input Nilai Mata Kuliah              |");
            System.out.println("3. Tampilkan KRS                        |");
            System.out.println("4. Keluar                               |");
            System.out.println("----------------------------------------|");
            System.out.println("Pilih menu: ");

            int pilihan = input.nextInt();
            input.nextLine(); // consume newline

            switch (pilihan) {
                case 1:
                    // Tambah Mata Kuliah
                    System.out.println("\nTAMBAH MATA KULIAH");
                    System.out.println("\n-----------------------");
                    System.out.print("Kode Mata Kuliah: ");
                    String kode = input.nextLine();

                    System.out.print("Nama Mata Kuliah: ");
                    String namaMK = input.nextLine();

                    System.out.print("Jumlah SKS: ");
                    int sks = input.nextInt();
                    input.nextLine();

                    Matakuliah mk = new Matakuliah(kode, namaMK, sks);
                    krs.tambahMatakuliah(mk);
                    break;

                case 2:
                    // Input Nilai
                    System.out.println("\nINPUT NILAI");
                    System.out.println("\n---------------");
                    System.out.print("Kode Mata Kuliah: ");
                    String kodeCari = input.nextLine();

                    Matakuliah mkCari = krs.cariMatakuliah(kodeCari);
                    if (mkCari != null) {
                        System.out.print("Input Nilai (0-100): ");
                        double nilai = input.nextDouble();
                        mkCari.setNilai(nilai);
                        System.out.println("Nilai berhasil diinput!");
                    } else {
                        System.out.println("Mata kuliah tidak ditemukan!");
                    }
                    break;

                case 3:
                    // Tampilan KRS
                    krs.tampilkanKRS();
                    break;

                case 4:
                    // Keluar
                    System.out.println("Terima kasih!");
                    running = false;
                    break;

                default:
                    System.out.println("Pilihan tidak Valid!");
            }
        }
    }
}

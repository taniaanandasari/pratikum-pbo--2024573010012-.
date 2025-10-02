package modul_2;

import java.util.Scanner;

public class WhileLoopDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Contoh While Loop
        System.out.println("=== Contoh While Loop ===");
        int angkaAwal = 1;

        while (angkaAwal <= 10) {
            System.out.print(angkaAwal + " ");

            // Penggunaan break dalam While
            if (angkaAwal == 5) {
                System.out.println("\nKeluar While di angka 5 (Paksa KELUAR)");
                break;
            }

            angkaAwal++;
        }
        System.out.println("\nProgram lanjut setelah while.");

        // Contoh Do-While Loop
        System.out.println("\n=== Contoh Do-While Loop - Menu ===");
        int pilihan;

        do {
            System.out.println("\n--- MENU PILIHAN ---");
            System.out.println("1. Tampilkan Angka Ganjil 1-7");
            System.out.println("2. Hitung Faktorial");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu (1-3): ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Angka Ganjil: ");
                    int ganjil = 1;
                    while (ganjil <= 7) {
                        System.out.print(ganjil + " ");
                        ganjil += 2;
                    }
                    System.out.println();
                    break;

                case 2:
                    System.out.print("Masukkan nilai N (Faktorial): ");
                    int N = input.nextInt();
                    long faktorial = 1;

                    for (int i = 1; i <= N; i++) {
                        faktorial *= i;
                    }
                    System.out.println("Faktorial dari " + N + " = " + faktorial);
                    break;

                case 3:
                    System.out.println("Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 3);

        input.close();
    }
}

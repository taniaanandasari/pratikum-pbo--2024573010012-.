package modul_3.latihan;

import java.util.Scanner;

public class latihan4 {

    // Method untuk input array dari pengguna
    public static int[] inputArray(int ukuran) {
        Scanner input = new Scanner(System.in);
        int[] array = new int[ukuran];

        System.out.println("Masukkan " + ukuran + " angka:");
        for (int i = 0; i < ukuran; i++) {
            System.out.print("Angka ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        return array;
    }

    // Method untuk menampilkan array
    public static void tampilkanArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Method untuk mengurutkan array (Bubble Sort)
    public static int[] urutkanArray(int[] array) {
        int[] dataUrut = array.clone();
        for (int i = 0; i < dataUrut.length - 1; i++) {
            for (int j = 0; j < dataUrut.length - 1 - i; j++) {
                if (dataUrut[j] > dataUrut[j + 1]) {
                    int temp = dataUrut[j];
                    dataUrut[j] = dataUrut[j + 1];
                    dataUrut[j + 1] = temp;
                }
            }
        }
        return dataUrut;
    }

    // Method untuk mencari nilai tertentu dalam array
    public static void cariNilai(int[] array, int nilaiDicari) {
        boolean ditemukan = false;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == nilaiDicari) {
                System.out.println("Nilai " + nilaiDicari + " ditemukan pada indeks ke-" + i);
                ditemukan = true;
                break;
            }
        }
        if (!ditemukan) {
            System.out.println("Nilai " + nilaiDicari + " tidak ditemukan dalam array.");
        }
    }

    // Method untuk menghitung median dari array yang sudah diurutkan
    public static double hitungMedian(int[] array) {
        int n = array.length;
        int[] dataUrut = urutkanArray(array);

        if (n % 2 == 1) {
            // Jika jumlah data ganjil, median adalah nilai tengah
            return dataUrut[n / 2];
        } else {
            // Jika jumlah data genap, median adalah rata-rata dari dua nilai tengah
            return (dataUrut[(n / 2) - 1] + dataUrut[n / 2]) / 2.0;
        }
    }

    // Method utama
    public static void main(String[] args) {
        System.out.println("=== PROGRAM LATIHAN 4: PENCARIAN & MEDIAN ARRAY ===");

        // Input jumlah data
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah data: ");
        int ukuran = input.nextInt();

        // Input nilai ke dalam array
        int[] data = inputArray(ukuran);

        System.out.println("\nData yang dimasukkan:");
        tampilkanArray(data);

        // Mengurutkan data dan menampilkan hasil
        int[] dataUrut = urutkanArray(data);
        System.out.println("\nData setelah diurutkan:");
        tampilkanArray(dataUrut);

        // Mencari nilai tertentu
        System.out.print("\nMasukkan nilai yang ingin dicari: ");
        int cari = input.nextInt();
        cariNilai(dataUrut, cari);

        // Menghitung dan menampilkan median
        double median = hitungMedian(dataUrut);
        System.out.println("\nMedian dari array: " + median);
    }
}

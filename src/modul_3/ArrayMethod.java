package modul_3;
import java.util.Scanner;

public class ArrayMethod {

    // Method untuk input data array
    static int[] inputArray(int n) {
        Scanner input = new Scanner(System.in);
        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan data ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }
        return data;
    }

    // Method untuk menampilkan isi array
    static void tampilkanArray(int[] data) {
        System.out.print("Isi array: ");
        for (int nilai : data) {
            System.out.print(nilai + " ");
        }
        System.out.println();
    }

    // Method mencari nilai maksimum
    static int cariMaksimum(int[] data) {
        int max = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] > max) max = data[i];
        }
        return max;
    }

    // Method mencari nilai minimum
    static int cariMinimum(int[] data) {
        int min = data[0];
        for (int i = 1; i < data.length; i++) {
            if (data[i] < min) min = data[i];
        }
        return min;
    }

    // Method menghitung rata-rata
    static double hitungRataRata(int[] data) {
        int total = 0;
        for (int nilai : data) total += nilai;
        return (double) total / data.length;
    }

    // Method untuk mengurutkan array (Bubble Sort)
    static int[] urutkanArray(int[] data) {
        int[] arr = data.clone();
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] data = inputArray(n);
        tampilkanArray(data);

        System.out.println("Nilai maksimum: " + cariMaksimum(data));
        System.out.println("Nilai minimum: " + cariMinimum(data));
        System.out.println("Rata-rata: " + hitungRataRata(data));

        int[] hasilUrut = urutkanArray(data);
        System.out.print("Array setelah diurutkan: ");
        tampilkanArray(hasilUrut);
    }
}

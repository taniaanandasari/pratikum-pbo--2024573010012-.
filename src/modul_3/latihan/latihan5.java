package modul_3.latihan;

import java.util.Scanner;

public class latihan5 {

    // Method untuk menghitung jumlah konsonan
    public static int hitungKonsonan(String kalimat) {
        kalimat = kalimat.toLowerCase();
        int jumlah = 0;
        for (int i = 0; i < kalimat.length(); i++) {
            char c = kalimat.charAt(i);
            if (c >= 'a' && c <= 'z' && "aeiou".indexOf(c) == -1) {
                jumlah++;
            }
        }
        return jumlah;
    }

    // Method untuk mengubah string menjadi Pascal Case
    public static String ubahKePascalCase(String kalimat) {
        String[] kata = kalimat.split(" ");
        StringBuilder hasil = new StringBuilder();

        for (String k : kata) {
            if (k.length() > 0) {
                hasil.append(Character.toUpperCase(k.charAt(0)))
                        .append(k.substring(1).toLowerCase())
                        .append(" ");
            }
        }
        return hasil.toString().trim();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        System.out.println("\n=== HASIL ANALISIS STRING ===");
        System.out.println("Jumlah Konsonan: " + hitungKonsonan(kalimat));
        System.out.println("Kalimat dalam Pascal Case: " + ubahKePascalCase(kalimat));
    }
}

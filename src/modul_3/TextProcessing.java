package modul_3;
import java.util.Arrays;
import java.util.Scanner;

public class TextProcessing {

    static void prosesDataMahasiswa(String data) {
        String[] namaMahasiswa = data.split(",");
        System.out.println("Jumlah mahasiswa: " + namaMahasiswa.length);

        String terpanjang = namaMahasiswa[0];
        String terpendek = namaMahasiswa[0];

        for (String nama : namaMahasiswa) {
            if (nama.length() > terpanjang.length()) terpanjang = nama;
            if (nama.length() < terpendek.length()) terpendek = nama;
        }

        System.out.println("Nama terpanjang: " + terpanjang);
        System.out.println("Nama terpendek: " + terpendek);

        Arrays.sort(namaMahasiswa, String::compareToIgnoreCase);
        System.out.println("\nData nama (urut alfabet):");
        for (String n : namaMahasiswa) System.out.println(n.trim());
    }

    static String formatTitleCase(String nama) {
        String[] kata = nama.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String k : kata) {
            sb.append(Character.toUpperCase(k.charAt(0)))
                    .append(k.substring(1).toLowerCase())
                    .append(" ");
        }
        return sb.toString().trim();
    }

    static String formatKataInitial(String nama) {
        String[] kata = nama.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String k : kata) {
            sb.append(Character.toUpperCase(k.charAt(0)));
        }
        return sb.toString();
    }

    static String buatUsername(String nama) {
        return nama.toLowerCase().replaceAll("\\s+", ".");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan daftar nama (pisahkan dengan koma): ");
        String data = input.nextLine();

        prosesDataMahasiswa(data);

        System.out.print("\nMasukkan satu nama untuk format: ");
        String nama = input.nextLine();

        System.out.println("Title Case: " + formatTitleCase(nama));
        System.out.println("Inisial: " + formatKataInitial(nama));
        System.out.println("Username: " + buatUsername(nama));
    }
}

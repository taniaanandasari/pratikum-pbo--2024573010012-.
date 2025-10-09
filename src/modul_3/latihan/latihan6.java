package modul_3.latihan;
import java.util.Scanner;

public class latihan6 {

    // Method untuk memvalidasi nama (tidak boleh ada angka atau karakter khusus)
    public static boolean validasiNama(String nama) {
        return nama.matches("[a-zA-Z\\s]+");
    }

    // Method untuk menghasilkan email berdasarkan nama
    public static String buatEmail(String nama) {
        String email = nama.toLowerCase().replaceAll("\\s+", ".") + "@student.ac.id";
        return email;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nama lengkap: ");
        String nama = input.nextLine();

        if (validasiNama(nama)) {
            String email = buatEmail(nama);
            System.out.println("Nama valid ✅");
            System.out.println("Email yang dihasilkan: " + email);
        } else {
            System.out.println("Nama tidak valid ❌ (tidak boleh mengandung angka atau simbol)");
        }

        input.close();
    }
}

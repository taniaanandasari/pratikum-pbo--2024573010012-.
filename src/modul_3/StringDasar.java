package modul_3;

public class StringDasar {

    static int hitungVokal(String teks) {
        teks = teks.toLowerCase();
        int count = 0;
        for (int i = 0; i < teks.length(); i++) {
            char c = teks.charAt(i);
            if ("aeiou".indexOf(c) != -1) count++;
        }
        return count;
    }

    static String reverseString(String teks) {
        StringBuilder sb = new StringBuilder(teks);
        return sb.reverse().toString();
    }

    static boolean isPalindrome(String teks) {
        teks = teks.replaceAll("[^a-zA-Z]", "").toLowerCase();
        return teks.equals(reverseString(teks));
    }

    public static void main(String[] args) {
        String kalimat = "Kasur ini rusak";

        System.out.println("Teks: " + kalimat);
        System.out.println("Jumlah huruf vokal: " + hitungVokal(kalimat));
        System.out.println("Kebalikan: " + reverseString(kalimat));
        System.out.println("Apakah palindrome? " + isPalindrome(kalimat));
    }
}

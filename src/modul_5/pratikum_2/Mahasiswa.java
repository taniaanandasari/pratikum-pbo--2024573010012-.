package modul_5.pratikum_2;

public class Mahasiswa {
    // ATRIBUT
    private String nim;
    private String nama;
    private String jurusan;
    private int ipk;
    private int semester;
    private boolean aktif;

    // KONSTRUKTOR
    public Mahasiswa(String nim, String nama, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
        this.ipk = 0; // nilai default
        this.semester = 1; // nilai default
        this.aktif = true; // nilai default
    }

    // GETTER METHODS
    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getJurusan() {
        return jurusan;
    }

    public int getIpk() {
        return ipk;
    }

    public int getSemester() {
        return semester;
    }

    // method boolean untuk mengecek apakah 'is' aktif
    public boolean isAktif() {
        return aktif;
    }

    // SETTER METHODS DENGAN VALIDASI

    public void setNama(String nama) {
        // Validasi: nama tidak boleh kosong dan hanya huruf/spasi
        if (nama == null || nama.trim().isEmpty()) {
            System.out.println("Error: Nama tidak boleh kosong!");
            return;
        }
        if (!nama.matches("^[a-zA-Z\\s]*$")) {
            System.out.println("Error: Nama hanya boleh berisi huruf dan spasi!");
            return;
        }
        this.nama = nama;
        System.out.println("Nama berhasil diubah menjadi: " + nama);
    }

    public void setJurusan(String jurusan) {
        // Validasi: jurusan tidak boleh kosong
        if (jurusan == null || jurusan.trim().isEmpty()) {
            System.out.println("Error: Jurusan tidak boleh kosong!");
            return;
        }
        this.jurusan = jurusan;
        System.out.println("Jurusan berhasil diubah menjadi: " + jurusan);
    }

    public void setIpk(double ipk) {
        // Validasi: IPK harus antara 0.00 - 4.00
        if (ipk < 0.0 || ipk > 4.0) {
            System.out.println("Error: IPK tidak valid (harus antara 0.00 - 4.00)");
            return;
        }
        // Konversi double ke int untuk disimpan (mungkin ada kesalahan tipe pada gambar aslinya)
        // Jika ipk dimaksudkan double: this.ipk = ipk;
        // Asumsi ipk diubah dari double ke int * 100 untuk presisi:
        this.ipk = (int) (ipk * 100);
        System.out.println("IPK berhasil diubah menjadi: " + String.format("%.2f", ipk));
    }

    public void setSemester(int semester) {
        // Validasi: Semester harus antara 1-14
        if (semester < 1 || semester > 14) {
            System.out.println("Error: Semester tidak valid (harus antara 1-14)");
            return;
        }
        this.semester = semester;
        System.out.println("Semester berhasil diubah menjadi: " + semester);
    }

    public void setAktif(boolean aktif) {
        this.aktif = aktif;
        String status = aktif ? "AKTIF" : "TIDAK AKTIF";
        System.out.println("Status keaktifan: " + status);
    }

    // Method untuk wisuda
    public void cekKelayakanWisuda() {
        if (this.semester > 8 && this.ipk >= 275) { // IPK minimal 2.75 (275 jika *100)
            System.out.println("[SELAMAT] " + this.nama + " memenuhi syarat untuk wisuda!");
        } else {
            System.out.println("[MAAF] " + this.nama + " belum memenuhi syarat wisuda.");
            System.out.println("Syarat: Semester > 8 dan IPK >= 2.75");
        }
    }

    // Method untuk mengubah status kelulusan
    public boolean getLulus() {
        if (this.semester < 9) {
            return false;
        }
        if (this.ipk >= 200 && this.ipk < 275) {
            return true; // Lulus "Cukup" (asumsi IPK 2.00-2.74)
        } else if (this.ipk >= 275 && this.ipk < 350) {
            return true; // Lulus "Baik" (asumsi IPK 2.75-3.49)
        } else if (this.ipk >= 350) {
            return true; // Lulus "Cumlaude" (asumsi IPK 3.50 ke atas)
        }
        return false;
    }

    // Method untuk menampilkan info lengkap
    public void printInfo() {
        System.out.println("\nINFORMASI MAHASISWA");
        System.out.println("NIM       : " + nim);
        System.out.println("Nama      : " + nama);
        System.out.println("Jurusan   : " + jurusan);
        System.out.println("IPK       : " + String.format("%.2f", (double) ipk / 100));
        System.out.println("Semester  : " + semester);
        System.out.println("Status    : " + (aktif ? "AKTIF" : "TIDAK AKTIF"));
        System.out.println("Kelayakan : " + (getLulus() ? "LULUS" : "BELUM LULUS/PROSES"));
    }
}


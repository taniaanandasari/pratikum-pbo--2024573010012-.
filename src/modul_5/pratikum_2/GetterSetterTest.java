package modul_5.pratikum_2;

public class GetterSetterTest {
    public static void main(String[] args) {
        System.out.println("--- TEST GETTER DAN SETTER ---");

        // Membuat object Mahasiswa
        Mahasiswa mhs = new Mahasiswa("20230001", "Budi Santoso", "Teknik Informatika");

        System.out.println("\n--- Data Awal ---");
        mhs.printInfo();

        // TEST GETTER
        System.out.println("\n--- TEST GETTER ---");
        System.out.println("Mengambil data menggunakan getter:");
        System.out.println("NPM:    " + mhs.getNim());
        System.out.println("Nama:   " + mhs.getNama());
        System.out.println("Jurusan:" + mhs.getJurusan());
        System.out.println("IPK:    " + mhs.getIpk());
        System.out.println("Semester: " + mhs.getSemester());
        System.out.println("Aktif:  " + mhs.isAktif());

        // TEST SETTER dengan validasi
        System.out.println("\n--- TEST SETTER ---");

        // Test 1: Update IPK valid
        System.out.println("\n1. Update IPK (valid):");
        mhs.setIpk(2.75);

        // Test 2: Update IPK invalid
        System.out.println("\n2. Update IPK (invalid):");
        mhs.setIpk(5.0); // Akan ditolak

        // Test 3: Update nama valid
        System.out.println("\n3. Update Nama (valid):");
        mhs.setNama("Ahmad Budi Santoso");

        // Test 4: Update nama invalid
        System.out.println("\n4. Update Nama (invalid - mengandung angka):");
        mhs.setNama("Budi23"); // Akan ditolak

        // Test 5: Update Semester
        System.out.println("\n5. Update Semester:");
        mhs.setSemester(5);

        // Test 6: Update semester invalid
        System.out.println("\n6. Update Semester (invalid):");
        mhs.setSemester(20); // Akan ditolak

        // Test 7: Update status
        System.out.println("\n7. Update Status:");
        mhs.setAktif(false);

        // Tampilkan data akhir
        System.out.println("\n--- Data Setelah Update ---");
        mhs.printInfo();

        // Demonstrasi computed property
        System.out.println("\n--- COMPUTED PROPERTY ---");
        System.out.println("Predikat: " + mhs.getLulus());

        // Tidak bisa akses langsung (akan error)
        System.out.println("\nCATATAN ENCAPSULATION");
        System.out.println("X TIDAK BISA: mhs.nim = \"123\"");
        System.out.println("X TIDAK BISA: mhs.ipk = 5.0");
        System.out.println("HARUS: mhs.setIpk(3.5)");
        System.out.println("VALIDASI otomatis dilakukan di setter");

    }
}


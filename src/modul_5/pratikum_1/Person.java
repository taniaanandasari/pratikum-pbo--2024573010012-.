package modul_5.pratikum_1;

public class Person {
    // PRIVATE
    private String nama;
    private int umur;

    // DEFAULT (package-private)
    String alamat;

    // PROTECTED
    protected String telepon;

    // PUBLIC
    public String email;

    // Constructor (Hanya 2 parameter, agar sesuai AccessModifierTest)
    public Person(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    // Public method untuk menampilkan info
    public void tampilkanInfo() {
        System.out.println("INFORMASI PERSON");
        System.out.println("Nama: " + this.nama);
        System.out.println("Umur: " + this.umur);
        System.out.println("Alamat: " + this.alamat);
        System.out.println("Telepon: " + this.telepon);
        System.out.println("Email: " + this.email);
    }

    // Private method (Hanya bisa dipanggil dari dalam class)
    private void metodePribadi() { // Disesuaikan namanya
        System.out.println("Ini adalah method private");
    }

    // Method publik untuk mengakses method private
    public void panggilMetodePribadi() { // Disesuaikan namanya dan diubah ke public
        metodePribadi();
    }

    // Protected method (opsional, tapi ada di kode Anda sebelumnya)
    protected void metodeProtected() {
        System.out.println("Ini adalah method protected");
    }
}
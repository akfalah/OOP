package Soal4;

public class Mahasiswa {
    String nim, nama, alamat;
    char jenisKelamin;

    // a. Tambahkan constructor
    // Gunakan constructor untuk
    // mengisi atribut nim, nama, alamat, jenisKelamin
    Mahasiswa(String nim, String nama, String alamat, char jenisKelamin) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jenisKelamin = jenisKelamin;
    }

    public void tampilData() {
        System.out.println("------------ ID Mahasiswa ------------");
        System.out.println("NIM           : " + nim);
        System.out.println("Nama          : " + nama);
        System.out.println("Alamat        : " + alamat);
        System.out.println("Jenis kelamin : " + jenisKelamin);
        System.out.println("--------------------------------------");
    }

    public static void main(String[] args) {
        // b. Buat objek mahasiswa
        // Isi atribut nim, nama, alamat, jenisKelamin
        // lewat constructor
        Mahasiswa mahasiswa = new Mahasiswa("2241720184", "Ahmad Khoirul Falah",
                "Jl. Remujung", 'L');

        mahasiswa.tampilData();
    }
}

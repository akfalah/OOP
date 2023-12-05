public class MataKuliah {
    private String nama_matakuliah;
    private int sks;
    private double[] nilai_mahasiswa;

    MataKuliah(String nama_matakuliah, int sks, double[] nilai_mahasiswa) {
        this.nama_matakuliah = nama_matakuliah;
        this.sks = sks;
        this.nilai_mahasiswa = nilai_mahasiswa;
    }

    public String getNama_matakuliah() {
        return nama_matakuliah;
    }

    public int getSks() {
        return sks;
    }

    public double hitung_bobot() {
        double totalNilai = 0;
        for (double n : nilai_mahasiswa) {
            totalNilai += n; // Hitung jumlah nilai mahasiswa
        }
        totalNilai /= nilai_mahasiswa.length; // Membagi total nilai dengan jumlah banyak nilai

        if (totalNilai >= 80) { // mengembalikan rata-rata nilai sesuai dengan kondisi
            return 4.0;
        } else if (totalNilai >= 75) {
            return 3.5;
        } else if (totalNilai >= 70) {
            return 3.0;
        } else if (totalNilai >= 65) {
            return 2.5;
        } else if (totalNilai >= 60) {
            return 2.0;
        } else if (totalNilai >= 55) {
            return 1.5;
        } else {
            return 1.0;
        }
    }

    public double hitung_bobot(double[] bobot_mahasiswa) {
        double bobot = 0;
        for (int i = 0; i < nilai_mahasiswa.length; i++) {
            bobot += nilai_mahasiswa[i] * bobot_mahasiswa[i]; // Hitung bobot menggunakan perulangan
        }

        bobot /= nilai_mahasiswa.length; // Membagi dengan jumlah banyak nilai

        if (bobot >= 80) { // Mengembalikan bobot sesuai dengan kondisi
            return 4.0;
        } else if (bobot >= 75) {
            return 3.5;
        } else if (bobot >= 70) {
            return 3.0;
        } else if (bobot >= 65) {
            return 2.5;
        } else if (bobot >= 60) {
            return 2.0;
        } else if (bobot >= 55) {
            return 1.5;
        } else {
            return 1.0;
        }
    }
}
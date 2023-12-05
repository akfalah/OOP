public class Mahasiswa {
    private String nama;
    private String nim;
    private double[] nilai;

    Mahasiswa(String nama, String nim, double[] nilai) {
        this.nama = nama;
        this.nim = nim;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public double hitung_ipk() {
        double totalNilai = 0;
        for (double n :
                nilai) {
            totalNilai += n; // Hitung jumlah dari atribut nilai
        }
        return (totalNilai / nilai.length) / 25; // Mengembalikan nilai dengan menghitung rata-rata nilai sebagai IPK
    }

    public double hitung_ipk(double[] bobot_sks) {
        double totalNilai = 0;
        double totalSKS = 0;
        for (int i = 0; i < nilai.length; i++) {
            totalNilai += nilai[i] * bobot_sks[i]; // Hitung jumlah nilai dan dikalikan bobot sks
            totalSKS += bobot_sks[i]; // Hitung jumlah bobot sks
        }
        return (totalNilai / totalSKS) / 25; // Mengembalikan nilai dari total nilai dibagi dengan bobot sks
    }
}

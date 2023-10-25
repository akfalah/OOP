package Tugas;

public class Anggota {
    String noKTP;
    String nama;
    int limitPinjam;
    int jumlahPinjam;

    Anggota(String noKTP, String nama, int limitPinjam) {
        this.noKTP = noKTP;
        this.nama = nama;
        this.limitPinjam = limitPinjam;
    }

    public void setJumlahPinjam(int jumlahPinjam) {
        if (jumlahPinjam > limitPinjam) {
            System.out.println("Maaf, jumlah pinjaman melebihi limit");
        } else {
            this.jumlahPinjam = jumlahPinjam;
        }
    }

    public String getNoKTP() {
        return noKTP;
    }

    public String getNama() {
        return nama;
    }

    public int getLimitPinjam() {
        return limitPinjam;
    }

    public int getJumlahPinjam() {
        return jumlahPinjam;
    }

    public void angsur(int bayar) {
        double min = 0.10 * jumlahPinjam;
        if (bayar >= min) {
            jumlahPinjam -= bayar;
        } else {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }
    }

    public void tampilData() {
        System.out.println("No. KTP: " + noKTP);
        System.out.println("Nama: " + nama);
        System.out.println("Limit pinjaman: " + limitPinjam);
    }
}

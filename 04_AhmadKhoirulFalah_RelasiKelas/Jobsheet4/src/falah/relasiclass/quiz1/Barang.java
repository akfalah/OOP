package falah.relasiclass.quiz1;

public class Barang {
    private String kodeBarang;
    private String nama;
    private int jumlah;

    Barang(String kodeBarang, String nama, int jumlah) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.jumlah = jumlah;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getJumlah() {
        return jumlah;
    }
}

package falah.relasiclass.quiz1;

import java.util.ArrayList;
import java.util.List;

public class Kategori {
    private String namaKategori;
    private List<Barang> daftarBarang;

    Kategori(String namaKategori) {
        this.namaKategori = namaKategori;
        this.daftarBarang = new ArrayList<>();
    }

    public void setNamaKategori(String namaKategori) {
        this.namaKategori = namaKategori;
    }

    public String getNamaKategori() {
        return namaKategori;
    }

    public void setDaftarBarang(List<Barang> daftarBarang) {
        this.daftarBarang = daftarBarang;
    }

    public List<Barang> getDaftarBarang() {
        return daftarBarang;
    }

    public void tambahBarang(Barang barang) {
        daftarBarang.add(barang);
    }

    public void hapusBarang(Barang barang) {
        daftarBarang.remove(barang);
    }
}

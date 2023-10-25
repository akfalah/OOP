package Tugas;

public class TestBarang {
    public static void main(String[] args) {
        Barang brg = new Barang();
        brg.kode = "pakaian";
        brg.namaBarang = "T-shirt";
        brg.hargaDasar = 200000;
        brg.diskon = 0.25F;
        brg.tampilData();
    }
}

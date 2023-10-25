package Tugas;

public class Barang {
    public String kode;
    public String namaBarang;
    public int hargaDasar;
    public float diskon;

    public int hitungHargaJual() {
        float hargaJual = hargaDasar - (diskon * hargaDasar);
        return (int) hargaJual;
    }

    public void tampilData() {
        System.out.println("Kode barang : " + kode);
        System.out.println("Nama barang : " + namaBarang);
        System.out.println("Harga dasar : " + hargaDasar);
        System.out.println("Diskon      : " + diskon);
        System.out.println("Harga jual  : " + hitungHargaJual());
    }
}

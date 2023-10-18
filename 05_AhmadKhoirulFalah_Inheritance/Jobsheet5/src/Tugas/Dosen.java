package Tugas;

public class Dosen extends Pegawai{
    private int jumlahSKS;
    private int TARIF_SKS;

    Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    @Override
    public int getGaji() {
        TARIF_SKS = 100000;
        return jumlahSKS * TARIF_SKS;
    }
}

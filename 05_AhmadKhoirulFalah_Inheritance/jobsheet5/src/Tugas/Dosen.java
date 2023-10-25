package Tugas;

public class Dosen extends Pegawai {
    protected int jumlahSKS;
    protected int TARIF_SKS;

    public Dosen(String nip, String nama, String alamat) {
        super(nip, nama, alamat);
        this.jumlahSKS = 0;
    }

    public void setSKS(int jumlahSKS) {
        this.jumlahSKS = jumlahSKS;
    }

    public int getGaji() {
        TARIF_SKS = 1250000;
        return TARIF_SKS * jumlahSKS;
    }
}

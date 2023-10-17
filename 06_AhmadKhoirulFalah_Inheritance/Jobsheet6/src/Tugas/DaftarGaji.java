package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    DaftarGaji(int size) {
        this.listPegawai = new Pegawai[size];
        this.count = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (count < listPegawai.length) {
            listPegawai[count] = pegawai;
            count++;
        } else {
            System.out.println("List pegawai penuh, tidak dapat menambah pegawai");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < count; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("------------------------------");
            System.out.println("NIP: " + pegawai.getNip());
            System.out.println("Nama: " + pegawai.getNama());
            System.out.println("Alamat: " + pegawai.getAlamat());
            System.out.println("Gaji: " + pegawai.getGaji());
            System.out.println("------------------------------");
        }
    }
}

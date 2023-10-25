package Tugas;

public class DaftarGaji {
    private Pegawai[] listPegawai;
    private int count;

    public DaftarGaji(int size) {
        listPegawai = new Pegawai[size];
        count = 0;
    }

    public void addPegawai(Pegawai pegawai) {
        if (count < listPegawai.length) {
            listPegawai[count] = pegawai;
            count++;
        } else {
            System.out.println("Tidak dapat menambah pegawai");
        }
    }

    public void printSemuaGaji() {
        for (int i = 0; i < count; i++) {
            Pegawai pegawai = listPegawai[i];
            System.out.println("------------------------------");
            System.out.println("NIP: " + pegawai.nip);
            System.out.println("Nama: " + pegawai.nama);
            System.out.println("Alamat: " + pegawai.alamat);
            System.out.println("Gaji: " + pegawai.getGaji());
            System.out.println("------------------------------");
        }
    }
}

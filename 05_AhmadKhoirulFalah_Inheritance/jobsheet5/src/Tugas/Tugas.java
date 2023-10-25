package Tugas;

public class Tugas {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(10);

        Dosen dosen = new Dosen("67890", "Pak Jhon", "Malang");
        dosen.setSKS(7);

        daftarGaji.addPegawai(dosen);

        daftarGaji.printSemuaGaji();
    }
}

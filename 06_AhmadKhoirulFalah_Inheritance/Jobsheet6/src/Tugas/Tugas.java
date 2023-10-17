package Tugas;

public class Tugas {
    public static void main(String[] args) {
        DaftarGaji daftarGaji = new DaftarGaji(10);
        Dosen dosen1 = new Dosen("67890", "Jane Smith", "Malang");

        dosen1.setSKS(7);
        daftarGaji.addPegawai(dosen1);
        daftarGaji.printSemuaGaji();
    }
}

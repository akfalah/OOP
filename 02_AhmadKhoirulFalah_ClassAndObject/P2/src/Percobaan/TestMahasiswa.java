public class TestMahasiswa {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.nim = 101;
        mhs1.nama = "Lestari";
        mhs1.alamat = "Jl. Vinolia No 1A";
        mhs1.kelas = "1A";
        mhs1.tampilBiodata();
        System.out.println();
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.nim = 990;
        mhs2.nama = "Arul";
        mhs2.alamat = "Jl. Bandung";
        mhs2.kelas = "1A";
        mhs2.tampilBiodata();
        System.out.println();
        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.nim = 110;
        mhs3.nama = "Amin";
        mhs3.alamat = "Jl. Cempaka";
        mhs3.kelas = "1A";
        mhs3.tampilBiodata();
    }
}

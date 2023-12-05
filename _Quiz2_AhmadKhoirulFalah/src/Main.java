public class Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa("John Doe", "123456", new double[]{80.0, 85.0, 90.0});
        Mahasiswa mhs2 = new Mahasiswa("Jane Doe", "789012", new double[]{75.0, 70.0, 85.0});

        MataKuliah mk1 = new MataKuliah("Pemrograman Java", 3, new double[]{80.0, 85.0, 90.0});
        MataKuliah mk2 = new MataKuliah("Basis Data", 4, new double[]{75.0, 70.0, 85.0});

        Perwalian perwalian = new Perwalian(2, 2);

        perwalian.addMahasiswa(mhs1);
        perwalian.addMahasiswa(mhs2);

        perwalian.addMataKuliah(mk1);
        perwalian.addMataKuliah(mk2);

        perwalian.printData();
    }
}

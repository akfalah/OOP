public class Perwalian {
    private Mahasiswa[] mahasiswaArray;
    private MataKuliah[] mataKuliahArray;
    private int mahasiswaCount;
    private int mataKuliahCount;

    public Perwalian(int maxMahasiswa, int maxMataKuliah) {
        mahasiswaArray = new Mahasiswa[maxMahasiswa];
        mataKuliahArray = new MataKuliah[maxMataKuliah];
        mahasiswaCount = 0;
        mataKuliahCount = 0;
    }

    public void addMahasiswa(Mahasiswa mahasiswa) {
        if (mahasiswaCount < mahasiswaArray.length) {
            mahasiswaArray[mahasiswaCount++] = mahasiswa;
        } else {
            System.out.println("Error: Kapasitas mahasiswa penuh.");
        }
    }

    public void addMataKuliah(MataKuliah mataKuliah) {
        if (mataKuliahCount < mataKuliahArray.length) {
            mataKuliahArray[mataKuliahCount++] = mataKuliah;
        } else {
            System.out.println("Error: Kapasitas mata kuliah penuh.");
        }
    }

    public void printData() {
        for (int i = 0; i < mahasiswaCount; i++) {
            System.out.println("Nama: " + mahasiswaArray[i].getNama());
            System.out.println("NIM: " + mahasiswaArray[i].getNim());
            System.out.println("IPK: " + mahasiswaArray[i].hitung_ipk());
            System.out.println("Mata kuliah yang diambil:");
            for (int j = 0; j < mataKuliahCount; j++) {
                System.out.println("* " + mataKuliahArray[j].getNama_matakuliah() + " (SKS: " + mataKuliahArray[j].getSks() + ")");
            }
            System.out.println();
        }
    }
}

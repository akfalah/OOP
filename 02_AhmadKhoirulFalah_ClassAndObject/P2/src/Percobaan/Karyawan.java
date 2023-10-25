public class Karyawan {
    public int idKaryawan;
    public String nama;
    public String jenisKelamin;
    public String jabatan;
    public int gaji;

    public void tampilData() {
        System.out.println("ID Karyawan: " + idKaryawan);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis kelamin:" + jenisKelamin);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Gaji: " + gaji);
    }
}

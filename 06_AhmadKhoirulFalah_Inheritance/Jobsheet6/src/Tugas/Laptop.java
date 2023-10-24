package Tugas;

public class Laptop extends Komputer {
    public String jmlBaterai;

    Laptop() {

    }

    Laptop(String merk, int kecProsesor, int sizeMemory, String jnsProsesor, String jmlBaterai) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor);
        this.jmlBaterai = jmlBaterai;
    }

    public void tampilLaptop() {
        super.tampilData();
        System.out.println("Jenis Baterai        = " + jmlBaterai);
    }
}

package Tugas;

public class Motor {
    String merk;
    String jenis;
    int cc;
    int topSpeed;
    int akselerasi;
    boolean mesin = false;

    public void hidupkanMesin() {
        mesin = true;
    }

    public void matikanMesin() {
        mesin = false;
        akselerasi = 0;
    }

    public void tambahAkselerasi(int newValue) {
        if (mesin == true) {
            akselerasi += newValue;
        } else {
            System.out.println("Hidupkan mesin");
        }
    }

    public void kurangiAkselerasi(int newValue) {
        if (mesin == true) {
            akselerasi -= newValue;
        } else {
            System.out.println("Hidupkan mesin");
        }
    }

    public void tampilkanData() {
        System.out.println("Merk: " + merk);
        System.out.println("jenis: " + jenis);
        System.out.println("cc: " + cc + " cc");
        System.out.println("Top speed: " + topSpeed + " mph");
    }

    public void tampilkanKondisi() {
        System.out.println("Mesin: " + mesin);
        System.out.println("Akselerasi: " + akselerasi);

    }
}

package Tugas;

public class Mac extends Laptop {
    public String security;

    Mac() {

    }

    Mac(String merk, int kecProsesor, int sizeMemory,
            String jnsProsesor, String jmlBaterai, String security) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jmlBaterai);
        this.security = security;
    }

    public void tampilMac() {
        super.tampilLaptop();
        System.out.println("Security             = " + security);
    }
}

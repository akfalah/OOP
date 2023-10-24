package Tugas;

public class Windows extends Laptop {
    public String fitur;

    Windows() {

    }

    Windows(String merk, int kecProsesor, int sizeMemory,
            String jnsProsesor, String jmlBaterai, String fitur) {
        super(merk, kecProsesor, sizeMemory, jnsProsesor, jmlBaterai);
        this.fitur = fitur;
    }

    public void tampilWindows() {
        super.tampilLaptop();
        System.out.println("                     = " + fitur);
    }
}

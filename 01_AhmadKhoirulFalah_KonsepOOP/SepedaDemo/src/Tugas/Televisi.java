package Tugas;

public class Televisi {
    String merk;
    String resolusi;
    String rasio;
    int siaran;
    int volume;
    boolean power = false;

    public void hidupkanTV() {
        power = true;
    }

    public void matikanTV() {
        power = false;
        siaran = 0;
        volume = 0;
    }

    public void gantiSiaran() {

    }
}

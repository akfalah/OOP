public class SepedaGunung extends Sepeda {
    private String tipeSuspendsi;

    public void setTipeSuspendsi(String newValue) {
        tipeSuspendsi = newValue;
    }

    public void cetakStatus() {
        super.cetakStatus();
        System.out.println("Tipe suspensi: " + tipeSuspendsi);
    }
}

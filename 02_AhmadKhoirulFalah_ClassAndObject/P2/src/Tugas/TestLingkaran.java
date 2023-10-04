public class TestLingkaran {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.phi = 3.14;
        lingkaran.r = 4;
        System.out.println("Luas lingkaran     = " + lingkaran.hitungLuas());
        System.out.println("Keliling lingkaran = " + lingkaran.hitungKeliling());
    }
}

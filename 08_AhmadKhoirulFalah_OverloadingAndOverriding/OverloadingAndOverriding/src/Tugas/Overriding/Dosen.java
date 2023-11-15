package Tugas.Overriding;

public class Dosen extends Manusia {
    @Override
    public void makan() {
        super.makan();
    }

    public void lembur() {
        System.out.println("Dosen sedang lembur");
    }
}

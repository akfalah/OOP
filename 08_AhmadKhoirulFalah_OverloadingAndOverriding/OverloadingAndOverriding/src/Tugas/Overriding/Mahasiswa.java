package Tugas.Overriding;

public class Mahasiswa extends Manusia {
    @Override
    public void makan() {
        super.makan();
    }

    public void tidur() {
        System.out.println("Mahasiswa sedang tidur");
    }
}

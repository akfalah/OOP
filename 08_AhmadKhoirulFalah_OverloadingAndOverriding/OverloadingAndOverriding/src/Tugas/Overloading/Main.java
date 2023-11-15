package Tugas.Overloading;

public class Main {
    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        System.out.println("Total sudut = " + segitiga.totalSudut(10));
        System.out.println("Total sudut = " + segitiga.totalSudut(90, 45));
        System.out.println("Keliling = " + segitiga.keliling(10, 10,5));
        System.out.println("Keliling = " + segitiga.keliling(20, 15));
    }
}

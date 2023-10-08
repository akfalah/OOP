package Tugas;

public class MotorDemo {
    public static void main(String[] args) {
        Motor motor = new Motor();

        motor.merk = "Honda";
        motor.jenis = "CRF 150L";
        motor.cc = 150;
        motor.topSpeed = 110;
        motor.tampilkanData();

        System.out.println();
        motor.hidupkanMesin();
        motor.tambahAkselerasi(20);
        motor.tambahAkselerasi(20);
        motor.tampilkanKondisi();

        System.out.println();
        motor.kurangiAkselerasi(20);
        motor.matikanMesin();
        motor.tampilkanKondisi();
    }
}

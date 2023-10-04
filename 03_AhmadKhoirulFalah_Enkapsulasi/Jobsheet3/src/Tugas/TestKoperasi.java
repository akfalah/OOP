package Tugas;

import java.util.Scanner;

public class TestKoperasi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String noKTP;
        String nama;
        int limitPinjam;
        int pinjam, angsur;
        int menu;

        System.out.print("No. KTP: ");
        noKTP = sc.next();
        System.out.print("Nama: ");
        nama = sc.next();
        System.out.print("Limit pinjaman: ");
        limitPinjam = sc.nextInt();

        Anggota anggota = new Anggota(noKTP, nama, limitPinjam);

        System.out.println();

        do {
            System.out.print("""
                    1. Pinjam
                    2. Angsur
                    3. Tagihan
                    Menu:\s""");
            menu = sc.nextInt();

            switch (menu) {
                case 1 :
                    System.out.print("Meminjam: ");
                    pinjam = sc.nextInt();
                    anggota.setJumlahPinjam(pinjam);
                    System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjam());
                    break;
                case 2 :
                    System.out.print("Mengangsur: ");
                    angsur = sc.nextInt();
                    anggota.angsur(angsur);
                    System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjam());
                    break;
                case 3 :
                    System.out.println("Jumlah pinjaman saat ini: " + anggota.getJumlahPinjam());
                    break;
            }
            System.out.println();
        } while (menu >= 1 && menu <= 3);
    }
}

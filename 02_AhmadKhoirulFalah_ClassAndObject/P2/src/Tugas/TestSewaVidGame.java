public class TestSewaVidGame {
    public static void main(String[] args) {
        SewaVidGame sewa1 = new SewaVidGame();
        sewa1.id = 1111;
        sewa1.namaMember = "Ahmad";
        sewa1.namaGame = "NFS: Most Wanted 2020";
        sewa1.harga = 20000;

        sewa1.tampilData();
        System.out.println("Harga sewa selama 3 hari : " + sewa1.hargaSewa(3));
    }
}

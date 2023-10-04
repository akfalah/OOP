public class SewaVidGame {
    public int id;
    public String namaMember;
    public String namaGame;
    public int harga;

    public void tampilData() {
        System.out.println("ID          : " + id);
        System.out.println("Nama member : " + namaMember);
        System.out.println("Nama game   : " + namaGame);
        System.out.println("Harga       : " + harga);
    }

    public int hargaSewa(int lamaSewa) {
        int total = harga * lamaSewa;
        return total;
    }
}

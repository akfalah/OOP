package Soal5;

public class Soal5 {
    public static void main(String[] args) {
        Penulis penulis = new Penulis();
        Buku buku = new Buku();

        penulis.setNama("Daniel Goleman");
        penulis.setAlamat("Stockton, California");

        buku.setISBN("123-456-789");
        buku.setJudul("Emotional Intelligence");
        buku.setPenulis(penulis);
        buku.setHarga(150000);

        System.out.println("ISBN    : " + buku.getISBN());
        System.out.println("Judul   : " + buku.getJudul());
        System.out.println("Penulis : " + buku.getPenulis().getNama());
        System.out.println("Alamat  : " + buku.getPenulis().getAlamat());
        System.out.println("Harga   : Rp" + buku.getHarga());
    }
}

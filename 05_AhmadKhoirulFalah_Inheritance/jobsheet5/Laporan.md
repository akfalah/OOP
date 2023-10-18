# jobsheet 5 - inheritance [1]

## Percobaan 1 (extends)

Kode program: <br>

![](img/Percobaan1ClassA.png)

![](img/Percobaan1ClassB.png)

![](img/Percobaan1ClassMain.png)

Hasil run program: <br>

![](img/Percobaan1HasilRun.png)

### Pertanyaan

1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error! <br>
    **Jawab**: <br>
    ![](img/Percobaan1Pertanyaan1.png)
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! <br>
    **Jawab**: Karena ClassB sebagai subclass belum ditambahkan keyword "extends" ke ClassA sebagai superclass.

## Percobaan 2 (Hak Akses)

Kode program: <br>

![](img/Percobaan2ClassA.png)

![](img/Percobaan2ClassB.png)

![](img/Percobaan2ClassMain.png)

Hasil run program: <br>

![](img/Percobaan2HasilRun.png)

### Pertanyaan

1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error! <br>
    **Jawab**: <br>
    ![](img/Percobaan2Pertanyaan1.png)
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! <br>
    **Jawab**: Karena ClassB belum ditambahkan keyword "extends ClassA" dan merubah modifier attributes dari ClassA menjadi protected agar dapat diakses oleh subclass.

## Percobaan 3 (Super)

Kode program: <br>

![](img/Percobaan3ClassBangun.png)

![](img/Percobaan3ClassTabung.png)

![](img/Percobaan3ClassMain.png)

Hasil run program: <br>

![](img/Percobaan3HasilRun.png)

### Pertanyaan
1. Jelaskan fungsi "super" di class Tabung! <br>
    **Jawab**: super pada class Tabung digunakan untuk mengakses attribute dari superclass.
2. Jelaskan fungsi "super" dan "this" di class Tabung! <br>
    **Jawab**: <br>
    - super: digunakan untuk mengakses attribute dari superclass.
    - this: digunakan untuk merujuk attribute dari class Tabung itu sendiri.
3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut! <br>
    **Jawab**: Karena modifier dari attributes class Bangun menggunakan protected yang dimana modifier tersebut dapat diakses oleh class yang sama, package yang sama, dan subclass.

## Perobaan 4 (Super constructor)

Kode program: <br>

![](img/Percobaan4ClassA.png)

![](img/Percobaan4ClassB.png)

![](img/Percobaan4ClassC.png)

![](img/Percobaan4ClassMain.png)

Hasil run program; <br>

![](img/Percobaan4HasilRun.png)

### Pertanyaan

1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya! <br>
    **Jawab**: ClassA merupakan superclass dari ClassB karena ClassB memiliki keyword "extends ClassA". Tetapi ClassB juga merupakan superclass dari ClassC. ClassC termasuk subclass karena memiliki keyword "extends ClassB"
2. Ubahlah isi konstruktor default ClassC <br> 
   Tambahkan kata super() di baris Pertama dalam konstruktor defaultnya. Coba jalankan
   kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya!
    **Jawab**: <br>
    ![](img/Percobaan4Pertanyaan2.png)
3. Ublah isi konstruktor default ClassC <br>
   Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang. <br>
   Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC <br>
   Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat! <br>
    **Jawab**: Saat memanggil konstruktor superclass menggunakan super(), super() harus ditulis diawal baris dalam konstruktor subclass. super() tidak dapat ditempatkan di bawah statement dari konstruktor subclass karena urutan proses dari inheritance adalah memproses superclass terlebih dahulu dan akan dilanjutkan subclass.
4. Apakah fungsi super() di ClassC!
    **Jawab**: Untuk memanggil konstruktor superclass dari ClassC.

## Tugas

Kode program: <br>

![](img/TugasClassDaftarGaji.png)

![](img/TugasClassDosen.png)

![](img/TugasClassPegawai.png)

![](img/TugasClassMain.png)

Hasil run program: <br>

![](img/TugasHasilRun.png)
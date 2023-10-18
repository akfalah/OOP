# Jobsheet 6 - Inheritance

## Percobaan 1 (Extends)
Kode program: <br>

![](img/Percobaan1ClassA.png)

![](img/Percobaan1ClassB.png)

![](img/Percobaan1ClassMain.png)

Hasil run program: <br>

![](img/Percobaan1Run.png)

### Pertanyaan
1. Pada percobaan 1 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error! <br>
    **Jawab**: <br>
    ![](img/Percobaan1Pertanyaan1.png)
    
    ![](img/Percobaan1Pertanyaan1Run.png)
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! <br>
    **Jawab**: Saat pembuatan ClassB yang sebagai subclass dari ClassA belum ditambahkan keyword "extends" yang menyebabkan kode program error.

## Percobaan 2 (Hak Akses)
Kode program: <br>

![](img/Percobaan2ClassA.png)

![](img/Percobaan2ClassB.png)

![](img/Percobaan2ClassMain.png)

Hasil run program: <br>

![](img/Percobaan2Run.png)

### Pertanyaan
1. Pada percobaan 2 diatas program yang dijalankan terjadi error, kemudian perbaiki sehingga program tersebut bisa dijalankan dan tidak error! <br>
    **Jawab**: <br>
     
    ![](img/Percobaan2Pertanyaan1.png)
    
    ![](img/Percobaan2Pertanyaan1Run.png)
    
2. Jelaskan apa penyebab program pada percobaan 1 ketika dijalankan terdapat error! <br>
    **Jawab**: Karena ClassB belum diberi keyword "extends" dan subclass belum mendapat access dari parentclass. Untuk mendapatkan accessnya, dapat mengganti modifier atribut menjadi protected atau public.

## Percobaan 3 (Super)
Kode program: <br>

![](img/Percobaan3ClassBangun.png)

![](img/Percobaan3ClassTabung.png)

![](img/Percobaan3ClassMain.png)

Hasil run program: <br>

![](img/Percobaan3Run.png)

### Pertanyaan
1. Jelaskan fungsi “super” pada potongan program berikut di class Tabung! <br>
    **Jawab**: Digunakan untuk merujuk/mengakses atribut dari class Bangun.
2. Jelaskan fungsi “super” dan “this” pada potongan program berikut di class Tabung! <br>
    **Jawab**: "super" digunakan untuk merujuk/mengakses atribut dari class Bangun, sedangkan "this" digunakan untuk merujuk/mengakses atribut dari class Tabung itu sendiri.
3. Jelaskan mengapa pada class Tabung tidak dideklarasikan atribut “phi” dan “r” tetapi class tersebut dapat mengakses atribut tersebut! <br>
    **Jawab**: Karena class Tabung memiliki keyword "extends" dan modifier atribut dari class Bangun adalah protected yang dimana modifier ini dapat diakses oleh subclass dan class lain yang masih dalam satu package.

## Percobaan 4 (Super Constructor)
Kode program: <br>

![](img/Percobaan4ClassA.png)

![](img/Percobaan4ClassB.png)

![](img/Percobaan4ClassC.png)

![](img/Percobaan4ClassMain.png)

Hasil run program: <br>

![](img/Percobaan4Run.png)

### Pertanyaan
1. Pada percobaan 4 sebutkan mana class yang termasuk superclass dan subclass, kemudian jelaskan alasannya! <br>
    **Jawab**: ClassA merupakan superclass dari ClassB karena pada ClassB memiliki keyword "extends ClassA". Class B merupakan subclass dari Class A dan juga superclass dari ClassC karena pada ClassC terdapat keyword "extends ClassB".
2. Ubahlah isi konstruktor default ClassC seperti berikut: <br>
   ![](img/Percobaan4Pertanyaan2.png)
   Tambahkan kata super() di baris Pertaman dalam konstruktor defaultnya. Coba jalankan
   kembali class Percobaan4 dan terlihat tidak ada perbedaan dari hasil outputnya! <br>
    **Jawab**: <br>
    
    ![](img/Percobaan4Pertanyaan2.png)

    ![](img/Percobaan4Pertanyaan2Run.png)
3. Ublah isi konstruktor default ClassC seperti berikut: <br>
    ![](img/Percobaan4Pertanyaan3.png)
   Ketika mengubah posisi super() dibaris kedua dalam kontruktor defaultnya dan terlihat ada error. Kemudian kembalikan super() kebaris pertama seperti sebelumnya, maka errornya akan hilang. <br>
   Perhatikan hasil keluaran ketika class Percobaan4 dijalankan. Kenapa bisa tampil output seperti berikut pada saat instansiasi objek test dari class ClassC <br>
   Jelaskan bagaimana urutan proses jalannya konstruktor saat objek test dibuat! <br>
    **Jawab**: Saat memanggil super(), super() harus di baris pertama dalam constructor. Sesuai hirarki inheritance, constructor akan ditampilkan secara urut dari superclass kemudian subclass. 
4. Apakah fungsi super() pada potongan program dibawah ini di ClassC!
    **Jawab**: super() digunakan untuk memanggil constructor dari parentclass pada subclass.

## Tugas
Kode program:

![](img/TugasClassDaftarGaji.png)

![](img/TugasClassPegawai.png)

![](img/TugasClassDosen.png)

![](img/TugasClassMain.png)

Hasil run program: <br>

![](img/TugasRun.png)
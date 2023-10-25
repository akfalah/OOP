# LAPORAN JOBSHEET 4 - RELASI KELAS

## Percobaan 1
Kode program:
![](img/ClassProcessor.png)

![](img/ClassLaptop.png)

![](img/MainPercobaan1.png)

Hasil run program:
![](img/RunPercobaan1.png)

### Pertanyaan
1. Di dalam class Processor dan class Laptop, terdapat method setter dan getter untuk masing‐masing atributnya.
   Apakah gunanya method setter dan getter tersebut? <br>
   **Jawab**: Karena object sudah diinstansiasikan, setter digunakan untuk mengubah value atribut object dan 
   getter bisa digunakan untuk memanggil dan nampilkan atribut object.
2. Di dalam class Processor dan class Laptop, masing‐masing terdapat konstruktor default dan konstruktor berparameter. 
   Bagaimanakah beda penggunaan dari kedua jenis konstruktor tersebut? <br>
   **Jawab**: Saat menginstansiasikan default constructor, maka tidak perlu mengisi parameter di dalam tanda kurung. 
   Sedangkan untuk menginstansiakan constructor berparameter, di dalam tanda kurung harus diisikan.
3. Perhatikan class Laptop, di antara 2 atribut yang dimiliki (merk dan proc), atribut manakah yang bertipe object? <br>
   **Jawab**: proc.
4. Perhatikan class Laptop, pada baris manakah yang menunjukkan bahwa class Laptop memiliki relasi dengan class 
   Processor?
   **Jawab**: Saat mendeklarasikan atribut proc yang bertipe data object Processor.
5. Perhatikan pada class Laptop, Apakah guna dari sintaks proc.info()? <br>
   **Jawab**: Untuk memanggil dan menampilkan data processor di class Laptop.
6. Pada class MainPercobaan1, terdapat baris kode: <br>
   Laptop l = new Laptop("Thinkpad", p);. <br>
   Apakah p tersebut? <br>
   Dan apakah yang terjadi jika baris kode tersebut diubah menjadi: <br>
   Laptop l = new Laptop("Thinkpad", new Processor("Intel i5", 3)); <br>
   Bagaimanakah hasil program saat dijalankan, apakah ada perubahan? <br>
   **Jawab**: p di dalam konstruktor adalah object dari class Processor yang telah diinstansiasikan.
   Jika dirubah Laptop L = new Laptop("Thinkpad", new Processor("Intel i5", 3));, tidak ada perubahan.

## Percobaan 2
Kode program:
![](img/ClassMobil.png)

![](img/ClassSopir.png)

![](img/ClassPelanggan.png)

![](img/MainPercobaan2.png)

Hasil run program:
![](img/RunPercobaan2.png)

### Pertanyaan
1. Perhatikan class Pelanggan. Pada baris program manakah yang menunjukan bahwa class Pelanggan memiliki relasi dengan 
   class Mobil dan class Sopir? <br>
   **Jawab**: Saat mendeklarasikan atribut mobil dan supir.
2. Perhatikan method hitungBiayaSopir pada class Sopir, serta method hitungBiayaMobil pada class Mobil. 
   Mengapa menurut Anda method tersebut harus memiliki argument hari? <br>
   **Jawab**: Karena menghitung biaya bergantung pada jumlah hari.
3. Perhatikan kode dari class Pelanggan. Untuk apakah perintah mobil.hitungBiayaMobil(hari) dan 
   sopir.hitungBiayaSopir(hari)? <br>
   **Jawab**: Agar dapat menghitung biaya mobil dan supir berdasarkan atribut hari.
4. Perhatikan class MainPercobaan2. Untuk apakah sintaks p.setMobil(m) dan p.setSopir(s)? <br>
   **Jawab**: Untuk menginisialisasikan atribut mobil dari pelanggan.
5. Perhatikan class MainPercobaan2. Untuk apakah proses p.hitungBiayaTotal() tersebut? <br>
   **Jawab**: Menjumlahkan method biaya mobil dan supir.
6. Perhatikan class MainPercobaan2, coba tambahkan pada baris terakhir dari method main
   dan amati perubahan saat di‐run! <br>
   System.out.println(p.getMobil().getMerk()); <br>
   Jadi untuk apakah sintaks p.getMobil().getMerk() yang ada di dalam method main tersebut? <br>
   **Jawab**: Untuk menampilkan merk mobil yang berelasi object p.

## Percobaan 3
Kode program:
![](img/ClassPegawai.png)

![](img/KeretaApi.png)

![](img/MainPercobaan3.png)

Hasil run program:
![](img/RunPercobaan3.png)

### Pertanyaan
1. Di dalam method info() pada class KeretaApi, baris this.masinis.info() dan this.asisten.info() digunakan untuk apa? <br>
   **Jawab**: Untuk memanggil data diri masinis dan asisten dari class Pegawai.
2. Buatlah main program baru dengan nama class MainPertanyaan pada package yang sama.
   Tambahkan kode berikut pada method main()! <br>
   Pegawai masinis = new Pegawai("1234", "Spongebob Squarepants"); <br>
   KeretaApi keretaApi = new KeretaApi("Gaya Baru", "Bisnis", masinis); <br>
   System.out.println(keretaApi.info()); <br>
   **Jawab**: ![](img/MainPertanyaanPercobaan3.png)
3. Apa hasil output dari main program tersebut? Mengapa hal tersebut dapat terjadi? <br>
   **Jawab**: Error, karena tidak memiliki pegawai asisten.
4. Perbaiki class KeretaApi sehingga program dapat berjalan! <br>
   **Jawab**: 
   ![](img/MainPertanyaanPercobaan3Edit.png)
   ![](img/RunPertanyaanPercobaan3.png)

## Percobaan 4
Kode Program:
![](img/ClassPenumpang.png)

![](img/ClassKursi.png)

![](img/ClassGerbong.png)

![](img/MainPercobaan4.png)

Hasil run program:
![](img/RunPercobaan4.png)

### Pertanyaan
1. Pada main program dalam class MainPercobaan4, berapakah jumlah kursi dalam Gerbong A? <br>
   **Jawab**: Ada 10 kursi.
2. Perhatikan potongan kode pada method info() dalam class Kursi. Apa maksud kode tersebut? <br>
   ... <br>
   if (this.penumpang != null) { <br>
   &ensp;&ensp;&ensp; info += "Penumpang: " + penumpang.info() + "\n"; <br>
   } <br>
   ... <br>
   **Jawab**: Jika kursi sudah terisi penumpang, maka akan menampilkan data penumpang.
3. Mengapa pada method setPenumpang() dalam class Gerbong, nilai nomor dikurangi dengan angka 1? <br>
   **Jawab**: Karena saat set nomor di class Main, memasukkan 1. Agar masuk di dalam indeks pertama array, 
   maka dikurangi 1.
4. Instansiasi objek baru budi dengan tipe Penumpang, kemudian masukkan objek baru tersebut pada gerbong dengan 
   gerbong.setPenumpang(budi, 1). Apakah yang terjadi? <br>
   **Jawab**: Object Penumpang p tergantikan object Penumpang budi.
5. Modifikasi program sehingga tidak diperkenankan untuk menduduki kursi yang sudah ada penumpang lain! <br>
   **Jawab**: 
   ![](img/MainPercobaan4Edit.png)
   ![](img/RunPercobaan4Edit.png)

## Tugas
Diagram class:
![](img/DiagramClassTugas.png)

Kode program:
![](img/ClassCustomer.png)

![](img/ClassCashier.png)

![](img/ClassProduct.png)

![](img/ClassOder.png)

![](img/ClassMain.png)

Hasil run program:
![](img/RunTugas.png)
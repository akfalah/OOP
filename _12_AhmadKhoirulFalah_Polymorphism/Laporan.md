# JOBSHEET 12 - Polymoprism

### Percobaan 1 - Bentuk dasar polimorfisme
![](img/ClassEmployee.png)

![](img/InterfacePayable.png)

![](img/InterfacePayable.png)

![](img/ClassPermanentEmployee.png)

![](img/ClassElectricityBill.png)

![](img/ClassTester1.png)

#### Pertanyaan
1. Class apa sajakah yang merupakan turunan dari class Employee? <br>
   **Jawab**: class InternshipEmployee dan class PermanentEmployee. <br>
   <br>
2. Class apa sajakah yang implements ke interface Payable? <br>
   **Jawab**: class PermanentEmployee dan class ElectricityBill. <br>
   <br>
3. Perhatikan class Tester1, baris ke-10 dan 11. Mengapa e, bisa diisi
   dengan objek pEmp (merupakan objek dari class PermanentEmployee) dan objek iEmp (merupakan objek dari class
   InternshipEmploye) ? <br>
   **Jawab**: Karena objek dari class InternshipEmployee dan class PermanentEmployee merupakan turunan class 
   dari class Employee. <br>
   <br>
4. Perhatikan class Tester1, baris ke-12 dan 13. Mengapa p, bisa diisi denganobjekpEmp (merupakan objek dari
   class PermanentEmployee) dan objek eBill (merupakan objek dari class ElectricityBill) ? <br>
   **Jawab**: Karena keduanya mengimplementasi interface Payable. <br>
   <br>
5. Coba tambahkan sintaks: <br>
   p = iEmp; <br>
   e = eBill; <br>
   pada baris 14 dan 15 (baris terakhir dalam method main) ! Apa yang menyebabkan error? <br>
   **Jawab**: Karena iEmp tidak mengimplementasikan interface payable dan eBill bukan class turunan dari class
   Employee. <br>
   <br>
6. Ambil kesimpulan tentang konsep/bentuk dasar polimorfisme! <br>
   **Jawab**: 
   - Polimorfisme memungkinkan objek dari class turunan dapat diakses melalui variabel dengan tipe class induknya.
   - Interface dapat digunakan sebagai tipe data untuk menciptakan polimorfisme antara objek yang mengimplementasi 
     interface tersebut.
   - Polimorfisme memungkinkan fleksibilitas dalam menggunakan objek, terutama dalam konteks pewarisan dan 
     implementasi interface. <br>
   <br>

### Percobaan 2 -  Virtual method invocation
![](img/ClassTester2.png)

![](img/RunClassTester2.png)

#### Pertanyaan
1. Perhatikan class Tester2 di atas, mengapa pemanggilan e.getEmployeeInfo() pada baris 8 dan pEmp.getEmployeeInfo()
   pada baris 10 menghasilkan hasil sama? <br>
   **Jawab**: Karena 'e' merupakan referensi objek dari class PermanentEmployee (pEmp). Meskipun tipe variabel 'e' 
   dideklarasikan sebagai class Employee, tetapi pada saat runtime, objek yang sebenarnya diakses adalah objek dari 
   class PermanentEmployee. <br>
   <br>
2. Mengapa pemanggilan method e.getEmployeeInfo() disebut sebagai pemanggilan method virtual (virtual method 
   invication), sedangkan pEmp.getEmployeeInfo() tidak? <br>
   **Jawab**: Karena method tersebut dipanggil melalui referensi variabel dengan tipe class induk (Employee). <br>
   <br>
3. Jadi apakah yang dimaksud dari virtual method invocation? Mengapa disebut virtual? <br>
   **Jawab**: Virtual method invocation merujuk pada pemanggilan method pada saat runtime, di mana pemilihan 
   implementasi method tergantung pada tipe objek yang sebenarnya saat runtime.  <br>
   <br>

### Percobaan 3 - Heterogenous Collection
![](img/ClassTester3.png)

#### Pertanyaan
1. Perhatikan array e pada baris ke-8, mengapa ia bisa diisi dengan objek-objek dengan tipe yang berbeda, 
   yaitu objek pEmp (objek dari PermanentEmployee) dan objek iEmp (objek dari InternshipEmployee) ? <br>
   **Jawab**: Karena keduanya adalah turunan dari class Employee. <br>
   <br>
2. Perhatikan juga baris ke-9, mengapa array p juga biisi dengan objek-objek dengan tipe yang berbeda, 
   yaitu objek pEmp (objek dari PermanentEmployee) dan objek eBill (objek dari ElectricityBilling) ? <br>
   **Jawab**: Karena keduanya mengimplementasi interface Payable. <br>
   <br>
3. Perhatikan baris ke-10, mengapa terjadi error? <br>
   **Jawab**: Karena eBill bukan class turunan dari class Employee. <br>
   <br>

### Percobaan 4 - Argumen polimorfisme, instanceof dan casting objek
![](img/ClassOwener.png)

![](img/ClassTester4.png)

![](img/RunClassTester4.png)

#### Pertanyaan
1. Perhatikan class Tester4 baris ke-7 dan baris ke-11, mengapa pemanggilan ow.pay(eBill) dan ow.pay(pEmp) 
   bisa dilakukan, padahal jika diperhatikan method pay() yang ada di dalam class Owner memiliki argument/parameter 
   bertipe Payable? <br>
   Jika diperhatikan lebih detil eBill merupakan objek dari ElectricityBill dan pEmp merupakan objek dari 
   PermanentEmployee? <br>
   **Jawab**: Karena objek dari class ElectricityBill dan objek dari class PermanentEmployee keduanya mengimplementasi 
   interface Payable. <br>
   <br>
2. Jadi apakah tujuan membuat argument bertipe Payable pada method pay() yang ada di dalam class Owner? <br>
   **Jawab**: Untuk memberikan fleksibilitas. Dengan menggunakan tipe data interface Payable sebagai parameter, 
   method pay() dapat menerima objek dari berbagai class yang mengimplementasi interface Payable. <br>
   <br>
3. Coba pada baris terakhir method main() yang ada di dalam class Tester4 ditambahkan perintah ow.pay(iEmp); <br>
   Mengapa terjadi error? <br>
   **Jawab**: Hal ini karena class InternshipEmployee bukan class yang mengimplementasi interface Payable. <br>
   <br>
4. Perhatikan class Owner, diperlukan untuk apakah sintaks p instanceof ElectricityBill pada baris ke-6 ? <br>
   **Jawab**: Digunakan untuk memeriksa apakah objek yang diterima sebagai parameter (p) merupakan instance dari 
   class ElectricityBill atau turunannya. <br>
   <br>
5. Perhatikan kembali class Owner baris ke-7, untuk apakah casting objek disana 
   (ElectricityBill eb = (ElectricityBill) p) diperlukan ? Mengapa objek p yang bertipe Payable harus di-casting ke
   dalam objek eb yang bertipe ElectricityBill ? <br>
   **Jawab**: Casting objek (ElectricityBill) p diperlukan karena pada saat kompilasi, variabel p diperlakukan sebagai 
   tipe Payable. Ini dilakukan untuk memberitahu compiler bahwa objek p sebenarnya adalah objek dari 
   class ElectricityBill, sehingga dapat diakses metode dan properti yang ada dalam class tersebut. <br>
   <br>

### Tugas
![](img/InterfaceDestroyable.png)

![](img/ClassZombie.png)

![](img/ClassWalkingZombie.png)

![](img/ClassJumpingZombie.png)

![](img/ClassBarrier.png)

![](img/ClassPlant.png)

![](img/ClassTester.png)

![](img/RunClassTester.png)
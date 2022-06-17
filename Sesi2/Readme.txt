Java Operator & Conditional Logic

Operator merupakan suatu simbol yang digunakan untuk memberikan perintah kepada komputer untuk 
melakukan aksi terhadap satu atau lebih operand. Operand sendiri adalah sesuatu yang dioperasikan 
oleh operator.

Di dalam java ada beberapa tipe Operator yang wajib dipahami , yaitu :
● Operator Aritmatika
● Operator Penugasan
● Operator Pembanding
● Operator Logika

1.Operator Aritmatika
Operator Aritmatika ini adalah operator yang sering kita gunakan untuk hitung menghitung seperti 
kali bagi tambah kurang dan lainnya.

2. Relational PenugasanAssignment Operator digunakan untuk memberi tugas suatu variable untuk 
melakukan suatu proses. Operator ini sering digunakan dalam pemrograman untuk mengulangi suatu perintah , 
salah satunya adalah increment / decrement.

3. Operator Pembanding Operator Pembanding merupakan suatu operator yang digunakan untuk membandingkan 
antara dua buah nilai. Hasil perbandingan dari operator ini adalah TRUE dan FALSE ( Tipe data BOOLEAN).

Java OperatorOperator logika adalah suatu operator yang membandingkan dua bukan KONDISI , 
mirip seperti dengan operator pembanding. Operator Logika ini menghasilkan nilai bertipe BOOLEAN , 
yaitu TRUE dan FALSE.

Conditional Logic

Dalam bahasa pemrograman Java, untuk menganalisa dan mengevaluasi kondisi digunakan variabel boolean.
Dalam hal ini, nilai boolean true dan false dikembalikan pada saat melakukan pembandingan ekspresi atau
dievaluasi.

Dalam kondisi normal, memang pada umumnya Anda tidak perlu menetapkan ekspresi kondisional kedalam boolean.

If - Else and Between
Java conditional berikutnya adalah if – else dan between. 
Untuk pernyataan if dan else dalam bahasapemrograman Java ini cukup sederhana.

Selain itu, dalam kondisi tertentu Anda dapat menambahkan pernyataan lain (else) setelah if. 
Ini dapat Anda lakukan ketika Anda ingin melakukan sesuatu jika kondisinya tidak benar

Untuk Anda ketahui, pernyataan if – else tidak harus Anda tuliskan dalam beberapa baris dengan menggunakan tanda {}, 
if dapat Anda gunakan dalam satu baris, atau tanpa {}, untuk satu baris pernyataan.


== and EqualsOperator 
Java conditional berikutnya ialah = = dan equals. Untuk operator = = sendiri, memiliki cara kerja
yang sedikit berbeda pada objek daripada variabel tipe primitif. Ketika Anda ingin menggunakan objek dan
ingin memastikan dengan cara memeriksa apakah mereka sama, operator = = akan mengatakan jikamereka sama.
Apabila Anda ingin memeriksa apakah keduanya memang sama secara logis, maka cara yang harus Anda
tempuh ialah dengan menggunakan equals metode pada objek.

Switch/Case

Nested IF

Misalnya ada model bisinis seperti ini di sebuah toko.
Ketika orang membayar di kasir, biasanya ditanya ada kartu member untuk mendapatkan diskon dan sebagainya.
Apakah anda punya kartu member?   
- ya       
 * Apakah belanjaan anda lebih dari 500rb?           
    # ya : mendapatkan diskon 50rb           
    # tidak : tidak mendapatkan diskon       
 * Apakah belanjaan anda lebih dari 100rb?           
    # ya : mendapatkan diskon 15rb           
    # tidak: tidak mendapatkan diskon   
- tidak       
 * Apakah belanjaan anda lebih dari 100rb?           
    # ya : mendapatkan diskon 10rb           
    # tidak: tidak mendapatkan diskon


A. Fungsi equalIgnoreCase(“ya”) digunakan untuk membandingkan string tanpa memperhatikan huruf besardan huruf kecilnya. 
B. Ada juga Fungsi equals(), fungsinya sama. Tapi equals lebih memperhatikan case hurufnya.


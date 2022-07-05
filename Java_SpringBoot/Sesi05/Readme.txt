Object Oriented Programming [OOP]

Object pada Java adalah entitas yang memiliki keadaan dan perilaku dikenal sebagai objek di dunia nyata
misalnya kursi, sepeda, spidol, pulpen, meja, mobil, dan lain sebagainya.D
apat berbentuk fisik atau logis (berwujud dan tidak berwujud).
Contoh benda tak berwujud adalah sistem perbankan.

Ada beberapa hal yang dapat dikategorikan sebagai definisi objek:
1.Objek adalah entitas dunia nyata.
2.Objek adalah entitas runtime.
3.Objek adalah entitas yang memiliki keadaan dan perilaku.
4.Objeknya adalah turunan dari kelas.

Sebuah objek memiliki tiga karakteristik:
1.State: merepresentasikan data (nilai) dari suatu objek.
2.Perilaku: merepresentasikan perilaku (fungsionalitas) suatu objek seperti deposit, penarikan, dll.
3.Identitas: Identitas objek biasanya diimplementasikan melalui ID unik. 
Nilai ID tidak terlihat olehpengguna eksternal. Namun, ini digunakan secara internal oleh JVM untuk mengidentifikasi setiapobjek secara unik. 
Misalnya, Pena adalah sebuah benda. Namanya Reynolds; warnanya putih, yang dikenal dengan negaranya. 
Itu digunakan untuk menulis, jadi menulis adalah perilakunya. Objek adalah turunan dari kelas. 
Kelas adalah templat atau cetak biru tempat objek dibuat. Jadi, sebuahobjek adalah turunan (hasil) dari sebuah kelas.

Class  adalah sekelompok objek yang memiliki properti yang sama.
Ini adalah blueprint  dari mana objek dibuat.

Kelas di Java dapat berisi:
1.Fields
2.Method
3.Konstruktor
4.Blok

Method adalah sekumpulan kode atau kumpulan pernyataan atau sekumpulan kode yang dikelompokkan
bersama untuk melakukan tugas atau operasi tertentu. Ini digunakan untuk mencapai penggunaan kembalikode.
Kita akan menulis Method sekali dan menggunakannya berkali-kali dalam kata lain tidak perlu menulis kode
lagi dan lagi.Hal ini juga menyediakan modifikasi dan pembacaan kode yang mudah, hanya dengan menambahkan ataumenghapus sebagian kode.
Method ini dijalankan hanya ketika kita memanggil atau memanggilnya.

Dengan mendeklarasikan method memberikan informasi tentang atribut Method, seperti visibilitas, tipe
kembalian, nama, dan argumen. Method memiliki enam komponen yang dikenal sebagai header Method,
seperti yang telah kita tunjukkan pada gambar berikut.
1.Method Signature: Setiap Method memiliki tanda tangan Method. Ini adalah bagian dari deklarasi Method. 
  Ini termasuk nama Method dan daftar parameter.
2.Access Specifier: Access specifier atau modifier adalah tipe akses dari Method ini. 
Ini menentukan visibilitas Method. Java menyediakan empat jenis penentu akses:
3.Public: Method ini dapat diakses oleh semua kelas saat kita menggunakan penentu publik dalamaplikasi kita.
4.Private: Saat kita menggunakan penentu akses pribadi, Method ini hanya dapat diakses di kelasyang ditentukan.
5.Protected: Saat kita menggunakan penentu akses yang dilindungi, Method ini dapat diakses dalampaket atau subkelas yang sama dalam paket yang berbeda.

Default: Ketika kita tidak menggunakan penentu akses apa pun dalam deklarasi Method, 
Java menggunakan penentu akses default secara default. Itu hanya terlihat dari paket yang sama saja.
3.Return Type: Jenis Pengembalian adalah jenis data yang dikembalikan Method. 
   Ini mungkinmemilikitipe data primitif, objek, koleksi, void, dll. Jika Method tidak mengembalikan apa pun, 
   kamimenggunakan kata kunci void.
4.Method name: Method name adalah nama unik yang digunakan untuk menentukan nama Method.
   Ini harus sesuai dengan fungsionalitas Method. Misalkan, jika kita membuat Method untuk pengurangan dua angka, 
   nama Method harus subtraction (). Sebuah Method dipanggil olehnamanya.
5.Parameter: Parameter adalah daftar parameter yang dipisahkan oleh koma dan diapit oleh sepasang tanda kurung. 
   Ini berisi tipe data dan nama variabel. Jika Method tidak memiliki parameter,kosongkan tanda kurung.
6.Method Body: Method body adalah bagian dari deklarasi Method. Ini berisi semua tindakan yangharus dilakukan. 
   Itu tertutup dalam sepasang kurung kurawal.

Saat menentukan Method, ingatlah bahwa nama Method harus berupa kata kerja dan dimulai dengan hurufkecil. 
Jika nama Method memiliki lebih dari dua kata, nama depan harus berupa kata kerja diikuti oleh katasifat atau kata benda.
Dalam Method Name multi-kata, huruf pertama dari setiap kata harus menggunakan huruf besar kecualikata pertama. 

Sebagai contoh:
1.Nama Method satu kata: sum (), area ()
2.Nama Method multi-kata: areaOfCircle (), stringComparision ()
Mungkin juga suatu Method memiliki nama yang sama dengan nama Method lain di kelas yang sama, ini dikenal sebagai Method overloading.

Method juga memiliki 2 jenis dari Method:
–  Predefined Method
-  User-defined Method

Ide di balik inheritance di Java adalah Kita dapat membuat kelas baru yang dibangun di atas kelas yangsudah ada.
Saat Kita mewarisi dari class yang ada, Kita dapat menggunakan kembali Method dan field dari kelasparents.
Selain itu, Kita juga dapat menambahkan method dan field baru di kelas Kita saat ini.

1. Class 
    Sekelompok objek yang memiliki properti umum. Ini adalah blueprint darimana objek dibuat.
2.Subclass / Child Class
    Class yang mewarisi class lain. Ini juga disebut class turunan, atau class anak.
3.Super Class / Parent Class         
    Class tempat subkelas mewarisi fitur. Ini juga disebut class dasar atau class induk.
4.Usabilitas         
    Mekanisme yang memfasilitasi Kita untuk menggunakan kembali kolom dan metode class yang ada          saat Anda membuat class baru. Kita dapat menggunakan kolom dan Method yang sama yang telah          
    ditentukan di class sebelumnya.

Encapsulation
Encapsulation, or data hiding, adalah prinsip dari membuat variable member yang tidak dapat diakses dari luar class, 
tapi menyediakan method yang bernama getter dan setter untuk mengakses dan memodifikasi variable member secara aman. 
ini dapat mencegah masalah, seperti mengatur health atau posisi ke nilai yang salah.
kedua method tersebut akan kita akses melalui method main, 
jadi yang harus kita set menjadi private itu adalah atributnya saja, seperti variable.

Polymorphysm
Secara sederhana polymorhpism di Java dibagi ke dalam 3 bentuk :
● Class itu sendiri
● Class lain
● Interface

Kemampuan method sama namun dengan behavior,  atau perilaku berbeda-beda ,antara Super class dengan
Sub class ini, disebut juga dengan method Overriding.

Kemampuan method sama namun dengan paramater yang berbeda-beda ,ini juga bisa disebut method
Overloading  Kedua tipemethod tersebut , menganut konsep dari Polymorphism.


Download JDK
1. Kunjungi  : https://www.oracle.com/java/technologies/downloads/
2. Pilihlah JDK yang sesuai dengan sistem operasi anda. Karena saya menggunakan Windows 10 64-bit, makasaya pilih 'Windows x64 Installer'
3. Tunggu proses download hingga muncul JDK Installer di folder anda.

Instalasi Java
1. Klik open pada JDK yang telah anda install, kemudian klik Next
2. Jika anda ingin mengubah direktori instalasi, anda dapat mengubahnya pada tombol 'Change', kemudianklik Next
3. Tunggu hingga proses instalasi selesai.
4. Klik 'Close' untuk menutup proses instalasi

Langkah selanjutnya setelah anda berhasil melakukan proses instalasi Java adalah melakukan SettingPathpada komputer anda. Berikut adalah langakah-langkah yang dapat anda ikuti untuk melakukan settingpath Java di Windows.
1. Cari CMD pada menu search di windows anda kemudian 'Run as administrator'
2. Tulis 'javac' atau 'java' pada CMD tersebut. Jika hasilnya "'javac' is not recognized as .....", maka setting path Java belum dilakukan pada komputer anda.
3. Buka directori dari java yang telah anda install. Jika anda tidak mengubah directori pada saat installJava,maka directori tersebut adalah 'C:\Program Files\Java\jdk-14.0.1\bin'
4. Cari 'Environment' pada menu search di Windows, dan pilih menu seperti di bawah
5. Klik 'Environment Variables'
6. Klik 'Edit' pada bagian System Variables
7. Kemudian klik New, dan paste path yang telah anda copy di tahap 3, kemudian klik 'OK'
8. Klik 'OK' pada tahap ini
9. Tulis 'javac' di CMD, akan tampak seperti berikut jika proses setting path nya benar
10. Tulis 'java'  di CMD, akan tampak seperti berikut jika proses setting path nya benar

Bahasa Java adalah Bahasa pemograman high-level, dibuat oleh James Gosling yang kemudian di akuisisi oleh  Sun Microsystems  tahun 1995. Banyak dijalankan pada variety platforms Windows, MasOS , and UNIX.

Mengapa Java ?Bahasa Pemograman paling popular yang bersifat Independent Platform yang Simple, Secure, Portable mendukung architecture-neutral dan juga yang paling penting adalah Object Oriented Programming!

Konsep Penting Java :
1. Tulis Code : menggunakan Teks Editor(Notepad, Netbeans tau text editor yang lain)
2. Kompilasi  : mengubah code menjadi bytecode,
3. Eksekusi.   : menjalankan program

File mismatch() Method
Method yang akan mengembalikan posisi dari first mismatch or -1L jika tidak terdapat mismatch.public static long mismatch(Path path, Path path2) throws IOException

Struktur Program Java secara umum dibagi menjadi 4 bagian :
1. Deklarasi Package
2. Import Library
3. Bagian Class
4. Method main

Package adalah  folder yang berisi sekumpulan program Java.
Deklarasi package biasanya dilakukan saat membuat program atau aplikasi besar
Biasanya nama package mengikuti nama domain dari sebuah vendor yang mengeluarkan program tersebut.
contoh : package com.hactiv8.ptogram; package Sesi1;

Kita dapat melakukan import library yang dibutuhkan pada program.
Library merupakan sekumpulan class dan fungsi yang bisa kita gunakan dalam membuat program.
contoh : import java.util.Scanner;

Java merupakan bahasa pemrograman yang menggunakan paradigma OOP (Object Oriented Programming).
Setiap program harus dibungkus di dalam class agar nanti bisa dibuat menjadi objek.

Method main() atau fungsi main() merupakan blok program yang akan SELALU dieksekusi pertama kali.
Method main() wajib kita buat. Kalau tidak, maka programnya tidak akan bisa dieksekusi

Method main() memiliki parameter args[]. Parameter ini nanti akan menyimpan sebuah nilai dariargumen di command line.
Lalu di dalam method main(), terdapat statement atau fungsi untuk menampilkan teks ke layarmonitor
contoh :    public class CekLList {
                public static void main(String[] args) {

                }
            }

Apa itu Statemen dan Expresion?Kita lihat dulu pengertian dari statemen dan ekspresi dalam pemrograman.
Statement adalah unit sintaks pada bahasa pemrograman yang menyatakan aksi atau tugas untuk dilakukan
contoh :    System.out.println("Hello World");
            System.out.print("Hello World");

Ekspresi adalah entitas sintaks pada bahasa pemrograman yang menghasilkan sebuah nilai.
Biasanya ekspresi terdiri dari konstanta, variabel, fungsi, dan operator.
conton :    var x = 10;
            var y = 10;
            var z = x + y;

Macam-macam Tipe Data
char : tipe data karakter, contoh Y
int : angka atau bilangan bulat, contoh 29
float : bilangan desimal, contoh 2.1
double : bilangan desimal juga, tapi lebih besar kapasitasnya, contoh 2.1
string : kumpulan dari karakter yang membentuk teks, contoh Hello Java!
Boolean : tipe data yang hanya bernilai true dan false

Nama variabel TIDAK BOLEH menggunakan kata kunci dari Java (reserved word) seperti if, for, switch, dll. 
- Nama variabel boleh menggunakan huruf, angka (0 - 9), garis bawah(underscore), dan symbol dollar ($),namun penggunaan garis bawah dan symbol lebih baik dihindari. 
- Nama variabel harus diawali dengan huruf kecil, karena Java menggunakan gaya CamelCase. 
- Apabila nama variabel lebih dari 1 suku kata, maka kata ke 2 dituliskan dengan diawali huruf besar danseterusnya, contoh namaVariabel.

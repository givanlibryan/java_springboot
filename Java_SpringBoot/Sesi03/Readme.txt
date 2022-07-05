Fundamental Programming with Looping

Perulangan atau Loop adalah sebuah hal yang digunakan untuk mengeksekusi sebuah set dari suatu
instruksi atau fungsi secara berulang ketika beberapa kondisi menjadi nyata (true).

Ada dua jenis atau tipe perulangan pada Java.
1.perulangan java for,
2.perulangan java while.

Namun perulangan ini memiliki turunan yaitu, perulangan java do-while.
Berikut kami jelaskan perbedaannya:
1.Definisi masing-masing perulangan.
- Perulangan for adalah pernyataan aliran kontrol yang mengulang bagian dari program beberapakali.
- Perulangan while adalah pernyataan aliran kontrol yang mengeksekusi bagian dari program
  berulang kali berdasarkan kondisi boolean yang diberikan.
- Perulangan do-while adalah pernyataan aliran kontrol yang mengeksekusi bagian dari program
  setidaknya satu kali dan eksekusi selanjutnya bergantung pada kondisi boolean yang diberikan.
2.Waktu Penggunaan.
– Jika jumlah iterasi tetap, disarankan untuk menggunakan perulangan for.
- Jika jumlah iterasi tidak tetap, disarankan untuk menggunakan perulangan while.
- Jika jumlah iterasi tidak tetap dan Anda harus menjalankan loop sekali, disarankan untuk menggunakan
  perulangan do-while.

Perulangan terbagi menjadi 2 jenis :
- Counted Loop : Perulangan yang jumlah pengurangannya terhitung atau tentu, terdiri dari perulangan fordan for-each
- Uncounted Loop : Perulangan yang jumlah pengulangannya tidak tentu, terdiri dari perulangan do dando/while

Perulangan For

Perulangan ini digunakan untuk mengiterasi bagian dari program beberapa kali. Jika angka dari iterasi sudah
pasti, maka direkomendasikan untuk menggunakan perulangan for.

● Variabel hitungan tugasnya untuk menyimpan hitungan pengulangan.
● Hitungan <= 10 artinya selama nilai hitungannya lebih kecil atau sama dengan 10, 
  maka pengulangan akan terus dilakukan. Dengan kata lain, perulangan ini akan mengulang sebanyak 10 kali.
● Hitungan++ fungsinya untuk menambah satu(+1) nilai hitungan pada setiap pengulangan.
● Blok kode For dimulai dengan tanda ‘{‘ dan diakhiri dengan ‘}’.

Perulangan for memiliki tiga bagian:
Bagian pernama menjalankan sekali ketika Anda memasukan perulangan.
Bagian kedua adalah gate keeper, jika mengembalikan nilai true, maka Anda akan menjalankan pernyataan
 di loop, jika mengembalikan false, maka Anda akan keluar dari loop.
 Hal ini pun berjalan tepat setelah bagian pertama untuk pertama kalinya, 
 kemudian setiap kali loop selesaidan bagian ketiga dijalankan.
Bagian ketiga adalah pernyataan terakhir yang akan dijalankan setiap kali loop berjalan.

Perulangan For-Each

Perulangan FOR-EACH digunakan untuk menampilkan isi array. Perulangan juga dilakukan dengan kata kunci For.

Penjelasan :
- Variabel item akan menyimpan nilai dari array.
- Untuk setiap item dalam dataArray, maka lakukan perulangan.

Break & Continue
Kata kunci ini membantu Anda untuk mengontrol perulangan di dalamnya. Break akan menyebabkan loop
berhenti dan akan segera beralih ke pernyataan berikutnya setelah perulangan.

Kata kunci ‘continue’ akan menghentikan iterasi saat ini dan akan pindah ke yang berikutnya. 
Perhatikanbahwa di dalam perulangan for, hal ini masih akan menjalankan bagian ketiga.

Uncounted Loop
Cara kerja perulangan ini seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai true.

Kondisi ini hanya memiliki nilai true & false, perulangan while akan berhenti sampai kondisi bernilai false.
Perulangan while digunakan untuk mengiterasi bagian dari program beberapa kali.
Sama seperti perulangan for, perulangan while direkomendasikan untuk Anda gunakan ketika angka dariiterasi belum pasti.
Hal inilah yang menyebabkan syntax dari perulangan ini sangat mirip dengan perulangan For.

Kemudian, perulangan while memiliki turunan yakni perulangan Java do while yang digunakan untuk
mengiterasibagian dari program beberapa kali.
Gunakan perulangan ini angka dari perulangan belum pasti dan Anda diharuskan untuk mengeksekuasi 
perulangan setidaknya satu kali

Perulangan Do - While

Cara kerja perulangan ini seperti percabangan, ia akan melakukan perulangan selama kondisinya bernilai true.

Cara kerja perulangan Do/While sebenarnya sama seperti perulangan While.|Bedanya, Do/While melakukan satu kali perulangan dulu. 
Kemudian mengecek kondisinya.
Jadi kerjakan dulu do baru di cek kondisi while-nya.Kalo kondisi bernilai true, maka lanjut perulangan.

Nested Loop

Perulangan juga dapat bersarang. Perulangan bersarang maksudnya, perulangan dalam perulangan ataudisebut juga nested loop.

Penjelasan
●Perulangan bersarang sering digunakan pada array multi dimensi.
●Jenis perulangan di dalam perulangn bisa berbeda, misalnya di dalam perulangan while adaperulangan for.





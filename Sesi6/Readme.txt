Version Control System
Sistem yang mencatat semua perubahan yang dilakukan pada file sehingga semua riwayatnya akan
terekamdan bisa dilihat kembali nanti. Saat developer membuat proyek baru, mereka selalu dan akan
terus-menerus melakukan pembaruan terhadap kodenya. Bahkan, setelah proyeknya online, developer
tetap harus memperbarui versinya, memperbaiki bug, menambahkan fitur baru, dan lain sebagainya.

Git adalah salah satu tool yang sering digunakan dalam proyek pengembangan software.
Version control system membantu developer melacak perubahan yang mereka lakukan terhadap basis kode. 
Tak hanyaitu, sistem ini juga mencatat siapa saja yang membuat perubahan serta memulihkan kode yang telah dihapus ataudimodifikasi.
Karena Git menyimpan banyak salinan kode di repositori, maka tidak ada kode yang saling tertimpa.

Repositori atau repo adalah direktori penyimpanan file proyek.
Di sini, Anda bisa menyimpan apa pun yang berkaitan dengan proyek yang sedang Anda buat, misalnya file kode, gambar, atau audio.
Repo sendiri bertempat di penyimpanan atau storage GitHub atau repositori lokal di komputer Anda.

Branch merupakan salinan dari repositori. Anda bisa menggunakan branch ketika akan melakukan suatu pengembangan atau development secara terpisah.
Pekerjaan atau task yang Anda kerjakan di branch tidak akan memengaruhi repositori pusat atau branch lainnya. 
Jika pengembangannya sudah selesai, Anda bisa menggabungkan branch saat ini ke branch lainnya dah juga repositori pusat dengan menggunakan pull request.

GitHub adalah manajemen proyek dan sistem versioning code sekaligus platform jaringan sosial yang dirancang khusus bagipara developer. 
Lalu, apa saja fungsi GitHub? Dengan platform ini, Anda bisa bekerja bersama-sama dengan rekan dariberbagai berlahan dunia, merencanakan proyek, dan bahkan tracking (melacak) pekerjaan Anda.

Buat akun github
Masuk ke Github dan daftar.
● Tentukan username kamu yang baik, jelas, mudah diingat dan dibaca; dengan huruf kecil (misalnya andirubenatau andir atau aruben). 
● Konfirmasi email akun GitHub di inbox kamu.
● Kunjungi https://github.com/settings/profile lalu lengkapi profil kamu.
● "Update profile" kamu.
● Jika nanti kamu melihat USERNAME, artinya perlu diganti dengan username-kamu. 
Misalnya username kamu adalah andiruben, berarti github.com/USERNAME menjadi github.com/andiruben.

Git merupakan tool utama yang pasti akan kamu gunakan setiap hari, sepanjang karirmu sebagai developer.
Dengan ini kamu dapat tahu apa saja yang kamu lakukan setiap saat dan berkolaborasi dengan rekan lainnyajuga

Download GitSilahkan buka website resminya Git (git-scm.com). 
Kemudian unduh Gitsesuai dengan arsitektur komputerkita. Kalau menggunakan 64bit,unduh yang 64bit. 
Begitu juga kalau menggunakan 32bit.
Panduan Instalasi ada di website


Konfigurasi Awal yang Harus Dilakukan
git config --list
git config --global --list
git status

1.
git config --global user.name "Nama"
git config --global user.email "email"
git config --global credential.username "username"

2. //pindah branch
git checkout -b main
git checkout -b master

3. cara menggunakan git
---
git init
git remote add origin "https://github.com/givanlibryan/java_springboot"
git add README.md
git commit -m "first commit"
git checkout -b main
git pull origin branchname --allow-unrelated-histories
git push -u origin main

pull git pertama kali jika sudah remote


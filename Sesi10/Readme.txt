download & intasll xampp 7.4
donload adminer kemudian pindahkan ke xampp/htdocs
edit file ini > c:\xampp\phpmyadmin\config.inc.php
ganti config menjadi cookie
lalu restart apache dan mysql

kemuadian buka xampp kemudian start apache dan mysql
kemudian ke http://localhost/phpmyadmin/index.php
ganti password 
root
root
kemudian login
http://localhost/adminer.php?

1. create database 	h8_siakad	 / db_siakad / bfi_siakad
2. create table		tb_mahasiswa / mahasiswa
3. create filed (sesuaikan struktur tabel)
	> tabel mahasiswa
		id > pk (primary key), type data int (11)/bigint, auto increment
		nim (nomor induk mahasiswa) type data string (255) / 50 / 100 (Unik)
		email (Unik)
		nama mahasiswa type data String (100)
		jenis kelamin > string/varchar 50 / 2 > value (P,L) > Perempuan/Laki-laki (tidak dikecualikan)
					enum (P,L) (Perempuan,Laki-laki > jika diisi "yang lainnya" > ini tidak bisa (sudah dikecualikan)
					int (2) > 0,1 > coment 0=laki-laki, 1=perempuan
4. insert record / insert data mahasiswa

auto
insert into tb_mahasiswa(nim, email, nama mahasiswa, jenkel) values("123", "gkl@gmail.com", "Givan", "laki-laki");

insert into tb_mahasiswa(id, nim, email, nama mahasiswa, jenkel) values(6, "123", "gkl@gmail.com", "Givan", "laki-laki");

/lebih simpel
insert into tb_mahasiswa values(
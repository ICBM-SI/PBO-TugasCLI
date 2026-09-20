# TUGAS INDIVIDU: PEMROGRAMAN BERORIENTASI OBJEK (JAVA)
## Nama: Aditya Dwinugraha Yusniandra / 2509116114

## Studi Kasus:
Program berikut merupakan contoh program penyewaan baju profesi sederhana yang menerapkan (Command Line Interface) menggunakan bahasa pemrograman Java dengan menerapkan prinsip Pemrograman Berorientasi Objek.

## Diagram Kelas:
BajuProfesi -> extends -> BajuKhusus
*BajuProfesi* merupakan superclass (class induk) yang memiliki atribut nama, profesi, dan harga.
*BajuKhusus* merupakan subclass (class turunan) yang mewarisi atribut dan fungsi dari BajuProfesi.

## Penjelasan bagian kode yang menerapkan inheritance:
1. Inheritence diterapkan pada class BajuKhusus menggunakan extends, dengan begitu BajuKhusus dapat mewarisi atribut dari BajuProfesi.
2. penggunaan super untuk memanggil constructor dari class BajuProfesi sehingga data nama, profesi, dan harga dapat digunakan oleh BajuKhusus.

# Screenshot Program

<img width="663" height="322" alt="image" src="https://github.com/user-attachments/assets/352f970d-1401-4e88-858b-529e9f3e0d7d" />

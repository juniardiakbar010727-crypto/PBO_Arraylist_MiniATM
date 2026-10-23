# Tugas PBO - Eksplorasi Array & ArrayList (Menu ATM Sederhana)

Repositori ini dibuat untuk memenuhi tugas praktikum/eksplorasi materi **Array dan ArrayList** dalam mata kuliah Pemrograman Berorientasi Objek (PBO).

## Identitas Mahasiswa
* **NIM:** F1D02510062
* **Nama:** Juniardi Akbar
* **Mata Kuliah:** Pemrograman Berorientasi Objek

## Deskripsi Program
Program Java berbasis *Command Line Interface (CLI)* ini mensimulasikan sistem menu ATM sederhana. Program menerapkan prinsip **Object-Oriented Programming (OOP)** dengan pemisahan kelas objek (`AkunATM`) dan kelas utama (`MainATM`). 

Selain itu, program ini mengeksplorasi penggunaan `java.util.ArrayList` untuk mencatat riwayat transaksi secara dinamis setiap kali pengguna melakukan setor tunai atau tarik tunai.

## Fitur Utama
1. **Cek Saldo**: Menampilkan informasi pemilik akun dan sisa saldo saat ini.
2. **Setor Tunai**: Menambah saldo akun dan otomatis merekam riwayat ke dalam `ArrayList`.
3. **Tarik Tunai**: Mengurangi saldo dengan validasi keamanan kecukupan dana.
4. **Riwayat Transaksi**: Menampilkan seluruh catatan aktivitas transaksi secara berurutan menggunakan method `ArrayList`.

## Cara Menjalankan Program
1. Pastikan komputer Anda telah terinstal **Java Development Kit (JDK)**.
2. Buka terminal di direktori penyimpanan file.
3. Lakukan kompilasi file:
   ```bash
   javac MainATM.java
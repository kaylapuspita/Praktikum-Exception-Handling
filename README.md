# Tugas Praktikum-Exception-Handling

**Nama:Kayla Puspita Khairiyah**
**NIM: 20230040159**
**Kelas: TI23E**

**LAPORAN PRAKTIKUM JAVA: EXCEPTION HANDLING**

---

## 📌 Pendahuluan

🧠 *Exception Handling* di Java adalah cara elegan untuk menangani error tanpa membuat program berhenti mendadak 🚫💥. Praktikum ini dibuat untuk membantu kita memahami cara kerja penanganan kesalahan, seperti `ArithmeticException`, `ArrayIndexOutOfBoundsException`, `NullPointerException`, hingga membuat exception sendiri 💡.

---

## 🎯 Tujuan Praktikum

* 🔍 Mengenali jenis-jenis error (*exception*) dalam Java
* 🧩 Memahami dan menggunakan `try`, `catch`, `finally`, `throw`, dan `throws`
* 🛡️ Menangani error agar program tetap berjalan stabil
* 🔄 Menganalisis alur program saat error terjadi

**III. RANGKAIAN PERCOBAAN DAN ANALISIS**

**Percobaan 1 - Array Index Out of Bounds**

* Kode awal mengakses `a[5]` dari array berukuran 5, menghasilkan `ArrayIndexOutOfBoundsException`.
* Perbaikan dilakukan dengan membungkus kode dalam `try-catch`.
* *Analisis*: Menunjukkan pentingnya pembatasan akses array agar tidak melebihi indeks yang valid.

**Percobaan 2 - Perulangan Melebihi Batas Array**

* Terjadi error karena `i < 4` sedangkan array hanya memiliki 3 elemen.
* Solusi dengan menangani error di `catch` dan mereset nilai `i`.
* *Analisis*: Demonstrasi kontrol alur program saat terjadi kesalahan akses array.

**Percobaan 3 - Pembagian dengan Nol**

* Terjadi `ArithmeticException` karena `bil / 0`.
* Penanganan dengan blok `try-catch`.
* *Analisis*: Penanganan operasi aritmatika yang tidak valid.

**Percobaan 4 - Multiple Exception**

* Dua kemungkinan error: pembagian nol dan akses array yang tidak ada.
* Urutan pernyataan dalam `try` menentukan exception mana yang ditangkap terlebih dahulu.
* *Analisis*: Pentingnya urutan eksekusi dalam blok `try`.

**Percobaan 5 - Informasi Lengkap Exception**

* Menampilkan pesan error dan jejak stack trace.
* *Analisis*: Berguna untuk debugging dengan informasi error yang detail.

**Percobaan 6 - `throw` Exception Manual**

* Program secara manual melempar `NullPointerException`.
* *Analisis*: Menjelaskan bahwa `throw` menghentikan eksekusi normal dan langsung masuk ke `catch`.

**Percobaan 7 - Throw `Exception` Umum**

* `throw new Exception("...")` digunakan.
* Menampilkan berbagai cara untuk membaca informasi dari exception.
* *Analisis*: Memberikan wawasan tentang `getMessage()`, `toString()`, dan `printStackTrace()`.

**Percobaan 8 - `throws` dan `try-catch`**

* `methodB()` diberi deklarasi `throws IOException` meskipun kesalahan sebenarnya adalah aritmatika.
* Versi kedua menggunakan `try-catch` di `main`.
* *Analisis*: Menjelaskan perbedaan `throws` (mendelegasikan penanganan) dan `try-catch` (menangani langsung).

**Percobaan 9 - Validasi Input String Kosong**

* Jika string kosong, program melempar exception.
* *Analisis*: Validasi input dan penggunaan `finally` sebagai bagian yang selalu dieksekusi.

**Percobaan 10 - File Handling dan IOException**

* Menggunakan `RandomAccessFile` untuk menulis dan membaca file.
* *Analisis*: Contoh nyata penggunaan `IOException` dalam operasi file.

**Percobaan 11 - Custom Exception dari `Throwable`**

* Membuat class exception sendiri: `RangeErrorException`.
* *Analisis*: Mendemonstrasikan bagaimana membuat dan melempar exception custom.

**Percobaan 12 - Custom Exception dari `Exception`**

* Membuat class `MyException` dan melemparkannya berdasarkan kondisi tertentu.
* *Analisis*: Memperkuat pemahaman membuat exception dengan logika dan pesan sendiri.

**IV. KESIMPULAN**

Melalui praktikum ini, mahasiswa memahami pentingnya exception handling dalam Java untuk memastikan program tetap stabil saat menghadapi error. Selain itu, percobaan memberikan gambaran lengkap mulai dari error umum, struktur exception handling, hingga pembuatan custom exception.

**V. SARAN**

* Disarankan untuk selalu menggunakan `try-catch` terutama saat berinteraksi dengan input/output atau operasi rawan error.
* Latihan pembuatan custom exception sangat baik untuk kasus bisnis tertentu di dunia nyata.

---

**SELESAI**

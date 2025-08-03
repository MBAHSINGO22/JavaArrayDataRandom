<h1 align="center">🎲 Java Array Data Random</h1>
<p align="center">
  <b>Larik dan Pengacakan Data di Java</b><br>
  <sub>Tentang array, random data, dan pencarian</sub>
</p>

<div align="center">

[![Java](https://img.shields.io/badge/Java-17-red?logo=oracle)](https://www.oracle.com/java/)
[![Random](https://img.shields.io/badge/Data-Randomization-success)]()
[![Educational](https://img.shields.io/badge/Type-Larik%20%26%20Pencarian-informational)]()
[![Author](https://img.shields.io/badge/Author-MBAHSINGO22-blue)](https://github.com/MBAHSINGO22)

</div>

---

## 📖 Deskripsi Proyek

**JavaArrayDataRandom** adalah repositori yang menampilkan:
- Inisialisasi larik (array) dengan data acak menggunakan `java.util.Random`
- Operasi manipulasi array: tampilkan isi, urutkan, cari nilai
- Uji coba dari kelas utama (`LarikMain.java`)
- Pengukuran performa sorting: Bubble, Selection, Insertion Sort

---

## 📂 Struktur Proyek

```
JavaArrayDataRandom/
├── DataRandom.java       # Kelas untuk menghasilkan data integer random dan mengukur waktu sorting
├── Larik.java            # Kelas larik dengan metode manipulasi array
└──  LarikMain.java        # Program utama untuk menjalankan dan menguji fungsi array
```

---

## 🧰 Teknologi

- Java 17+
- IDE Java seperti IntelliJ / NetBeans / Eclipse atau command line terminal

---

## 📌 Contoh Output

### 🔢 Output dari `DataRandom.java`
```
Bubble Sort time for size 1000: 2577899 nanoseconds
Selection Sort time for size 1000: 62800 nanoseconds
Insertion Sort time for size 1000: 88500 nanoseconds
Bubble Sort time for size 10000: 8514401 nanoseconds
Selection Sort time for size 10000: 162300 nanoseconds
Insertion Sort time for size 10000: 152700 nanoseconds
Bubble Sort time for size 100000: 74394300 nanoseconds
Selection Sort time for size 100000: 5778900 nanoseconds
Insertion Sort time for size 100000: 5590299 nanoseconds
```

### 🔁 Output dari `LarikMain.java`
```
Bubble Sort: [31, 26, 15, 11, 8, 5]
Selection Sort: [31, 26, 15, 11, 8, 5]
Insertion Sort: [31, 26, 15, 11, 8, 5]
```

---

## 📈 Analisis

- **Bubble Sort** paling lambat untuk dataset besar karena kompleksitas O(n²)
- **Selection & Insertion Sort** lebih efisien untuk ukuran sedang
- Data hasil sorting pada LarikMain menunjukkan array dibalik (descending), sesuai pengujian

---

## 👨‍💻 Author

**MBAHSINGO22**  
🔗 [GitHub](https://github.com/MBAHSINGO22)

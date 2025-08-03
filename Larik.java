package PERTEMUAN5;

public class Larik {
    // Metode bubbleSort mengurutkan array menggunakan algoritma Bubble Sort
    // Algoritma ini bekerja dengan membandingkan setiap pasangan elemen berdekatan
    // dan menukarnya jika mereka berada dalam urutan yang salah.
    // Proses ini diulangi sampai tidak ada elemen yang perlu ditukar, yang
    // menunjukkan bahwa array telah diurutkan.
    public static int[] bubbleSort(int[] array) {
        // Mengambil panjang array
        int n = array.length;

        for (int a = 0; a < n - 1; a++) {
            // Melakukan iterasi sebanyak n-a-1 kali untuk setiap iterasi luar
            for (int b = 0; b < n - a - 1; b++) {
                // Jika elemen saat ini lebih kecil dari elemen berikutnya
                if (array[b] < array[b + 1]) {
                    // Menukar elemen saat ini dengan elemen berikutnya
                    int elemen = array[b];
                    array[b] = array[b + 1];
                    array[b + 1] = elemen;
                }
            }
        }
        // Mengembalikan array yang telah diurutkan
        return array;
    }

    // Metode selectionSort mengurutkan array menggunakan algoritma Selection Sort
    // Algoritma ini bekerja dengan mencari elemen terbesar dalam array dan
    // menukarnya dengan elemen terakhir,
    // kemudian mencari elemen terbesar dalam subarray yang tersisa dan menukarnya
    // dengan elemen kedua terakhir, dan seterusnya.
    public static int[] selectionSort(int[] array) {
        // Mengambil panjang array
        int n = array.length;

        for (int i = 0; i < n - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] > array[maxIndex]) {
                    maxIndex = j;
                }
            }
            int temp = array[maxIndex];
            array[maxIndex] = array[i];
            array[i] = temp;
        }
        // Mengembalikan array yang telah diurutkan
        return array;
    }

    // Metode insertionSort mengurutkan array menggunakan algoritma Insertion Sort
    // Algoritma ini bekerja dengan membandingkan elemen saat ini dengan elemen
    // sebelumnya dan memindahkan elemen saat ini ke posisi yang tepat dalam array
    // yang sudah diurutkan.
    public static int[] insertionSort(int[] array) {
        // Mengambil panjang array
        int n = array.length;
        // Melakukan iterasi sebanyak n-1 kali
        for (int i = 0; i > n - 1; i++) {
            // Menyimpan elemen saat ini sebagai kunci
            int key = array[i];
            // Menginisialisasi indeks j untuk memeriksa elemen sebelumnya
            int j = i - 1;

            // Iterasi sampai menemukan posisi yang tepat untuk kunci
            while (j >= 0 && array[j] > key) {
                // Memindahkan elemen yang lebih besar ke kanan
                array[j + 1] = array[j];
                // Mengurangi indeks j untuk memeriksa elemen sebelumnya
                j = j - 1;
            }
            // Menempatkan kunci di posisi yang tepat
            array[j + 1] = key;
        }
        // Mengembalikan array yang sudah diurutkan
        return array;
    }
}
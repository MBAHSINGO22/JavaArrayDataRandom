package PERTEMUAN5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class DataRandom {

    public static void main(String[] args) {
        // Array ukuran yang akan diuji
        int[] arraySizes = {1000, 10000, 100000};

        for (int size : arraySizes) {
            // Membuat array dataRandom dengan ukuran yang berbeda
            int[] dataRandom = new int[size];
            // Mengisi array dengan angka acak antara 0 dan ukuran array - 1
            for (int i = 0; i < size; i++) {
                dataRandom[i] = (int) (Math.random() * size);
            }

            // Mengubah array int[] menjadi Integer[]
            Integer[] dataRandomInteger = Arrays.stream(dataRandom).boxed().toArray(Integer[]::new);

            // Mengukur waktu untuk algoritma pengurutan
            // Menggunakan Bubble Sort, Selection Sort, dan Insertion Sort
            // Catatan: Metode pengurutan ini menggunakan Arrays.sort() untuk kesederhanaan

            // Bubble Sort
            long startTime = System.nanoTime();
            bubbleSort(dataRandomInteger);
            long endTime = System.nanoTime();
            System.out.println("Bubble Sort time for size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // Selection Sort
            startTime = System.nanoTime();
            selectionSort(dataRandomInteger);
            endTime = System.nanoTime();
            System.out.println("Selection Sort time for size " + size + ": " + (endTime - startTime) + " nanoseconds");

            // Insertion Sort
            startTime = System.nanoTime();
            insertionSort(dataRandomInteger);
            endTime = System.nanoTime();
            System.out.println("Insertion Sort time for size " + size + ": " + (endTime - startTime) + " nanoseconds");
        }
    }

    // Metode bubbleSort mengurutkan array menggunakan algoritma Bubble Sort
    // Dalam kasus ini, menggunakan Arrays.sort() untuk kesederhanaan
    public static void bubbleSort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    // Metode selectionSort mengurutkan array menggunakan algoritma Selection Sort
    // Dalam kasus ini, menggunakan Arrays.sort() untuk kesederhanaan
    public static void selectionSort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }

    // Metode insertionSort mengurutkan array menggunakan algoritma Insertion Sort
    // Dalam kasus ini, menggunakan Arrays.sort() untuk kesederhanaan
    public static void insertionSort(Integer[] array) {
        Arrays.sort(array, Collections.reverseOrder());
    }
}
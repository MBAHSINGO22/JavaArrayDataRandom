package PERTEMUAN5;

public class LarikMain {
    public static void main(String[] args) {
        // Membuat array data dengan elemen 5, 8, 26, 15, 11, 31
        int[] data = { 5, 8, 26, 15, 11, 31 };

        // Memanggil metode bubbleSort dari kelas Larik untuk mengurutkan array data
        // Metode ini mengembalikan array yang telah diurutkan menggunakan algoritma
        // Bubble Sort
        int[] sortedDataBubble = Larik.bubbleSort(data);
        // Mencetak hasil pengurutan menggunakan Bubble Sort
        System.out.println("Bubble Sort: " + java.util.Arrays.toString(sortedDataBubble));

        // Memanggil metode selectionSort dari kelas Larik untuk mengurutkan array data
        // Metode ini mengembalikan array yang telah diurutkan menggunakan algoritma
        // Selection Sort
        int[] sortedDataSelection = Larik.selectionSort(data);
        // Mencetak hasil pengurutan menggunakan Selection Sort
        System.out.println("Selection Sort: " + java.util.Arrays.toString(sortedDataSelection));

        // Memanggil metode insertionSort dari kelas Larik untuk mengurutkan array data
        // Metode ini mengembalikan array yang telah diurutkan menggunakan algoritma
        // Insertion Sort
        int[] sortedDataInsertion = Larik.insertionSort(data);
        // Mencetak hasil pengurutan menggunakan Insertion Sort
        System.out.println("Insertion Sort: " + java.util.Arrays.toString(sortedDataInsertion) );
    }
}
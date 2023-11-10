

import java.util.Scanner;

public class arraypercobaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan banyaknya elemen
        System.out.print("Masukkan jumlah elemen: ");
        int jumlahElemen = input.nextInt();

        // Membuat array untuk menyimpan elemen
        int[] array = new int[jumlahElemen];

        // Meminta pengguna untuk memasukkan nilai tiap elemen
        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        // Memanggil method untuk menghitung nilai tertinggi, terendah, dan rata-rata
        int nilaiTertinggi = cariNilaiTertinggi(array);
        int nilaiTerendah = cariNilaiTerendah(array);
        double rataRata = hitungRataRata(array);

        // Menampilkan nilai tertinggi, terendah, dan rata-rata
        System.out.println("Nilai Tertinggi: " + nilaiTertinggi);
        System.out.println("Nilai Terendah: " + nilaiTerendah);
        System.out.println("Rata-rata: " + rataRata);

        input.close();
    }

    // Method untuk mencari nilai tertinggi
    public static int cariNilaiTertinggi(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method untuk mencari nilai terendah
    public static int cariNilaiTerendah(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    // Method untuk menghitung rata-rata
    public static double hitungRataRata(int[] arr) {
        int total = 0;
        for (int num : arr) {
            total += num;
        }
        return (double) total / arr.length;
    }
}


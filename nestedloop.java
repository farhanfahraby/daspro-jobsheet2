import java.util.Scanner;

public class nestedloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Deklarasi array 2 dimensi
        double[][] temps = new double[5][7];

        // Input Suhu
        for (int i = 0; i < temps.length; i++) {
            System.out.println("kota ke-" + i);
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print("hari ke-" + (j + i) + ": ");
                temps[i][j] = sc.nextDouble();
            }
            System.out.println();
        }

        // Menampilkan Nilai Rata-rata Masing-masing Kota
        for (int i = 0; i < temps.length; i++) {
            System.out.print("kota ke-" + (i + 1) + ": ");
            double totalSuhu = 0;
            for (int j = 0; j < temps[0].length; j++) {
                System.out.print(temps[i][j] + " ");
                totalSuhu += temps[i][j];
            }
            double rataRata = totalSuhu / temps[0].length;
            System.out.println("- Rata-rata: " + rataRata);
        }
    }
}
import java.util.Scanner;

public class arrayratanilai18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahNilai = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahNilai];

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        double total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }

        double rata = total / jumlahNilai;

        System.out.println("\nOutput:");

        for (int i = 0; i < jumlahNilai; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" + (i + 1) + " = " + nilaiMahasiswa[i]);
        }

        System.out.println("\nRata-rata nilai = " + rata);

        if (rata >= 70) {
            System.out.println("Rata-rata nilai lulus = " + rata);
        } else {
            System.out.println("Rata-rata nilai tidak lulus = " + rata);
        }

        double totalTidakLulus = 0;
        int jumlahTidakLulus = 0;
        for (int nilai : nilaiMahasiswa) {
            if (nilai < 70) {
                totalTidakLulus += nilai;
                jumlahTidakLulus++;
            }
        }

        if (jumlahTidakLulus > 0) {
            double rataTidakLulus = totalTidakLulus / jumlahTidakLulus;
            System.out.println("Rata-rata nilai tidak lulus = " + rataTidakLulus);
        } else {
            System.out.println("Tidak ada nilai yang tidak lulus.");
        }
    }
}
        
       
        
       
        



         
          
        
            
        



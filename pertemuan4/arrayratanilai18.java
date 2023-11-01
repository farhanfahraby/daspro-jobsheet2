import java.util.Scanner;

public class arrayratanilai18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai mahasiswa: ");
        int jumlahnilai = input.nextInt();

        int[] nilaiMahasiswa = new int[jumlahnilai];

        for (int i = 0; i < jumlahnilai; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMahasiswa[i] = input.nextInt();
        }

        double total = 0;
        for (int nilai : nilaiMahasiswa) {
            total += nilai;
        }

        double rata = total / jumlahnilai;
        System.out.println("Rata-rata nilai = " + rata);

        if (rata >= 70) {
            System.out.println("Rata-rata nilai lulus = " + rata);
        } else {
            System.out.println("Rata-rata nilai tidak lulus = " + rata);
        }
    }
}


         
          
        
            
        



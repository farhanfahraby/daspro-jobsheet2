import java.util.Scanner;
public class arraynilai {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int [] nilaiakhir = new int[10];
    for (int i = 0; i < 10; i++) {
        System.out.println("masukan nilai akhir ke - " +i+ ":");
        nilaiakhir[i] = sc.nextInt();
        
       
        }
        for ( int i = 0; i < nilaiakhir.length; i++ ){
        if (nilaiakhir[i] > 70){
            System.out.println("mahasiswa ke-" + i + "lulus!");
           
            } if (nilaiakhir[i] < 70){
                System.out.println("mahasiswa ke- " + i + "tidak lulus!");
    }
}
}
    
}
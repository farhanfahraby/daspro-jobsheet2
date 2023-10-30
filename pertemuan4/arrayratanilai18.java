import java.util.Scanner;
public class arrayratanilai18 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaimhs= new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaimhs.length; i++) {
            System.out.println("masukan nilai mahasiswa ke -" + (i+1) + " : ");
            nilaimhs [i] = input.nextInt();
            }
            for (int i = 0; i < nilaimhs.length; i++){
                total += nilaimhs[i];
                
            }
            rata2 = total/nilaimhs.length;
                System.out.println("rata rata nilai = " + rata2);
        
    }
}

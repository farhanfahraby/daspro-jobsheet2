import java.util.Scanner;

public class segitiga18 {
    public static void main( String[] args) {
        Scanner sc = new Scanner (System.in);
        int alas = 6, tinggi = 5;
        float luas; 
       
        System.out.println("masukan alas: " + alas);
        alas = sc.nextInt();
        System.out.println("masukan tinggi:" + tinggi);
        tinggi = sc.nextInt();

        luas = alas * tinggi / 2;
        System.out.println("luas segiutiga: " + luas);
    }
    
}

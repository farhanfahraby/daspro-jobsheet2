import java.util.Scanner;

public class WhileMultiples18 {
     public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        
        int multiple;
        int sum = 0;
        int counter = 0;
        
        
        System.out.println("input the multiple = ");
        multiple = input18.nextInt();
        
        int i = 1;
        while (i<=50){
            if (i%multiple == 0 ) {
                sum = sum + i;
                counter++;
                //System.out.println( i + "-");
                
            } i++;
        }
                System.out.printf("banyak bilang %d dari 1 sampai 50 adalah %d\n", counter,multiple);
                System.out.printf("total bilangan kelipatan %d dari 1 samppai 50 adalah %d\n", multiple, sum);
               
    }
}


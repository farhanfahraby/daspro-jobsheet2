import java.util.Scanner;
public class pemilihan2percobaan118 {
    public static void main(String[] args){
        Scanner input18 = new Scanner (System.in);
        System.out.println("input year =");
    int year = input18.nextInt();
    if (year%4 == 0 )
        if(year%100 != 0)
            System.out.println("leap year");
    else
            System.out.println("not leap year"); 
    
 }
    }
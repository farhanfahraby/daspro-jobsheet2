import java.util.Scanner;

public class totalprice {
    public static void main(String[] args) {
    Scanner input=new Scanner (System.in);
double timepark , totalpriceofpark ;
double price=2000;
System.out.println("input time parking");
timepark = input.nextInt();
totalpriceofpark=(price*timepark);
System.out.println("total price of park" +totalpriceofpark);
    }
}
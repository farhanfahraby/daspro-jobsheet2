import java.util.Scanner;

public class pemilihanpercobaan18 {
    public static void main(String[] args) {
    Scanner input05 =new Scanner(System.in);
    System.out.println("input a number =");
    int number = input05.nextInt();
    //if(number%2 == 0){
       // System.out.println(number+"is even nuber !");
    //}else
    {
        System.out.println(number+ "s an odd number!");
        String hasil = number % 2 == 0 ? "number" + number + "is even number " :"number" + number + "is odd number";
    }
    }
}
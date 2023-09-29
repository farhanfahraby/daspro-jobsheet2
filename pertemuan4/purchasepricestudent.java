import java.util.Scanner;

public class purchasepricestudent {
    public static void main (String[] args){
Scanner input =new Scanner(System.in);
int pagecount,price, quantity;
double discount=0.1, totalPrice, totalDiscount;
System.out.println("input page count: ");
pagecount=input.nextInt();
String bookbrand =input.nextLine();
System.out.println("input bookbrand: ");
System.out.println("input price: ");
price=input.nextInt();
System.out.println("Input Quantity: ");
quantity=input.nextInt();

    totalPrice=price*quantity;
    totalDiscount=totalPrice*discount;
    double purchasePrice = totalPrice-totalDiscount;
    System.out.println("total discount: "+totalDiscount);
    System.out.println("Final purchase price: "+purchasePrice);
    }
}

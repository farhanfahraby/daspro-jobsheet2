import java.util.Scanner;
public class whileovertimepay18 {
       
    public static void main(String[] args) {
        Scanner input18 = new Scanner(System.in);
        int numemployee, overtimehours;
        double totalovertimepay = 0, overtimepay = 0;
        String position;

        System.out.println("Employee number = ");
        numemployee = input18.nextInt();
        int i = 0;
        while (i < numemployee) {
            System.out.println("Position of employee " + (i + 1) + " (director, manager, staff) = ");
            position = input18.next();
            System.out.println("Employee " + (i + 1) + " overtime hours = ");
            overtimehours = input18.nextInt();

            if (position.equalsIgnoreCase("director")) {
                System.out.println("Employee " + (i + 1) + " overtime hours = " + overtimehours);
                System.out.println("Total of overtime pay = " + totalovertimepay);
            } else if (position.equalsIgnoreCase("manager")) {
                overtimepay = overtimehours * 100000;
            } else if (position.equalsIgnoreCase("staff")) {
                overtimepay = overtimehours * 75000;
            } else {
                System.out.println("Invalid position!");
                continue;
            }

            totalovertimepay = overtimepay + totalovertimepay;
            System.out.println("Total of overtime pay = " + totalovertimepay);
            i++;
        }
    }
}
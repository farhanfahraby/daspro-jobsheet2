import java.util.Scanner;
public class whileovertimepay18 {
        public static void main(String[] args) {
            Scanner input18 = new Scanner(System.in);
            int numemployee,overtimehours;
            double totalovertimepay = 0, overtimepay = 0;
            String position;
             System.out.println("empployee number = ");
            numemployee = input18.nextInt(); 
            int i=0;
            while(i<numemployee) {
                System.out.println("position of employee " +(i+1)+" (director,manager,staff) = ");
                position = input18.next();
                System.out.println("employee"+(i+1)+"overtime hours =" );
                overtimehours = input18.nextInt();
                i++;

                if(position.equalsIgnoreCase("director")) {
                    continue;
                } else if(position.equalsIgnoreCase("manager")) {
                    overtimepay=overtimehours*100000;
                } else if (position.equalsIgnoreCase("staff")){
                    overtimepay=overtimehours*75000;
                }

                totalovertimepay += overtimepay;
                System.out.println("total of overtime pay = "+totalovertimepay);
            } 

        }
}
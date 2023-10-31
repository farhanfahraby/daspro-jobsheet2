import java.util.Scanner;
public class pemilihan2percobaan218 {
    public static void main(String[] args){
        Scanner input18 = new Scanner (System.in);
        System.out.println("input angel1 = ");
        float angel1 = input18.nextFloat();
        System.out.println("input angel2 = ");
        float angel2 = input18.nextFloat();
        System.out.println("input angel3 = ");
        float angel3 = input18.nextFloat();
        float totalangel,equalateraltriangel;
        totalangel = angel1 + angel2 + angel3;
        if(totalangel == 180 ) {
            if (angel1==90 || angel2==90 || angel3==90) {
                System.out.println("right triangle");
            } else if  (angel1 == angel2 && angel2 == angel3){
                System.out.println("equalateral triangel");
            } else if (angel1 == angel2 || angel2 == angel3 || angel1 == angel3 ) {
             System.out.println("isosceles triangel");
            } else {
             System.out.println("isoceles triangel");
            }
            } else {
                System.out.println("not a right triangle");
            }

        
    }
}
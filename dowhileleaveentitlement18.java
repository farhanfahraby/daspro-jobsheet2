import java.util.Scanner;
public class dowhileleaveentitlement18 {
    public static void main(String[] args) {
        Scanner sc18 = new Scanner (System.in);
        int leaveentitlement = 12,numleave;
        String confirmation;

        System.out.println("leave entitlement");
        leaveentitlement = sc18.nextInt();

        do {
            System.out.println("do you want to take time off (y/t)");
            confirmation = sc18.next();
            
            
            if (confirmation.equalsIgnoreCase("y")) {
                System.out.println("num leave");
                numleave = sc18.nextInt();

                if (numleave <= leaveentitlement){
                    leaveentitlement -= numleave;
                    System.out.println("remaining leave allowance" + leaveentitlement);
                } else {
                    System.out.println("sisa jatah cuti anda tidak mencukupi");
                    break;
                }
            }
        } while (leaveentitlement > 0);

    }
}

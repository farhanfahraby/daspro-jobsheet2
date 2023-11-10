import java.util.Scanner;
public class bioskopwithscanner18 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int row, column;
        String name, next;
        String [][] audience = new String[4][2];

        while (true) {
            System.out.println("enter a name : ");
            name = input.nextLine();
            System.out.println("enter row number: ");
            row = input.nextInt();
            System.out.println("enter column number ");
            column = input.nextInt();
            input.nextLine();

            audience[row - 1] [column - 1] = name;
            System.out.print("are there any other audiences to be added ? (y/n)");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}

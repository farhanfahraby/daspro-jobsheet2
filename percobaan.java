import java.util.Scanner;

public class percobaan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int row, column;
        String name, next;
        String[][] audience = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input audence data");
            System.out.println("2. show audience list");
            System.out.println("3. Exit");

            System.out.print(" menu (1/2/3): ");
            int choice = input.nextInt();
            input.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("Input audience data");
                    System.out.println("Enter a name: ");
                    name = input.nextLine();
                    System.out.println("Enter row number: ");
                    row = input.nextInt();
                    System.out.println("Enter column number: ");
                    column = input.nextInt();
                    input.nextLine();

                    if (isValidSeat(row, column, audience)) {
                        audience[row - 1][column - 1] = name;
                        System.out.println("Data audience input was successful");
                    } else {
                        System.out.println("the audience filled please input the data again");
                    }
                    break;
                case 2:
                    System.out.println("data audience:");
                    for (int i = 0; i < audience.length; i++) {
                     for (int j = 0; j < audience[i].length; j++) {
                    if (audience[i][j] == null) {
                    System.out.print("***\t");
                    } else {
                    System.out.print(audience[i][j] + "\t");
                    }
                    }
                    System.out.println();
                    }
                    break;

                case 3:
                    System.out.println("Thank you!");
                    System.exit(0);

                default:
                    System.out.println("input invalid. please input aigain.");
            }

            System.out.print("do you want to add the audience? (y/n): ");
            next = input.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    private static boolean isValidSeat(int row, int column, String[][] audience) {
        if (row >= 1 && row <= audience.length && column >= 1 && column <= audience[0].length) {
            return audience[row - 1][column - 1] == null;
        }
        return false;
    }
}
import java.util.Scanner;

public class selection3 {
    /**
     * @param args
     */
    public static void main(String[] args){
        Scanner input18 = new Scanner (System.in);
        double operand1, operand2, result;
        char operator;
        System.out.println("input operand 1 : ");
        operand1 = input18.nextDouble();
        System.out.println("input operand 2  : ");
        operand2 = input18.nextDouble();
        System.out.println("Input operator (+ - /): ");
       
        operator = input18.next().charAt(0);
        switch (operator) {
            case '+':
            result = operand1 + operand2;
            System.out.println(operand1 + " + " + operand2 + "=" + result);
        
case '-':
result = operand1 - operand2;
System.out.println(operand1 + " - " + operand2 + "=" + result);
break;
case '*':
result = operand1 * operand2;
System.out.println(operand1 + " * " + operand2 + "=" + result);
break;
case '/':
result = operand1/operand2;
System.out.println(operand1 + "/" + operand2 + "=" + result);
break;
        }
    }
}

import java.util.Scanner;

public class salarystudent18 {
    public static void main (String[] args){
        Scanner input =new Scanner (System.in);
int numAttendance, numAbsence, totalSalary;
int salary=40000, salaryDeduction=250000;
System.out.println("input attendance number");
numAttendance = input.nextInt();
System.out.println("input absence number: ");
numAbsence = input.nextInt();
totalSalary=(numAttendance*salary)-(numAbsence*salaryDeduction);
System.out.println("total salary: "+totalSalary);
    }
}
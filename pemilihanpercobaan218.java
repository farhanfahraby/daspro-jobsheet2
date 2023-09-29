import java.util.Scanner;

public class pemilihanpercobaan218 {
    
    public static void main (String[] args){
    Scanner input05 = new Scanner(System.in);
    System.out.println("nilai uas   : ");
    float finalexam = input05.nextFloat();
    System.out.println("nilai uts   : ");
float midexam = input05.nextFloat();
System.out.println("nilai kuis   : ");
float quiz =input05.nextFloat();
System.out.println("nilai tugas : ");
float assigment = input05.nextFloat();
float total = (finalexam*0.4F) + (midexam*0.3F) + (quiz*0.1F) + (assigment*0.2F);
String message = total < 65 ? "Retake" : "Pass";
System.out.println("Final Grade = " + total + "and the decission" + message);

String predikat = "";
if (total > 80 && total <= 100)
{
predikat = "A+";
} else if ( total > 73 && total <= 80){
    predikat = "B+";
} else if (total > 65 && total <= 73) {
    predikat = "B";
}else if (total > 60 && total <= 65) {
    predikat = "C+";
}else if (total > 50 && total <= 60) {
    predikat = "C";
}else if (total > 39 && total <= 50){
    predikat = "D";
} else {
    predikat = "E";
}
    System.out.println(predikat);

}
}






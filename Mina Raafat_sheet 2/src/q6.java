import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
System.out.println("please enter your 3 number in orders");
    Scanner input = new Scanner(System.in);
    double firstNum = input.nextDouble();
    double secondNum = input.nextDouble();
    double thirdNum = input.nextDouble();
if(firstNum<secondNum &&secondNum<thirdNum){System.out.println("numbers are increasing");}
        else if (firstNum>secondNum&&secondNum>thirdNum){System.out.println("numbers are decreasing");}
        else{System.out.println("Neither nor");}}}

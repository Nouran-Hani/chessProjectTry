import java.util.Scanner;

public class q5 {
    public static void main(String[] args) {
        System.out.println("please enter your 3 number");
        Scanner input = new Scanner(System.in);
        double firstNum = input.nextDouble();
        double secondNum = input.nextDouble();
        double thirdNum = input.nextDouble();
if(firstNum==secondNum&&firstNum==thirdNum){System.out.println("all 3 numbers are equal");}
else if (firstNum!=secondNum&&firstNum!=thirdNum&&secondNum!=thirdNum){System.out.println("all 3 numbers are different");}
else{System.out.println("Neither all are equal or different");}}}

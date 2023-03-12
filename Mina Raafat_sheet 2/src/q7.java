import java.util.Scanner;

public class q7 {public static void main(String[] args) {
    double bigger1=0;
    double middle=0;
    double smallest=0;

    System.out.println("please enter your 3 numbers");
    Scanner input = new Scanner(System.in);
    double firstNum = input.nextDouble();
    double secondNum = input.nextDouble();
    double thirdNum = input.nextDouble();

    if(firstNum>secondNum){
         bigger1=firstNum;
        middle=secondNum;
    }
    else {bigger1=secondNum;
        middle=firstNum;}

    if(thirdNum>bigger1){smallest=middle;middle=bigger1;bigger1=thirdNum;}
    else if(thirdNum>middle){middle=thirdNum;smallest=secondNum;}
    else {smallest=thirdNum;}
    System.out.println("bigger "+bigger1+" middle "+middle+" smallest "+smallest);
}
}
